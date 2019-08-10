package com.hcl.talmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.talmate.entity.Employee;

@Repository
public interface IPmEmployee extends JpaRepository<Employee, Integer>{

}
