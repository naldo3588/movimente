/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConexaoFactory;
import bean.UsuarioBean;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import src.JFLogin;
import src.JFTelaPrincipal;

/**
 *
 * @author Ronaldo Pedro
 */
public class UsuarioDAO {

    Connection connection;
    private Connection con;
    private ResultSet rsNavegar;
    private java.sql.Statement stmt;
    private java.sql.ResultSet rsListar;
    private Statement stmtNavegar;

    public UsuarioDAO() throws ClassNotFoundException {
        try {
            this.connection = ConexaoFactory.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean inserir(UsuarioBean usuario) {

        try {
            if (existelogin(usuario.getLogin())) {
//                JOptionPane.showMessageDialog(null, "Login ja cadastrado");
                return false;
            }
            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_usuario(login,senha,nome,email,perfil,ativo) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getNome());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getPerfil());
            ps.setInt(6, usuario.getAtivo());

            JOptionPane.showMessageDialog(null, "Usuario " + usuario.getNome() + " Cadastrado com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }

    public boolean autenticar(UsuarioBean usuario) {

        try {

            if (existeusuario(usuario.getLogin(), usuario.getSenha())) {
//                JOptionPane.showMessageDialog(null, "Funcionario " + funcionario.getLogin() + " autenticado com sucesso! ");
                JFLogin telalogin = new JFLogin();
                telalogin.setVisible(false);
//                JDTelaPrincipal tela = new JDTelaPrincipal(telalogin, true);
                JFTelaPrincipal tela = new JFTelaPrincipal();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);

                return false;

            } else {
                JFLogin telalogin = new JFLogin();
                telalogin.setVisible(true);
            }

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_usuario (login,senha) VALUES (?,?)";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }

    public boolean existeusuario(String login, String senha) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "SELECT login, senha FROM cad_usuario WHERE login = ? and senha = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet result = ps.executeQuery();

            return result.next();

        } catch (SQLException e) {

            return true;
        }
    }

    public boolean existelogin(String login) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "SELECT id_usuario FROM cad_usuario WHERE id_usuario = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, login);

            ResultSet result = ps.executeQuery();

            return result.next();

        } catch (SQLException e) {

            return true;
        }
    }

    public boolean altera(UsuarioBean usuario) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("UPDATE cad_usuario SET nome='"
                    + usuario.getNome() + "',email='" + usuario.getEmail() + "',perfil='" + usuario.getPerfil() + "' WHERE id_usuario='" + usuario.getId_usuario() + "'");
            JOptionPane.showMessageDialog(null, " Usuario " + usuario.getNome() + " atualizado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return true;
    }

    public boolean exclui(UsuarioBean usuario) throws SQLException, ClassNotFoundException {
        con = ConexaoFactory.getConnection();
        Statement stmt = con.createStatement();
        try {

            Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Excluir Usuario", JOptionPane.OK_CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                stmt.executeUpdate("DELETE FROM cad_usuario WHERE id_usuario='" + usuario.getId_usuario() + "'");
                JOptionPane.showMessageDialog(null, " Usuario Excluido com Sucesso!!");
            }
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            Integer opcao = JOptionPane.showConfirmDialog(null, "Este Usuario Possui Movimentação! Não é Possivel Excluir !! \n   \n Deseja Inativa-lo ?", "Excluir Aluno", JOptionPane.OK_CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                try {
                    stmt.executeUpdate("UPDATE cad_usuario SET ativo ='0' WHERE id_usuario='" + usuario.getId_usuario() + "'");
                    JOptionPane.showMessageDialog(null, "Usuario Inativado Com Sucesso !!");
                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
