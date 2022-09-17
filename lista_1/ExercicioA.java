/*a)Faça um programa que recebe três números reais e exibe a multiplicação desses números.*/

package lista_1;

import javax.swing.JOptionPane;

public class ExercicioA {
	
	
	public static void main(String[] args) {
		float  a, b, c, d;
		
		
		a = Float.parseFloat((JOptionPane.showInputDialog( args, "Digite um valor para A:")));
		b = Float.parseFloat((JOptionPane.showInputDialog( args, "Digite um valor para B:")));
		c = Float.parseFloat((JOptionPane.showInputDialog( args, "Digite um valor para C:")));
		d = a * b * c;
		
		JOptionPane.showMessageDialog(null, "O valor da multiplicação foi: " + d);
		System.out.println("O valor da multiplicação foi: " + d);
	}

}
