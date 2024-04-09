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
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        int N = scanner.nextInt();

        double H = 0.0;
        for (int i = 1; i <= N; i++) {
            H += 1.0 / i;
        }

        System.out.println("O valor de H é: " + H);

        scanner.close();
    }
}
