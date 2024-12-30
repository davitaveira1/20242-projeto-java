/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author Davi
 */
public class Aluno {
    
    String nome;
    String telefone;
    String matricula;
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Davi";
        a1.telefone = "62-9999-0000";
        a1.matricula = "123-4";
        
        System.out.println("Nome: "+a1.nome);
        System.out.println("Tel: "+a1.telefone);
        System.out.println("Matrícula: "+a1.matricula);
        
    }
    
}
