/*g)Faça um programa que exibe a área de um círculo a partir do perímetro fornecido pelo usuário.*/
package lista_1;

import java.lang.Math;
import javax.swing.JOptionPane;

public class ExercicioG {

	public static void main(String[] args) {
		//P * P /4 pi
		
		double p, a;
		String u;
		
		p = Float.parseFloat((JOptionPane.showInputDialog( args, "Digite o perímetro do círculo:")));
		u =  JOptionPane.showInputDialog(args, "Digite a unidade de medida:");
		a = (p * p)/(4 * Math.PI);
		
		
		JOptionPane.showMessageDialog(null, "A área do circulo é de:" + a + " " + u + "2");
		System.out.println("A área do círculo é de:" + a +" "+ u + "2");
	}

}
