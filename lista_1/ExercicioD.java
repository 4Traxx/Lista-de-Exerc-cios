/*d)Faça um programa que lê o salário base de alguém e exibe o novo salário, 
considerando 5% de gratificação(mais dinheiro) e 7% de impostos(menos dinheiro)sobre o salário base. 
Também exiba a gratificação e o imposto.*/

package lista_1;

import javax.swing.JOptionPane;

public class ExercicioD {

	public static void main(String[] args) {
		
		double  s, a, i, sf;
		
		
		s = Double.parseDouble((JOptionPane.showInputDialog( args, "Digite seu salário atual:")));
		
		a = s * 0.05;
		i = s * 0.07;
 		sf = s * 0.98;
			
		
		JOptionPane.showMessageDialog(null, "O seu novo salário será de R$:" + sf + "\nGratificação (5%) R$:" + a 
				+ " \nImpostos (7%) R$:" + i);
		System.out.println("O seu novo salário será de R$:" + sf + "\nGratificação (5%) R$:" + a 
				+ " \nImpostos (7%) R$:" + i);
	}

}
