package com.unama;

import java.util.Scanner;

public class Questão2 {
    public static String calcSemana(int codigoSemana) {
        switch (codigoSemana){
            case 1:
            return "Segunda-feira";
            case 2:
            return "Terça-feira";
            case 3:
            return "Quarta-feira";
            case 4:
            return "Quinta-feira";
            case 5:
            return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return"Nenhum";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o código da semana: ");
        int codigoSemana = scanner.nextInt();
        //Chama o método para verificar o dia da semana.
        String semana = calcSemana( codigoSemana);
        //Saída de dados
        System.out.println("O dia da semana é: " + semana);
    }
}
