package com.nader.aria.nader_assistant.repository.reminder_repository;

import com.nader.aria.nader_assistant.entities.enums.ReminderState;
import com.nader.aria.nader_assistant.entities.enums.RepetitionType;
import com.nader.aria.nader_assistant.entities.reminder.Reminder;
import com.nader.aria.nader_assistant.entities.reminder.ReminderManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

@Repository
public interface ReminderRepo extends JpaRepository<Reminder,Long> {

    public List<Reminder> findAllByReminderManager(@Param("ReminderManager") ReminderManager reminderManager);
    public List<Reminder> findAllByRepetitionType(@Param("repetitionType") RepetitionType repetitionType);
    public List<Reminder> findAllByRepetition(@Param("repetition") boolean repetition);
    public List<Reminder> findAllByReminderState(@Param("reminderState") ReminderState reminderState);
    public List<Reminder> findAllByCreateDate(@Param("createDate") Calendar createDate);
    public List<Reminder> findAllByTimeActivated(@Param("timeActivated") Calendar timeActivated);
    public List<Reminder> findAllByActive(@Param("active") boolean active);

}
