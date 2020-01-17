package com.cdainfo.vacaciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.cdainfo.vacaciones.entity.enumerado.Estado;

@Entity

@Table(
		name = "usuario"
//		schema = "vacaciones",
//		indexes = {@Index(name = "usuario", columnList = "nombre", unique = true)}
		)

public class Usuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@Column(name = "user", nullable = false, length = 20)
    private String user;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre; 
    
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    
    @Column(name = "sede", nullable = false, length = 20)
    private String sede;
    
    @Column(name = "cargo", nullable = false, length = 20)
    private String cargo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
    

    
}
