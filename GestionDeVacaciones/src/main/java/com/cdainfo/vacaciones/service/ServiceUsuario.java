package com.cdainfo.vacaciones.service;

import java.util.List;
import com.cdainfo.vacaciones.entity.Usuario;

public interface ServiceUsuario {
		
		List<Usuario> traerTodos();
	    
		Usuario findById(Long usuarioId);
		
		Usuario grabar(Usuario usuario);
		
		void borrar(Usuario usuario);

}
