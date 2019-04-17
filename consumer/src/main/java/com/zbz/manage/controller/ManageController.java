package com.zbz.manage.controller;

import com.zbz.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ag
 * @date: 2019/4/17 20:00
 */
@RestController
public class ManageController {

    @Autowired
    ManageService manageService;

    @GetMapping("/emp")
    public String getInfo(){
        String info = "";
        try{
            info = manageService.getEmpInfo();
        }catch (Exception e){
            e.printStackTrace();
        }
        String rtnString ="{\"info\":\" "+ info +"\"}";
        return  rtnString;
    }

}
