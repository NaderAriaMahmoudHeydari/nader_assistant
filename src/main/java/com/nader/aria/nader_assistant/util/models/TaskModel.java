package com.nader.aria.nader_assistant.util.models;

import com.nader.aria.nader_assistant.entities.enums.PriorityType;
import com.nader.aria.nader_assistant.entities.enums.ScheduleType;
import com.nader.aria.nader_assistant.entities.life.Task;


import java.util.ArrayList;
import java.util.List;

public class TaskModel {

    private Long lifeId;

    private Long aimId;

    private Long sprintId;

    private Task task;

    private List<Task> tasks;

    private String selectedAimCode;

    private String selectedSprintCode;

    private String selectedTaskCode;

    public Long getLifeId(){ return lifeId; }
    public void setLifeId(Long lifeId){ this.lifeId = lifeId; }

    public Long getAimId(){ return aimId; }
    public void setAimId(Long aimId){ this.aimId = aimId; }

    public Long getSprintId(){ return sprintId; }
    public void setSprintId(Long sprintId){ this.sprintId = sprintId; }

    public Task getTask(){

        if( task == null ){
            task = new Task();
        }
        return task;
    }

    public void setTask(Task task){ this.task = task; }

    public List<Task> getTasks(){

        if( tasks == null ){
            tasks = new ArrayList<>();
        }
        return tasks;
    }

    public void setTasks(List<Task> tasks){ this.tasks = tasks; }

    public PriorityType[] getTaskPriorityTypeList(){ return PriorityType.values(); }

    public ScheduleType[] getScheduleTypeList(){ return ScheduleType.values(); }

    public String getSelectedAimCode(){ return selectedAimCode; }
    public void setSelectedAimCode(String selectedAimCode){ this.selectedAimCode = selectedAimCode; }

    public String getSelectedSprintCode(){ return selectedSprintCode; }
    public void setSelectedSprintCode(String selectedSprintCode){ this.selectedSprintCode = selectedSprintCode; }

    public String getSelectedTaskCode(){ return selectedTaskCode; }
    public void setSelectedTaskCode(String selectedTaskCode){ this.selectedTaskCode = selectedTaskCode; }


}
