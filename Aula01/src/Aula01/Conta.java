/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author Davi
 */
public class Conta {

    String nroConta;
    double saldo;

    void debitar(double valor) {

        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saldo final: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void creditar(double valor) {
        saldo = saldo + valor;
        System.out.println("Saldo final: " + saldo);
    }

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nroConta = "123-4";
        c1.saldo = 800;
        System.out.println("Nro da conta: " + c1.nroConta);
        System.out.println("Saldo: " + c1.saldo);
        
        c1.creditar(100);
        c1.debitar(1000);
    }

}
