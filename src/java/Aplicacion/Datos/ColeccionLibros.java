
package Aplicacion.Datos;

import Aplicacion.Modelo.Dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class ColeccionLibros implements Serializable {
    private ArrayList<Libro> libros;

    public ColeccionLibros() {
    libros = new ArrayList();
    }
    
    public void agregarLibros(Libro unLibro){
        getLibros().add(unLibro);
    }
 
        public ArrayList<Libro> buscarLibro (String buscaTit, String buscaCat, boolean cat){
        ArrayList<Libro> libroEncontrado = new ArrayList<Libro>(){};
        if(cat && !buscaTit.isEmpty()){
            for(Libro l : libros)
            {
                if(l.getTitulo().equals(buscaTit) && l.getCategoria().equals(buscaCat)){
                    libroEncontrado.add(l);
               }
            }
        }
        else if(!cat && !buscaTit.isEmpty()){
            for (Libro l : libros){
                if (l.getTitulo().equals(buscaTit)){
                    libroEncontrado.add(l);
                }
            }
        }
        else if(cat && buscaTit.isEmpty()){
            for (Libro l : libros){
                if (l.getCategoria().equals(buscaCat)){
                    libroEncontrado.add(l);
                }
            }            
        }
        return libroEncontrado;
    }
        
        
        
    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
