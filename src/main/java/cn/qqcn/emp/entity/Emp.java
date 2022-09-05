package cn.qqcn.emp.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Emp implements Serializable {
    
    private Integer empId;
    private String name;
    private String sex;
    private Integer age;
    private Double sal;
    private Date birthday;
    private String address;
    private Integer deptId;
}