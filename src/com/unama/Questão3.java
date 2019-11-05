package com.unama;

import java.util.Scanner;

public class Questão3 {
    public static String verificaParImpar(int numero){
        if(numero%2 > 0){
            return "impar";
        }else{
            return "par";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Entrada de dados
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        //chamada da função
        String resultado = verificaParImpar(numero);
        //saída de dados
        System.out.println("O número " +numero + " é " + resultado);
    }
}
