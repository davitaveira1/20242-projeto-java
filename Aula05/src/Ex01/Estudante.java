/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author Davi
 */
public class Estudante extends Pessoa {
    
    @Override
    void apresentar(){
        System.out.print(super.nome);
        System.out.print(" e estudante!");        
        
    }
    
}
