package com.nader.aria.nader_assistant.repository.financial_repository;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.financial.CurrentFund;
import com.nader.aria.nader_assistant.entities.financial.FundManager;
import com.nader.aria.nader_assistant.entities.financial.SavingsFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FundManagerRepo extends JpaRepository<FundManager,Long> {

    @Query(value ="select f.currentFund from FundManager as f where f.id =:id ")
    public CurrentFund getCurrentFund(@Param("id") Long id);

    @Query(value ="select f.savingsFund from FundManager as f where f.id =:id ")
    public SavingsFund getSavingsFund(@Param("id") Long id);

    public FundManager findByLogin(@Param("login") Login login);

}
