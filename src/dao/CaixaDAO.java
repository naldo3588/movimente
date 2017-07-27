/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.AlunoBean;
import bean.CaixaBean;
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
public class CaixaDAO {

    Connection con;

    public boolean inserir(CaixaBean caixa) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO caixa (tipo_movimento,tipo_pagamento,data_lancamento,hora_lancamento,historico,valor,id_titulo,nome_caixa,id_banco,id_fornecedor,id_aluno,tipo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, caixa.getTipo_movimento());
            ps.setString(2, caixa.getTipo_pagamento());
            ps.setObject(3, caixa.getData_lancamento());
            ps.setObject(4, caixa.getHora_lancamento());
            ps.setString(5, caixa.getHistorico());
            ps.setDouble(6, caixa.getValor());
            ps.setDouble(7, caixa.getId_titulo());
            ps.setString(8, caixa.getCaixa());
            ps.setInt(9, caixa.getId_banco());
            ps.setInt(10, caixa.getId_fornecedor());
            ps.setInt(11, caixa.getId_aluno());
            ps.setInt(12, caixa.getId_tipo());
            System.out.println("Inserido com Sucessoaaa!");
            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Violação no banco de dados");
        }

        return true;

    }

//    public boolean efetuarBaixa(ParcelasBean caixas) throws SQLException {
//
//        try {
//            con = ConexaoFactory.getConnection();
//            String sql = ("UPDATE caixa_contrato SET data_baixa= ? WHERE id_caixa_contrato= ?");
//
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setObject(1, caixas.getData_baixa());
//            ps.setInt(2, caixas.getId_caixa_contrato());
//
//            System.out.println("Passou DNV");
//
//            JOptionPane.showMessageDialog(null, "Baixa realizada com sucesso! ");
//
//            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;
//
//        } catch (ClassNotFoundException e) {
//
//        }
//        return true;
//    }
//}
    public boolean estornarBaixa(CaixaBean caixa) throws SQLException, ClassNotFoundException {
        con = ConexaoFactory.getConnection();
        Statement stmt = con.createStatement();
        try {

            stmt.executeUpdate("DELETE FROM caixa WHERE id_titulo='" + caixa.getId_titulo() + "'");
            JOptionPane.showMessageDialog(null, " Titulo Estornado com Sucesso!!");

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
