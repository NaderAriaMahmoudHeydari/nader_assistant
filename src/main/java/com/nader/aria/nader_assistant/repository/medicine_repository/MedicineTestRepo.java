package com.nader.aria.nader_assistant.repository.medicine_repository;

import com.nader.aria.nader_assistant.entities.enums.MedicineTestType;
import com.nader.aria.nader_assistant.entities.medicine.MedicineTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineTestRepo extends JpaRepository<MedicineTest,Long> {

    public List<MedicineTest> findAllByValue(@Param("value") String value);
    public List<MedicineTest> findAllByRelatedDiseases(@Param("relatedDiseases") boolean relatedDiseases);
    public List<MedicineTest> findAllByMedicineTestType(@Param("medicineTestType") MedicineTestType medicineTestType);
}
