package com.nader.aria.nader_assistant.repository.account_repository;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.account.Member;
import com.nader.aria.nader_assistant.entities.account.UserNamePassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoginRepo extends JpaRepository<Login,Long> {

     public static final String GET_ALL_USER_NAME = " select l.userNamePassword.userName from Login as l ";

     public Optional<Login> finaByMember(@Param("member")Member member) throws Exception;

     public Optional<Login> findByUserNamePassword(@Param("userNamePassword") UserNamePassword userNamePassword) throws Exception;

     public Login findByUserNamePasswordUserNameAndUserNamePasswordPassword(@Param("userName") String userName, @Param("password") String password);

     @Query(name = GET_ALL_USER_NAME)
     public Optional<List<String>> findAllUserName();

}
