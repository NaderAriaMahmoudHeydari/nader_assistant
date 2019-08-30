package com.nader.aria.nader_assistant.util.models;

import com.nader.aria.nader_assistant.entities.life.Aim;
import com.nader.aria.nader_assistant.entities.life.Life;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class AimModel implements Serializable {

    private Aim aim;

    private Long taskCount;



    private List<Aim> aims;

    public Aim getAim(){

        if( aim == null ){
            aim = new Aim();
            aim.setLife(new Life());
        }
        return aim;
    }

    public void setAim(Aim aim){ this.aim = aim; }

    public Long getTaskCount(){ return taskCount; }
    public void setTaskCount(Long taskCount){ this.taskCount = taskCount; }

    public List<Aim> getAims(){

        if( aims == null ){
            aims = new ArrayList<>();
        }
        return aims;
    }

    public void setAims(List<Aim> aims){ this.aims = aims; }

}
