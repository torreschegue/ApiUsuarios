package com.AppUsuarios.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.AppUsuarios.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	// Esta clase se va a utilizar para poder usar los metodos de JpaRepository
	

}
