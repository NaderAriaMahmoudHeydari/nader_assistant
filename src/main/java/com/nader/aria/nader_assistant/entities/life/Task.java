package com.nader.aria.nader_assistant.entities.life;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;
import com.nader.aria.nader_assistant.entities.enums.PriorityType;
import com.nader.aria.nader_assistant.entities.enums.ScheduleType;
import com.nader.aria.nader_assistant.entities.enums.StateType;
import com.nader.aria.nader_assistant.entities.financial.Financial;
import com.nader.aria.nader_assistant.entities.reminder.Reminder;
import com.nader.aria.nader_assistant.util.Utils;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="TASKS" , uniqueConstraints = @UniqueConstraint( columnNames= {"SPRINT_ID","TITLE","CODE"}) )
@Inheritance(strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name = "TASK_CHILD_TYPE" , discriminatorType = DiscriminatorType.STRING )
@NamedQueries({
		@NamedQuery(name = Task.FIND_ALL,query = "select t from Task as t "),
		@NamedQuery(name = Task.FIND_ALL_BY_AIM,query = "select t from Task as t where t.aim =:aim"),
		@NamedQuery(name = Task.FIND_ALL_BY_SPRINT,query = "select t from Task as t where t.sprint =:sprint"),
		@NamedQuery(name = Task.GET_ALL_TASK_CODE,query = "select t.code from Task as t"),
		@NamedQuery(name = Task.FIND_BY_CODE,query = "select t from Task as t where t.code =:code")
})
public class Task extends BaseEntity {

	public static final String FIND_ALL = "task.findAll";
	public static final String FIND_ALL_BY_AIM = "task.findAllByAim";
	public static final String FIND_ALL_BY_SPRINT = "task.findAllSprint";
	public static final String GET_ALL_TASK_CODE = "task.getAllTaskCode";
	public static final String FIND_BY_CODE = "task.findByCode";

	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.REFRESH},fetch = FetchType.EAGER)
	@JoinColumn(name="SPRINT_ID")
	private Sprint sprint;

	@Column(name="RANK")
	private Integer rank;
	
	@Column(name ="TITLE"   )
	private String title;
	
	@Column(name="DESCRIPTION"  )
	private String description;
	
	@Column(name="CODE")
	private String code;
	
	@Enumerated( EnumType.STRING )
	@Column(name="PRIORITY_TYPE")
	private PriorityType priorityType;
	
	@Enumerated( EnumType.STRING )
	@Column(name="SCHEDULE_TYPE")
	private ScheduleType scheduleType;

	@Column(name="TIME_PREDICTION")
	private String timePrediction;//پیش بینی زمان

	@Enumerated( EnumType.STRING)
	@Column(name = "STATE_TYPE")
	private StateType stateType;
	
	@OneToMany( cascade = {CascadeType.ALL} , mappedBy ="task")
	@LazyCollection(value = LazyCollectionOption.FALSE)
	private List<TaskLog> taskLogs;
	
	@OneToOne( cascade = {CascadeType.ALL} ,fetch = FetchType.EAGER )
	@JoinColumn(name="FINANCIAL_ID"   )
	private Financial financial;
	
	@OneToOne( cascade = {CascadeType.ALL} ,fetch = FetchType.EAGER )
	@JoinColumn(name="REMINDER_ID"  )
	private Reminder reminder;

	@OneToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
	private Task linkTo;


	public Sprint getSprint() { return sprint; }
	public void setSprint(Sprint sprint) { this.sprint = sprint; }

	public Integer getRank(){ return rank; }
	public void setRank(Integer rank){ this.rank = rank; }

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public String getCode() { return code; }
	public void setCode(String code) { this.code = code; }
	
	public PriorityType getPriorityType() { return priorityType; }
	public void setPriorityType(PriorityType priorityType) { this.priorityType = priorityType; }
	
	public ScheduleType getScheduleType() { return scheduleType; }
	public void setScheduleType(ScheduleType scheduleType) { this.scheduleType = scheduleType; }

	public String getTimePrediction() { return timePrediction; }
	public void setTimePrediction(String timePrediction) { this.timePrediction = timePrediction; }
	
	public StateType getStateType(){ return stateType; }
	public void setStateType(StateType stateType){ this.stateType  = stateType; }

	public List<TaskLog> getTaskLogs(){ return taskLogs; }
	public void setTaskLogs(List<TaskLog> taskLogs) { this.taskLogs = taskLogs; }
	
	public Financial getFinancial() { return financial; }
	public void setFinancial(Financial financial) { this.financial = financial; }
	
	public Reminder getReminder() { return reminder; }
	public void setReminder(Reminder reminder) { this.reminder = reminder; }

	public Task getLinkTo(){ return linkTo; }
	public void setLinkTo(Task linkTo){ this.linkTo = linkTo; }


	@Transient
	private String taskLogSum;

	public final String getTaskLogSum(){

		if( taskLogs != null && taskLogs.size() != 0 ){

			int sum = taskLogs.stream()
					.mapToInt(t-> t.getLogHours() + t.getLogMinutes() + t.getLogSeconds() )
					.sum();


			return Utils.convertLogsToStringFormat(sum);
		}

		return "0";
	}



	@Transient
	private long financialValue;

	public final long getFinancialValue(){
		return ( getFinancial() != null ) ? getFinancial().getValue() : 0;
	}

	@Transient
	private LocalDateTime reminderActiveTime;

	public final LocalDateTime getReminderActiveTime(){
		return ( this.getReminder() != null && this.getReminder().isActive() ) 	? this.getReminder().getTimeActivated()
																				: null;
	}

	@Override
	public Task clone(){

		Task tempTask = new Task();

		tempTask.setId(this.getId());

		Sprint tempSprint = new Sprint();
		tempSprint.setId(this.getSprint().getId());
		tempSprint.setCode(this.getSprint().getCode() );

		tempTask.setSprint(tempSprint);

		tempTask.setRank(this.getRank());
		tempTask.setTitle(this.getTitle());
		tempTask.setDescription(this.getDescription());
		tempTask.setCode(this.getCode());
		tempTask.setPriorityType(this.getPriorityType());
		tempTask.setScheduleType(this.getScheduleType());
		tempTask.setTimePrediction(this.getTimePrediction());
		tempTask.setTaskLogs(this.getTaskLogs());

		if( this.getFinancial() != null && this.getFinancial().getId() != null ){
			Financial tempFinancial = new Financial();
			tempFinancial.setId(this.getFinancial().getId());
			tempTask.setFinancial(tempFinancial);
		}

		if( this.getReminder() != null && this.getReminder().getId() != null ){

			Reminder tempReminder = new Reminder();
			tempReminder.setId(this.getReminder().getId());
			tempTask.setReminder(tempReminder);
		}

		if( this.getLinkTo() != null && this.getLinkTo().getId() != null ){
			Task tempLinkTo = new Task();
			tempLinkTo.setId(this.getLinkTo().getId());
			tempLinkTo.setCode(this.getLinkTo().getCode());

			tempTask.setLinkTo(tempLinkTo);
		}


		return tempTask;
	}
	
}
