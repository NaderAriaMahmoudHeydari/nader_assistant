package com.nader.aria.nader_assistant.repository.financial_repository;

import com.nader.aria.nader_assistant.entities.abstracts.Fund;
import com.nader.aria.nader_assistant.entities.enums.FinanceType;
import com.nader.aria.nader_assistant.entities.enums.PaymentReceiveType;
import com.nader.aria.nader_assistant.entities.financial.Financial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialRepo extends JpaRepository<Financial,Long> {

    public List<Financial> findAllByFund(@Param("fund") Fund fund);
    public List<Financial> findAllByValue(@Param("value") Long value);
    public List<Financial> findAllByFinanceType(@Param("financeType") FinanceType financeType);
    public List<Financial> findAllByPaymentReceiveType(@Param("paymentReceiveType") PaymentReceiveType paymentReceiveType);
    public Financial findByTitle(@Param("title") String title);

}
