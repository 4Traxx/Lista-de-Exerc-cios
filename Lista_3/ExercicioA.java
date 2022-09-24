/*a) Elabore um programa que lê um número inteiro n, seguido de n inteiros, e exibe a média dos n números lidos.*/

package Lista_3;
import java.util.Scanner;

public class ExercicioA {

	public static void main(String[] args) {

		int num, acumula, media, i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("quantos números você irá digitar?");
        i = sc.nextInt();
        acumula = 0;
        
        
        for(int n = 0; n < i; n++)
        {
        System.out.println("Digite um número:");
        num = sc.nextInt();
        acumula += num;
        }
        
        media = acumula/i;

        System.out.println("Média: " + media);
        sc.close();
	}

}
