/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaMedica;



import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 // Crie o Paciente João, quem tem ma consulta com o Médico Pedro dia 22/10/2023
// Crie a Paciente Marcela, quem tem uma consulta com o Médico rafael no dia 22/10/2023
// Crie a paciente Regina, quem tem uma consulta com a Médica Carla no dia 22/10/2023
//Se o paciente tiver menos que 14 anos ele deve ser atendido pelo Pedro que é Pediatra.
 * @author hiago
 */
public class TesteConsulta {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade ;
        String nomeP;
 
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Paciente"));
        
        
        nomeP = JOptionPane.showInputDialog("Digite o nome do Paciente");
        
        
        
        
        Paciente pac = new Paciente(nomeP, idade);
        Medico med = new Medico(); 
        Consulta data = new Consulta();
        
        if(idade <= 14){
            
           med.imprimirMedico("Pedro");
           data.imprimirConsulta("22/10/2023");
            
        } else if(nomeP.equals("Marcela")) {
            
			med.imprimirMedico("Rafael");
			data.imprimirConsulta("22/10/2023");
                        
	} else if(nomeP.equals("Regina")) {
			
			med.imprimirMedico("Carla");
			data.imprimirConsulta("22/10/2023");
			
	} else {
			JOptionPane.showMessageDialog(null,"Você não tem consulta marcada.");
	}
        

    }
}
