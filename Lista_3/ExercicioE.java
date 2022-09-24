/*e) [for] Desenvolva um programa que exibe a tabuada de um número natural escolhido pelo usuário. 
 * Os múltiplos apresentados devem ser de 1 a 10.*/
package Lista_3;

import javax.swing.JOptionPane;

public class ExercicioE {

	public static void main(String[] args) {
			int a,  counter, result;
			a = Integer.parseInt((JOptionPane.showInputDialog("Digite um número:")));
			
			for (counter = 0; counter <= 10; counter++) {
			
			result = counter * a;
			System.out.println("valor de: " + result);
			}

		}
	}


