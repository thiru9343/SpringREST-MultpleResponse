package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Thirupathi");
		emp.setDesignation("JavaDeveloper");
		emp.setEmpId("100");
		emp.setSalary(6000.0);

		return emp;
	}

}