/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConexaoFactory;
import bean.AlunoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo Pedro
 */
public class AlunoDAO {

    Connection con;

    public boolean inserir(AlunoBean aluno) {

        try {

            if (existeCPF(aluno.getCpf())) {
                return false;
            }
            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_aluno(nome,endereco,bairro,telefone,cidade,cpf,rg,email,data_nasc,ativo,id_titular) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println("PASSOU AQUI");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getEndereco());
            ps.setString(3, aluno.getBairro());
            ps.setString(4, aluno.getTelefone());
            ps.setString(5, aluno.getCidade());
            ps.setString(6, aluno.getCpf());
            ps.setString(7, aluno.getRg());
            ps.setString(8, aluno.getEmail());
            ps.setString(9, aluno.getData_nasc());
            ps.setInt(10, aluno.getAtivo());
            ps.setInt(11, aluno.getId_titular());

            JOptionPane.showMessageDialog(null, "Aluno " + aluno.getNome() + " Cadastrado com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException | ClassNotFoundException e) {

            return false;
        }
    }
    //inseri os alunos que não tem cpf

    public boolean inserir2(AlunoBean aluno) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_aluno(nome,endereco,bairro,telefone,cidade,cpf,rg,email,data_nasc,ativo,id_titular) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println("PASSOU AQUI");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getEndereco());
            ps.setString(3, aluno.getBairro());
            ps.setString(4, aluno.getTelefone());
            ps.setString(5, aluno.getCidade());
            ps.setString(6, aluno.getCpf());
            ps.setString(7, aluno.getRg());
            ps.setString(8, aluno.getEmail());
            ps.setString(9, aluno.getData_nasc());
            ps.setInt(10, aluno.getAtivo());
            ps.setInt(11, aluno.getId_titular());

            JOptionPane.showMessageDialog(null, "Aluno " + aluno.getNome() + " Cadastrado com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException | ClassNotFoundException e) {

            return false;
        }
    }

//verifica se tem cpf igual cadastrado no banco
    public boolean existeCPF(String cpf) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM cad_aluno WHERE cpf = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet result = ps.executeQuery();

            return result.next();

        } catch (SQLException e) {

            return true;
        }
    }

    public boolean alteraId_Titular(AlunoBean aluno) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE cad_aluno SET id_titular='" + aluno.getId_titular() + "' WHERE id_aluno='" + aluno.getId_titular() + "'");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

    public boolean altera(AlunoBean aluno) throws ClassNotFoundException {
        try {

            if (!existeCPF(aluno.getCpf())) {
                JOptionPane.showMessageDialog(null, "Falha na alteração, o CPF digitado não possui nenhum aluno cadastrado!!");
                return false;
            }
            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE cad_aluno SET nome='" + aluno.getNome() + "',endereco='" + aluno.getEndereco() + "',bairro='" + aluno.getBairro() + "',telefone='" + aluno.getTelefone() + "',cidade='" + aluno.getCidade() + "',cpf='" + aluno.getCpf() + "',rg='" + aluno.getRg() + "',email='" + aluno.getEmail() + "',data_nasc='" + aluno.getData_nasc() + "',ativo='" + aluno.getAtivo() + "' WHERE id_aluno='" + aluno.getId_aluno() + "'");
            JOptionPane.showMessageDialog(null, " Aluno Atualizado !!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

    public boolean exclui(AlunoBean aluno) throws SQLException, ClassNotFoundException {
        con = ConexaoFactory.getConnection();
        Statement stmt = con.createStatement();
        try {

            Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Excluir Aluno", JOptionPane.OK_CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                stmt.executeUpdate("DELETE FROM cad_aluno where id_aluno='" + aluno.getId_aluno() + "'");
                JOptionPane.showMessageDialog(null, " Aluno Excluido com Sucesso!!");
            }
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            Integer opcao = JOptionPane.showConfirmDialog(null, "Este Aluno Possui Movimentação! Não é Possivel Excluir !! \n   \n Deseja Inativa-lo ?", "Excluir Aluno", JOptionPane.OK_CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                try {
                    stmt.executeUpdate("UPDATE cad_aluno SET ativo ='0' WHERE id_aluno='" + aluno.getId_aluno() + "'");
                    JOptionPane.showMessageDialog(null, "Aluno Inativado Com Sucesso !!");
                } catch (SQLException ex) {
                    Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
