package com.wu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
//员工表
public class Employee {
    private Integer id;
    private String ename;
    private String email;
    private Integer gender;
    private int did;
    private String birthday;
    private String dname;
}
