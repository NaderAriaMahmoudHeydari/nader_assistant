package com.nader.aria.nader_assistant.repository.financial_repository;

import com.nader.aria.nader_assistant.entities.enums.ReceiveType;
import com.nader.aria.nader_assistant.entities.financial.Receive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceiveRepo extends JpaRepository<Receive,Long> {

    public List<Receive> findAllByReceived(@Param("received") boolean received);
    public List<Receive> findAllByReceiveType(@Param("receiveType") ReceiveType receiveType);
    public List<Receive> findAllByPayer(@Param("payer") String payer);

}
