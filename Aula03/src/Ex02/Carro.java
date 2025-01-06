/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Davi
 */
public class Carro {
    
    String marca;
    String modelo;
    String cor;
    double preco;

    public Carro(String marca, String modelo, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public Carro(String marca) {
        this.marca = marca;
    }
    
    
    
    public static void main(String[] args) {
        Carro c1 = new Carro("vw","gol","branco",36000);
    }
    
}
