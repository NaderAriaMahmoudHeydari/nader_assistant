package com.nader.aria.nader_assistant.entities.medicine;


import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;
import com.nader.aria.nader_assistant.entities.account.Login;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MEDICINE_TEST_MANAGERS")
public class MedicineTestManager extends BaseEntity {

    @OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
    @JoinColumn(name="LOGIN_ID")
    private Login login;

    @OneToMany( cascade = {CascadeType.ALL},fetch = FetchType.LAZY , mappedBy ="medicineTestManager")
    private List<MedicineTest> medicineTests;

    public Login getLogin(){ return login; }
    public void setLogin(Login login){ this.login = login; }

    public List<MedicineTest> getMedicineTests(){ return medicineTests; }
    public void setMedicineTests(List<MedicineTest> medicineTests ){ this.medicineTests = medicineTests; }

}
