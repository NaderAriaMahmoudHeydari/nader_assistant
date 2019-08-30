package com.nader.aria.nader_assistant.repository.abstracts;

import com.nader.aria.nader_assistant.entities.abstracts.ReferencesSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReferencesSequenceRepo extends JpaRepository<ReferencesSequence,Long> {

    public final String GET_LAST_RANK_BY_DISCRIMINATOR = "select r.lastRank from ReferencesSequence as r where r.id = ( select max(r.id) from ReferencesSequence as r ) and r.discriminator =:discriminator ";

    @Query(name = ReferencesSequenceRepo.GET_LAST_RANK_BY_DISCRIMINATOR)
    public Optional<Long> findReferencesSequenceByDiscriminatorOrderByIdDesc(@Param("discriminator") String discriminator) throws Exception;


}
