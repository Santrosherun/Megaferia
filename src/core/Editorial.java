/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.libros.Libro;
import core.persona.Gerente;
import java.util.ArrayList;

/**
 *
 * @author Santiagodd
 */
public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente = new Gerente();
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Stand> stands = new ArrayList<>();
}
