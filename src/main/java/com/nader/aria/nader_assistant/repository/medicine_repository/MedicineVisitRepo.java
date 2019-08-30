package com.nader.aria.nader_assistant.repository.medicine_repository;

import com.nader.aria.nader_assistant.entities.medicine.MedicineInfo;
import com.nader.aria.nader_assistant.entities.medicine.MedicineVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineVisitRepo extends JpaRepository<MedicineVisit,Long> {

    public MedicineVisit findByMedicineInfo(@Param("medicineInfo") MedicineInfo medicineInfo);

}
