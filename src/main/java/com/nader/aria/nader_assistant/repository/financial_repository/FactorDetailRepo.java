package com.nader.aria.nader_assistant.repository.financial_repository;

import com.nader.aria.nader_assistant.entities.financial.Factor;
import com.nader.aria.nader_assistant.entities.financial.FactorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FactorDetailRepo extends JpaRepository<FactorDetail,Long> {


    public Optional<List<FactorDetail>> findAllByAmountOf(@Param("amountOf") Long amountOf);
    public Optional<List<FactorDetail>> findAllByPricePerUnit(@Param("pricePerUnit") Long pricePerUnit);
    public Optional<List<FactorDetail>> findAllBySum(@Param("sum") Long sum);
    public Optional<List<FactorDetail>> findAllByFactor(@Param("factor") Factor factor);
    public Optional<FactorDetail> findByTitle(@Param("title") String title);
    public void deleteAllByFactor(@Param("factor") Factor factor);




}
