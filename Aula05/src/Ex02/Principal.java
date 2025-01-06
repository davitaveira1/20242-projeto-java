/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Principal {
    
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();
        
        c1.nome="Pluto";
        g1.nome="Garfield";
        System.out.println("Nome: "+c1.nome);
        c1.emitirSom();
        System.out.println("Nome: "+g1.nome);
        g1.emitirSom();

    }
    
}
