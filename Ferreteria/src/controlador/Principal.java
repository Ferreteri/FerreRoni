/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Logica;
import Vista.Inicio.SplashScreen;
import Vista.Inicio.Login;
import Vista.MenuPrincipal.MenuPrincipal;

/**
 *
 * @author hpere
 */
public class Principal {
    
    
     Logica miLogica;
	SplashScreen frmSplashScreen;
	Login frmLogin;
	MenuPrincipal frmMenuPrincipal;
	Coordinator ClassCoordinator;
        
        
     public static void main(String[] args) {
         Principal CargaMenu=new Principal();
		CargaMenu.iniciar();
     }
     
     
     private void iniciar() {
		/*Se instancian las clases*/
		frmSplashScreen=new SplashScreen();
                
                /*Se establecen las relaciones entre clases*/
		frmSplashScreen.setCoordinador(ClassCoordinator);
                
                
                /*Se establecen relaciones con la clase coordinador*/
		ClassCoordinator.setFrmSplashScreen(frmSplashScreen);
                
	}

     
}
