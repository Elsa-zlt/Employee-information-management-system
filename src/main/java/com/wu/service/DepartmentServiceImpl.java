package com.wu.service;

import com.wu.mapper.DepartmentMapper;
import com.wu.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 吴磊
 * @program: springboot-03-web
 * @create: 2021-01-29 14:16
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }

     
}
