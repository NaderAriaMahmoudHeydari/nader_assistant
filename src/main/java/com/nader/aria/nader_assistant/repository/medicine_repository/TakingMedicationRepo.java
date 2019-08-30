package com.nader.aria.nader_assistant.repository.medicine_repository;

import com.nader.aria.nader_assistant.entities.medicine.TakingMedication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

@Repository
public interface TakingMedicationRepo extends JpaRepository<TakingMedication,Long> {

    public List<TakingMedication> findAllByUseTime(@Param("useTime") Calendar useTime);
    public List<TakingMedication> findAllByConsumed(@Param("consumed") boolean consumed);

}
