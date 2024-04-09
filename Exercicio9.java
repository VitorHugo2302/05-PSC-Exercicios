/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5fabricio;

/**
 *
 * @author 42414189
 */
public class Exercicio9 {
    public static void main(String[] args) {
        double S = 0.0;
        
        for (int i = 1, numerador = 1000; i <= 50; i++, numerador -= 3 * i - 1) {
            if (i % 2 == 0) {
                S -= (double) numerador / i;
            } else {
                S += (double) numerador / i;
            }
        }
        
        System.out.println("A soma dos 50 primeiros termos da série é: " + S);
    }
}
