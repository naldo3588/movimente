/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bean.ParcelasBean;
import dao.ParcelasDAO;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import factory.ConexaoFactory;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static src.JDAPM.id_contrato;

/**
 *
 * @author Ronaldo Pedro
 */
public class JDParcelasEmpresa extends javax.swing.JDialog {

    private java.sql.Connection con;
    String look_and_fell = ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    Date diaAtual = new Date();
    public Double valor;
    public int numPar;
    public static int statusParcelas = 0;
    JFLogin login;
    NumberFormat format;
    public Double valor1;
    public Double valor2;

    /**
     * Creates new form JDLancFinanceiro
     */
    public JDParcelasEmpresa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        lookandfell();
        jFormattedTextFieldNumContrato.setText(String.valueOf(JDAPMEmpresa.id_contrato));
        jFormattedTextFieldQTDParcelas.setText(String.valueOf(JDAPMEmpresa.qtd_parcelas));
        jFormattedTextFieldValorMensalidade.setText(String.valueOf(JDAPMEmpresa.valor_mensalidade));
        jFormattedTextFieldValorContrato.setText(String.valueOf(JDAPMEmpresa.valor_total_contrato));
//        valor1 = JDAPM.valor_mensalidade;
//        valor2 = JDAPM.valor_total_contrato;
//        jFormattedTextFieldValorMensalidade1.setText(String.valueOf(format.format(valor1)));
//        jFormattedTextFieldValorContrato1.setText(String.valueOf(format.format(valor2)));
        jDateChooserDataVcto.setDate(diaAtual);
        valor = Double.parseDouble(jFormattedTextFieldValorMensalidade.getText());
        numPar = Integer.parseInt(jFormattedTextFieldQTDParcelas.getText());
        jFormattedTextFieldQTDParcelas.setVisible(false);
        jFormattedTextFieldValorMensalidade1.setVisible(false);
        jFormattedTextFieldValorMensalidade.setVisible(false);
        jFormattedTextFieldValorContrato1.setVisible(false);
        jFormattedTextFieldValorContrato.setVisible(false);
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
        jLabel5 = new javax.swing.JLabel();
        jComboBoxFormaPgto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldQTDParcelas = new javax.swing.JFormattedTextField();
        jFormattedTextFieldValorContrato = new javax.swing.JFormattedTextField();
        jFormattedTextFieldValorMensalidade = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextFieldNumContrato = new javax.swing.JFormattedTextField();
        jButtonFinalizar = new javax.swing.JButton();
        jDateChooserDataVcto = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextFieldValorMensalidade1 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldValorContrato1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Movi Mente - Finalizar Contrato - Gerar Parcelas");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Gerar Parcelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Forma Pagamento");

        jComboBoxFormaPgto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxFormaPgto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "DI - Dinheiro", "CD - Cartão Débito", "CC - Cartão Crédito - à vista", "CP - Cartão Crédito - Parcelado", "TR - Transferência ou Doc", "CH - Cheque" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jFormattedTextFieldQTDParcelas.setEditable(false);

        jFormattedTextFieldValorContrato.setEditable(false);

        jFormattedTextFieldValorMensalidade.setEditable(false);
        jFormattedTextFieldValorMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValorMensalidadeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Contrato Nº");

        jFormattedTextFieldNumContrato.setEditable(false);
        jFormattedTextFieldNumContrato.setBorder(null);
        jFormattedTextFieldNumContrato.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jButtonFinalizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jDateChooserDataVcto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Vencimento");

        jFormattedTextFieldValorMensalidade1.setEditable(false);
        jFormattedTextFieldValorMensalidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValorMensalidade1ActionPerformed(evt);
            }
        });

        jFormattedTextFieldValorContrato1.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldQTDParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldValorMensalidade)
                            .addComponent(jFormattedTextFieldValorMensalidade1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldValorContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldValorContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFormaPgto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jDateChooserDataVcto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldNumContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFinalizar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextFieldNumContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFormaPgto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserDataVcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldQTDParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldValorMensalidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldValorContrato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldValorContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldValorMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButtonFinalizar)
                .addGap(79, 79, 79)
                .addComponent(jLabel7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        // TODO add your handling code here:
        if (jComboBoxFormaPgto.getSelectedItem().toString().equals("Selecione")) {
            JOptionPane.showMessageDialog(rootPane, "Selecione a forma de Pagamento !!");
        } else if (jDateChooserDataVcto.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Digite a Data de Vencimento !!");
        } else {
            gerarParcelas();
            this.dispose();
        }

//        insert();

    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:


    }//GEN-LAST:event_formWindowGainedFocus

    private void jFormattedTextFieldValorMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorMensalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValorMensalidadeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(rootPane, "Não é Possivel Fechar Esta Janela \n As parcelas só podem ser Geradas neste Momento!!");
        JOptionPane.showMessageDialog(this, "Se sair agora todo os dados inseridos serão perdidos !!");
        int option = JOptionPane.showConfirmDialog(rootPane, "Confirma ?");

        if (option == JOptionPane.YES_OPTION) {
            roolbackAll();
            this.dispose();
        } else {

        }


    }//GEN-LAST:event_formWindowClosing

    private void jFormattedTextFieldValorMensalidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorMensalidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValorMensalidade1ActionPerformed

    private void gerarParcelas() {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(jDateChooserDataVcto.getDate());

        if (jDateChooserDataVcto.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Informe a data de vencimento!!");
            jDateChooserDataVcto.requestFocus();

        } else {

            ParcelasBean parcela = new ParcelasBean();
            ParcelasDAO dao = new ParcelasDAO();
            parcela.setId_contrato(Integer.parseInt(jFormattedTextFieldNumContrato.getText()));
            parcela.setValor_total(Double.parseDouble(jFormattedTextFieldValorContrato.getText()));

            parcela.setTipo_entrada(1);
            parcela.setTipo_pagamento(jComboBoxFormaPgto.getSelectedItem().toString());
            parcela.setUsuario(JFLogin.nomeuser);

            parcela.setValor_parcela(valor);
            for (int e = 1; e <= numPar; e++) {
                gc.setTime(jDateChooserDataVcto.getDate());
                gc.add(GregorianCalendar.MONTH, e - 1);
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date d = gc.getTime();
                df.format(d);
                parcela.setNumero_parcela(e);
                parcela.setData_vencimento(d);
                System.out.println(d);
                dao.inserirEmpresa(parcela);
                statusParcelas = 1;
                JDAPM.status = 1;
            }
            JOptionPane.showMessageDialog(rootPane, "Parcelas Geradas !!");
        }
    }

    public boolean roolbackAll() {
        try {
            id_contrato = Integer.parseInt(jFormattedTextFieldNumContrato.getText());
            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM cad_item_contrato_empresa WHERE id_contrato_empresa='" + id_contrato + "'");
            stmt.executeUpdate("DELETE FROM contrato_empresa WHERE id_contrato_empresa='" + id_contrato + "' and status=1 ");
            stmt.executeUpdate("DELETE FROM parcela_contrato_empresa WHERE id_parcela_contrato_empresa='" + id_contrato + "'");
//            JOptionPane.showMessageDialog(this, "Rotina não completada !!\n As alterações no Banco de Dados Foram Excluidas !!");

        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return true;
    }

    private void lookandfell() {
        try {

            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o tema = " + erro);
        }
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
            java.util.logging.Logger.getLogger(JDParcelasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDParcelasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDParcelasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDParcelasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDParcelasEmpresa dialog = new JDParcelasEmpresa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JComboBox<String> jComboBoxFormaPgto;
    private com.toedter.calendar.JDateChooser jDateChooserDataVcto;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumContrato;
    private javax.swing.JFormattedTextField jFormattedTextFieldQTDParcelas;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorContrato;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorContrato1;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorMensalidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorMensalidade1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
