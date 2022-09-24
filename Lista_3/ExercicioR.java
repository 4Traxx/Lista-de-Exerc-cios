/*r) Fulano tem 160cm de altura e cresce 2 centímetros por ano, enquanto Ciclano tem 110cm de 
 * altura e cresce 3 centímetros por ano. 
 * Faça um programa que exibe em quantos anos Ciclano superará a altura de Fulano.*/
package Lista_3;

import javax.swing.JOptionPane;

public class ExercicioR {

	public static void main(String[] args) {

        int Fulano, Ciclano, CF, CC, cont, diferença;

        Fulano = 160;
        Ciclano = 110;
        CF = 2;
        CC = 3;
        cont = 0;

        while (Fulano >= Ciclano) {
            if (Fulano >= Ciclano) {

                diferença = Fulano - Ciclano;
                System.out.println("Fulano é " + diferença + " mais alto que" + cont + " . ");
                Fulano = Fulano + CF;
                Ciclano = Ciclano + CC;
            }
                cont ++;

        }
        JOptionPane.showMessageDialog(null, "Ciclano irá ultrapassar Fulano em " + cont + 
        		" anos, após esse tempo, " + "Ciclano estará com " + Ciclano + " cm . "
        		+ "e Fulano estará terá " + Fulano + " cm ");
    }

}
