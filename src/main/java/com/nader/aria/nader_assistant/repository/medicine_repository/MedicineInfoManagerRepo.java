package com.nader.aria.nader_assistant.repository.medicine_repository;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.medicine.MedicineInfoManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicineInfoManagerRepo extends JpaRepository<MedicineInfoManager,Long> {

    public MedicineInfoManager findByLogin(@Param("login") Login login);

}
