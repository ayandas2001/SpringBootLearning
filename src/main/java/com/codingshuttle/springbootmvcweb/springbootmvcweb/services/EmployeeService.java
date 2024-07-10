package com.codingshuttle.springbootmvcweb.springbootmvcweb.services;


import com.codingshuttle.springbootmvcweb.springbootmvcweb.dto.EmployeeDto;
import com.codingshuttle.springbootmvcweb.springbootmvcweb.entitties.EmployeeEntity;
import com.codingshuttle.springbootmvcweb.springbootmvcweb.repositories.EmployeeRepositories;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {


   private final EmployeeRepositories employeeRepositories;
   private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepositories employeeRepositories, ModelMapper modelMapper) {
        this.employeeRepositories = employeeRepositories;
        this.modelMapper = modelMapper;
    }

    public EmployeeDto getEmployeeById(int employeeId){
        EmployeeEntity employeeEntity = employeeRepositories.findById(employeeId).orElse(null);
        return modelMapper.map(employeeEntity,EmployeeDto.class);
    }

    public List<EmployeeDto> getAllEmployeeEntity(){
        List<EmployeeEntity> employeeEntities = employeeRepositories.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDto.class))
                .collect(Collectors.toList());
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto){
       EmployeeEntity entity  =  modelMapper.map(employeeDto,EmployeeEntity.class);

        EmployeeEntity employeeEntity = employeeRepositories.save(entity);
        return modelMapper.map(employeeEntity,EmployeeDto.class);
    }


}
