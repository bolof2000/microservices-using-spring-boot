package com.micro.department.service.controller;

import com.micro.department.service.entity.Department;
import com.micro.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/departments")
@RestController
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department  department){

        log.info("Inisde saveDepartment method of department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){

        log.info("Inisde saveDepartment method of department Controller");

        return departmentService.findDepartmentById(departmentId);
    }

}
