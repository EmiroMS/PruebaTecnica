package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Empleados;

public interface EmpleadoRepository extends JpaRepository<Empleados,Integer>{

	
}
 