/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author Davi
 */
public class Livro {
    
    String titulo;
    String autor;
    
    Livro(){
        
    }
    Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    Livro criarLivro(String titulo, String autor){
        return new Livro(titulo,autor);
    }
    
    public static void main(String[] args) {
        Livro l1 = new Livro();
        
        l1 = l1.criarLivro("Livro A", "autor A");
        
        System.out.println("Titulo: "+l1.titulo);
        System.out.println("Autor: "+l1.autor);
    }
    
}
