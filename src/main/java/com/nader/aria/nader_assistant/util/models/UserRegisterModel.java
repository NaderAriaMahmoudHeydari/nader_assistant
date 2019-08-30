package com.nader.aria.nader_assistant.util.models;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.account.Member;
import com.nader.aria.nader_assistant.entities.account.UserNamePassword;
import com.nader.aria.nader_assistant.entities.enums.Gender;
import com.nader.aria.nader_assistant.entities.financial.CurrentFund;
import com.nader.aria.nader_assistant.entities.financial.FundManager;
import com.nader.aria.nader_assistant.entities.financial.SavingsFund;
import com.nader.aria.nader_assistant.util.Utils;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.time.format.DateTimeParseException;

public class UserRegisterModel implements Serializable {

    private Login login;

    private Member member;

    private UserNamePassword userNamePassword;

    private String confirmPassword;

    private String birthDayString;

    private FundManager fundManager;



    public Login getLogin(){

        if( login == null ) {
            login = new Login();
            login.setMember(new Member());
            login.setUserNamePassword(new UserNamePassword());

        }
        return login;
    }

    public String getConfirmPassword(){ return confirmPassword; }
    public void setConfirmPassword(String confirmPassword){ this.confirmPassword = confirmPassword; }

    public String getBirthDayString(){ return birthDayString; }
    public void setBirthDayString(String birthDayString){ this.birthDayString = birthDayString; }

    public FundManager getFundManager(){

        if( fundManager == null ){
            fundManager = new FundManager();
            fundManager.setCurrentFund(new CurrentFund());
            fundManager.setSavingsFund(new SavingsFund());
        }

        return fundManager;
    }

    public Gender[] getGenderList(){ return Gender.values(); }


    public void completeAccountModel(MultipartFile userImageFile) throws Exception{

        if(this.getLogin().getMember().getGender() == null){
            this.getLogin().getMember().setGender(Gender.OTHER);
        }

        if(userImageFile != null && userImageFile.getBytes()!= null ){
            this.getLogin().getMember().setImage(userImageFile.getBytes());
        }

        try {

            this.getLogin().getMember().setBirthDay(Utils.convertStringToLocalDate(this.getBirthDayString()));

            this.getLogin().getUserNamePassword().setPassword(Utils
                    .passwordDigest(this.getLogin().getUserNamePassword().getPassword(),
                            this.getLogin().getUserNamePassword().getUserName()
                    )
            );

        }catch (DateTimeParseException e){
            e.printStackTrace();
            throw new Exception("Can not parse String to LocalDateTime");
        }catch (Exception e){
            e.printStackTrace();
        }

        this.getFundManager().setLogin(this.getLogin());

    }


}