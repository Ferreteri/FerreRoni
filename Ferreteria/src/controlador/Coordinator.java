/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Logica;
import Modelo.DAO.UsuariosDAO;
import Modelo.VO.UsuariosVO;
import Vista.Inicio.SplashScreen;
import Vista.Inicio.Login;
import Vista.MenuPrincipal.MenuPrincipal;

/**
 *
 * @author sistema
 */
public class Coordinator {
 
        private Logica miLogica;
	private SplashScreen frmSplashScreen;

    public Logica getMiLogica() {
        return miLogica;
    }

    public void setMiLogica(Logica miLogica) {
        this.miLogica = miLogica;
    }

    public SplashScreen getFrmSplashScreen() {
        return frmSplashScreen;
    }

    public void setFrmSplashScreen(SplashScreen frmSplashScreen) {
        this.frmSplashScreen = frmSplashScreen;
    }
        
      
}
