package com.prashanth.spring.boot.jpa.relations.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanth.spring.boot.jpa.relations.entity.Departments;

import jakarta.transaction.Transactional;


@Transactional
public interface DepartmentsRepository extends JpaRepository<Departments, Integer>{

}
