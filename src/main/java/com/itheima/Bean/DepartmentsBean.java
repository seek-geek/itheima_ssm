package com.itheima.Bean;

/**
 * 科室bean
 */
public class DepartmentsBean {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "com.itheima.Bean.DepartmentsBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
