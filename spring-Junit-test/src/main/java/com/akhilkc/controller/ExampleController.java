package com.akhilkc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akhilkc.model.ExampleEmployee;

@RestController
public class ExampleController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ExampleEmployee firstPage() {

		ExampleEmployee emp = new ExampleEmployee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}
}
