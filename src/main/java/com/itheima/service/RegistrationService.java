package com.itheima.service;

import com.itheima.Bean.DepartmentsBean;
import com.itheima.Bean.PatientBean;

import java.util.List;

public interface RegistrationService {
    List<PatientBean> findPatientAll();
    List<DepartmentsBean> findDepartmentsAll();
    void saveRegistration(PatientBean patientBean);
    List<PatientBean> selectPatientByName(String name);
}
