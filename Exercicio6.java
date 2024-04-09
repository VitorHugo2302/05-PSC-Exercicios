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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.println("Digite a opção desejada:");
            opcao = entrada.nextInt();
            double salario = 0;
            switch (opcao) {
                case 1:
                    System.out.println("Digite o salário do funcionário:");
                    salario = entrada.nextDouble();

                    double imposto;
                    if (salario < 1400.00) {
                        imposto = salario * 0.05;
                    } else if (salario <= 2500.00) {
                        imposto = salario * 0.10;
                    } else {
                        imposto = salario * 0.15;
                    }

                    System.out.println("Valor do imposto: R$ " + imposto);
                    break;
                case 2:
                    System.out.println("Digite o salário do funcionário:");
                    salario = entrada.nextDouble();

                    double aumento;
                    if (salario > 5000.00) {
                        aumento = 25.00;
                    } else if (salario >= 2500.00) {
                        aumento = 50.00;
                    } else if (salario >= 1400.00) {
                        aumento = 75.00;
                    } else {
                        aumento = 100.00;
                    }

                    double novoSalario = salario + aumento;
                    System.out.println("Novo salário: R$ " + novoSalario);
                    break;
                case 3:
                    System.out.println("Digite o salário do funcionário:");
                    salario = entrada.nextDouble();

                    if (salario <= 1400.00) {
                        System.out.println("Mal remunerado");
                    } else {
                        System.out.println("Bem remunerado");
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 4);

        entrada.close();
    }
}
