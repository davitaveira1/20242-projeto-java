/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author Davi
 */
public class Ex01 {
    
    void mostrarBoasVindas(){
        System.out.println("Seja bem-vindo!");
    }
    
    void mostrarMensagemDeAniversario(String nome){
        System.out.println("Feliz aniversário "+nome);
    }
    
    int retornarAnoAtual(){
        return 2024;
    }
    
    double calcularMedia(double n1, double n2){
        double media = (n1+n2)/2;
        return media;
    }
    
    public static void main(String[] args) {
        Ex01 e = new Ex01();
        e.mostrarBoasVindas();
        e.mostrarMensagemDeAniversario("Davi");
        
        int anoAtual = e.retornarAnoAtual();
        System.out.println("Ano atual: "+anoAtual);
        
        double media = e.calcularMedia(10, 8);
        System.out.println("Media: "+media);
    }
    
}
