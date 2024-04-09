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
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0, totalQuantPessoas = 0, canal, quantPessoasAssistindo;
        System.out.println("Canais disponíveis: 4, 5, 7, 12 ");
        do {
            System.out.print("Digite o canal (0 para encerrar o programa): ");
            canal = entrada.nextInt();
            if (canal != 0) {
                System.out.print("Digite a quantidade de pessoas que estavam assistindo o canal " + canal + ": ");
                quantPessoasAssistindo = entrada.nextInt();
                switch (canal) {
                    case 4:
                        canal4 += quantPessoasAssistindo;
                        totalQuantPessoas += canal4;
                        break;
                    case 5:
                        canal5 += quantPessoasAssistindo;
                        totalQuantPessoas += canal5;
                        break;
                    case 7:
                        canal7 += quantPessoasAssistindo;
                        totalQuantPessoas += canal7;
                        break;
                    case 12:
                        canal12 += quantPessoasAssistindo;
                        totalQuantPessoas += canal12;
                        break;
                    default:
                        break;
                }
            }
        } while (canal != 0);

        System.out.println("Porcentagem de audiência de cada canal:");
        System.out.println("Canal 4: " + ((double) canal4 / totalQuantPessoas * 100) + "%");
        System.out.println("Canal 5: " + ((double) canal5 / totalQuantPessoas * 100) + "%");
        System.out.println("Canal 7: " + ((double) canal7 / totalQuantPessoas * 100) + "%");
        System.out.println("Canal 12: " + ((double) canal12 / totalQuantPessoas * 100) + "%");

        entrada.close();
    }
}
