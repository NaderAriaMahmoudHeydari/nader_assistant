package com.nader.aria.nader_assistant.repository.medicine_repository;

import com.nader.aria.nader_assistant.entities.account.Address;
import com.nader.aria.nader_assistant.entities.enums.MedicineType;
import com.nader.aria.nader_assistant.entities.medicine.MedicineInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineInfoRepo extends JpaRepository<MedicineInfo,Long> {

    public List<MedicineInfo> findAllByAddress(@Param("address") Address address);
    public List<MedicineInfo> findAllByMedicineType(@Param("medicineType") MedicineType medicineType);
    public List<MedicineInfo> findAllByDescription(@Param("description") String description);
    //public List<MedicineInfo> findAllByContactDetail(@Param("contactDetail") ContactDetail contactDetail);
    public MedicineInfo findByTitle(@Param("title") String title);

}
