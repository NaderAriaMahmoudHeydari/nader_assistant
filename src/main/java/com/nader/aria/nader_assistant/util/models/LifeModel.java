package com.nader.aria.nader_assistant.util.models;

import com.nader.aria.nader_assistant.entities.life.Aim;
import com.nader.aria.nader_assistant.entities.life.Sprint;
import com.nader.aria.nader_assistant.entities.life.Task;

import java.util.ArrayList;
import java.util.List;

public class LifeModel {

    private Long lifeId;

    private List<Aim> aims;

    private List<Sprint> sprints;

    private List<Task> tasks;

    private Aim aim;

    private Sprint sprint;


    public Long getLifeId() { return lifeId; }
    public void setLifeId(Long lifeId){ this.lifeId = lifeId; }


    public List<Task> getTasks(){

        if( tasks == null ){
            tasks = new ArrayList<>();

        }
        return tasks;
    }

    public void setTasks(List<Task> tasks){
        this.tasks = tasks;
    }

    public List<Aim> getAims(){

        if( aims == null ){
            this.aims = new ArrayList<>();
        }
        return aims;
    }

    public void setAims(List<Aim> aims){
        this.aims = aims;
    }

    public List<Sprint> getSprints(){

        if( sprints == null ){
            sprints = new ArrayList<>();
        }
        return sprints;
    }

    public void setSprints(List<Sprint> sprints){
        this.sprints = sprints;
    }

    public Aim getAim(){

        if( aim == null ){
            aim = new Aim();
        }
        return aim;
    }

    public Sprint getSprint(){

        if( sprint ==  null ){
            sprint = new Sprint();
        }

        return sprint;
    }


}
