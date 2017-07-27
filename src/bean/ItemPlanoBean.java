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
public class ItemPlanoBean {

    private int id_item_plano;
    private int id_plano;
    private int membro;
    private int meses;
    private Double desconto;

    public int getId_item_plano() {
        return id_item_plano;
    }

    public void setId_item_plano(int id_item_plano) {
        this.id_item_plano = id_item_plano;
    }

    public int getId_plano() {
        return id_plano;
    }

    public void setId_plano(int id_plano) {
        this.id_plano = id_plano;
    }

    public int getMembro() {
        return membro;
    }

    public void setMembro(int membro) {
        this.membro = membro;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

}
