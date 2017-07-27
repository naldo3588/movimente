/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.AlunoBean;
import bean.ContasPagarBean;
import bean.ContasReceberBean;
import bean.ContratoBean;
import bean.ParcelasBean;
import bean.PlanoBean;
import factory.ConexaoFactory;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo Pedro
 */
public class ParcelasDAO {

    Connection con;

    public boolean inserir(ParcelasBean parcela) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO parcela_contrato (id_contrato,valor_total,data_vencimento,tipo_entrada,tipo_pagamento,usuario,numero_parcela,valor_parcela) VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, parcela.getId_contrato());
            ps.setDouble(2, parcela.getValor_total());
            ps.setObject(3, parcela.getData_vencimento());
            ps.setInt(4, parcela.getTipo_entrada());
            ps.setString(5, parcela.getTipo_pagamento());
            ps.setString(6, parcela.getUsuario());
            ps.setInt(7, parcela.getNumero_parcela());
            ps.setDouble(8, parcela.getValor_parcela());
            System.out.println("Inserido com Sucesso!");
            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {

        }

        return true;

    }

    public boolean efetuarBaixa(ParcelasBean parcelas) throws SQLException {

        try {
            con = ConexaoFactory.getConnection();
            String sql = ("UPDATE parcela_contrato SET data_baixa= ? WHERE id_parcela_contrato= ?");

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, parcelas.getData_baixa());
            ps.setInt(2, parcelas.getId_parcela_contrato());

            System.out.println("Passou DNV");

            JOptionPane.showMessageDialog(null, "Baixa realizada com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (ClassNotFoundException e) {

        }
        return true;
    }

    public boolean efetuarEstornoContrato(ParcelasBean parcelas) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE parcela_contrato SET data_baixa = NULL WHERE id_parcela_contrato='" + parcelas.getId_parcela_contrato() + "'");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

    public boolean efetuarEstornoContasaPagar(ContasPagarBean pagar) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE contas_pagar SET data_baixa = NULL, hora_baixa= NULL, status = 1 WHERE id_contas_pagar='" + pagar.getId_contas_pagar() + "'");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

    public boolean efetuarEstornoContasaReceber(ContasReceberBean receber) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE contas_receber SET data_baixa = NULL, hora_baixa= NULL , status= 1 WHERE id_contas_receber='" + receber.getId_contas_receber() + "'");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

    public boolean inserirMulta(ParcelasBean parcela) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO multa (valor_multa) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, parcela.getMulta());
            JOptionPane.showMessageDialog(null, "Multa cadastrada com Sucesso !!");
            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {

        }

        return true;

    }

    public boolean excluirLancamento(ParcelasBean parcela) throws SQLException, ClassNotFoundException {
        con = ConexaoFactory.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM parcela_contrato WHERE id_parcela_contrato='" + parcela.getId_parcela_contrato() + "'");
        JOptionPane.showMessageDialog(null, " Titulo Excluido com Sucesso!!");
        return false;
    }

}
//    public boolean efetuarBaixa(ParcelasBean parcelas) throws SQLException, ClassNotFoundException {
//        try {
//
//            con = ConexaoFactory.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("UPDATE parcela_contrato SET data_baixa='"
//                    + parcelas.getData_baixa() + "' WHERE id_contrato='" + parcelas.getId_contrato() + "' and numero_parcela='" + parcelas.getNumero_parcela() + "'");
//            JOptionPane.showMessageDialog(null, "Baixa efetuada com Sucesso !!");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
//        return true;
//    }
//}
