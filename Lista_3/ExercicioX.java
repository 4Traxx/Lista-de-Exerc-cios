/*x) [while] Certa pessoa (A) possui R$ 10.000,00 e tem sua fortuna crescendo em R$ 100,00 por mês. 
 * Outra pessoa (B) tem sua fortuna crescendo em R$ 300,00 ao mês e possui R$ 5.000,00. 
 * Faça um programa que exibe, mês a mês, a diferença das duas fortunas até que a pessoa (B) 
 * tenha mais dinheiro do que a pessoa (A).*/
package Lista_3;

import javax.swing.JOptionPane;

public class ExercicioX {

	public static void main(String[] args) {
		int PA, PB, FortunaA, FortunaB, cont, diferença;

        PA = 10000;
        PB = 5000;
        FortunaA = 100;
        FortunaB = 300;
        cont = 0;

        while (PA >= PB) {
            if(PA >= PB) {

                diferença = PA - PB;
                System.out.println("A diferença entre as fortunas é: " + diferença + " no mes " + cont + " . ");
                PA = PA + FortunaA;
                PB = PB + FortunaB;

            }
             cont ++;

        } 
        
        JOptionPane.showMessageDialog(null, "O tempo para a pessoa B ter mais dinheiro"
        		+ " que a pessoa A é de " + cont + " meses, "
        		+ "após esse tempo, a pessoa A estará com " + PA + " já a pessoa B estará com " + PB + " .");

	}

}
