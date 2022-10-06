/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_Futebol;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class TesteJogadores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome de jogador: ");
        String nome1 = sc.nextLine();
        System.out.println("Seleção: ");
        String selecao1 = sc.nextLine();
        System.out.println("Posição: ");
        String posicao1 = sc.nextLine();
        System.out.println("Numero da camisa: ");
        int numero1 = sc.nextInt();
        
        
        sc.nextLine();
        
        System.out.println("\nNome de jogador: ");
        String nome2 = sc.nextLine();
        System.out.println("Seleção: ");
        String selecao2 = sc.nextLine();
        System.out.println("Posição: ");
        String posicao2 = sc.nextLine();
        System.out.println("Numero da camisa: ");
        int numero2 = sc.nextInt();
        
        Jogadores jogador1 = new Jogadores(selecao1, posicao1, numero1, nome1);
        Jogadores jogador2 = new Jogadores(selecao2, posicao2, numero2, nome2);
        
        jogador1.exibirMensagem();
        jogador2.exibirMensagem(); 
    }
    
}
