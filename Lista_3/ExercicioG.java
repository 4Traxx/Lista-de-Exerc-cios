/*[for] Faça um programa que lê um número natural e exibe o fatorial desse número. Lembre-se: 5! é 120, 
 * porque 5 × 4 × 3 × 2 × 1 = 120. 
 * Use um acumulador e um contador dentro de um laço de repetição.*/
package Lista_3;

import javax.swing.JOptionPane;

public class ExercicioG {

	public static void main(String[] args) {
		int f, v, counter;
		f = 1;
		v = Integer.parseInt((JOptionPane.showInputDialog("Digite um número:")));
		
		for (counter = 2; counter <= v; counter ++ ) {
		
		f *= counter;
		
		}
		System.out.println("O fatorial de " + v + " é igual a " + f);

		
	}
}


