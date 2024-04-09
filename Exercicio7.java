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
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de cidades:");
        int quantidadeCidades = entrada.nextInt();

        String cidadeMaiorIndice = "";
        int maiorIndice = Integer.MIN_VALUE;

        String cidadeMenorIndice = "";
        int menorIndice = Integer.MAX_VALUE;

        int totalVeiculos = 0;

        for (int i = 1; i <= quantidadeCidades; i++) {
            System.out.println("Cidade " + i + ":");

            System.out.println("Nome da cidade:");
            String nomeCidade = entrada.next();

            System.out.println("Número de veículos de passeio:");
            int veiculosPasseio = entrada.nextInt();
            totalVeiculos += veiculosPasseio;

            System.out.println("Número de acidentes de trânsito com vítimas:");
            int acidentes = entrada.nextInt();

            if (acidentes > maiorIndice) {
                maiorIndice = acidentes;
                cidadeMaiorIndice = nomeCidade;
            }

            if (acidentes < menorIndice) {
                menorIndice = acidentes;
                cidadeMenorIndice = nomeCidade;
            }
        }

        double mediaVeiculos = (double) totalVeiculos / quantidadeCidades;

        System.out.println("Maior índice de acidentes de trânsito: " + maiorIndice + " (Cidade: " + cidadeMaiorIndice + ")");
        System.out.println("Menor índice de acidentes de trânsito: " + menorIndice + " (Cidade: " + cidadeMenorIndice + ")");
        System.out.println("Média de veículos nas cidades: " + mediaVeiculos);

        entrada.close();
    }
}
