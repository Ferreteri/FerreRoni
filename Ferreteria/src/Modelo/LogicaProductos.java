/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.DAO.ProductosDAO;

import Modelo.VO.ProductosVO;
import javax.swing.JOptionPane;
/**
 *
 * @author hpere
 */
public class LogicaProductos {
     public ProductosVO BuscarCodigoBarras(String CodigoBarras ) 
         {
		ProductosDAO frmProductosVODao;
		try {	
               frmProductosVODao = new ProductosDAO();
           
                return frmProductosVODao.buscarProducto(CodigoBarras);		
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Ingresa datos Alfanumericos","Error",JOptionPane.ERROR_MESSAGE);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
			
		}		
		return null;
	}
}
