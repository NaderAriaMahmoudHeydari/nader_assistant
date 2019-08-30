package com.nader.aria.nader_assistant.repository.medicine_repository;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.medicine.DrugInfoManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugInfoManagerRepo extends JpaRepository<DrugInfoManager,Long> {

    public DrugInfoManager findByLogin(@Param("login") Login login);

}
