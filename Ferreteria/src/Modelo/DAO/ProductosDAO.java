/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion.Conexion;
import Modelo.VO.ProductosVO;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author hpere
 */
public class ProductosDAO 
{

public ProductosVO buscarProducto(String CodigoBarras) 
	{
		Conexion conex= new Conexion();
		ProductosVO Productos= new ProductosVO();
		boolean existe=false;
		try {//IdProductoPK, IdTipoProductoFK, CodigoBarras, ClaveProducto, Nombre, Descripcion, Exixtencia, PrecioCompra, 
                      //PrecioCompraMayoreo, PrecioPublico, PrecioMayoreoPublico, fecha_Registro, Activo
                      //
			PreparedStatement consulta = conex.getConnection().prepareStatement("select*from Productos where  CodigoBarras=? ");
			consulta.setString(1, CodigoBarras);
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				existe=true;
				Productos.setIdProductoPK(Integer.parseInt(res.getString("IdProductoPK")));
				Productos.setIdTipoProductoFK(Integer.parseInt(res.getString("IdTipoProductoFK")));
                                Productos.setCodigoBarras(res.getString("CodigoBarras"));
				Productos.setClaveProducto(res.getString("ClaveProducto"));
                                Productos.setNombre(res.getString("Nombre"));
                                Productos.setDescripcion(res.getString("Descripcion"));
                                Productos.setExistencia(res.getDouble("Exixtencia"));
                                Productos.setPrecioCompra(res.getDouble("PrecioCompra"));
                                Productos.setPrecioCompraMayoreo(res.getDouble("PrecioCompraMayoreo"));
                                Productos.setPrecioPublico(res.getDouble("PrecioPublico"));
                                Productos.setPrecioMayoreoPublico(res.getDouble("PrecioMayoreoPublico"));
                                Productos.setFechaRegistro(res.getDate("Fecha_Registro"));
                                Productos.setActivo(res.getBoolean("Activo"));
                              
			 }
			res.close();
			conex.desconectar();
					
					
			} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Error, no se conecto");
					System.out.println(e);
			}
		
			if (existe) {
				return Productos;
			}
			else return null;				
	}    
}
