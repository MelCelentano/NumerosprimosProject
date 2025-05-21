/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosprimosproject;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class NumerosprimosProject  {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char resposta = 's';
            
            while (resposta == 's' || resposta == 'S') {
                System.out.print("Digite um número inteiro para verificar se é primo: ");
                int numeroParaVerificar = scanner.nextInt();
                
                boolean ehPrimo = true;
                long contadorDeDivisoes = 0;
                
                if (numeroParaVerificar <= 1) {
                    ehPrimo = false;
                } else {
                    for (int i = 2; i * i <= numeroParaVerificar; i++) {
                        contadorDeDivisoes++;
                        if (numeroParaVerificar % i == 0) {
                            ehPrimo = false;
                            break;
                        }
                    }
                }
                
                System.out.println("O número " + numeroParaVerificar + " é primo? " + ehPrimo);
                System.out.println("Número de divisões testadas: " + contadorDeDivisoes);
                
                System.out.print("Deseja verificar outro número? (s/n): ");
                resposta = scanner.next().charAt(0);
            }
            
            System.out.println("Programa encerrado.");
        }
    }
}
