package com.nader.aria.nader_assistant.repository.account_repository;

import com.nader.aria.nader_assistant.entities.account.Address;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {

    public Optional<List<Address>> findAllByCountry(@Param("country") String country) throws Exception;

    public Optional<List<Address>> findAllByCountry(@Param("country") String country, Pageable pageable)throws Exception;

    public Optional<List<Address>> findAllByCountry(@Param("country") String country, Sort sort)throws Exception;

    public Optional<List<Address>> findAllByCity(@Param("city") String city)throws Exception;

    public Optional<List<Address>> findAllByCity(@Param("city") String city, Pageable pageable)throws Exception;

    public Optional<List<Address>> findAllByCity(@Param("city") String city, Sort sort)throws Exception;

    public Optional<Address> findByFullAddress(@Param("fullAddress") String fullAddress)throws Exception;













    
    
}
