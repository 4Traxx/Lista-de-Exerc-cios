/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Exercicio_Futebol;


public class Jogadores {

    private String selecao;
    private String posicao;
    private int numero;
    private String nome;

    public Jogadores(String selecao, String posicao, int numero, String nome) {
        this.selecao = selecao;
        this.posicao = posicao;
        this.numero = numero;
        this.nome = nome;
    }

    

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void exibirMensagem()
    {
        System.out.printf("Jogador: %s / Camisa: %d / Seleção: %s / Posição: %s \n",
                getNome(),getNumero(), getSelecao(), getPosicao());
    }
    
    
    
    
}   
