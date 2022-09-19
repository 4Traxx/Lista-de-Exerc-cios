/*a) Faça um programa que recebe duas notas, exibe a média aritmética das notas 
e uma mensagem indicando se o aluno foi aprovado ou reprovado. 
A média para aprovação deve ser maior que seis.*/

package lista_2;

import javax.swing.JOptionPane;

public class ExercicioA {

	public static void main(String[] args) {
		
		double n1, n2, mf;
	
		n1 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da Nota 1:")));
		n2 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor da Nota 2:")));
		
		mf = (n1 + n2) / 2;
		
		if(mf > 6) {
			
			JOptionPane.showMessageDialog(null, "A média final é: " + mf + "\nVocê foi aprovado, parabéns!");
			System.out.println("A média final é: " + mf + "\nVocê foi Aprovado, Parabéns!");
		
		} else {
			
			JOptionPane.showMessageDialog(null, "A média final é: " + mf + "\nVocê foi reprovado.");
			System.out.println("A média final é: " + mf + "\nVocê foi reprovado.");
			
		}
		
	}

}
