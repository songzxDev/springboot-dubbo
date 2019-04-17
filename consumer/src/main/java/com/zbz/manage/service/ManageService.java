package com.zbz.manage.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zbz.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author: ag
 * @date: 2019/4/17 19:59
 */
@Service
public class ManageService {

    @Reference /**com.alibaba.dubbo.config.annotation.Reference*/
    EmployeeService employeeService;
    public String getEmpInfo(){
        String info = employeeService.getEmpInfo();
        return info;
    }

}
