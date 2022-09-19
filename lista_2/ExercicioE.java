/*e) Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se ele é par ou ímpar 
(use o operador % para obter o resto de uma divisão inteira).*/
 
package lista_2;

import javax.swing.JOptionPane;

public class ExercicioE {

	public static void main(String[] args) {
	int a;
	
	a = Integer.parseInt((JOptionPane.showInputDialog("Digite um número inteiro:")));
	
	
		
		if(a %2 == 0) {
			
			JOptionPane.showMessageDialog(null, "O número " + a +  " é par: ");
			System.out.println("O número " + a +  " é par: ");
		
		} else {
			
			JOptionPane.showMessageDialog(null, "O número " + a +  " é ímpar: ");
			System.out.println("O número " + a +  " é ímpar: ");
			
		}
	

	}

}
