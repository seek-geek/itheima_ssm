package com.itheima.controller;

import com.itheima.Bean.DepartmentsBean;
import com.itheima.Bean.PatientBean;
import com.itheima.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 挂号系统Controller
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    /**
     * 获取所有患者信息以及所挂的科室信息(连表查询)
     *
     * @return
     */
    @RequestMapping("/findPatientAll")
    public List<PatientBean> findPatientAll() {
        return service.findPatientAll();
    }

    /**
     * 获取所有科室信息
     *
     * @return
     */
    @RequestMapping("/findDepartmentsAll")
    public List<DepartmentsBean> findDepartmentsAll() {
        return service.findDepartmentsAll();
    }

    /**
     * 保存患者挂号信息
     */
    @RequestMapping("/saveRegistration")
    public void saveRegistration(PatientBean patientBean) {
        service.saveRegistration(patientBean);
    }

    /**
     * 根据患者姓名模糊查询患者信息
     *
     * @param name
     */
    @RequestMapping("/selectPatientByName")
    public List<PatientBean> selectPatientByName(String name) {
        return service.selectPatientByName(name);
    }
}
