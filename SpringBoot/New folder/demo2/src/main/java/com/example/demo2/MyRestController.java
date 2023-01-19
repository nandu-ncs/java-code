package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/greeting")
    private String sayHello() {
        Employee employee = new Employee();
        employee.setEmpName("Nandu");
        employee.setPaid(true);
        employee.setSalary(1000.00);
        employeeRepository.save(null);
        return "Hello";
    }

    @PostMapping("/postreq")
    private String postRequest() {
        return "This response is from post";
    }

    @PutMapping("/putreq")
    private String putRequest() {
        return "This response is from put";
    }

    @DeleteMapping("/deletereq")
    private String deleteRequest() {
        return "This response is from delete";
    }

}
