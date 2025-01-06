/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Pessoa {
        
    String nome;
    String cpf;
    
    Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Davi","000.000.000-00");
        
        System.out.println("Nome: "+p1.nome);
        System.out.println("CPF: "+p1.cpf);
        
    }
    
}
