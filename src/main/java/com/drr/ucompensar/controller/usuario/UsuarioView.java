package com.drr.ucompensar.controller.usuario;

import java.io.Serializable;

import com.drr.ucompensar.service.UsuarioService;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
public class UsuarioView implements Serializable {
	
	@Inject
	private UsuarioService usuarioService; 

	private static final long serialVersionUID = 1L;
	
	@Getter @Setter
	private String nombre;
	
	public void guardarNuevoUsuario() {
		try {
			
			if ( this.nombre != null && !this.nombre.isBlank() ) {
				
				this.usuarioService.crearUsuario(this.nombre);
				System.out.println("Se ha creado el usuario correctamente");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
