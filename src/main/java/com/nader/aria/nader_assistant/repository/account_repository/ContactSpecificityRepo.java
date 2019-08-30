package com.nader.aria.nader_assistant.repository.account_repository;

import com.nader.aria.nader_assistant.entities.account.ContactSpecificity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactSpecificityRepo extends JpaRepository<ContactSpecificity,Long> {

     public Optional<ContactSpecificity> findBySite(@Param("site") String site) throws Exception;

     public Optional<ContactSpecificity> findByEmail(@Param("email") String email) throws Exception;

}
