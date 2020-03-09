/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Autor;
import entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author aulasingenieria
 */
public class ControllerAutor {
    
    private ArrayList <Autor> autores = new ArrayList <Autor> ();
    
    private Autor buscarAutor(String ced){
        for(Autor actual:this.autores){
            if(actual.getCedula().equals(ced)){
                return actual;
            }
        }
        return null;
    }
    
    private Libro buscarLibroDeAutor(String ced, String isbn){
        Autor actual = buscarAutor(ced);
        if(actual!=null){
            for(Libro lActual:actual.getLibrosEscritos()){
                if(lActual.getIsbn().equals(isbn)){
                    return lActual;
                }
            }
        }
        return null;
    }
    
    public boolean agregarAutor(Autor autor){
        String cAutor = autor.getCedula();
        if(buscarAutor(cAutor)==null){
            this.autores.add(autor);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean agregarLibroAAutor(Autor autor, Libro libro, ArrayList <Libro> crL){
        String cAutor = autor.getCedula();
        if(buscarAutor(cAutor)!=null){
            if(buscarLibroDeAutor(cAutor, libro.getIsbn())==null){
                for(Libro actual : crL){
                    if(actual.equals(libro)){
                        autor.getLibrosEscritos().add(libro);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public int calcularCostoLibrosPorAutor(String ced){
        Autor actual = buscarAutor(ced);
        int cont = 0;
        if(actual!=null){
            for(Libro lActual : actual.getLibrosEscritos()){
                cont = cont + lActual.getCosto();
            }
            return cont;
        }else{
            return 0;
        }
    }
    
    public int calcularCostoTotalLibros(){
        String cActual;
        int cont = 0;
        for(Autor actual : autores){
            cActual = actual.getCedula();
            cont = cont + calcularCostoLibrosPorAutor(cActual);
        }
        return cont;
    }
    
}
