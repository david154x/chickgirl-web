package com.drr.ucompensar.api;

import com.drr.ucompensar.service.InventarioService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("inventario")
public class InventarioREST {
	
	@Inject
	private InventarioService inventarioService;
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Path("descontarInventarioXProducto/{producto}/{cantidad}") 
    public String crearProducto(@PathParam("producto") Long idProducto, @PathParam("cantidad") Integer cantidad) {
		return this.inventarioService.descontarInventario(idProducto, cantidad);
    }

}
