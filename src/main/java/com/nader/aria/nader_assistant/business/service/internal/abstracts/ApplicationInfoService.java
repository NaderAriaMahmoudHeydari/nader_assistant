package com.nader.aria.nader_assistant.business.service.internal.abstracts;

import com.nader.aria.nader_assistant.entities.abstracts.ApplicationInfo;

import java.util.List;
import java.util.Optional;

public interface ApplicationInfoService {

    public Optional<List<ApplicationInfo>> getAllApplicationInfo() throws Exception;

    public void save(ApplicationInfo applicationInfo) throws Exception;

    public void save(List<ApplicationInfo> applicationInfoList) throws Exception;

}
