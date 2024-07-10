package com.codingshuttle.springbootmvcweb.springbootmvcweb.repositories;

import com.codingshuttle.springbootmvcweb.springbootmvcweb.entitties.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositories extends JpaRepository<EmployeeEntity, Integer> {


}
