package com.AppUsuarios.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.AppUsuarios.model.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuariosService usuarioService;

	@GetMapping("/api/usuarios")
	public List<Usuario> obtenerUsuarios(){
		// Se Crea una lista de Tipo Usuario y nombre del objeto es listaUsuarios
		 List<Usuario> listaUsuarios = new ArrayList<>();
		 
		 // Creando usuarios en la lista Usuarios
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setNombre("Juan");
		u1.setApellido("Perez Perez");
		u1.setCorreo("juan@test.com");
		
		Usuario u2 = new Usuario();
		u2.setId(2);
		u2.setNombre("Jorge");
		u2.setApellido("Rosales Castro");
		u2.setCorreo("jorge@test.com");
		
		Usuario u3 = new Usuario();
		u3.setId(3);
		u3.setNombre("Cristian Omar ");
		u3.setApellido("Torres Chegue");
		u3.setCorreo("torreschegue@test.com");
		
		
		// Agregar Usuarios a lista
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		listaUsuarios.add(u3);
		
		return listaUsuarios;
	}
	
	@PostMapping("/api/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		System.out.println("Vas a Ingrear: " + usuario);
		usuarioService.guardar(usuario); // Aqui es cuando se manda la informacion a la base de datos
	
		return usuario;
	}
	
	//@GetMapping("/api/usuarios")
	//public List<Usuario>obtenerTodo(){
		//return usuarioService.obtenerUsuarios();
	//}
	
}