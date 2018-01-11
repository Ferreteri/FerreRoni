/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.VO;

import java.util.Date;

/**
 *
 * @author hpere
 */
public class ProductosVO {
     private Integer IdProductoPK;
     private Integer IdTipoProductoFK;
    private String CodigoBarras;
    private String ClaveProducto;
    private String Nombre;
    private String Descripcion;
    private Double Existencia;
    private Double PrecioCompra;
    private Double PrecioCompraMayoreo;
    private Double PrecioPublico;
    private Double PrecioMayoreoPublico;
    private Date FechaRegistro;
    private Boolean Activo;

    public Integer getIdProductoPK() {
        return IdProductoPK;
    }

    public void setIdProductoPK(Integer IdProductoPK) {
        this.IdProductoPK = IdProductoPK;
    }

    public Integer getIdTipoProductoFK() {
        return IdTipoProductoFK;
    }

    public void setIdTipoProductoFK(Integer IdTipoProductoFK) {
        this.IdTipoProductoFK = IdTipoProductoFK;
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(String CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }

    public String getClaveProducto() {
        return ClaveProducto;
    }

    public void setClaveProducto(String ClaveProducto) {
        this.ClaveProducto = ClaveProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Double getExistencia() {
        return Existencia;
    }

    public void setExistencia(Double Existencia) {
        this.Existencia = Existencia;
    }

    public Double getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(Double PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public Double getPrecioCompraMayoreo() {
        return PrecioCompraMayoreo;
    }

    public void setPrecioCompraMayoreo(Double PrecioCompraMayoreo) {
        this.PrecioCompraMayoreo = PrecioCompraMayoreo;
    }

    public Double getPrecioPublico() {
        return PrecioPublico;
    }

    public void setPrecioPublico(Double PrecioPublico) {
        this.PrecioPublico = PrecioPublico;
    }

    public Double getPrecioMayoreoPublico() {
        return PrecioMayoreoPublico;
    }

    public void setPrecioMayoreoPublico(Double PrecioMayoreoPublico) {
        this.PrecioMayoreoPublico = PrecioMayoreoPublico;
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
    
    
}
