package com.cdainfo.vacaciones.service.impl;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.entity.Usuario;
import com.cdainfo.vacaciones.repository.UsuarioRepository;
import com.cdainfo.vacaciones.service.ServiceUsuario;

@Service
public class ServiceUsuarioImpl implements ServiceUsuario {
	
	@Autowired
	UsuarioRepository usuarioRepository; 
	
	Peticion peticion;
	
	@Override
	public List<Usuario> traerTodos() {
		return usuarioRepository.findAll();
	}
    
	@Override
	public Usuario findById(Long usuarioId) {
		Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
		if ( usuario.isPresent() ) {
			return usuario.get();
		} else {
			return null;
		}
	}

	@Override
	public Usuario grabar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void borrar(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	/*public void ListarPeticion()
	{
		// Lista de peticiones
		List<Peticion> lista = new ArrayList<Peticion>();

	}*/
	
}
