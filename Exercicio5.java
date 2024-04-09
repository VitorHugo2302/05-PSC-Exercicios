/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5fabricio;

import java.util.Scanner;

/**
 *
 * @author 42414189
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int totalEntrevistados = 10;
        int sim = 0;
        int nao = 0;
        int mulheresSim = 0;
        int homensNao = 0;
        int totalHomens = 0;
        
        for (int i = 1; i <= totalEntrevistados; i++) {
            System.out.print("Digite o sexo do entrevistado (M para masculino ou F para feminino): ");
            char sexo = entrada.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            
            System.out.println("Resposta do entrevistado (S para sim ou N para não):");
            char resposta = entrada.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            switch (resposta) {
                case 'S':
                    sim++;
                    if (sexo == 'F') {
                        mulheresSim++;
                    }   break;
                case 'N':
                    nao++;
                    if (sexo == 'M') {
                        homensNao++;
                        totalHomens++;
                    }   break;
                default:
                    System.out.println("Resposta inválida.");
                    i--;
                    break;
            }
        }
        
        double percentualHomensNao = (double) homensNao / totalHomens * 100;
        
        System.out.println("Número de pessoas que responderam sim: " + sim);
        System.out.println("Número de pessoas que responderam não: " + nao);
        System.out.println("Número de mulheres que responderam sim: " + mulheresSim);
        System.out.println("Percentagem de homens que responderam não: " + percentualHomensNao + "%");
        
        entrada.close();
    }
}
