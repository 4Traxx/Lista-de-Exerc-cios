/*b)Faça um programa que recebe as notas P1, P2 e P3 e exibe a média 
considerando que a nota P1 tem peso 3, a nota P2 tem peso 3 e a nota P3 tem peso 4..*/
package lista_1;

import javax.swing.JOptionPane;

public class ExercicioB {

	public static void main(String[] args) {
		float  p1, p2, p3, d, e, f, m;
		
		
		p1 = Float.parseFloat((JOptionPane.showInputDialog( args, "Digite a Nota da P1:")));
		p2 = Float.parseFloat((JOptionPane.showInputDialog( args, "Digite a Nota da P2:")));
		p3 = Float.parseFloat((JOptionPane.showInputDialog( args, "Digite a Nota da P3:")));
		
		d = p1 * 3;
		e = p2 * 3;
		f = p3 * 4;
		
		m = (d + e + f) /10;
		
		JOptionPane.showMessageDialog(null, "A média final é: " + m);
		System.out.println("A Média final é: " + m);
	}

}
