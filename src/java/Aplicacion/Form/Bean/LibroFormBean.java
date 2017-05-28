/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Form.Bean;

import Aplicacion.Datos.ColeccionLibros;
import Aplicacion.Modelo.Dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Familia
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable {
    private ColeccionLibros libros;
    private Libro libro;
    private ArrayList<Libro> librosBusq = new ArrayList<Libro>();
    private String unIsbn;
    private String unAutor;
    private String unTitulo;
    private double unPrecio;
    private String unaCategoria;
    private ArrayList<String> categorias;
    private boolean cat;
    private String buscaTitulo;
    private String buscaCat;

    /**
     * Creates a new instance of LibroFormBean
     */
    public LibroFormBean() {
    libros = new ColeccionLibros();
    categorias = new ArrayList ();
    categorias.add("Novela");
    categorias.add("Ciencia Ficcion");
    categorias.add("Politica");
    categorias.add("Ciencias exactas");
    categorias.add("Economia");
    categorias.add("Manual");
    cat = false;
    }

    public void agregarLibro(){
        setLibro(new Libro(getUnIsbn(),getUnAutor(),getUnTitulo(),getUnPrecio(),getUnaCategoria()));
                getLibros().agregarLibros(getLibro());
    }
    
    public void buscarLibro (){
        //libro;
        
        setLibrosBusq(libros.buscarLibro (getBuscaTitulo(), getBuscaCat(), isCat()));
    }
    /**
     * @return the libros
     */
    public ColeccionLibros getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ColeccionLibros libros) {
        this.libros = libros;
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the unIsbn
     */
    public String getUnIsbn() {
        return unIsbn;
    }

    /**
     * @param unIsbn the unIsbn to set
     */
    public void setUnIsbn(String unIsbn) {
        this.unIsbn = unIsbn;
    }

    /**
     * @return the unAutor
     */
    public String getUnAutor() {
        return unAutor;
    }

    /**
     * @param unAutor the unAutor to set
     */
    public void setUnAutor(String unAutor) {
        this.unAutor = unAutor;
    }

    /**
     * @return the unTitulo
     */
    public String getUnTitulo() {
        return unTitulo;
    }

    /**
     * @param unTitulo the unTitulo to set
     */
    public void setUnTitulo(String unTitulo) {
        this.unTitulo = unTitulo;
    }

    /**
     * @return the unPrecio
     */
    public double getUnPrecio() {
        return unPrecio;
    }

    /**
     * @param unPrecio the unPrecio to set
     */
    public void setUnPrecio(double unPrecio) {
        this.unPrecio = unPrecio;
    }

    /**
     * @return the unaCategoria
     */
    public String getUnaCategoria() {
        return unaCategoria;
    }

    /**
     * @param unaCategoria the unaCategoria to set
     */
    public void setUnaCategoria(String unaCategoria) {
        this.unaCategoria = unaCategoria;
    }

    /**
     * @return the categorias
     */
    public ArrayList<String> getCategorias() {
        return categorias;
    }

    /**
     * @param categorias the categorias to set
     */
    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }

    /**
     * @return the cat
     */
    public boolean isCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(boolean cat) {
        this.cat = cat;
    }

    /**
     * @return the buscaTitulo
     */
    public String getBuscaTitulo() {
        return buscaTitulo;
    }

    /**
     * @param buscaTitulo the buscaTitulo to set
     */
    public void setBuscaTitulo(String buscaTitulo) {
        this.buscaTitulo = buscaTitulo;
    }

    /**
     * @return the buscaCat
     */
    public String getBuscaCat() {
        return buscaCat;
    }

    /**
     * @param buscaCat the buscaCat to set
     */
    public void setBuscaCat(String buscaCat) {
        this.buscaCat = buscaCat;
    }

    /**
     * @return the librosBusq
     */
    public ArrayList<Libro> getLibrosBusq() {
        return librosBusq;
    }

    /**
     * @param librosBusq the librosBusq to set
     */
    public void setLibrosBusq(ArrayList<Libro> librosBusq) {
        this.librosBusq = librosBusq;
    }
    
}
