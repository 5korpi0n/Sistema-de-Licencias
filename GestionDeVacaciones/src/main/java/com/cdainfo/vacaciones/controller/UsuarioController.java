package com.cdainfo.vacaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdainfo.vacaciones.entity.Peticion;
import com.cdainfo.vacaciones.entity.Usuario;
//import com.cdainfo.vacaciones.entity.enumerado.Estado;
import com.cdainfo.vacaciones.repository.PeticionRepository;
import com.cdainfo.vacaciones.service.ServiceUsuario;
//import com.cdainfo.vacaciones.service.impl.ServiceUsuarioImpl;


@RestController
public class UsuarioController {
	
	
	@Autowired
    ServiceUsuario serviceUsuario;
	
	@Autowired
	PeticionRepository peticionRepository;
	 Peticion peticion;

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios() {
        List<Usuario> lista = serviceUsuario.traerTodos();
        return lista;
    }
    
    @GetMapping("/peticion")
	public String peticion(Model model) {
		model.addAttribute("peticion", new Peticion());
		return "peticion";
	}
    
    @GetMapping("/usuario/{usuarioId}")
	public Usuario getUsuario(@PathVariable Long usuarioId){
    	System.out.println("Usuario: " + usuarioId);
    	Usuario usuario = serviceUsuario.findById(usuarioId);
//    	usuario.setEstado(Estado.Aprobado);
//    	if ( usuario.getEstado() == Estado.Cancelado ) {
//    		
//    	}
    	return usuario;
    }
    

    
	@PostMapping("/usuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		usuario = serviceUsuario.grabar(usuario);
		
		return usuario;
		
	}
	
	@PostMapping("/cargarPeticion")
	  public String peticion(@ModelAttribute Peticion peticion) {
	    return "resultadoPeticion";
	  }

	@PutMapping("/usuario")
	public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
		
		usuario = serviceUsuario.grabar(usuario);
		
		return usuario;
	}
	
	@DeleteMapping("usuario_borrar/{usuarioId}")
	public String eliminarUsuario(@PathVariable Long usuarioId) {
		
		Usuario usuario = serviceUsuario.findById(usuarioId);
		
		if ( usuario == null ) {
			throw new RuntimeException("Usuario con id " + usuarioId + " no se encuentra");
		}
		
		serviceUsuario.borrar(usuario);
		
		return "Se ha eliminado el usuario id = "+usuarioId;
	}
}
