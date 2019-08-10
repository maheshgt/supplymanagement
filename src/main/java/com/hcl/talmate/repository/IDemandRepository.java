package com.hcl.talmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.talmate.entity.Demand;

@Repository
public interface IDemandRepository extends JpaRepository<Demand, Integer>{

}
