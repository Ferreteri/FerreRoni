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
//                                Productos.setExistencia(res.getFloat("Existencia"));
//                                Productos.setPrecioCompra(res.getDouble("PrecioCompra"));
//                                Productos.setPrecioCompraMayoreo(Double.parseDouble(res.getString("PrecioCompraMayoreo")));
//                                Productos.setPrecioPublico(Double.parseDouble(res.getString("PrecioPublico")));
//                                Productos.setPrecioMayoreoPublico(Double.parseDouble(res.getString("PrecioMayoreoPublico")));
//                                Productos.setFechaRegistro(res.getDate("FechaRegistro"));
//                                Productos.setActivo(res.getBoolean("Activo"));
                              
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
