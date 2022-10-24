/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaMedica;

/**
 *nome
 * idade
 * telefone
 * cpf
 * @author hiago
 */
// Crie o Paciente João, quem tem ma consulta com o Médico Pedro dia 22/10/2023
// Crie a Paciente Marcela, quem tem uma consulta com o Médico rafael no dia 22/10/2023
// Crie a paciente Regina, quem tem uma consulta com a Médica Carla no dia 22/10/2023
//Se o paciente tiver menos que 14 anos ele deve ser atendido pelo Pedro que é Pediatra.

public class Paciente {
    private String nomeP;
    private int idade;
    private int telefone;
    private int cpf;

    public Paciente(String nomeP, int idade) {
        this.nomeP = nomeP;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public void imprimirPaciente(String nome) {
		System.out.println("Paciente: " + nomeP);
		}

    
}
