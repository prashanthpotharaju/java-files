package com.prashanth.spring.boot.jpa.relations.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanth.spring.boot.jpa.relations.entity.Roles;

import jakarta.transaction.Transactional;


@Transactional
public interface RolesRepository extends JpaRepository<Roles, Integer>{

}
