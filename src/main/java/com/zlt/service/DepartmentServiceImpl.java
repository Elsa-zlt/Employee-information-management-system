package com.zlt.service;

import com.zlt.mapper.DepartmentMapper;
import com.zlt.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 钟良堂
 * @program: Employee-information-management-system
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
