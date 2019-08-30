package com.nader.aria.nader_assistant.entities.medicine;


import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;
import com.nader.aria.nader_assistant.entities.account.Login;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TAKING_MEDICATION_MANAGERS")
public class TakingMedicationManager extends BaseEntity {

    @OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
    @JoinColumn(name="LOGIN_ID")
    private Login login;

    @OneToMany( cascade = {CascadeType.ALL},fetch = FetchType.LAZY , mappedBy ="takingMedicationManager")
    private List<TakingMedication> takingMedications;

    public Login getLogin(){ return login; }
    public void setLogin(Login login){ this.login = login; }

    public List<TakingMedication> getTakingMedications(){ return takingMedications; }
    public void setTakingMedications(List<TakingMedication> takingMedications ){ this.takingMedications = takingMedications; }

}
