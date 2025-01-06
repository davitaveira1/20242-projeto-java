/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Davi
 */
public class Lista {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        listaNumeros.add(50);
        listaNumeros.add(60);
        listaNumeros.add(70);
        listaNumeros.add(80);
        listaNumeros.add(90);
        listaNumeros.add(100);
        
        //antes da remoção
        System.out.println(listaNumeros);
        
        System.out.print("Informe a posição que deseja remover: ");
        int pos = entrada.nextInt();

        listaNumeros.remove(pos);
        
        //após a remoção
        System.out.println(listaNumeros);

    }

}
