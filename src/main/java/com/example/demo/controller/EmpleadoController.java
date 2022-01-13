package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import javax.validation.Valid;

import com.example.demo.model.Empleados;
import com.example.demo.service.EmpleadoService;

//Este viene siendo el API REST
@RestController
public class EmpleadoController {

	@Autowired
	private EmpleadoService service;

	@GetMapping("/empleado")
	public List<Empleados> listarEmpleados() {
		return service.listarEmpleados();
	}

	@GetMapping("/empleado/{id}")
	public ResponseEntity<Empleados> obtenerEmpleado(@PathVariable Integer id) {
		try {
			Empleados empleado = service.obtenerEmpleadoPorId(id);
			return new ResponseEntity<Empleados>(empleado, HttpStatus.OK);

		} catch (Exception exception) {
			return new ResponseEntity<Empleados>(HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("/empleado")
	public void registrarEmpleado(@Valid @RequestBody Empleados empleado) {
		service.guardarEmpleado(empleado);

	}

	@DeleteMapping("/empleado/{id}")
	public void eliminarEmpleado(@PathVariable Integer id) {

		service.eliminarEmpleado(id);
	}

}
