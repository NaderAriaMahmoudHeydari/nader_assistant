package com.nader.aria.nader_assistant.repository.life_repository;

import com.nader.aria.nader_assistant.entities.enums.AimTimeType;
import com.nader.aria.nader_assistant.entities.enums.AimType;
import com.nader.aria.nader_assistant.entities.enums.StateType;
import com.nader.aria.nader_assistant.entities.life.Aim;
import com.nader.aria.nader_assistant.entities.life.Life;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AimRepo extends JpaRepository<Aim,Long>{

    public List<Aim> findAllByAimType(@Param("aimType") AimType aimType);
    public List<Aim> findAllByAimTimeType(@Param("aimTimeType") AimTimeType aimTimeType);
    public List<Aim> findAllByStateType(@Param("stateType") StateType stateType);
    public List<Aim> findAllByLife(@Param("life") Life life);
    public Aim findAimByTitle(@Param("title") String title);
    public Aim findAimByCode(@Param("code") String code);

}
