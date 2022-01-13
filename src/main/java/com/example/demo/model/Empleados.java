package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

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

	public Empleados(Integer id, String nombre, String apellido, String documento, String numeroDocumento,
			Date fechaNacimiendo, Date vinculacionCompañia, String cargo, Double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		Apellido = apellido;
		this.documento = documento;
		this.numeroDocumento = numeroDocumento;
		this.fechaNacimiendo = fechaNacimiendo;
		this.vinculacionCompañia = vinculacionCompañia;
		Cargo = cargo;
		this.salario = salario;
	}

	public Empleados(String nombre, String apellido, String documento, String numeroDocumento, Date fechaNacimiendo,
			Date vinculacionCompañia, String cargo, Double salario) {
		super();

		this.nombre = nombre;
		Apellido = apellido;
		this.documento = documento;
		this.numeroDocumento = numeroDocumento;
		this.fechaNacimiendo = fechaNacimiendo;
		this.vinculacionCompañia = vinculacionCompañia;
		Cargo = cargo;
		this.salario = salario;
	}

	public Empleados() {
		super();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Date getFechaNacimiendo() {
		return fechaNacimiendo;
	}

	public void setFechaNacimiendo(Date fechaNacimiendo) {
		this.fechaNacimiendo = fechaNacimiendo;
	}

	public Date getVinculacionCompañia() {
		return vinculacionCompañia;
	}

	public void setVinculacionCompañia(Date vinculacionCompañia) {
		this.vinculacionCompañia = vinculacionCompañia;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
