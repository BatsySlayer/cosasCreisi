/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControllerAutor;
import control.ControllerLibro;
import entidades.Autor;
import entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author aulasingenieria
 */
public class PantallaLibreria {

    /**
     * @param args the command line arguments
     */
    
    private ControllerLibro crL = new ControllerLibro();
    private ControllerAutor crA = new ControllerAutor();
    
    public static void main(String[] args) {
        // TODO code application logic here
        PantallaLibreria pr = new PantallaLibreria();
        Libro libro1 = new Libro ("Lol", "1", 10);
        Libro libro2 = new Libro ("Lul", "1", 20);
        Autor au1 = new Autor("J", "1", "ACTIVO");
        Autor au2 = new Autor("K", "2", "INACTIVO");
        if(pr.crA.agregarAutor(au1)){
            System.out.println("Se pudo agregar autor de nombre "+au1.getNombre());
        }else{
            System.out.println("No se pudo agregar autor de nombre "+au1.getNombre());
        }
        if(pr.crA.agregarAutor(au2)){
            System.out.println("Se pudo agregar autor de nombre "+au2.getNombre());
        }else{
            System.out.println("No se pudo agregar autor de nombre "+au2.getNombre());
        }
        ArrayList <Libro> libros = pr.crL.retornarLibros();
        if(pr.crA.agregarLibroAAutor(au1, libro1, libros)){
            System.out.println("Se ha agregado el libro "+libro1.getNombre()+" al autor "+au1.getNombre());
        }else{
            System.out.println("No se ha agregado el libro "+libro1.getNombre()+" al autor "+au1.getNombre());
        }
        if(pr.crA.agregarLibroAAutor(au2, libro2, libros)){
            System.out.println("Se ha agregado el libro "+libro2.getNombre()+" al autor "+au2.getNombre());
        }else{
            System.out.println("No se ha agregado el libro "+libro2.getNombre()+" al autor "+au2.getNombre());
        }
        System.out.println("Costo total de los libros del autor "+au1.getNombre()+ " es "+pr.crA.calcularCostoLibrosPorAutor("1"));
        System.out.println("Costo total de los libros del autor "+au2.getNombre()+ " es "+pr.crA.calcularCostoLibrosPorAutor("2"));
        System.out.println("El costo total de los libros es "+pr.crA.calcularCostoTotalLibros());
    }
    
}
