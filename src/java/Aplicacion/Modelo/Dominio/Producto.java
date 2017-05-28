/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Modelo.Dominio;

import java.io.Serializable;

/**
 *
 * @author Franco
 */
public class Producto implements Serializable{
    private String nombre;
    private String codigo;
    private double precio;
    private String cuota;
    private double pCuota;
    
    public Producto() {
        pCuota=0;
    }

    public Producto(String nombre, String codigo, double precio, String cuota, double pCuota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cuota = cuota;
        this.pCuota = pCuota;
    }
    
    public double precioenc(){
        double i=Double.parseDouble(getCuota());
        double res = 0;
        double cuotaant = getPrecio()/i;
        if(i == 1) return getPrecio();
        for(int j = 0; j < i; j++)
        {
            res = res + cuotaant;
            cuotaant = cuotaant*1.015;
        }
        return res;
    }
    
    public double total(){
       
        return getpCuota();
    }  

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the cuota
     */
    public String getCuota() {
        return cuota;
    }

    /**
     * @param cuota the cuota to set
     */
    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    /**
     * @return the pCuota
     */
    public double getpCuota() {
        return pCuota;
    }

    /**
     * @param pCuota the pCuota to set
     */
    public void setpCuota(double pCuota) {
        this.pCuota = pCuota;
    }
}
