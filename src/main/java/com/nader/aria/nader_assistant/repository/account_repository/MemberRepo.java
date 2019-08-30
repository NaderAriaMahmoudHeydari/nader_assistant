package com.nader.aria.nader_assistant.repository.account_repository;

import com.nader.aria.nader_assistant.entities.account.Address;
import com.nader.aria.nader_assistant.entities.account.ContactSpecificity;
import com.nader.aria.nader_assistant.entities.account.Member;
import com.nader.aria.nader_assistant.entities.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepo extends JpaRepository<Member,Long> {

    public Optional<List<Member>> findAllByGender(@Param("gender") Gender gender);
    public Optional<List<Member>> findAllByBirthDay(@Param("birthDay") Calendar birthDay);
    public Optional<Member> findByAddress(@Param("address") Address address);
    public Optional<Member> findByContactSpecificity(@Param("contactSpecificity") ContactSpecificity contactSpecificity);
    public Optional<Member> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);


}
