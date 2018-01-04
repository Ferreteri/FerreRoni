/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.DAO.LoginDAO;
import static Modelo.Logica.consultaUsuarios;
import Modelo.VO.UsuariosVO;
import javax.swing.JOptionPane;

/**
 *
 * @author sistema
 */
public class LogicaLogin {
    
    
    
        public UsuariosVO InicioLogin(String Nombre,String Contrasena) 
         {
		LoginDAO frmLoginDao;
		try {	
                frmLoginDao = new LoginDAO();
                consultaUsuarios=true;
                return frmLoginDao.LoginUsuario(Nombre,Contrasena);		
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Ingresa datos Alfanumericos","Error",JOptionPane.ERROR_MESSAGE);
			consultaUsuarios=false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
			consultaUsuarios=false;
		}		
		return null;
	}
                    
    
}
