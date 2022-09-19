/*b) Tendo como entrada a altura e o sexo de uma pessoa, 
construa um programa que exibe o peso ideal para ela, em quilos. 
Use as seguintes fórmulas (adote ℎ como a altura e em metros): 
• Homens: 72,7 × ℎ − 58
• Mulheres: 62,1 × ℎ − 44,7*/

package lista_2;

import javax.swing.JOptionPane;

public class ExercicioB {

	public static void main(String[] args) {
		String s;
		double h, kg;
		
		s = JOptionPane.showInputDialog("Informe o sexo (F ou M)");
		
		
		if (s.equals("F")) {
			
			h = Double.parseDouble((JOptionPane.showInputDialog("Digite sua altura (M):")));
			kg = 62.1* h - 44.7;
			JOptionPane.showMessageDialog(null, "Seu peso ideal é de: " + kg + "Kg");
			System.out.println("Seu peso ideal é de: " + kg + "Kg");
		
		} if (s.equals("M")){
			h = Double.parseDouble((JOptionPane.showInputDialog("Digite sua altura (M):")));
			kg = 72.7* h - 58;
			JOptionPane.showMessageDialog(null, "Seu peso ideal é de: " + kg + "Kg");
			System.out.println("Seu peso ideal é de: " + kg + "Kg");
		} else {
			
			JOptionPane.showMessageDialog(null, "Sexo inválido! Digite F para Feminino ou M para Masculino");
		}
		
	}

}
