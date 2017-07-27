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
public class ContratoBean {

    private int id_contrato;
    private int id_titular;
    private int id_plano;
    private int id_modalidade;
    private int id_item_plano;
    private int id_item_modalidade;
    private String nome_plano;
    private String nome_modalidade;
    private String nome_aluno;
    private String endereco_aluno;
    private String bairro_aluno;
    private String cidade_aluno;
    private String rg_aluno;
    private String cpf_aluno;
    private String telefone_aluno;
    private String email_aluno;
    private Double desc_plano;
    private int freq_modalidade;
    private String horario;
    private String dias;
    private Double valor;
    private Date data_adesao;
    private Date data_vencimento;
    private String tipo_pgto;
    private Date data_criacao;
    private String usuario;
    private Double valor_total_contrato;
    private Double valor_mensal;
    private int qtd_parcelas;
    private int status;
    private int id_empresa;

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getId_plano() {
        return id_plano;
    }

    public void setId_plano(int id_plano) {
        this.id_plano = id_plano;
    }

    public int getId_modalidade() {
        return id_modalidade;
    }

    public void setId_modalidade(int id_modalidade) {
        this.id_modalidade = id_modalidade;
    }

    public int getId_item_plano() {
        return id_item_plano;
    }

    public void setId_item_plano(int id_item_plano) {
        this.id_item_plano = id_item_plano;
    }

    public int getId_item_modalidade() {
        return id_item_modalidade;
    }

    public void setId_item_modalidade(int id_item_modalidade) {
        this.id_item_modalidade = id_item_modalidade;
    }

    public String getNome_plano() {
        return nome_plano;
    }

    public void setNome_plano(String nome_plano) {
        this.nome_plano = nome_plano;
    }

    public String getNome_modalidade() {
        return nome_modalidade;
    }

    public void setNome_modalidade(String nome_modalidade) {
        this.nome_modalidade = nome_modalidade;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getEndereco_aluno() {
        return endereco_aluno;
    }

    public void setEndereco_aluno(String endereco_aluno) {
        this.endereco_aluno = endereco_aluno;
    }

    public String getBairro_aluno() {
        return bairro_aluno;
    }

    public void setBairro_aluno(String bairro_aluno) {
        this.bairro_aluno = bairro_aluno;
    }

    public String getCidade_aluno() {
        return cidade_aluno;
    }

    public void setCidade_aluno(String cidade_aluno) {
        this.cidade_aluno = cidade_aluno;
    }

    public String getRg_aluno() {
        return rg_aluno;
    }

    public void setRg_aluno(String rg_aluno) {
        this.rg_aluno = rg_aluno;
    }

    public String getCpf_aluno() {
        return cpf_aluno;
    }

    public void setCpf_aluno(String cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    public String getTelefone_aluno() {
        return telefone_aluno;
    }

    public void setTelefone_aluno(String telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }

    public String getEmail_aluno() {
        return email_aluno;
    }

    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }

    public Double getDesc_plano() {
        return desc_plano;
    }

    public void setDesc_plano(Double desc_plano) {
        this.desc_plano = desc_plano;
    }

    public int getFreq_modalidade() {
        return freq_modalidade;
    }

    public void setFreq_modalidade(int freq_modalidade) {
        this.freq_modalidade = freq_modalidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData_adesao() {
        return data_adesao;
    }

    public void setData_adesao(Date data_adesao) {
        this.data_adesao = data_adesao;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getTipo_pgto() {
        return tipo_pgto;
    }

    public void setTipo_pgto(String tipo_pgto) {
        this.tipo_pgto = tipo_pgto;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getValor_total_contrato() {
        return valor_total_contrato;
    }

    public void setValor_total_contrato(Double valor_total_contrato) {
        this.valor_total_contrato = valor_total_contrato;
    }

    public int getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(int qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }

    public Double getValor_mensal() {
        return valor_mensal;
    }

    public void setValor_mensal(Double valor_mensal) {
        this.valor_mensal = valor_mensal;
    }

}
