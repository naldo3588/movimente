/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bean.UsuarioBean;
import dao.UsuarioDAO;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Ronaldo Pedro
 */
public class JDCadUsuario extends javax.swing.JDialog {

    String look_and_fell = ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

    /**
     * Creates new form JDCadusuario
     */
    public JDCadUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lookandfell();
        jCheckBoxAtivo.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxPermissao = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movi Mente - Cadastro de Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastrar Novo Funcionario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEmail.setText("Email");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Ativo");

        jComboBoxPermissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Comum" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Permissão");

        jCheckBoxAtivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Login");

        jTextFieldLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordFieldSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPasswordFieldConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Confirmar Senha");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldEmail)
                    .addComponent(jComboBoxPermissao, 0, 187, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxAtivo))
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEmail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAtivo))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jbSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/delete_button.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/save_f.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/limpar_icon.png"))); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        validaremail();
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparcampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void lookandfell() {
        try {

            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o tema = " + erro);
        }
    }

    public void validaremail() {
        if (jTextFieldEmail.getText().isEmpty()) {

        } else if ((jTextFieldEmail.getText().contains("@")) && (jTextFieldEmail.getText().contains(".")) && (!jTextFieldEmail.getText().contains(" "))) {
            String usuario = new String(jTextFieldEmail.getText().substring(0, jTextFieldEmail.getText().lastIndexOf('@')));
            String dominio = new String(jTextFieldEmail.getText().substring(jTextFieldEmail.getText().lastIndexOf('@') + 1, jTextFieldEmail.getText().length()));
            if ((usuario.length() >= 1) && (!usuario.contains("@")) && (dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".") >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite um email valido!!");
            jTextFieldEmail.requestFocus();

        }
    }

    private void limparcampos() {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jComboBoxPermissao.setSelectedItem("Selecione");
    }

    private void salvar() {
        if (validarcamposvazios() == false) {

            try {
                UsuarioBean usuario = new UsuarioBean();
                UsuarioDAO dao = new UsuarioDAO();

                usuario.setNome(jTextFieldNome.getText());
                usuario.setEmail(jTextFieldEmail.getText());
                usuario.setLogin(jTextFieldLogin.getText());
                usuario.setSenha(jPasswordFieldSenha.getText());
                usuario.setPerfil(jComboBoxPermissao.getSelectedItem().toString());
                usuario.setAtivo(1);
                String login = jTextFieldLogin.getText();
                String senha1 = jPasswordFieldSenha.getText();
                String senha2 = jPasswordFieldConfirmarSenha.getText();

                if (dao.existelogin(login) == true) {
                    JOptionPane.showMessageDialog(null, "Login " + jTextFieldLogin.getText() + " ja existe!!");
                    jTextFieldLogin.requestFocus();

                } else if (!senha1.equals(senha2)) {
                    JOptionPane.showMessageDialog(null, "Senhas não conferem, os campos devem ser iguais!!");
                    jPasswordFieldConfirmarSenha.setText("");
                    jPasswordFieldConfirmarSenha.requestFocus();

                } else {
                    dao.inserir(usuario);
                    jTextFieldNome.requestFocus();
                    limparcampos();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JDCadUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean validarcamposvazios() {

        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor digite um nome!", "Digite um nome", WIDTH);
            jTextFieldNome.requestFocus();

        } else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor digite um email!", "Digite um email", WIDTH);
            jTextFieldEmail.requestFocus();

        } else if (jTextFieldLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor digite um login!", "Digite um login", WIDTH);
            jTextFieldLogin.requestFocus();
        } else if (jPasswordFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor digite uma senha!", "Digite uma senha", WIDTH);
            jPasswordFieldSenha.requestFocus();
        } else if (jPasswordFieldConfirmarSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor digite a confirmação da senha!", "Digite a confirmação da senha", WIDTH);
            jPasswordFieldConfirmarSenha.requestFocus();
        } else if (jComboBoxPermissao.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Por favor Selecione uma opção!", "Selecione uma opção", WIDTH);
            jComboBoxPermissao.requestFocus();
        } else {

            return false;
        }

        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadUsuario dialog = new JDCadUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JComboBox<String> jComboBoxPermissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    // End of variables declaration//GEN-END:variables
}
