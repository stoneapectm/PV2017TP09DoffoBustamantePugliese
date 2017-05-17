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
    private double perim;
    private double d;
    private Pendiente p;
    private Punto unPuntoA;
    private Punto unPuntoB;
    private Punto unPuntoC;

    public Triangulo() {
    }

    public Triangulo(double d, Pendiente p, Punto unPuntoA, Punto unPuntoB, Punto unPuntoC, double perim) {
        this.perim = perim;
        this.d = d;
        this.p = p;
        this.unPuntoA = unPuntoA;
        this.unPuntoB = unPuntoB;
        this.unPuntoC = unPuntoC;
    }
    
    public boolean verificarTriangulo(Punto unPuntoA, Punto unPuntoB, Punto unPuntoC){
        boolean bandera = true;
        p = new Pendiente();
        double pendiente1 = p.calcularPendiente(unPuntoA, unPuntoB);
        double pendiente2 = p.calcularPendiente(unPuntoB, unPuntoC);
        double pendiente3 = p.calcularPendiente(unPuntoA, unPuntoC);
        
        if (pendiente1 == pendiente2){
            if (pendiente2 == pendiente3){
                bandera = false;
            }
        }
        return bandera;
    }
    
    public double calcularDistancia (Punto A, Punto B){
        d=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
        return d;
    }
    
    public double calcularPerimetro(Punto unPuntoA, Punto unPuntoB, Punto unPuntoC){
        boolean verif;
        setPerim(0);
        verif = verificarTriangulo(unPuntoA, unPuntoB, unPuntoC);
        if (verif == true){
            double distancia1 = calcularDistancia(unPuntoA, unPuntoB);
            double distancia2 = calcularDistancia(unPuntoB, unPuntoC);
            double distancia3 = calcularDistancia(unPuntoA, unPuntoC);
            setPerim(distancia1+distancia2+distancia3);
        }
        return getPerim();
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

    /**
     * @return the perim
     */
    public double getPerim() {
        return perim;
    }

    /**
     * @param perim the perim to set
     */
    public void setPerim(double perim) {
        this.perim = perim;
    }
    
    
}
