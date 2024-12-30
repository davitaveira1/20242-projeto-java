/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author Davi
 */
public class Pessoa {
    
    String nome;
    String telefone;
    String cpf;
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Davi";
        p1.telefone = "62-9999-0000";
        p1.cpf = "000.000.000-11";
        System.out.println("Nome: "+p1.nome);
        System.out.println("Tel: "+p1.telefone);
        System.out.println("CPF: "+p1.cpf);
    }
    
}
