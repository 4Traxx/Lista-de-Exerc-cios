/*f)Faça um programa que exibe a área de um triângulo a partir da base e da altura fornecidas pelo usuário.*/
package lista_1;

import javax.swing.JOptionPane;

public class ExercicioF {

	public static void main(String[] args) {
		{
			double  a, b, h;
			String u;
			
			b = Double.parseDouble((JOptionPane.showInputDialog( args, "Digite a base do triângulo:")));
			h = Double.parseDouble((JOptionPane.showInputDialog( args, "Digite a altura do triângulo:")));
			u =  JOptionPane.showInputDialog(args, "Digite a unidade de medida:");
			
			a = (b * h)/2;
			
			JOptionPane.showMessageDialog(null, "A área do triângulo é de:" + a +" "+ u + "2");
			System.out.println("A área do triângulo é de:" + a +" "+ u + "2");
		}
	}

}
