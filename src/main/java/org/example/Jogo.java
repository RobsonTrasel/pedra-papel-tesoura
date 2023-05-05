package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Map<String, String> vencedores = new HashMap<>();
        vencedores.put("ataque", "pedra");
        vencedores.put("pedra", "papel");
        vencedores.put("papel", "ataque");

        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo de Pedra, Papel e Tesoura!");
        System.out.println("Quantas partidas você gostaria de jogar?");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nPartida " + i);
            System.out.println("Jogador 1, escolha sua jogada (ataque, pedra ou papel):");
            String jogador1 = input.nextLine().toLowerCase();

            while (!vencedores.containsKey(jogador1)) {
                System.out.println("Jogada inválida. Por favor, escolha uma das opções (ataque, pedra ou papel):");
                jogador1 = input.nextLine().toLowerCase();
            }

            System.out.println("Jogador 2, escolha sua jogada (ataque, pedra ou papel):");
            String jogador2 = input.nextLine().toLowerCase();

            while (!vencedores.containsKey(jogador2)) {
                System.out.println("Jogada inválida. Por favor, escolha uma das opções (ataque, pedra ou papel):");
                jogador2 = input.nextLine().toLowerCase();
            }

            if (jogador1.equals(jogador2)) {
                if (jogador1.equals("pedra")) {
                    System.out.println("Ninguém ganhou!");
                } else if (jogador1.equals("ataque")) {
                    System.out.println("Aniquilação Mutua, ambos jogadores perderam!");
                } else {
                    System.out.println("Ambos venceram!");
                }
            } else if (vencedores.get(jogador2).equals(jogador1)) {
                System.out.println("Jogador 1 venceu!");
            } else {
                System.out.println("Jogador 2 venceu!");
            }
        }
        System.out.println("\nObrigado por jogar!");
    }
}


