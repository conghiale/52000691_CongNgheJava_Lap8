package com.example._52000691_lab8_2.service;

import com.example._52000691_lab8_2.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> selectAllEmployee();
    public Employee selectEmployeeById(Integer id);
    public Employee insertEmployee(Employee employee);
    public boolean deleteEmployeeById(Integer id);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployees(List<Integer> selectedEmployees);
}
