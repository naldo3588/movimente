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
public class ContasPagarBean {

    private int id_contas_pagar;
    private int qtd_parcelas;
    private int status;
    private int numero_parcela;
    private int id_fornecedor;

    private String historico;
    private String tipo_saida;
    private String tipo_pagamento;
    private String caixa;
    private String nome_usuario;
    private Date data_lancamento;
    private Date hora_lancamento;
    private Date data_vencimento;
    private Date data_baixa;
    private Date hora_baixa;

    private Double valor;

    public int getId_contas_pagar() {
        return id_contas_pagar;
    }

    public void setId_contas_pagar(int id_contas_pagar) {
        this.id_contas_pagar = id_contas_pagar;
    }

    public Date getData_baixa() {
        return data_baixa;
    }

    public void setData_baixa(Date data_baixa) {
        this.data_baixa = data_baixa;
    }

    public Date getHora_baixa() {
        return hora_baixa;
    }

    public void setHora_baixa(Date hora_baixa) {
        this.hora_baixa = hora_baixa;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getNumero_parcela() {
        return numero_parcela;
    }

    public void setNumero_parcela(int numero_parcela) {
        this.numero_parcela = numero_parcela;
    }

    public int getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(int qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getTipo_saida() {
        return tipo_saida;
    }

    public void setTipo_saida(String tipo_saida) {
        this.tipo_saida = tipo_saida;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public Date getHora_lancamento() {
        return hora_lancamento;
    }

    public void setHora_lancamento(Date hora_lancamento) {
        this.hora_lancamento = hora_lancamento;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
