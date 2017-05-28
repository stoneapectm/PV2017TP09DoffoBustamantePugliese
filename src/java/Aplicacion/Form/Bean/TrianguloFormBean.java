/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Form.Bean;

import Aplicacion.Modelo.Dominio.Distancia;
import Aplicacion.Modelo.Dominio.Punto;
import Aplicacion.Modelo.Dominio.Triangulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author tienda
 */
@ManagedBean
@ViewScoped
public class TrianguloFormBean implements Serializable{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private Triangulo unTriangulo;
    private String esTriangulo;
    private Distancia distancia;
    private double perimetro;
    /**
     * Creates a new instance of TrianguloFormBean
     */
    public TrianguloFormBean() {
        perimetro=0;
    }
    
    public void ingresarPuntos(){
        setEsTriangulo("No es Triangulo");
        Punto unPuntoA=new Punto(getX1(), getY1());
        Punto unPuntoB=new Punto(getX2(), getY2());
        Punto unPuntoC=new Punto(getX3(), getY3());
        setUnTriangulo(new Triangulo());
        setDistancia(new Distancia());
        if(getUnTriangulo().verificarTriangulo(unPuntoA,unPuntoB,unPuntoC)){
            setEsTriangulo("Es Triangulo");
            setPerimetro(getDistancia().calcularDistancia(unPuntoA, unPuntoB) + getDistancia().calcularDistancia(unPuntoB, unPuntoC) + getDistancia().calcularDistancia(unPuntoA, unPuntoC));
        }
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public double getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }

    /**
     * @return the y2
     */
    public double getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }

    /**
     * @return the x3
     */
    public double getX3() {
        return x3;
    }

    /**
     * @param x3 the x3 to set
     */
    public void setX3(double x3) {
        this.x3 = x3;
    }

    /**
     * @return the y3
     */
    public double getY3() {
        return y3;
    }

    /**
     * @param y3 the y3 to set
     */
    public void setY3(double y3) {
        this.y3 = y3;
    }

    /**
     * @return the unTriangulo
     */
    public Triangulo getUnTriangulo() {
        return unTriangulo;
    }

    /**
     * @param unTriangulo the unTriangulo to set
     */
    public void setUnTriangulo(Triangulo unTriangulo) {
        this.unTriangulo = unTriangulo;
    }

    /**
     * @return the esTriangulo
     */
    public String getEsTriangulo() {
        return esTriangulo;
    }

    /**
     * @param esTriangulo the esTriangulo to set
     */
    public void setEsTriangulo(String esTriangulo) {
        this.esTriangulo = esTriangulo;
    }

    /**
     * @return the distancia
     */
    public Distancia getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(Distancia distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
