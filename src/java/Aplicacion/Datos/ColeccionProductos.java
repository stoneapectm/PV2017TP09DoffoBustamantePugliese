/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Datos;

import Aplicacion.Modelo.Dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public class ColeccionProductos implements Serializable{
    private ArrayList<Producto> lproductos;

    public ColeccionProductos() {
        lproductos=new ArrayList();
    
    }
    public double productoTotal()
    {
        double suma = 0;
        for(Producto a : getLproductos())
        {
            suma = suma + a.precioenc();
        }       // System.out.println(suma);
        
        return suma;
    }    
    public void agregarProducto(Producto unProducto){
        getLproductos().add(unProducto);
    }

    /**
     * @return the lproductos
     */
    public ArrayList<Producto> getLproductos() {
        return lproductos;
    }

    /**
     * @param lproductos the lproductos to set
     */
    public void setLproductos(ArrayList<Producto> lproductos) {
        this.lproductos = lproductos;
    }
    
}
