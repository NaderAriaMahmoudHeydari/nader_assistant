package com.nader.aria.nader_assistant.util.models;

import com.nader.aria.nader_assistant.entities.life.Life;
import com.nader.aria.nader_assistant.entities.life.Sprint;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SprintModel implements Serializable {

    private HttpStatus httpStatus;

    private Sprint sprint;

    private String startDateString;

    private String endDateString;

    private Long taskCount;

    private List<Sprint> sprints;

    public HttpStatus getHttpStatus(){ return httpStatus; }
    public void setHttpStatus(HttpStatus httpStatus){ this.httpStatus = httpStatus; }

    public Sprint getSprint(){

        if( sprint == null ){
            sprint = new Sprint();
            sprint.setLife(new Life());
        }
        return sprint;
    }

    public void setSprint(Sprint sprint){ this.sprint = sprint; }

    public String  getStartDateString(){ return startDateString; }
    public void setStartDateString(String startDateString){ this.startDateString = startDateString; }

    public String getEndDateString(){ return endDateString; }
    public void setEndDateString(String endDateString){ this.endDateString = endDateString; }



    public Long getTaskCount(){ return taskCount; }
    public void setTaskCount(Long taskCount){ this.taskCount = taskCount; }

    public List<Sprint> getSprints(){

        if( sprints == null ){
            sprints = new ArrayList<>();
        }
        return sprints;
    }

    public void setSprints(List<Sprint> sprints){ this.sprints = sprints; }

}
