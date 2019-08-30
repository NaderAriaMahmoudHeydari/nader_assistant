package com.nader.aria.nader_assistant.entities.medicine;

import com.nader.aria.nader_assistant.entities.abstracts.BaseEntity;
import com.nader.aria.nader_assistant.entities.account.Login;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MEDICINE_VISIT_MANAGERS")
public class MedicineVisitManager extends BaseEntity {

    @OneToOne( cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH} ,fetch = FetchType.EAGER )
    @JoinColumn(name="LOGIN_ID")
    private Login login;

    @OneToMany( cascade = {CascadeType.ALL},fetch = FetchType.LAZY , mappedBy ="medicineVisitManager")
    private List<MedicineVisit> medicineVisits;

    public Login getLogin(){ return login; }
    public void setLogin(Login login){ this.login = login; }

    public List<MedicineVisit> getMedicineVisits(){ return medicineVisits; }
    public void setMedicineVisits(List<MedicineVisit> medicineVisits ){ this.medicineVisits = medicineVisits; }


}
