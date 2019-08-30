package com.nader.aria.nader_assistant.entities.life;

import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="DAILY_SPRINTS" , uniqueConstraints = @UniqueConstraint( columnNames= {"TITLE","CODE"}) )
@NamedQuery(name = DailySprint.FIND_ALL_BY_LIFE,query = "select d from DailySprint as d where d.life =:life")
public class DailySprint extends BaseEntity {

    public static final String FIND_ALL_BY_LIFE = "dailySprint.findAllByLife";

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH} , fetch = FetchType.EAGER)
    @JoinColumn(name = "LIFE_ID")
    private Life life;

    @OneToMany( cascade = {CascadeType.ALL} ,fetch = FetchType.LAZY , mappedBy ="sprint" )
    private List<Task> tasks;

    public Life getLife(){ return life; }
    public void setLife(Life life){ this.life = life; }

    public List<Task> getTasks(){ return tasks; }
    public void setTasks(List<Task> tasks){ this.tasks = tasks; }

}
