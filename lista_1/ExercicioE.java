/*e)Faça um programa que exibe a área de um retângulo a partir da base e da altura fornecidas pelo usuário.*/
package lista_1;

import javax.swing.JOptionPane;

public class ExercicioE {

	public static void main(String[] args) {
		double  a, b, h;
		String u;
		
		b = Double.parseDouble((JOptionPane.showInputDialog( args, "Digite a base do retângulo:")));
		h = Double.parseDouble((JOptionPane.showInputDialog( args, "Digite a altura do retângulo:")));
		u =  JOptionPane.showInputDialog(args, "Digite a unidade de medida:");
		
		a = b * h;
		
		JOptionPane.showMessageDialog(null, "A área do retângulo é de:" + a +" "+ u + "2");
		System.out.println("A área do retângulo é de:" + a +" "+ u + "2");
	}

}
