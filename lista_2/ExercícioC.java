/*c) Faça um programa que recebe dois números inteiros distintos e exibe o maior.*/
package lista_2;

import javax.swing.JOptionPane;

public class ExercícioC {

	public static void main(String[] args) {
		
		double v1, v2;
		
		v1 = Double.parseDouble((JOptionPane.showInputDialog("Digite o primeiro valor:")));
		v2 = Double.parseDouble((JOptionPane.showInputDialog("Digite o segundo valor:")));	
		
		if (v1 > v2) {
		
			JOptionPane.showMessageDialog(null, "O maior valor é: " + v1);
			System.out.println("O maior valor é: " + v1);
			
		} if (v1 < v2) {
			
			JOptionPane.showMessageDialog(null, "O maior valor é: " + v2);
			System.out.println("O maior valor é: " + v2);
				
		} if (v1 == v2) {
				
			JOptionPane.showMessageDialog(null, "Os valores são iguais: " + v1);
			System.out.println("Os valores são iguais: " + v1);
					
		} 	
				
	}

}
