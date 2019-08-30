package com.nader.aria.nader_assistant.repository.reminder_repository;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.reminder.ReminderManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderManagerRepo extends JpaRepository<ReminderManager,Long> {

    public ReminderManager findByLogin(@Param("login") Login login);

}
