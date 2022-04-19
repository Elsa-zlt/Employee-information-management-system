package com.zlt.mapper;

import com.zlt.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeMapper {

    // 查询全部的员工信息
    List<Employee> getAll();

    // 通过ID查询员工
    Employee getEmployeeById(@Param("id") int id);

    // 通过ID删除员工
    int delete(@Param("id") int id);

    // 增加一个员工
    int save(Employee employee);

    // 修改员工
    int updateEmpById(Employee employee);

}
