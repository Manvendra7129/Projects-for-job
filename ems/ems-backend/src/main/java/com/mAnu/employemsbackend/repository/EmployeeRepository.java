package com.mAnu.employemsbackend.repository;

import com.mAnu.employemsbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
