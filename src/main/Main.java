/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Editorial;
import core.Megaferia;
import core.libros.Libro;
import core.libros.LibroDigital;
import core.libros.LibroImpreso;
import core.persona.Autor;
import core.persona.Gerente;
import java.util.ArrayList;

/**
 *
 * @author Santiagodd
 */
public class Main {
    public static void main(String[] args) {
       Megaferia megaferia = new Megaferia();
       
       megaferia.createStand(100000);
       megaferia.createStand(200000);
       megaferia.createStand(300000);
       megaferia.createStand(500000);
       
        Gerente gerente1 = new Gerente("Juliao", 104893);
        Gerente gerente2 = new Gerente("Pedro", 11671);
        
        Editorial editorial1 = new Editorial("345-3455345-3", "Planeta", "Calle 12 centro", gerente1);
        Editorial editorial2 = new Editorial("368-859074-2", "Universal", "Calle 14 sur", gerente2);
        
        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(3);
        standsIds.add(4);
        
        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);
        
        Autor autor1 = new Autor("Julian", 198848234);
        Autor autor2 = new Autor("Juan Morales", 8745768);
        Autor autor3 = new Autor("Daniel Sanchez", 4598673);
        
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        
        Libro libro1 = new LibroImpreso(120, 60, "it", autores, "237864", "Terror", "Pasta Dura", 120000, editorial1);
        
        autores = new ArrayList<>();
        autores.add(autor2);
        autores.add(autor3);
       
        ArrayList<String> hipervinculos = new ArrayList<>();
        
        Libro libro2 = new LibroDigital(false, hipervinculos,"it2", autores, "7645896", "Terror", "PDF", 50000, editorial2);
        //-----------------------------------------------------------------------
        
        megaferia.assignStandEditorial(standsIds, editoriales);
        
        System.out.println(megaferia + " -> " + megaferia.getStands());
        System.out.println(megaferia + " -> " + megaferia.getEditoriales());
        
        System.out.println(editorial1 + " -> " + editorial1.getGerente());
        System.out.println(gerente1 + " -> " + gerente1.getEditorial() + "\n");

        System.out.println(editorial2 + " -> " + editorial2.getGerente());
        System.out.println(gerente2 + " -> " + gerente2.getEditorial() + "\n");
        
        megaferia.verifyStands();
        System.out.println("\n" + editorial1 + " -> " + editorial1.getStands());
        System.out.println(editorial2 + " -> " + editorial2.getStands() + "\n");

        System.out.println(editorial1 + " -> " + editorial1.getLibros());
        System.out.println(libro1 + " -> " + libro1.getEditorial() + "\n");
        
        System.out.println(editorial2 + " -> " + editorial2.getLibros());
        System.out.println(libro2 + " -> " + libro2.getEditorial() + "\n");
        
     }
}
