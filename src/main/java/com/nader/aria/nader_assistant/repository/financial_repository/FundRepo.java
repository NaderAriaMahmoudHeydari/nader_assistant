package com.nader.aria.nader_assistant.repository.financial_repository;

import com.nader.aria.nader_assistant.entities.abstracts.Fund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FundRepo<F extends Fund> extends JpaRepository<F,Long> {

    public Optional<List<F>> findAllByMinStock(@Param(value = "minStock") Long minStock);
    public Optional<List<F>> findAllByMaxStock(@Param(value = "maxStock") Long maxStock);
    public Optional<List<F>> findAllByCurrentStock(@Param(value = "currentStock") Long currentStock);

    public Optional<F> findByMinStock(@Param(value = "minStock") Long minStock);
    public Optional<F> findByMaxStock(@Param(value = "maxStock") Long maxStock);
    public Optional<F> findByCurrentStock(@Param(value = "currentStock") Long currentStock);

}
