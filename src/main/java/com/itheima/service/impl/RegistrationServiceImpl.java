package com.itheima.service.impl;

import com.itheima.Bean.DepartmentsBean;
import com.itheima.Bean.PatientBean;
import com.itheima.mapper.RegistrationDao;
import com.itheima.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationDao registrationDao;

    /**
     * 获取所有患者信息以及所挂的科室信息(连表查询)
     * @return
     */
    @Override
    public List<PatientBean> findPatientAll() {
        return registrationDao.findPatientAll();
    }

    /**
     * 获取所有科室信息
     * @return
     */
    @Override
    public List<DepartmentsBean> findDepartmentsAll() {
        return registrationDao.findDepartmentsAll();
    }

    /**
     * 保存患者挂号信息
     */
    @Override
    public void saveRegistration(PatientBean patientBean) {
        registrationDao.saveRegistration(patientBean);
    }

    /**
     * 根据患者姓名模糊查询患者信息
     * @param name
     */
    @Override
    public List<PatientBean> selectPatientByName(String name) {
        return registrationDao.selectPatientByName(name);
    }
}
