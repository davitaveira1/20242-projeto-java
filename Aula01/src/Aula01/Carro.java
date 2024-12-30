/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author Davi
 */
public class Carro {
    
    String marca;
    String modelo;
    int ano;
    String placa;
    String cor;
    double preco;
    
    void valorTabelaFipe(){
        System.out.println("Preço tabela FIPE: "+(0.8*preco));
    }
    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "VW";
        c1.modelo = "Gol";
        c1.ano = 2019;
        c1.placa = "NVZ-0505";
        c1.cor = "branca";
        c1.preco = 32000;
        
        System.out.println("Marca: "+c1.marca);
        System.out.println("Modelo: "+c1.modelo);
        System.out.println("Ano: "+c1.ano);
        System.out.println("Placa: "+c1.placa);
        System.out.println("Cor: "+c1.cor);
        System.out.println("Preco: "+c1.preco);
        
        c1.valorTabelaFipe();
    }
    
}
