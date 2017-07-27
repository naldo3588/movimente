/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Ronaldo Pedro
 */
public class BancoBean {

    private String nome_favorecido;
    private String nome_banco;
    private String agencia;
    private String conta;

    public String getNome_favorecido() {
        return nome_favorecido;
    }

    public void setNome_favorecido(String nome_favorecido) {
        this.nome_favorecido = nome_favorecido;
    }

    public String getNome_banco() {
        return nome_banco;
    }

    public void setNome_banco(String nome_banco) {
        this.nome_banco = nome_banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

}
