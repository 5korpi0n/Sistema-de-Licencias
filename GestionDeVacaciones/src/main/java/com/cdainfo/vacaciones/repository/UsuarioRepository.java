package com.cdainfo.vacaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdainfo.vacaciones.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario ,Long>{

}
