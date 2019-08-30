package com.nader.aria.nader_assistant.util.models;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class UserNamePasswordModel implements Serializable {

    private String userNameAndPassword;

    @NotNull
    private String userName;

    @NotNull
    private String password;

    public String getUserNameAndPassword(){ return userNameAndPassword; }

    public String getUserName(){ return userName; }
    public void setUserName(String userName){ this.userName = userName; }

    public String getPassword(){ return password; }
    public void setPassword(String password){ this.password = password; }


}
