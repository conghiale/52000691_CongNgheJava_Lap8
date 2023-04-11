package com.example._52000691_lab8_2.repository;

import com.example._52000691_lab8_2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    void deleteByIdIn(List<Integer> ids);
}
