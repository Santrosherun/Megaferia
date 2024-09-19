/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.libros;

import core.Editorial;
import core.persona.Autor;
import java.util.ArrayList;

/**
 *
 * @author Santiagodd
 */
public abstract class Libro {
    protected String titulo;  
    protected ArrayList<Autor> autores = new ArrayList<>();
    protected String isbn;  
    protected String genero;  
    protected String formato;
    protected float valor;
    protected ArrayList<Editorial> editoriales = new ArrayList<>();
}
