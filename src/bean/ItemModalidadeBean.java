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
public class ItemModalidadeBean {

    private int id_item_modalidade;
    private int id_modalidade;
    private int frequencia;
    private Double valor;

    public int getId_item_modalidade() {
        return id_item_modalidade;
    }

    public void setId_item_modalidade(int id_item_modalidade) {
        this.id_item_modalidade = id_item_modalidade;
    }

    public int getId_modalidade() {
        return id_modalidade;
    }

    public void setId_modalidade(int id_modalidade) {
        this.id_modalidade = id_modalidade;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
