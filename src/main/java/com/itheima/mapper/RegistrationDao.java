package com.itheima.mapper;


import com.itheima.Bean.DepartmentsBean;
import com.itheima.Bean.PatientBean;

import java.util.List;

/**
 * 挂号系统dao层查询接口
 */
public interface RegistrationDao {
    /**
     * 获取所有患者信息以及所挂的科室信息(连表查询)
     * @return
     */
    List<PatientBean> findPatientAll();

    /**
     * 获取所有科室信息
     * @return
     */
    List<DepartmentsBean> findDepartmentsAll();

    /**
     * 保存患者挂号信息
     */
    void saveRegistration(PatientBean patientBean);

    /**
     * 根据患者姓名模糊查询患者信息
     * @param name
     */
    List<PatientBean> selectPatientByName(String name);
}
