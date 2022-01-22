package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Empleados {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "el campo no debe ser vacio")
	private String nombre;

	@NotEmpty(message = "el campo no debe ser vacio")
	private String Apellido;

	@NotEmpty(message = "el campo no debe ser vacio")
	private String documento;

	@NotEmpty(message = "el campo no debe ser vacio")
	private String numeroDocumento;

	private Date fechaNacimiendo;

	private Date vinculacionCompañia;

	@NotEmpty(message = "el campo no debe ser vacio")
	private String Cargo;

	private Double salario;



}
