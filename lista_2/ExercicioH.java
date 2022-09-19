/*h) Desenvolva um programa que recebe a base e a altura de três triângulos e exibe a maior área. 
 * Lembre-se da fórmula: 𝐴 = 𝑏𝑎𝑠𝑒 ×𝑎𝑙𝑡𝑢𝑟𝑎 / 2 */
package lista_2;

import javax.swing.JOptionPane;

public class ExercicioH {

	public static void main(String[] args) {
		String u;
		double b1, b2, b3, h1, h2, h3, a1, a2, a3;
		
		b1 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da base do triângulo 1:")));
		h1 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da altura do triângulo 1:")));
		b2 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da base do triângulo 2:")));
		h2 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da altura do triângulo 2:")));
		b3 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da base do triângulo 3:")));
		h3 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da altura do triângulo 3:")));
		u =  JOptionPane.showInputDialog("Digite a unidade de medida:");
		
		a1 = (b1 * h1) /2;
		a2 = (b2 * h2) /2;
		a3 = (b3 * h3) /2;
	
		if ((a1 > a2) && (a1 > a3)) {
			
			JOptionPane.showMessageDialog(null, "O triângulo que possui maior área é o triângulo 1: " + a1 +" " + u);
			System.out.println("O triângulo que possui maior área é o triângulo 1: " + a1 +" " + u);
		
		}if ((a2 > a1) && (a2 > a3)) {
			
			JOptionPane.showMessageDialog(null, "O triângulo que possui maior área é o triângulo 2: " + a2 +" " + u);
			System.out.println("O triângulo que possui maior área é o triângulo 2: " + a2 +" " + u);
		
		}if ((a3 > a1) && (a3 > a2)) {
			
			JOptionPane.showMessageDialog(null, "O triângulo que possui maior área é o triângulo 3: " + a3 +" " + u);
			System.out.println("O triângulo que possui maior área é o triângulo 3: " + a3 +" " + u);
		
		}if ((a1 == a2) && (a1 > a3)) {
			
			JOptionPane.showMessageDialog(null, "Os triângulos que possuem maior área são os triângulos 1 e 2: " + a1 +" " + u);
			System.out.println("Os triângulos que possuem maior área são os triângulos 1 e 2: " + a1 +" " + u);
		
		}if ((a1 == a3) && (a1 > a2)) {
			
			JOptionPane.showMessageDialog(null, "Os triângulos que possuem maior área são os triângulos 1 e 3: " + a1 +" " + u);
			System.out.println("Os triângulos que possuem maior área são os triângulos 1 e 3: " + a1 +" " + u);
		
		}if ((a2 == a3) && (a2 > a1)) {
			
			JOptionPane.showMessageDialog(null, "Os triângulos que possuem maior área são os triângulos 2 e 3: " + a2 +" " + u);
			System.out.println("Os triângulos que possuem maior área são os triângulos 2 e 3: " + a2 +" " + u);
		
		}if ((a1 == a2) && (a1 == a3)) {
			
			JOptionPane.showMessageDialog(null, "Os três triângulos possuem a mesma área: " + a1 +" " + u);
			System.out.println("Os três triângulos possuem a mesma área: " + a1 +" " + u);
		
		}
		
	}

}
