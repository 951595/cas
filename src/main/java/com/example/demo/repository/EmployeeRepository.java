package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Employee findByName(String name);

	//void updateEmployeeBySalary(Double salary);

	Employee save( Employee e);

	

}
