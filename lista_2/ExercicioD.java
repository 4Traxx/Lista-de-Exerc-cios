/*d) Faça um programa que recebe dois números reais e exibe o menor deles e com duas casas decimais.*/
package lista_2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ExercicioD {

	public static void main(String[] args) {
		
		double v1, v2;
		
		v1 = Double.parseDouble((JOptionPane.showInputDialog("Digite o primeiro valor:")));
		v2 = Double.parseDouble((JOptionPane.showInputDialog("Digite o segundo valor:")));	
		
		if (v1 < v2) {
		
			JOptionPane.showMessageDialog(null, "O menor valor é: " + new DecimalFormat(".##").format(v1));
			System.out.println("O menor valor é:" + new DecimalFormat(".##").format(v1));
			
		} if (v1 > v2) {
			
			JOptionPane.showMessageDialog(null, "O menor valor é: " + new DecimalFormat(".##").format(v2));
			System.out.println("O menor valor é:" + new DecimalFormat(".##").format(v2));
				
		} if (v1 == v2) {
				
			JOptionPane.showMessageDialog(null, "Os valores são iguais: " + new DecimalFormat(".##").format(v1));
			System.out.println("Os valores são iguais:" + new DecimalFormat(".##").format(v1));
					
		} 

	}

}
