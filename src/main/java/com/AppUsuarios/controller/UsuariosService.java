package com.AppUsuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AppUsuarios.model.Usuario;

@Service
public class UsuariosService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	// Primer Metodo Que nos va a permitir Guardar un Usuario.
	public void guardar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> obtenerUsuarios(){
		return usuarioRepository.findAll();
	}
	
	

}
