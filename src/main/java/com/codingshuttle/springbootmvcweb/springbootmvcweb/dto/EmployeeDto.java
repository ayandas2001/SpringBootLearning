package com.codingshuttle.springbootmvcweb.springbootmvcweb.dto;

public class EmployeeDto {

    private String name;
    private String email;
    private int age;

    private int empId;
    public EmployeeDto(){

    }

    public EmployeeDto(String name, String email, int age, int empId) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
