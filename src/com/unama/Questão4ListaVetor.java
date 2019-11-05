package com.unama;

import java.util.Scanner;

public class Questão4ListaVetor {
    public static void main(String[] args) {
        //entrada de dados
        Scanner scanner = new Scanner (System.in);
        double[] vetor = new double[3];
        for (int i=0; i<vetor.length; i++){
            System.out.println("Informe o número: " +i);
            vetor[i] = scanner.nextDouble();
        }
        //chamada da função
        double[] resultado = verificaNumeroPosicao(vetor);
        //saída de dados
        for(double numero: resultado){
            System.out.println(numero);
        }
        }
    }
