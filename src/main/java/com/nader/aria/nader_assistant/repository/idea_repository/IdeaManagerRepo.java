package com.nader.aria.nader_assistant.repository.idea_repository;

import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.idea.IdeaManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaManagerRepo extends JpaRepository<IdeaManager,Long> {

    public IdeaManager findByLogin(@Param("login") Login login);

}
