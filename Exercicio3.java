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
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a primeira nota:");
                    double nota1 = entrada.nextDouble();
                    System.out.println("Digite a segunda nota:");
                    double nota2 = entrada.nextDouble();

                    double media = (nota1 + nota2) / 2;
                    System.out.println("A média aritmética é: " + media);
                    break;
                case 2:
                    System.out.println("Digite a primeira nota:");
                    double primeiraNota = entrada.nextDouble();
                    System.out.println("Digite o peso da primeira nota:");
                    double peso1 = entrada.nextDouble();
                    System.out.println("Digite a segunda nota:");
                    double segundaNota = entrada.nextDouble();
                    System.out.println("Digite o peso da segunda nota:");
                    double peso2 = entrada.nextDouble();
                    System.out.println("Digite a terceira nota:");
                    double nota3 = entrada.nextDouble();
                    System.out.println("Digite o peso da terceira nota:");
                    double peso3 = entrada.nextDouble();

                    double mediaPonderada = (primeiraNota * peso1 + segundaNota * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
                    System.out.println("A média ponderada é: " + mediaPonderada);
                    break;
                case 3:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 3);

        entrada.close();
    }
}
