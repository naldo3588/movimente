/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author Ronaldo Pedro
 */
public class ItemContratoBean {

    private int id_contrato;
    private int id_aluno;
    private int id_empresa;
    private int id_titular;
    private int id_modalidade;
    private int id_item_modalidade;
    private String nome_aluno;
    private String nome_empresa;
    private int frequencia;
    private String dias;
    private double valor;
    private String modalidade;
    private String horario;

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public int getId_titular() {
        return id_titular;
    }

    public void setId_titular(int id_titular) {
        this.id_titular = id_titular;
    }

    public int getId_modalidade() {
        return id_modalidade;
    }

    public void setId_modalidade(int id_modalidade) {
        this.id_modalidade = id_modalidade;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId_item_modalidade() {
        return id_item_modalidade;
    }

    public void setId_item_modalidade(int id_item_modalidade) {
        this.id_item_modalidade = id_item_modalidade;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

}
