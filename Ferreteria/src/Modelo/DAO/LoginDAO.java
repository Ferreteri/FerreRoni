/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion.Conexion;
import Modelo.VO.UsuariosVO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sistema
 */
public class LoginDAO {
    
    
     public UsuariosVO LoginUsuario(String Usuario,String Contrasena) 
	{//SELECT*FROM Usuarios u WHERE u.Usuario='javier' AND u.Contrasena='1234';
		Conexion conex= new Conexion();
		UsuariosVO Usuarios= new UsuariosVO();
		boolean existe=false;
		try {//IdUsuarioPK, Usuario, Contrasena, Nombre, ApellidoP, ApellidoM, Edad, FechaRegistro, Activo,IdTipoUsuarioFK
			//Statement estatuto = conex.getConnection().createStatement();
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Usuarios where Usuario = '?' AND Contrasena='?' ");
			consulta.setString(1, Usuario);
                        consulta.setString(2, Contrasena);
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				existe=true;
				Usuarios.setIdUsuarioPK(Integer.parseInt(res.getString("IdUsuarioPK")));
				Usuarios.setUsuario(res.getString("Usuario"));
				Usuarios.setContrasena(res.getString("Contrasena"));
				Usuarios.setNombre(res.getString("Nombre"));
				Usuarios.setApellidoP(res.getString("ApellidoP"));
                                Usuarios.setApellidoM(res.getString("ApellidoM"));
                                Usuarios.setEdad(Integer.parseInt(res.getString("Edad")));
                                Usuarios.setFechaRegistro(Date.valueOf(res.getString("FechaRegistro")));
                                Usuarios.setActivo(Boolean.valueOf(res.getString("Activo")));
                                Usuarios.setIdTipoUsuarioFK(Integer.parseInt(res.getString("IdTipoUsuarioFK")));
			 }
			res.close();
			conex.desconectar();
                        
			} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Error, no se conecto");
					System.out.println(e);
			}
		
			if (existe) {
				return Usuarios;
			}
			else return null;				
	}
     
}
