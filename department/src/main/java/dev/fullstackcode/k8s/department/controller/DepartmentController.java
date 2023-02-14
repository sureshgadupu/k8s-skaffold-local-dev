package dev.fullstackcode.k8s.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @GetMapping
    public String getDepartment() {
        return "from department project - update2";
    }

}
