/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import factory.ConexaoFactory;
import bean.UsuarioBean;
import dao.UsuarioDAO;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Ronaldo Pedro
 */
public class JFLogin extends javax.swing.JFrame {

    public static String nomelogado;
    public static String nomeuser;
    public static String tipouser;
    public static String senhalogado;
    ConexaoFactory conecta = new ConexaoFactory();
    String look_and_fell = ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

    /**
     * Creates new form Login
     */
    public JFLogin() {
        initComponents();
        lookandfell();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logooooo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movi Mente - Autenticação de Usuario");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel1.setText("Esqueceu Sua Senha?");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 100, 110, 20);

        jTextFieldLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldLogin.setToolTipText("");
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLogin);
        jTextFieldLogin.setBounds(230, 30, 180, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 60, 60, 16);

        jPasswordSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordSenhaActionPerformed(evt);
            }
        });
        jPasswordSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordSenha);
        jPasswordSenha.setBounds(230, 80, 180, 20);

        jButtonEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ok_button.png"))); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setMaximumSize(new java.awt.Dimension(4, 129));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jButtonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(230, 110, 90, 25);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/delete_button.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(330, 110, 80, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoredimensionadaRelatorio.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 30, 190, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 10, 90, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/plain-white-background.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 430, 150);

        setSize(new java.awt.Dimension(445, 183));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jPasswordSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordSenhaActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jPasswordSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordSenhaKeyPressed
        logarEnter(evt);
    }//GEN-LAST:event_jPasswordSenhaKeyPressed

    private void jButtonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEntrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEntrarKeyPressed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        logar();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    public boolean verificaAutenticacao() {
        boolean acesso = false;

        try {
            ConexaoFactory conectmysql = new ConexaoFactory();
            conectmysql.conexao();
            conectmysql.createStatement();
            conectmysql.executaSQL("SELECT * FROM cad_usuario WHERE ativo='1'");

            while (conectmysql.rs.next()) {
                if ((jTextFieldLogin.getText().equals(conectmysql.rs.getString("login")))
                        && jPasswordSenha.getText().equals(conectmysql.rs.getString("senha"))) {
                    nomeuser = conectmysql.rs.getString("login");
                    nomelogado = conectmysql.rs.getString("nome");
                    tipouser = conectmysql.rs.getString("perfil");
                    senhalogado = conectmysql.rs.getString("senha");
                    acesso = true;
                }
            }

            if (!acesso) {
                JOptionPane.showMessageDialog(null, "Usuário Incorreto/Inativo ou Senha Inválida!! ");
            }
        } catch (Exception erro) {
            System.out.println("Erro Tela Login: " + erro);
        }

        return acesso;
    }

    private void logar() {
        try {
            UsuarioBean usuario = new UsuarioBean();
            UsuarioDAO dao = new UsuarioDAO();
            usuario.setLogin(jTextFieldLogin.getText());
            usuario.setSenha(jPasswordSenha.getText());
            verificaAutenticacao();
            System.out.println("src.JfLogin.logar()" + tipouser);
            dao.autenticar(usuario);
            this.dispose();
        } catch (Exception e) {
        }
    }

    private void logarEnter(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                UsuarioBean usuario = new UsuarioBean();
                UsuarioDAO dao = new UsuarioDAO();
                usuario.setLogin(jTextFieldLogin.getText());
                usuario.setSenha(jPasswordSenha.getText());
                verificaAutenticacao();
                dao.autenticar(usuario);
                this.dispose();
            } catch (Exception e) {
            }
        }
    }

    private void lookandfell() {
        try {

            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o tema = " + erro);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
