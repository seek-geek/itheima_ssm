package com.itheima.Bean;

/**
 * 患者bean
 */
public class PatientBean {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer did;
    private String advice;
    private DepartmentsBean departmentsBean;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public DepartmentsBean getDepartmentsBean() {
        return departmentsBean;
    }

    public void setDepartmentsBean(DepartmentsBean departmentsBean) {
        this.departmentsBean = departmentsBean;
    }

    @Override
    public String toString() {
        return "com.itheima.Bean.PatientBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", did=" + did +
                ", advice='" + advice + '\'' +
                ", departmentsBean=" + departmentsBean +
                '}';
    }
}
