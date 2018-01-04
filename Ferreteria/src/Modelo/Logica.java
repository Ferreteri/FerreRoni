/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.DAO.UsuariosDAO;
import Modelo.VO.UsuariosVO;
import controlador.Coordinator;
import javax.swing.JOptionPane;
/**
 *
 * @author sistema
 */
public class Logica {
    
        private Coordinator ClassCoordinador;
	public static boolean consultaUsuarios=false;
	public static boolean modificaUsuarios=false;
    
            public void setCoordinator(Coordinator ClassCoordinador) {
		this.ClassCoordinador=ClassCoordinador;
		
            }    
        
    
                public void validarRegistro(UsuariosVO Usuarios) {
		UsuariosDAO frmUsuariosDao;
		if (Usuarios.getIdUsuarioPK()> 99) {
			frmUsuariosDao = new UsuariosDAO();
			frmUsuariosDao.registrarUsuarios(Usuarios);						
		}else {
			JOptionPane.showMessageDialog(null,"El documento de la persona debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
		
                }
                }
                
                public UsuariosVO validarConsulta(String codigoUsuario) {
		UsuariosDAO frmUsuariosDao;
		
		try {
			int codigo=Integer.parseInt(codigoUsuario);	
			if (codigo > 99) {
				frmUsuariosDao = new UsuariosDAO();
				consultaUsuarios=true;
				return frmUsuariosDao.buscarUsuario(codigo);						
			}else{
				JOptionPane.showMessageDialog(null,"El documento de la persona debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
				consultaUsuarios=false;
			}
			
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Debe ingresar un dato numerico","Error",JOptionPane.ERROR_MESSAGE);
			consultaUsuarios=false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
			consultaUsuarios=false;
		}
					
		return null;
	}
		
	public void validarModificacion(UsuariosVO Usuarios) {
		UsuariosDAO frmUsuariosDAO;
		if (Usuarios.getNombre().length()>3) {
			frmUsuariosDAO = new UsuariosDAO();
			frmUsuariosDAO.modificarUsuarios(Usuarios);	
			modificaUsuarios=true;
		}else{
			JOptionPane.showMessageDialog(null,"El nombre de la persona debe ser mayor a 5 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
			modificaUsuarios=false;
		}
	}
        
        public void validarEliminacion(String codigo) {
		UsuariosDAO frmUsuario=new UsuariosDAO();
		frmUsuario.eliminarUsuarios(codigo);
	}
    
}
