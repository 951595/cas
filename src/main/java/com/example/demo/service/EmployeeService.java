package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeExistException;
import com.example.demo.repository.EmployeeRepository;


@Service 
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee ep){
		Employee employee=employeeRepository.findById(ep.getId()).orElse(null);
		if(employee == null) {
		return employeeRepository.save(ep);
		}
		else {
			throw new EmployeeExistException("Employee id already in database...");
		}
		
	}
	public List<Employee> saveEmployees(List<Employee>employees){
		return employeeRepository.saveAll(employees);
		
	}
	public  List<Employee>getEmployees(){
		return employeeRepository.findAll(Sort.by("salary").descending().and(Sort.by("name")));
		
	}
	
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id).orElse(null);
	}
	public Employee getEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "player is removed"+id;
	}
	public Employee updateEmployee(Employee e) {
		Employee ep=employeeRepository.findById(e.getId()).orElse(null);
		ep.setName(e.getName());
		ep.setSalary(e.getSalary());
		ep.setDesg(e.getDesg());
		
		return employeeRepository.save(ep);
	}
	public String updateEmployeeBySalary(Double salary, Employee e) {
		// TODO Auto-generated method stub
		employeeRepository.save(e);
		return "update successfully ";
	}


}
