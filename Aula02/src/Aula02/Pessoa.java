/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author Davi
 */
public class Pessoa {
    
    String nome;
    int idade;
    
    Pessoa(){
        
    }
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    Pessoa obterPessoaPadrao(){
        return new Pessoa("Davi",41);
    }
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1 = p1.obterPessoaPadrao();
        
        System.out.println("Nome: "+p1.nome);
        System.out.println("Idade: "+p1.idade);
    }
    
}
