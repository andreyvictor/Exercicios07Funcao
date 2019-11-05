package com.unama;

import java.util.Scanner;

public class Questão3ListaVetor {
    public static int[] preencheVetor(int[] vetor){
        for(int i=0; i<vetor.length; i++){
            vetor[i] = i*i;
        }
        return vetor;
    }

    public static void main(String[] args) {
        //criação do vetor
        int[] vetor = new int[30];
        //chamada da função que preenche o vetor
        int[] resultado = preencheVetor(vetor);
        //saída de dados
        for(int numero:resultado){
            System.out.println(numero);
        }
    }
}
