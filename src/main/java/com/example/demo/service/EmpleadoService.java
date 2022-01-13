package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Empleados;
import com.example.demo.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository repository;
	
	public List<Empleados> listarEmpleados(){
		
		return repository.findAll();
	}
	
	public void guardarEmpleado(Empleados empleados) {
		
		repository.save(empleados);
	}
	
	public Empleados obtenerEmpleadoPorId(Integer id) {
		
		return repository.findById(id).get();
	}
	
	public void eliminarEmpleado(Integer id) {
		repository.deleteById(id);
	}
	
}
