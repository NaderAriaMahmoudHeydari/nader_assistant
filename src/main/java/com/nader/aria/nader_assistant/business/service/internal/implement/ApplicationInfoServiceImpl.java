package com.nader.aria.nader_assistant.business.service.internal.implement;

import com.nader.aria.nader_assistant.business.service.internal.abstracts.ApplicationInfoService;
import com.nader.aria.nader_assistant.entities.abstracts.ApplicationInfo;
import com.nader.aria.nader_assistant.repository.abstracts.ApplicationInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationInfoServiceImpl implements ApplicationInfoService {

    private ApplicationInfoRepo applicationInfoRepo;

    @Autowired
    public ApplicationInfoServiceImpl(ApplicationInfoRepo applicationInfoRepo){
        this.applicationInfoRepo = applicationInfoRepo;
    }



    @Override
    @Transactional
    public Optional<List<ApplicationInfo>> getAllApplicationInfo() throws Exception{
        return Optional.of(applicationInfoRepo.findAll());
    }

    @Override
    @Transactional
    public void save(ApplicationInfo applicationInfo) throws Exception {
        applicationInfoRepo.save(applicationInfo);
    }

    @Override
    @Transactional
    public void save(List<ApplicationInfo> applicationInfoList) throws Exception{
        applicationInfoRepo.saveAll(applicationInfoList);
    }
}
