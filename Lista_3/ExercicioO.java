/*o) [while] Faça um programa que recebe valores inteiros positivos até que seja digitado o valor zero.
 *  O programa deverá exibir o maior valor digitado.*/

package Lista_3;

import java.util.Scanner;

public class ExercicioO {
    public static void main(String[] args) {
       int num, numMaior = 0;
       
       Scanner sc = new Scanner(System.in);
       
       do
       {
           System.out.println("Digite um número: ");
           num = sc.nextInt();
           if (num > numMaior)
           {
               numMaior = num;
               System.out.println("-->" + numMaior);
           }
       
       }
       while (num != 0);
       
        System.out.println("O número maior é: " + numMaior);
       
        sc.close();
       
    }
             
}

