package com.nader.aria.nader_assistant.repository.financial_repository;

import com.nader.aria.nader_assistant.entities.enums.PayType;
import com.nader.aria.nader_assistant.entities.financial.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepo<P extends Payment> extends JpaRepository<P,Long> {

    public Optional<List<Payment>> findAllByPayed(@Param("payed") boolean payed);
    public Optional<List<Payment>> findAllByPayType(@Param("payType") PayType payType);
    public Optional<List<Payment>> findAllBySeller(@Param("seller") String seller);

}
