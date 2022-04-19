package com.wu;

import com.wu.service.DepartmentServiceImpl;
import com.wu.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class Springboot03WebApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private DepartmentServiceImpl departmentService;

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Test

    public void test() {
        System.out.println(dataSource.getClass());
    }

    @Test
    public void test2() {
        departmentService.getAll().forEach(System.out::println);
    }

    @Test
    public void test3() {
        System.out.println(employeeService.getEmployeeById(1));
    }

    
}
