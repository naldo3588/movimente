/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.AlunoBean;
import bean.CaixaBean;
import bean.ContasPagarBean;
import bean.ContratoBean;
import bean.ParcelasBean;
import bean.PlanoBean;
import factory.ConexaoFactory;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo Pedro
 */
public class ContasPagarDAO {

    Connection con;

    public boolean inserir(ContasPagarBean conta) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO contas_pagar (qtd_parcelas,numero_parcela,historico,tipo_saida,tipo_pagamento,caixa,usuario,data_lancamento,hora_lancamento,data_vencimento,id_fornecedor,valor) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, conta.getQtd_parcelas());
            ps.setInt(2, conta.getNumero_parcela());
            ps.setString(3, conta.getHistorico());
            ps.setString(4, conta.getTipo_saida());
            ps.setString(5, conta.getTipo_pagamento());
            ps.setString(6, conta.getCaixa());
            ps.setString(7, conta.getNome_usuario());
            ps.setObject(8, conta.getData_lancamento());
            ps.setObject(9, conta.getHora_lancamento());
            ps.setObject(10, conta.getData_vencimento());
            ps.setInt(11, conta.getId_fornecedor());
            ps.setDouble(12, conta.getValor());
            System.out.println("Inserido com Sucesso!");
            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {

        }

        return true;

    }

    public boolean efetuarBaixa(ContasPagarBean conta) throws SQLException {

        try {
            con = ConexaoFactory.getConnection();
            String sql = ("UPDATE contas_pagar SET data_baixa= ? , hora_baixa = ? , status = '0' WHERE id_contas_pagar = ?");

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, conta.getData_baixa());
            ps.setObject(2, conta.getHora_baixa());
            ps.setInt(3, conta.getId_contas_pagar());

            System.out.println("Passou DNV");

            JOptionPane.showMessageDialog(null, "Baixa realizada com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (ClassNotFoundException e) {

        }
        return true;
    }

    public boolean efetuarEstorno(ParcelasBean parcelas) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE parcela_contrato SET data_baixa = NULL WHERE id_parcela_contrato='" + parcelas.getId_parcela_contrato() + "'");
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

    public boolean estornarBaixa(ContasPagarBean pagar) throws SQLException, ClassNotFoundException {
        con = ConexaoFactory.getConnection();
        Statement stmt = con.createStatement();
        try {

            stmt.executeUpdate("DELETE FROM contas_pagar WHERE id_contas_pagar='" + pagar.getId_contas_pagar() + "'");
            JOptionPane.showMessageDialog(null, " Titulo Estornado com Sucesso!!");

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean excluirLancamento(ContasPagarBean pagar) throws SQLException, ClassNotFoundException {
        con = ConexaoFactory.getConnection();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM contas_pagar WHERE id_contas_pagar='" + pagar.getId_contas_pagar() + "'");
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
