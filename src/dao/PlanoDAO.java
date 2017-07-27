/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.PlanoBean;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo Pedro
 */
public class PlanoDAO {

    Connection con;

    public boolean inserir(PlanoBean plano) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_plano (nome) VALUES(?)";
            System.out.println("PASSOU AQUI");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, plano.getNome());

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException | ClassNotFoundException e) {

            return false;
        }
    }

//    public boolean altera(AlunoBean aluno) throws ClassNotFoundException {
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
}
