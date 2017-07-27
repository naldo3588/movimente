/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConexaoFactory;
import bean.BancoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo Pedro
 */
public class BancoDAO {

    Connection con;

    public boolean inserir(BancoBean banco) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_banco(nome_favorecido,agencia,conta,banco) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, banco.getNome_favorecido());
            ps.setString(2, banco.getAgencia());
            ps.setString(3, banco.getConta());
            ps.setString(4, banco.getNome_banco());

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException | ClassNotFoundException e) {

            return false;
        }
    }

//    public boolean altera(AlunoBean aluno) throws ClassNotFoundException {
//        try {
//
//            if (!existeCPF(aluno.getCpf())) {
//                JOptionPane.showMessageDialog(null, "Falha na alteração, o CPF digitado não possui nenhum aluno cadastrado!!");
//                return false;
//            }
//            con = ConexaoFactory.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("UPDATE cad_aluno SET nome='" + aluno.getNome() + "',endereco='" + aluno.getEndereco() + "',bairro='" + aluno.getBairro() + "',telefone='" + aluno.getTelefone() + "',cidade='" + aluno.getCidade() + "',cpf='" + aluno.getCpf() + "',rg='" + aluno.getRg() + "',email='" + aluno.getEmail() + "',data_nasc='" + aluno.getData_nasc() + "',ativo='" + aluno.getAtivo() + "' WHERE cpf='" + aluno.getCpf() + "'");
//            JOptionPane.showMessageDialog(null, " Aluno Atualizado !!");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
//        return true;
//    }
//    public boolean exclui(AlunoBean aluno) throws SQLException, ClassNotFoundException {
//        con = ConexaoFactory.getConnection();
//        Statement stmt = con.createStatement();
//        try {
//
//            Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Excluir Aluno", JOptionPane.OK_CANCEL_OPTION);
//            if (opcao == JOptionPane.YES_OPTION) {
//                stmt.executeUpdate("DELETE FROM cad_aluno WHERE cpf='" + aluno.getCpf() + "'");
//                JOptionPane.showMessageDialog(null, " Aluno Excluido com Sucesso!!");
//            }
//        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
//            Integer opcao = JOptionPane.showConfirmDialog(null, "Este Aluno Possui Movimentação! Não é Possivel Excluir !! \n   \n Deseja Inativa-lo ?", "Excluir Aluno", JOptionPane.OK_CANCEL_OPTION);
//            if (opcao == JOptionPane.YES_OPTION) {
//                try {
//                    stmt.executeUpdate("UPDATE cad_aluno SET ativo ='0' WHERE cpf='" + aluno.getCpf() + "'");
//                    JOptionPane.showMessageDialog(null, "Aluno Inativado Com Sucesso !!");
//                } catch (SQLException ex) {
//                    Logger.getLogger(BancoDAO.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } else {
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BancoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
}
