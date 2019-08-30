package com.nader.aria.nader_assistant.repository.life_repository;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.life.Life;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LifeRepo extends JpaRepository<Life,Long> {

    public Life findByLogin(@Param("login") Login login);

}
