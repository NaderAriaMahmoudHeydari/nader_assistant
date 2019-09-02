package com.nader.aria.nader_assistant.repository.abstracts;

import com.nader.aria.nader_assistant.entities.abstracts.ApplicationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationInfoRepo extends JpaRepository<ApplicationInfo,Long> {


    @Query(value = "select a.key from ApplicationInfo as a ")
    public Optional<List<String>> getAllKey();

    @Query(value = "select a.value from ApplicationInfo as a where a.key =:key " )
    public Optional<String> getValueByKey(String key);


}
