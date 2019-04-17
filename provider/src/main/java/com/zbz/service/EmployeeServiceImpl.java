package com.zbz.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author: ag
 * @date: 2019/4/17 19:41
 */

@Component
@Service  /**注意此注解:com.alibaba.dubbo.config.annotation.Service*/
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public String getEmpInfo() {
        String info = "这是一个非常棒的同事.";
        return info;
    }
}
