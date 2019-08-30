package com.nader.aria.nader_assistant.repository.account_repository;

import com.nader.aria.nader_assistant.entities.account.UserNamePassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserNamePasswordRepo extends JpaRepository<UserNamePassword,Long> {

    public UserNamePassword findByUserName(@Param("userName") String userName);
    public UserNamePassword findByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);


}
