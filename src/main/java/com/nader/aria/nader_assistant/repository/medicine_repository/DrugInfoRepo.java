package com.nader.aria.nader_assistant.repository.medicine_repository;

import com.nader.aria.nader_assistant.entities.medicine.DrugInfo;
import com.nader.aria.nader_assistant.entities.medicine.DrugInfoManager;
import com.nader.aria.nader_assistant.entities.medicine.MedicineInfo;
import com.nader.aria.nader_assistant.entities.medicine.TakingMedication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugInfoRepo extends JpaRepository<DrugInfo,Long> {

    public List<DrugInfo> findAllByDrugInfoManager(@Param("drugInfoManager") DrugInfoManager drugInfoManager);
    public List<DrugInfo> findAllByMedicineInfo(@Param("medicineInfo") MedicineInfo medicineInfo);
    public List<DrugInfo> findAllByTakingMedication(@Param("takingMedication") TakingMedication takingMedication);
    public List<DrugInfo> findAllByComplications(@Param("complications") String complications);
    public DrugInfo findByTitle(@Param("title") String title);
    public void deleteAllByDrugInfoManager(@Param("drugInfoManager") DrugInfoManager drugInfoManager);

}
