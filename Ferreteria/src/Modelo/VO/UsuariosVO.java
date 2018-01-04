/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.VO;

import java.sql.Date;



/**
 *
 * @author sistema
 */
public class UsuariosVO {
    private Integer IdUsuarioPK;
    private String Usuario;
    private String Contrasena;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private Integer Edad;
    private Date FechaRegistro;
    private Boolean Activo; 
    private Integer IdTipoUsuarioFK;

    public Integer getIdUsuarioPK() {
        return IdUsuarioPK;
    }

    public void setIdUsuarioPK(Integer IdUsuarioPK) {
        this.IdUsuarioPK = IdUsuarioPK;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }

    public Integer getIdTipoUsuarioFK() {
        return IdTipoUsuarioFK;
    }

    public void setIdTipoUsuarioFK(Integer IdTipoUsuarioFK) {
        this.IdTipoUsuarioFK = IdTipoUsuarioFK;
    }
    
    
    
}
