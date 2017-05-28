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
public class Distancia implements Serializable {
    private double d;

    public Distancia() {
    }

    public Distancia(double d) {
        this.d = d;
    }
    public double calcularDistancia(Punto A,Punto B) {
        setD(Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()- A.getY(),2)));
        return getD();
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }
    
}
