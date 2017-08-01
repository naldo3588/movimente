/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ContratoBean;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo Pedro
 */
public class ContratoDAO {

    Connection con;

    public boolean inserir(ContratoBean contrato) throws ClassNotFoundException {

//        if (existeID_Aluno(contrato.getId_aluno())) {
//            JOptionPane.showMessageDialog(null, "Falha em cadastrar o Livro. Já existe um livro cadastrado para este ISBN!!");
//            return true;
//        }
        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO contrato (id_titular,id_plano,id_item_plano,data_adesao,data_criacao,usuario,total_parcelas,valor_total,valor_mensal,status) VALUES(?,?,?,?,?,?,?,?,?,?)";
            System.out.println("PASSOU AQUI");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, contrato.getId_titular());
            ps.setInt(2, contrato.getId_plano());
            ps.setInt(3, contrato.getId_item_plano());
            ps.setObject(4, contrato.getData_adesao());
            ps.setObject(5, contrato.getData_criacao());
            ps.setString(6, contrato.getUsuario());
            ps.setInt(7, contrato.getQtd_parcelas());
            ps.setDouble(8, contrato.getValor_total_contrato());
            ps.setDouble(9, contrato.getValor_mensal());
            ps.setInt(10, contrato.getStatus());

//            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ");
            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro de Violação de Banco de Dados!");

            return false;
        }
    }

    public boolean inserirEmpresa(ContratoBean contrato) throws ClassNotFoundException {

//        if (existeID_Aluno(contrato.getId_aluno())) {
//            JOptionPane.showMessageDialog(null, "Falha em cadastrar o Livro. Já existe um livro cadastrado para este ISBN!!");
//            return true;
//        }
        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO contrato_empresa (id_plano,id_item_plano,data_adesao,data_criacao,usuario,total_parcelas,valor_total,valor_mensal,status,id_empresa) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, contrato.getId_plano());
            ps.setInt(2, contrato.getId_item_plano());
            ps.setObject(3, contrato.getData_adesao());
            ps.setObject(4, contrato.getData_criacao());
            ps.setString(5, contrato.getUsuario());
            ps.setInt(6, contrato.getQtd_parcelas());
            ps.setDouble(7, contrato.getValor_total_contrato());
            ps.setDouble(8, contrato.getValor_mensal());
            ps.setInt(9, contrato.getStatus());
            ps.setInt(10, contrato.getId_empresa());

//            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ");
            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro de Violação de Banco de Dados!");

            return false;
        }
    }

    public boolean existeID_Aluno(int id_aluno) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM contrato WHERE id_aluno = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_aluno);

            ResultSet result = ps.executeQuery();

            return result.next();

        } catch (SQLException e) {

            return true;
        }
    }

    public boolean altera(ContratoBean contrato) throws ClassNotFoundException {
        try {
            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE contrato SET id_plano='" + contrato.getId_plano() + "',id_modalidade='" + contrato.getId_modalidade() + "',id_item_plano='" + contrato.getId_item_plano() + "',id_item_modalidade='" + contrato.getId_item_modalidade() + "',nome_plano='" + contrato.getNome_plano() + "',nome_modalidade='" + contrato.getNome_modalidade() + "',nome_aluno='" + contrato.getNome_aluno() + "',endereco_aluno='" + contrato.getEndereco_aluno() + "',bairro_aluno='" + contrato.getBairro_aluno() + "',cidade_aluno='" + contrato.getCidade_aluno() + "',rg_aluno='" + contrato.getRg_aluno() + "',telefone_aluno='" + contrato.getTelefone_aluno() + "',email_aluno='" + contrato.getEmail_aluno() + "',desc_plano='" + contrato.getDesc_plano() + "',freq_modalidade='" + contrato.getFreq_modalidade() + "',horario='" + contrato.getHorario() + "',dias='" + contrato.getDias() + "',valor='" + contrato.getValor() + "' WHERE id_contrato='" + contrato.getId_contrato() + "'");
            JOptionPane.showMessageDialog(null, " Contrato Atualizado!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

}
//    public boolean altera(ContratoBean aluno) throws ClassNotFoundException {
//        try {
//
//            con = ConexaoFactory.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("UPDATE cad_aluno SET nome='"
//                    + aluno.getNome() + "',endereco='" + aluno.getEndereco() + "',telefone='" + aluno.getTelefone() + "',cidade='" + aluno.getCidade() + "',cpf='" + aluno.getCpf() + "',rg='" + aluno.getRg() + "',email='" + aluno.getEmail() + "',data_nasc='" + aluno.getData_nasc() + "',ativo='" + aluno.getAtivo() + "' WHERE cpf='" + aluno.getCpf() + "'");
//            JOptionPane.showMessageDialog(null, " Aluno Atualizado !!");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
//        return true;
//    }

