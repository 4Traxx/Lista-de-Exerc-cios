/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaMedica;

import javax.swing.JOptionPane;

/**
 * crm
 * nome
 * @author hiago
 */
// Crie o Paciente João, quem tem ma consulta com o Médico Pedro dia 22/10/2023
// Crie a Paciente Marcela, quem tem uma consulta com o Médico rafael no dia 22/10/2023
// Crie a paciente Regina, quem tem uma consulta com a Médica Carla no dia 22/10/2023
//Se o paciente tiver menos que 14 anos ele deve ser atendido pelo Pedro que é Pediatra.
public class Medico {
    private String crmP = "056347/SP";
    private String crmC = "048951/RJ";
    private String crmR = "781649/MG";          
            
    private String crm;
    private String med;

    public Medico() {
        this.crm = crm;
        this.med = med;
    }

    public String getCrmP() {
        return crmP;
    }

    public void setCrmP(String crmP) {
        this.crmP = crmP;
    }

    public String getCrmC() {
        return crmC;
    }

    public void setCrmC(String crmC) {
        this.crmC = crmC;
    }

    public String getCrmR() {
        return crmR;
    }

    public void setCrmR(String crmR) {
        this.crmR = crmR;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getMed() {
        return med;
    }

    public void setMed(String med) {
        this.med = med;
    }
   
    public void imprimirMedico(String med) {
		JOptionPane.showMessageDialog(null,"Consulta agendada com médico: " + med);
		}
   
    

    
    
}
