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
public class Triangulo implements Serializable{
    private Pendiente p;
    private Punto unPuntoA;
    private Punto unPuntoB;
    private Punto unPuntoC;

    public Triangulo() {
    }

    public Triangulo(Pendiente p, Punto unPuntoA, Punto unPuntoB, Punto unPuntoC) {
        this.p = p;
        this.unPuntoA = unPuntoA;
        this.unPuntoB = unPuntoB;
        this.unPuntoC = unPuntoC;
    }
    
    public boolean verificarTriangulo(Punto unPuntoA, Punto unPuntoB, Punto unPuntoC){
        boolean bandera=true;
        setP(new Pendiente());
        double pendiente1=getP().calcularPendiente(unPuntoA, unPuntoB);
        double pendiente2=getP().calcularPendiente(unPuntoB, unPuntoC);
        double pendiente3=getP().calcularPendiente(unPuntoA, unPuntoC);
        if(pendiente1==pendiente2){
            if(pendiente2==pendiente3){
                bandera=false;
            }
        }
        return bandera;
    }

    /**
     * @return the p
     */
    public Pendiente getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Pendiente p) {
        this.p = p;
    }

    /**
     * @return the unPuntoA
     */
    public Punto getUnPuntoA() {
        return unPuntoA;
    }

    /**
     * @param unPuntoA the unPuntoA to set
     */
    public void setUnPuntoA(Punto unPuntoA) {
        this.unPuntoA = unPuntoA;
    }

    /**
     * @return the unPuntoB
     */
    public Punto getUnPuntoB() {
        return unPuntoB;
    }

    /**
     * @param unPuntoB the unPuntoB to set
     */
    public void setUnPuntoB(Punto unPuntoB) {
        this.unPuntoB = unPuntoB;
    }

    /**
     * @return the unPuntoC
     */
    public Punto getUnPuntoC() {
        return unPuntoC;
    }

    /**
     * @param unPuntoC the unPuntoC to set
     */
    public void setUnPuntoC(Punto unPuntoC) {
        this.unPuntoC = unPuntoC;
    }

   
    
    
}
