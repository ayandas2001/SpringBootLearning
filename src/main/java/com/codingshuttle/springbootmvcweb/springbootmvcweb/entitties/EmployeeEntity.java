package com.codingshuttle.springbootmvcweb.springbootmvcweb.entitties;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    private String name;
    private String email;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
}
