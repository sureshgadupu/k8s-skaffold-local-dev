package dev.fullstackcode.k8s.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @GetMapping
    public String getEmployee() {
        System.out.println("from getEmployee #####");
        return "from employee project - updated6";
    }
}
