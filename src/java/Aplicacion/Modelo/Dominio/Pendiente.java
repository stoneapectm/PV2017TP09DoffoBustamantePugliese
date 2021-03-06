/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Modelo.Dominio;

import java.io.Serializable;

/**
 *
 * @author tienda
 */
public class Pendiente implements Serializable{
    private double p;

    public Pendiente() {
    }

    public Pendiente(double p) {
        this.p = p;
    }
    
    public double calcularPendiente(Punto A, Punto B){
        setP((A.getY()-B.getY())/(A.getX()-B.getX()));
        return getP();
    }

    /**
     * @return the p
     */
    public double getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(double p) {
        this.p = p;
    }
}
