package com.nader.aria.nader_assistant.web_service;

import com.nader.aria.nader_assistant.business.service.internal.abstracts.ApplicationInfoService;
import com.nader.aria.nader_assistant.entities.abstracts.ApplicationInfo;
import com.nader.aria.nader_assistant.util.ResponseEntityManager;
import com.nader.aria.nader_assistant.util.VariablesDefault;
import com.nader.aria.nader_assistant.util.models.Menu;
import com.nader.aria.nader_assistant.util.models.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class IndexWebService {

    private ApplicationInfoService applicationInfoService;

    @Autowired
    public IndexWebService(ApplicationInfoService applicationInfoService){
        this.applicationInfoService = applicationInfoService;
    }


    @ResponseBody
    @GetMapping(VariablesDefault.ROOT)
    public ResponseEntity<?> getIndex(){

        try{
            Optional<List<ApplicationInfo>> optionalApplicationInfoList = applicationInfoService.getAllApplicationInfo();

            if( optionalApplicationInfoList.isEmpty() ) {

                List<ApplicationInfo> applicationInfoList = new ArrayList<>();
                applicationInfoList.add(new ApplicationInfo("CopyRight","@COPY; Nader Aria Company 20019-2020"));
                applicationInfoList.add(new ApplicationInfo("WelcomeMessage","Please Login in Application, or Registering New User use Menu Link. "));
                applicationInfoService.save(applicationInfoList);

            }

        }catch (Exception e){
            e.printStackTrace();
        }


        PageInfo pageInfo = new PageInfo();

        pageInfo.setPageTitle("Index");
        pageInfo.setCopyRight("@COPY; Nader Aria Company 20019-2020");


        return ResponseEntityManager.UNAUTHORIZED.getResponseEntity(pageInfo);

    }

    @GetMapping("/getMenuList")
    public ResponseEntity<?> getMenuList(){


        Map<String, List<String>> menuList = Stream.of(Menu.values())
                .collect(Collectors.toMap((m-> m.getIndex()+" : "+ m.getMenuName() +" : "+ m.getPath()),Menu::getItems));
        return ResponseEntityManager.OK.getResponseEntity(menuList);
    }

}
