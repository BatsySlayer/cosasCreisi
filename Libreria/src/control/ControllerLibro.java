/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author aulasingenieria
 */
public class ControllerLibro {
    
    private ArrayList <Libro> libros = new ArrayList <Libro> ();
    
    
    public ArrayList <Libro> retornarLibros(){
        return libros;
    }
    
    private Libro buscarLibro(String isbn){
        for(Libro actual : this.libros){
            if(actual.getIsbn().equals(isbn)){
                return actual;
            }
        }
        return null;
    }
    
    public boolean agregarLibro(Libro libro){
        String iActual = libro.getIsbn();
        if(buscarLibro(iActual)==null){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
    
}
