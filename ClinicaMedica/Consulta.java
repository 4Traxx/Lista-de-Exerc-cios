/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaMedica;

import javax.swing.JOptionPane;

/**
 *data
 * @author hiago
 */
// Crie o Paciente João, quem tem ma consulta com o Médico Pedro dia 22/10/2023
// Crie a Paciente Marcela, quem tem uma consulta com o Médico rafael no dia 22/10/2023
// Crie a paciente Regina, quem tem uma consulta com a Médica Carla no dia 22/10/2023
//Se o paciente tiver menos que 14 anos ele deve ser atendido pelo Pedro que é Pediatra.
public class Consulta {
    private String data;

    public Consulta() {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
 
    public void imprimirConsulta(String data) {
	JOptionPane.showMessageDialog(null, "Data da consulta: " + data);	
	}
    
}
