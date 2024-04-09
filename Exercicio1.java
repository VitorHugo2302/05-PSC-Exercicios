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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaDasIdades = 0, idade, quantIdade = 0;
        do {
            System.out.println("Digite a idade desejada (0 para calcular a média e encerrar o programa): ");
            idade = entrada.nextInt();
            if (idade != 0) {
                somaDasIdades += idade;
                quantIdade++;
            }
        } while (idade != 0);

        System.out.println("Média das idades: " + (somaDasIdades / quantIdade));

        entrada.close();
    }
}
