/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;


import Modelo.Conexion.Conexion;
import Modelo.VO.UsuariosVO;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sistema
 */
public class UsuariosDAO 
{
    
    public void registrarUsuarios(UsuariosVO addUsuarios)
	{
		Conexion conex= new Conexion();
		
		try {//IdUsuarioPK, Usuario, Contrasena, Nombre, ApellidoP, ApellidoM, Edad, FechaRegistro, Activo,IdTipoUsuarioFK
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO Usuarios VALUES ('"+addUsuarios.getIdUsuarioPK()+"', '"
					+addUsuarios.getUsuario()+"', '"+addUsuarios.getContrasena()+"', '"
                                        +addUsuarios.getNombre()+"', '"+addUsuarios.getApellidoP()+"', '"
                                        +addUsuarios.getEdad()+"', '"+addUsuarios.getFechaRegistro()+"', '"
					+addUsuarios.getActivo()+"', '"+addUsuarios.getIdTipoUsuarioFK()+"')");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}
    
    public UsuariosVO buscarUsuario(int IdTipoUsuarioFK) 
	{
		Conexion conex= new Conexion();
		UsuariosVO Usuarios= new UsuariosVO();
		boolean existe=false;
		try {//IdUsuarioPK, Usuario, Contrasena, Nombre, ApellidoP, ApellidoM, Edad, FechaRegistro, Activo,IdTipoUsuarioFK
			//Statement estatuto = conex.getConnection().createStatement();
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Usuarios where IdUsuarioPK = ? ");
			consulta.setInt(1, IdTipoUsuarioFK);
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
                                //Usuarios.setFechaRegistro(Date.valueOf(res.getString("FechaRegistro")));
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
    
    public void modificarUsuarios(UsuariosVO UsuarioUpdate) 
    {
		Conexion conex= new Conexion();
		try{//IdUsuarioPK, Usuario, Contrasena, Nombre, ApellidoP, ApellidoM, Edad, FechaRegistro, Activo,IdTipoUsuarioFK
		String consulta="UPDATE Usuarios SET IdUsuarioPK= ? ,Usuario = ? , Contrasena=? , Nombre=? , ApellidoP= ?  , ApellidoM= ?  ,"
                                + " Edad= ?  , FechaRegistro= ?  , Activo= ?  , IdTipoUsuarioFK= ? WHERE IdUsuarioPK= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			
            estatuto.setInt(1, UsuarioUpdate.getIdUsuarioPK());
            estatuto.setString(2, UsuarioUpdate.getUsuario());
            estatuto.setString(3, UsuarioUpdate.getContrasena());
            estatuto.setString(4, UsuarioUpdate.getNombre());
            estatuto.setString(5,UsuarioUpdate.getApellidoP());
            estatuto.setString(6, UsuarioUpdate.getApellidoM());
            estatuto.setInt(7, UsuarioUpdate.getEdad());
            //estatuto.setDate(8, UsuarioUpdate.getFechaRegistro());
            estatuto.setBoolean(9, UsuarioUpdate.getActivo());
            estatuto.setInt(10, UsuarioUpdate.getIdTipoUsuarioFK());
            estatuto.executeUpdate();
            
          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException	 e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);
        }	
    }
    
    public void eliminarUsuarios(String IdUsuarioPK)
	{
		Conexion conex= new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM Usuarios WHERE IdUsuarioPK='"+IdUsuarioPK+"'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}
    
    
}
