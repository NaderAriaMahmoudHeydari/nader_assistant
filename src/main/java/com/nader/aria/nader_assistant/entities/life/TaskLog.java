package com.nader.aria.nader_assistant.entities.life;

import javax.persistence.*;
import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;
import com.nader.aria.nader_assistant.entities.enums.StateType;


@Entity
@Table(name="TASK_LOGS")
public class TaskLog extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER)
	@JoinColumn(name="TASK_ID")
	private Task task;
	
	@Column(name="COMMENT"  )
	private String comment;
	
	@Enumerated( EnumType.STRING )
	@Column(name="STATE_TYPE")
	private StateType stateType;
	
	@Column(name="LOG_DAYS")
	private int logDays;

	@Column(name="LOG_HOURS")
	private int logHours;

	@Column(name="LOG_MINUTES")
	private int logMinutes;

	@Column(name="LOG_SECONDS")
	private int logSeconds;



	public Task getTask() { return task; }
	public void setTask(Task task) { this.task =  task; }
	
	public String getComment() { return comment; }
	public void setComment(String comment) { this.comment = comment; }
	
	public StateType getStateType() { return stateType; }
	public void setStateType(StateType stateType) { this.stateType = stateType; }
	
	public int getLogDays(){ return logDays; }
	public void setLogDays(int logDays){ this.logDays = logDays; }

	public int getLogHours(){ return logHours; }
	public void setLogHours(int logHours){ this.logHours = logHours; }

	public int getLogMinutes(){ return logMinutes; }
	public void setLogMinutes(int logMinutes){ this.logMinutes = logMinutes; }

	public int getLogSeconds(){ return logSeconds; }
	public void setLogSeconds(int logSeconds){ this.logSeconds = logSeconds; }


	public int convertLogsSeconds(){

		int temp = 0;

		if( getLogDays() != 0 ){

			temp += getLogDays() * 24 * 60 * 60;
		}

		if( getLogHours() != 0 ){

			temp += getLogHours() * 60 * 60;

		}

		if( getLogMinutes() != 0 ){

			temp += getLogMinutes() * 60;
		}

		if( getLogSeconds() != 0 ){

			temp  += getLogSeconds();
		}

		return temp;
	}


	
}
