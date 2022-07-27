package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeExistException;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) throws EmployeeExistException{
		return service.saveEmployee(employee);
	}
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee>ep){
		return service.saveEmployees(ep);
	}
	@GetMapping("/employee")
	public List<Employee> findAllEmployees(){
		return service.getEmployees();
	}
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	@GetMapping("/employee/{name}")
	public Employee findEmployeeByName(@PathVariable String name) {
		return service.getEmployeeByName(name);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e) {
		return service.updateEmployee(e);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
	@PutMapping("/update/{salary}")
	public String updateEmployeeBySalary(@RequestBody Employee e , @PathVariable Double salary) {
		return service.updateEmployeeBySalary(salary,e);
		
	}

}
