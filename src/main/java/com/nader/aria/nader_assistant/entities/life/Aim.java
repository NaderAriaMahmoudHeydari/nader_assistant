package com.nader.aria.nader_assistant.entities.life;

import javax.persistence.*;
import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;
import com.nader.aria.nader_assistant.entities.enums.AimTimeType;
import com.nader.aria.nader_assistant.entities.enums.AimType;
import com.nader.aria.nader_assistant.entities.enums.StateType;


@Entity
@Table(name="AIMS" , uniqueConstraints = @UniqueConstraint( columnNames= {"LIFE_ID","TITLE","CODE"}) )
@NamedQueries({
		@NamedQuery(name = Aim.FIND_ALL_BY_LIFE,query = "select a from Aim as a where a.life =:life"),
		@NamedQuery(name = Aim.GET_ALL_AIMS_CODE,query = "select a.code from Aim as a "),
		@NamedQuery(name = Aim.FIND_BY_CODE, query = "select a from Aim as a where a.code =:code")
})
public class Aim extends BaseEntity {

	public static final String FIND_ALL_BY_LIFE = "aim.findAllByLife";
	public static final String GET_ALL_AIMS_CODE = "aim.getAllAimsCode";
	public static final String FIND_BY_CODE = "aim.findByCode";

	private static final long serialVersionUID = 1L;


    @ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER)
	@JoinColumn(name="LIFE_ID")
	private Life life;

	@Column(name="RANK")
	private Integer rank;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="DESCRIPTION"  )
	private String description;
	
	@Enumerated(EnumType.STRING)
	@Column(name="AIM_TYPE")
	private AimType aimType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="AIM_TIME_TYPE")
	private AimTimeType aimTimeType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="STATE_TYPE")
	private StateType stateType;

    public Integer getRank(){ return rank; }
    public void setRank(Integer rank){ this.rank = rank; }

	public Life getLife() { return life; }
	public void setLife(Life life) { this.life = life; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	public String getCode() { return code; }
	public void setCode(String code) { this.code = code; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public AimType getAimType() { return aimType; }
	public void setAimType(AimType aimType) { this.aimType = aimType; }
	
	public AimTimeType getAimTimeType() { return aimTimeType; }
	public void setAimTimeType(AimTimeType aimTimeType) { this.aimTimeType = aimTimeType; }
	
	public StateType getStateType() { return stateType; }
	public void setStateType(StateType stateType) { this.stateType = stateType; }
	
}
