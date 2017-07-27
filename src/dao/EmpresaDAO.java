/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConexaoFactory;
import bean.EmpresaBean;
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
public class EmpresaDAO {

    Connection con;

    public boolean inserir(EmpresaBean empresa) {

        try {

            if (existeCNPJ(empresa.getCnpj())) {
                return false;
            }
            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_empresa(nome_fantasia,endereco,bairro,telefone,cidade,cnpj,inscricao_estadual,razao_social,email,ativo) VALUES(?,?,?,?,?,?,?,?,?,?)";
            System.out.println("PASSOU AQUI");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, empresa.getNome_fantasia());
            ps.setString(2, empresa.getEndereco());
            ps.setString(3, empresa.getBairro());
            ps.setString(4, empresa.getTelefone());
            ps.setString(5, empresa.getCidade());
            ps.setString(6, empresa.getCnpj());
            ps.setString(7, empresa.getInscricao_estadual());
            ps.setString(8, empresa.getRazao_social());
            ps.setString(9, empresa.getEmail());
            ps.setInt(10, empresa.getAtivo());

            JOptionPane.showMessageDialog(null, "Empresa " + empresa.getNome_fantasia() + " Cadastrada com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException | ClassNotFoundException e) {

            return false;
        }
    }

    public boolean existeCNPJ(String cnpj) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM cad_empresa WHERE cnpj = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cnpj);

            ResultSet result = ps.executeQuery();

            return result.next();

        } catch (SQLException e) {

            return true;
        }
    }

//    public boolean altera(EmpresaBean empresa) throws ClassNotFoundException {
//        try {
//
//            if (!existeCPF(empresa.getCpf())) {
//                JOptionPane.showMessageDialog(null, "Falha na alteração, o CPF digitado não possui nenhum empresa cadastrado!!");
//                return false;
//            }
//            con = ConexaoFactory.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("UPDATE cad_empresa SET nome='" + empresa.getNome() + "',endereco='" + empresa.getEndereco() + "',bairro='" + empresa.getBairro() + "',telefone='" + empresa.getTelefone() + "',cidade='" + empresa.getCidade() + "',cpf='" + empresa.getCpf() + "',rg='" + empresa.getRg() + "',email='" + empresa.getEmail() + "',data_nasc='" + empresa.getData_nasc() + "',ativo='" + empresa.getAtivo() + "' WHERE cpf='" + empresa.getCpf() + "'");
//            JOptionPane.showMessageDialog(null, " Aluno Atualizado !!");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
//        return true;
//    }
//
//    public boolean exclui(EmpresaBean empresa) throws SQLException, ClassNotFoundException {
//        con = ConexaoFactory.getConnection();
//        Statement stmt = con.createStatement();
//        try {
//
//            Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Excluir Aluno", JOptionPane.OK_CANCEL_OPTION);
//            if (opcao == JOptionPane.YES_OPTION) {
//                stmt.executeUpdate("DELETE FROM cad_empresa WHERE cpf='" + empresa.getCpf() + "'");
//                JOptionPane.showMessageDialog(null, " Aluno Excluido com Sucesso!!");
//            }
//        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
//            Integer opcao = JOptionPane.showConfirmDialog(null, "Este Aluno Possui Movimentação! Não é Possivel Excluir !! \n   \n Deseja Inativa-lo ?", "Excluir Aluno", JOptionPane.OK_CANCEL_OPTION);
//            if (opcao == JOptionPane.YES_OPTION) {
//                try {
//                    stmt.executeUpdate("UPDATE cad_empresa SET ativo ='0' WHERE cpf='" + empresa.getCpf() + "'");
//                    JOptionPane.showMessageDialog(null, "Aluno Inativado Com Sucesso !!");
//                } catch (SQLException ex) {
//                    Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } else {
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
}
