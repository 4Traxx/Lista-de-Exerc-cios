/*i) [for] Faça um programa que exibe 𝑛 elevado a 𝑚 considerando 𝑛 (real) e 𝑚 (natural) dados pelo usuário. 
  * Não usar funções prontas da linguagem para o cálculo de potência.*/

package Lista_3;

import java.util.Scanner;


public class ExercicioI {
    public static void main(String[] args) {
        
        float n, result;
        int m;
        
        
        result = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um númeto Natural:");
        n = sc.nextFloat();
        
        System.out.println("Digite um númeto Real:");
        m = sc.nextInt();
        
        if(m < 0)
        {
            System.out.println("Numero real Inválido");
        } else {
	        for(int i =0; i < m; i++)
	        result *= n;
	        
	        System.out.println("a potência é: " + result);
	        sc.close();
        }
    }
}
