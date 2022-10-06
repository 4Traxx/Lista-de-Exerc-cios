package Exercicio_Futebol;

import java.util.Scanner;

public class TestePartidaCamp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do time: ");
		String time1 = sc.nextLine();
		System.out.println("Região do Time: ");
		String regiao1 = sc.nextLine();
		System.out.println("Nome do capitão: ");
		String capitao1 = sc.nextLine();
	
		
		System.out.println("Nome do time: ");
		String time2 = sc.nextLine();
		System.out.println("Região do Time: ");
		String regiao2 = sc.nextLine();
		System.out.println("Nome do capitão: ");
		String capitao2 = sc.nextLine();
		
		
		System.out.println("Nome do Estádio: ");
		String estadio = sc.nextLine();
		System.out.println("Nome da divisão: ");
		String divisao = sc.nextLine();
		System.out.println("Horário da partida: ");
		String horario = sc.nextLine();
		System.out.println("Árbitro da partida: ");
		String arbitro = sc.nextLine();
		
		TimeCampBrasileiro TimeCampbrasileiro1 = new TimeCampBrasileiro (time1, regiao1, capitao1);
		TimeCampBrasileiro TimeCampbrasileiro2 = new TimeCampBrasileiro (time2, regiao2, capitao2);
		PartidaFutebol PartidaFutebol = new PartidaFutebol (estadio, divisao, horario, arbitro);
		
		TimeCampbrasileiro1.exibirTime();
		TimeCampbrasileiro2.exibirTime();
		PartidaFutebol.exibirPartida();
		
	}

}
