package com.nader.aria.nader_assistant.util.models;

import java.io.Serializable;

public class ForgotPasswordModel implements Serializable {

    private String userName;

    private String registeredEmail;

    private String userNameAndRegisteredEmail;


    public String getUserName(){ return userName; }
    public void setUserName(String userName){ this.userName = userName; }

    public String getRegisteredEmail(){ return registeredEmail; }
    public void setRegisteredEmail(String registeredEmail){ this.registeredEmail = registeredEmail; }

    public String getUserNameAndRegisteredEmail(){ return userNameAndRegisteredEmail; }
    public void setUserNameAndRegisteredEmail(String userNameAndRegisteredEmail){ this.userNameAndRegisteredEmail = userNameAndRegisteredEmail; }

}
