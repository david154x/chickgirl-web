package com.drr.ucompensar.api;

import java.util.List;

import com.drr.ucompensar.dto.ProductoDTO;
import com.drr.ucompensar.service.ProductoService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("producto")
public class ProductoREST {
	
	@Inject
	private ProductoService productoService;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductoDTO> consultarTodos() {
        return this.productoService.consultarTodos();
    }
	
	@GET
	@Path("{producto}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductoDTO consultarXId(@PathParam("producto") Long idProducto) {
        return this.productoService.consultarXId(idProducto);
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Path("crearProducto") 
    public Boolean crearProducto(ProductoDTO productoRequest) {
		return this.productoService.crearProducto(productoRequest);
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Path("crearProductos") 
    public Boolean crearProducto(List<ProductoDTO> lstProductoRequest ) {
		return this.productoService.crearProductos(lstProductoRequest);
    }

}
