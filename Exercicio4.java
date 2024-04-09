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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int totalIdades = 0;
        int pessoasComPeso90Menor150 = 0;
        int pessoasAlturaMais190 = 0;
        int pessoasIdadeEntre10e30 = 0;
        int totalPessoas = 10;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = entrada.nextInt();
            totalIdades += idade;
            
            System.out.println("Digite o peso da pessoa " + i + " (em kg):");
            double peso = entrada.nextDouble();
            
            System.out.println("Digite a altura da pessoa " + i + " (em metros):");
            double altura = entrada.nextDouble();
            
            if (peso > 90 && altura < 1.50) {
                pessoasComPeso90Menor150++;
            }
            
            if (altura > 1.90) {
                pessoasAlturaMais190++;
                if (idade >= 10 && idade <= 30) {
                    pessoasIdadeEntre10e30++;
                }
            }
        }
        
        double mediaIdades = (double) totalIdades / totalPessoas;
        double porcentagemIdadeEntre10e30AlturaMais190 = (double) pessoasIdadeEntre10e30 / pessoasAlturaMais190 * 100;
        
        System.out.println("Média das idades das dez pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + pessoasComPeso90Menor150);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porcentagemIdadeEntre10e30AlturaMais190 + "%");
        
        entrada.close();
    }
}
