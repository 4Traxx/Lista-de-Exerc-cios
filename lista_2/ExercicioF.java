/*f) Faça um programa que recebe três números reais e os exibe em ordem crescente.*/

package lista_2;

import javax.swing.JOptionPane;

public class ExercicioF {

	public static void main(String[] args) {
		
		double v1, v2, v3;
		
		v1 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor 1:")));
		v2 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor 2:")));
		v3 = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor 3:")));
	
		if ((v1 > v2) && (v1 > v3)){
			if (v1 > v3) {
				if(v2 > v3) {
		
					JOptionPane.showMessageDialog(null, "os maiores valores são: " + v3 + ", " + v2 + ", " + v1);
					System.out.println("os maiores valores são: " + v3 + ", " + v2 + ", " + v1) ;
				
				}if(v3 > v2) {
					
					JOptionPane.showMessageDialog(null, "os maiores valores são: " + v2 + ", " + v3 + ", " + v1);
					System.out.println("os maiores valores são: " + v2 + ", " + v3 + ", " + v1) ;	
					
					
				}
			}
			
			if (v2 == v3) {
				
				JOptionPane.showMessageDialog(null, "os maiores valores são: " + v3 + ", " + v2 + ", " + v1);
				System.out.println("os maiores valores são: " + v3 + ", " + v2 + ", " + v1);
			}
			
		} if((v2 > v1) && (v2 > v3)){
			
			if(v1 > v3) {
				
				JOptionPane.showMessageDialog(null, "os maiores valores são: " + v3 + ", " + v1 + ", " + v2);
				System.out.println("os maiores valores são: " + v3 + ", " + v1 + ", " + v2);
				
			}if(v3 > v1) {
				
				JOptionPane.showMessageDialog(null, "os maiores valores são: " + v1 + ", " + v3 + ", " + v2);
				System.out.println("os maiores valores são: " + v1 + ", " + v3 + ", " + v2);
				
			}if (v1 == v3) {
				
				JOptionPane.showMessageDialog(null, "os maiores valores são: " + v3 + ", " + v1 + ", " + v2);
				System.out.println("os maiores valores são: " + v3 + ", " + v1 + ", " + v2);
			}
			
			
		} if((v3 > v1) && (v3 > v2)){
			
			if(v1 > v2) {
				
				JOptionPane.showMessageDialog(null, "os maiores valores são: " + v2+ ", " + v1 + ", " + v3);
				System.out.println("os maiores valores são: " + v2 + ", " + v1 + ", " + v3);
				
			}if(v2 > v1) {
				
				JOptionPane.showMessageDialog(null, "os maiores valores são: " + v1 + ", " + v2 + ", " + v3);
				System.out.println("os maiores valores são: " + v1 + ", " + v2 + ", " + v3);
				
			}if (v1 == v2) {
				
				JOptionPane.showMessageDialog(null, "os maiores valores são: " + v2 + ", " + v1 + ", " + v3);
				System.out.println("os maiores valores são: " + v2 + ", " + v1 + ", " + v3);
			}
			
			
		}if((v1 == v2) && (v1 == v3) && (v2 == v3)) {
			
			JOptionPane.showMessageDialog(null, "os valores são iguais: " + v1 + ", " + v2 + ", " + v3);
			System.out.println("os valores são iguais: " + v1 + ", " + v2 + ", " + v3);
			
		}
			
	
	}
	
}
