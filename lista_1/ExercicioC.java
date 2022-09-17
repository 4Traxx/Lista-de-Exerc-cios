/*c)Faça um programa que lê o salário atual de alguém e exibe o novo salário que é o atual com 25% de aumento.*/
package lista_1;

import javax.swing.JOptionPane;

public class ExercicioC {

	public static void main(String[] args) {

		double  a, b;
		
		
		a = Double.parseDouble((JOptionPane.showInputDialog( args, "Digite seu salário atual:")));
		
		b = a * 1.25;
		
		JOptionPane.showMessageDialog(null, "O seu novo salário será de R$:" + b);
		System.out.println("O seu novo salário será de R$:" + b);
	}

}
