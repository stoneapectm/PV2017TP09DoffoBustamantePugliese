/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Form.Bean;

import Aplicacion.Modelo.Dominio.Punto;
import Aplicacion.Modelo.Dominio.Triangulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tienda
 */
@ManagedBean
@RequestScoped
public class TrianguloFormBean implements Serializable{
    private double d;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private Triangulo unTriangulo;
    private String esTriangulo;
    private double unPerimetro;

    /**
     * Creates a new instance of TrianguloFormBean
     */
    public TrianguloFormBean() {
    }
    
    public void ingresarPuntos(){
        setEsTriangulo("No es Triangulo");
        Punto unPuntoA = new Punto(getX1(), getY1());
        Punto unPuntoB = new Punto(getX2(), getY2());
        Punto unPuntoC = new Punto(getX3(), getY3());
        unTriangulo = new Triangulo();
        
        if (unTriangulo.verificarTriangulo(unPuntoA, unPuntoB, unPuntoC)){
            setEsTriangulo("Es Triangulo");
            setUnPerimetro(unTriangulo.calcularPerimetro(unPuntoA, unPuntoB, unPuntoC));
        }
    }

    public TrianguloFormBean(double d, double x1, double y1, double x2, double y2, double x3, double y3, Triangulo unTriangulo, String esTriangulo, double unPerimetro) {
        this.d = d;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.unTriangulo = unTriangulo;
        this.esTriangulo = esTriangulo;
        this.unPerimetro = unPerimetro;
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
     * @return the unPerimetro
     */
    public double getUnPerimetro() {
        return unPerimetro;
    }

    /**
     * @param unPerimetro the unPerimetro to set
     */
    public void setUnPerimetro(double unPerimetro) {
        this.unPerimetro = unPerimetro;
    }
    
    
}
