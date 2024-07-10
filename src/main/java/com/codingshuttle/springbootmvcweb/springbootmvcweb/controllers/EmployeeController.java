package com.codingshuttle.springbootmvcweb.springbootmvcweb.controllers;


import com.codingshuttle.springbootmvcweb.springbootmvcweb.dto.EmployeeDto;
import com.codingshuttle.springbootmvcweb.springbootmvcweb.entitties.EmployeeEntity;
import com.codingshuttle.springbootmvcweb.springbootmvcweb.repositories.EmployeeRepositories;
import com.codingshuttle.springbootmvcweb.springbootmvcweb.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{employeeId}")
        public EmployeeDto getEmployeeById(@PathVariable(name = "employeeId")  int id){
            return employeeService.getEmployeeById(id);
        }

        @GetMapping
        public List<EmployeeDto> getEmployee(@RequestParam(required = false) String name){
            return employeeService.getAllEmployeeEntity();
        }

        @PostMapping
        public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto){
          return employeeService.createEmployee(employeeDto);
        }

}
