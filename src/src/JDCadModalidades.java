/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bean.AlunoBean;
import bean.ItemModalidadeBean;
import bean.ItemPlanoBean;
import bean.PlanoBean;
import dao.AlunoDAO;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import factory.ConexaoFactory;
import static factory.ConexaoFactory.con;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronaldo Pedro
 */
public class JDCadModalidades extends javax.swing.JDialog {

    private java.sql.Connection con;
    private java.sql.Statement stmtListar;
    private java.sql.ResultSet rsListar;
    String look_and_fell = ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    int ativo = 1;

    /**
     * Creates new form NovoJDialog
     */
    public JDCadModalidades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lookandfell();
        jTextFieldID_Modalidade.setVisible(false);
        jTextFieldID_ItemModalidade.setVisible(false);
        this.setModal(true);

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
        jbSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlanos = new javax.swing.JTable();
        jComboBoxNomeModalidade = new javax.swing.JComboBox<>();
        jButtonNovoPlano = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonNovoPlano1 = new javax.swing.JButton();
        jButtonNovoPlano2 = new javax.swing.JButton();
        jTextFieldID_Modalidade = new javax.swing.JTextField();
        jTextFieldID_ItemModalidade = new javax.swing.JTextField();
        jSpinnerFrequencia = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jSpinnerValor = new javax.swing.JSpinner();
        precoRender1 = new util.PrecoRender();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movi Mente - Gerenciar Modalidades");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Gerenciar Modalidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jbSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/delete_button.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome");

        jTablePlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Frequencia \"X\"", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablePlanos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTablePlanos.getTableHeader().setReorderingAllowed(false);
        jTablePlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePlanosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePlanos);
        if (jTablePlanos.getColumnModel().getColumnCount() > 0) {
            jTablePlanos.getColumnModel().getColumn(0).setMinWidth(0);
            jTablePlanos.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTablePlanos.getColumnModel().getColumn(0).setMaxWidth(0);
            jTablePlanos.getColumnModel().getColumn(1).setMinWidth(80);
            jTablePlanos.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTablePlanos.getColumnModel().getColumn(1).setMaxWidth(80);
            jTablePlanos.getColumnModel().getColumn(2).setCellRenderer(precoRender1);
        }

        jComboBoxNomeModalidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxNomeModalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBoxNomeModalidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNomeModalidadeItemStateChanged(evt);
            }
        });
        jComboBoxNomeModalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxNomeModalidadeMouseClicked(evt);
            }
        });

        jButtonNovoPlano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNovoPlano.setText("Novo");
        jButtonNovoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPlanoActionPerformed(evt);
            }
        });

        jLabel5.setText("Frequencia");

        jLabel6.setText("Valor");

        jButtonNovoPlano1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNovoPlano1.setText("+");
        jButtonNovoPlano1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPlano1ActionPerformed(evt);
            }
        });

        jButtonNovoPlano2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNovoPlano2.setText("-");
        jButtonNovoPlano2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPlano2ActionPerformed(evt);
            }
        });

        jTextFieldID_Modalidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldID_ItemModalidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinnerValor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxNomeModalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNovoPlano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(212, 212, 212))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinnerFrequencia))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(56, 56, 56))
                                    .addComponent(jSpinnerValor)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldID_Modalidade)
                                    .addComponent(jTextFieldID_ItemModalidade, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(69, 69, 69))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNovoPlano2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonNovoPlano1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(precoRender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNomeModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoPlano))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(precoRender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovoPlano1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovoPlano2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID_Modalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID_ItemModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jbSair))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jButtonNovoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPlanoActionPerformed
        // TODO add your handling code here:
        JDCadModalidadeNome nome = new JDCadModalidadeNome(null, rootPaneCheckingEnabled);
        nome.setLocationRelativeTo(null);
        nome.setVisible(true);
    }//GEN-LAST:event_jButtonNovoPlanoActionPerformed

    private void jButtonNovoPlano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPlano1ActionPerformed
        // TODO add your handling code here:
        addItensTabela();
        buscarParaTabela();
    }//GEN-LAST:event_jButtonNovoPlano1ActionPerformed

    private void jButtonNovoPlano2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPlano2ActionPerformed
        // TODO add your handling code here:
        removerItensTabela();
    }//GEN-LAST:event_jButtonNovoPlano2ActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1FocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
//        carregarcombobox();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jComboBoxNomeModalidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNomeModalidadeItemStateChanged
        // TODO add your handling code here:
        if (jComboBoxNomeModalidade.getSelectedItem().toString().equals("Selecione")) {
            ((DefaultTableModel) jTablePlanos.getModel()).setNumRows(0);
            ((DefaultTableModel) jTablePlanos.getModel()).setNumRows(9);
        } else {
            buscarId_Modalidade();
            buscarParaTabela();
        }
    }//GEN-LAST:event_jComboBoxNomeModalidadeItemStateChanged

    private void jTablePlanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePlanosMouseClicked
        // TODO add your handling code here:
        try {
            int indiceLinha = jTablePlanos.getSelectedRow();
            jTextFieldID_ItemModalidade.setText(jTablePlanos.getValueAt(indiceLinha, 0).toString());

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Selecione Uma Linha Preenchida!");
        }
    }//GEN-LAST:event_jTablePlanosMouseClicked

    private void jComboBoxNomeModalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxNomeModalidadeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomeModalidadeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JDCadModalidades mod = new JDCadModalidades(null, rootPaneCheckingEnabled);
        mod.setLocationRelativeTo(null);
        mod.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        carregarcombobox();
    }//GEN-LAST:event_formWindowOpened

    private void iniciarBD() {
        try {
            con = ConexaoFactory.getConnection();
            stmtListar = con.createStatement();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
        }
    }

    private void removerItensTabela() {
        try {
            ItemPlanoBean item = new ItemPlanoBean();

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM cad_item_modalidade WHERE id_modalidade='" + jTextFieldID_Modalidade.getText() + "' and id_item_modalidade='" + jTextFieldID_ItemModalidade.getText() + "'");

            ((DefaultTableModel) jTablePlanos.getModel()).removeRow(jTablePlanos.getSelectedRow());

        } catch (Exception e) {
        }

    }

    private void carregarcombobox() {
        try {
            iniciarBD();

            rsListar = stmtListar.executeQuery("SELECT * FROM cad_modalidade ORDER BY id_modalidade DESC ");

            while (rsListar.next()) {

                jComboBoxNomeModalidade.addItem(rsListar.getString(2));
            }
        } catch (Exception e) {

        }
    }

    private void buscarId_Modalidade() {
        try {

            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT id_modalidade FROM cad_modalidade WHERE nome='" + jComboBoxNomeModalidade.getSelectedItem().toString() + "'");

            if (rsListar.next()) {
                jTextFieldID_Modalidade.setText(rsListar.getString(1));
            } else {

            }

        } catch (SQLException ex) {

        }
    }

//    private void buscarItemId_Plano() {
//        try {
//
//            iniciarBD();
//            rsListar = stmtListar.executeQuery("SELECT id_item_plano FROM cad_item_plano WHERE nome='" + jComboBoxNomePlano.getSelectedItem().toString() + "' and id_plano='" + jTextFieldID_Plano.getText() + "'");
//
//            if (rsListar.next()) {
//                jTextFieldID_ItemPlano.setText(rsListar.getString(0));
//            } else {
//
//            }
//
//        } catch (SQLException ex) {
//
//        }
//    }
    private void buscarParaTabela() {

        ((DefaultTableModel) jTablePlanos.getModel()).setNumRows(0);
        ((DefaultTableModel) jTablePlanos.getModel()).setNumRows(9);
        iniciarBD();
        try {
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_item_modalidade WHERE id_modalidade='" + jTextFieldID_Modalidade.getText() + "' ORDER BY frequencia asc");
            montarTabela();
        } catch (SQLException e) {

        }
    }

    private void montarTabela() {
        int linha = 0;
        try {
            while (rsListar.next()) {
                String id = rsListar.getString("id_item_modalidade");
                String frequencia = rsListar.getString("frequencia");
                Double valor = rsListar.getDouble("valor");

                jTablePlanos.getModel().setValueAt(id, linha, 0);
                jTablePlanos.getModel().setValueAt(frequencia, linha, 1);
                jTablePlanos.getModel().setValueAt(valor, linha, 2);

                linha++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
        }
    }

    private boolean addItensTabela() {

        if (jSpinnerValor.getValue().toString().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe O Valor!!");
            jSpinnerValor.requestFocus();
        } else if (jSpinnerFrequencia.getValue().equals(0)) {
            JOptionPane.showMessageDialog(null, "Informe a Frequencia!!");
            jSpinnerFrequencia.requestFocus();
        } else {

            try {

                ItemModalidadeBean item = new ItemModalidadeBean();

                item.setId_modalidade(Integer.parseInt(jTextFieldID_Modalidade.getText()));
                item.setValor(Double.parseDouble(jSpinnerValor.getValue().toString()));
                item.setFrequencia(Integer.parseInt(jSpinnerFrequencia.getValue().toString()));

                con = ConexaoFactory.getConnection();
                String sql = "INSERT INTO cad_item_modalidade (id_modalidade,frequencia,valor) VALUES (?,?,?)";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, item.getId_modalidade());
                ps.setInt(2, item.getFrequencia());
                ps.setDouble(3, item.getValor());

//                jTextFieldID_Plano.setText("");
                jSpinnerValor.setValue(0);
                jSpinnerFrequencia.setValue(0);

                return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

            } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            }
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
            java.util.logging.Logger.getLogger(JDCadModalidades.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadModalidades.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadModalidades.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadModalidades.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadModalidades dialog = new JDCadModalidades(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonNovoPlano;
    private javax.swing.JButton jButtonNovoPlano1;
    private javax.swing.JButton jButtonNovoPlano2;
    private javax.swing.JComboBox<String> jComboBoxNomeModalidade;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerFrequencia;
    private javax.swing.JSpinner jSpinnerValor;
    private javax.swing.JTable jTablePlanos;
    private javax.swing.JTextField jTextFieldID_ItemModalidade;
    private javax.swing.JTextField jTextFieldID_Modalidade;
    private javax.swing.JButton jbSair;
    private util.PrecoRender precoRender1;
    // End of variables declaration//GEN-END:variables
}
