/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bean.AlunoBean;
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
public class JDCadPlanos extends javax.swing.JDialog {

    private java.sql.Connection con;
    private java.sql.Statement stmtListar;
    private java.sql.ResultSet rsListar;
    String look_and_fell = ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    int ativo = 1;

    /**
     * Creates new form NovoJDialog
     */
    public JDCadPlanos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lookandfell();
        jTextFieldID_Plano.setVisible(false);
        jTextFieldID_ItemPlano.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlanos = new javax.swing.JTable();
        jComboBoxNomePlano = new javax.swing.JComboBox<>();
        jButtonNovoPlano = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonNovoPlano1 = new javax.swing.JButton();
        jButtonNovoPlano2 = new javax.swing.JButton();
        jTextFieldID_Plano = new javax.swing.JTextField();
        jTextFieldID_ItemPlano = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerMembros = new javax.swing.JSpinner();
        jSpinnerDesconto = new javax.swing.JSpinner();
        jSpinnerMeses = new javax.swing.JSpinner();
        jbSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movi Mente - Gerenciar Planos");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Gerenciar Planos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome");

        jTablePlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Membros", "Desconto", "Meses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
            jTablePlanos.getColumnModel().getColumn(1).setMinWidth(55);
            jTablePlanos.getColumnModel().getColumn(1).setPreferredWidth(55);
            jTablePlanos.getColumnModel().getColumn(1).setMaxWidth(55);
            jTablePlanos.getColumnModel().getColumn(3).setMinWidth(50);
            jTablePlanos.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTablePlanos.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jComboBoxNomePlano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxNomePlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jComboBoxNomePlano.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNomePlanoItemStateChanged(evt);
            }
        });

        jButtonNovoPlano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNovoPlano.setText("Novo");
        jButtonNovoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPlanoActionPerformed(evt);
            }
        });

        jLabel5.setText("Membros");

        jLabel6.setText("Desconto");

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

        jTextFieldID_Plano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldID_ItemPlano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setText("   Meses");

        jSpinnerMembros.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jSpinnerDesconto.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        jSpinnerMeses.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jbSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/delete_button.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNovoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jSpinnerMembros, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSpinnerDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldID_ItemPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldID_Plano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonNovoPlano1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovoPlano2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoPlano))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerMembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovoPlano1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovoPlano2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID_Plano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID_ItemPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jButtonNovoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPlanoActionPerformed
        // TODO add your handling code here:
        JDCadPlanoNome cadPlanoNome = new JDCadPlanoNome(null, rootPaneCheckingEnabled);
        cadPlanoNome.setLocationRelativeTo(null);
        cadPlanoNome.setVisible(true);
    }//GEN-LAST:event_jButtonNovoPlanoActionPerformed

    private void jButtonNovoPlano1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPlano1ActionPerformed
        // TODO add your handling code here:
        if (jComboBoxNomePlano.getSelectedItem().toString().equals("Selecione")) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o Plano !!");
        } else {

            addItensTabela();
            buscarParaTabela();
        }
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
        carregarcombobox();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jComboBoxNomePlanoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNomePlanoItemStateChanged
        // TODO add your handling code here:
        if (jComboBoxNomePlano.getSelectedItem().toString().equals("Selecione")) {
            ((DefaultTableModel) jTablePlanos.getModel()).setNumRows(0);
            ((DefaultTableModel) jTablePlanos.getModel()).setNumRows(9);
        } else {
            buscarId_Plano();

            buscarParaTabela();
        }
    }//GEN-LAST:event_jComboBoxNomePlanoItemStateChanged

    private void jTablePlanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePlanosMouseClicked
        // TODO add your handling code here:
        try {
            int indiceLinha = jTablePlanos.getSelectedRow();
            jTextFieldID_ItemPlano.setText(jTablePlanos.getValueAt(indiceLinha, 0).toString());

        } catch (NullPointerException e) {
            System.out.println("src.JDCadPlanos.jTablePlanosMouseClicked()");
        }
    }//GEN-LAST:event_jTablePlanosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JDCadPlanos mod = new JDCadPlanos(null, rootPaneCheckingEnabled);
        mod.setLocationRelativeTo(null);
        mod.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            stmt.executeUpdate("DELETE FROM cad_item_plano WHERE id_plano='" + jTextFieldID_Plano.getText() + "' and id_item_plano='" + jTextFieldID_ItemPlano.getText() + "'");

            ((DefaultTableModel) jTablePlanos.getModel()).removeRow(jTablePlanos.getSelectedRow());

        } catch (Exception e) {
        }

    }

    private void carregarcombobox() {
        try {
            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_plano ORDER BY id_plano DESC ");
            while (rsListar.next()) {
                jComboBoxNomePlano.addItem(rsListar.getString(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro " + e.getMessage());
        }
    }

    private void buscarId_Plano() {
        try {

            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT id_plano FROM cad_plano WHERE nome='" + jComboBoxNomePlano.getSelectedItem().toString() + "'");

            if (rsListar.next()) {
                jTextFieldID_Plano.setText(rsListar.getString(1));
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
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_item_plano WHERE id_plano='" + jTextFieldID_Plano.getText() + "' ORDER BY membro asc");
            montarTabela();
        } catch (SQLException e) {

        }

    }

    private void montarTabela() {
        int linha = 0;
        try {
            while (rsListar.next()) {
                String id = rsListar.getString("id_item_plano");
                String membro = rsListar.getString("membro");
                String desconto = rsListar.getString("desconto");
                String meses = rsListar.getString("meses");
                jTablePlanos.getModel().setValueAt(id, linha, 0);
                jTablePlanos.getModel().setValueAt(membro, linha, 1);
                jTablePlanos.getModel().setValueAt(desconto, linha, 2);
                jTablePlanos.getModel().setValueAt(meses, linha, 3);

                linha++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
        }
    }

    private boolean addItensTabela() {

        if (jSpinnerDesconto.getValue().equals(0)) {
            JOptionPane.showMessageDialog(rootPane, "Informe a Quantidade de desconto!!");
            jSpinnerDesconto.requestFocus();
        } else if (jSpinnerMembros.getValue().equals(0)) {
            JOptionPane.showMessageDialog(null, "Informe a Quantidade de Membros!!");
            jSpinnerDesconto.requestFocus();
        } else if (jSpinnerMeses.getValue().equals(0)) {
            JOptionPane.showMessageDialog(null, "Informe a Quantidade de Meses!!");
            jSpinnerDesconto.requestFocus();
        } else {

            try {

                ItemPlanoBean item = new ItemPlanoBean();

                item.setId_plano(Integer.parseInt(jTextFieldID_Plano.getText()));
                item.setDesconto(Double.parseDouble(jSpinnerDesconto.getValue().toString()));
                item.setMembro(Integer.parseInt(jSpinnerMembros.getValue().toString()));
                item.setMeses(Integer.parseInt(jSpinnerMeses.getValue().toString()));

                con = ConexaoFactory.getConnection();
                String sql = "INSERT INTO cad_item_plano (id_plano,membro,desconto,meses) VALUES (?,?,?,?)";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, item.getId_plano());
                ps.setInt(2, item.getMembro());
                ps.setDouble(3, item.getDesconto());
                ps.setInt(4, item.getMeses());

//                jTextFieldID_Plano.setText("");
                jSpinnerDesconto.setValue(0);
                jSpinnerMembros.setValue(0);
                jSpinnerMeses.setValue(0);

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
            java.util.logging.Logger.getLogger(JDCadPlanos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadPlanos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadPlanos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadPlanos.class
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadPlanos dialog = new JDCadPlanos(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxNomePlano;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDesconto;
    private javax.swing.JSpinner jSpinnerMembros;
    private javax.swing.JSpinner jSpinnerMeses;
    private javax.swing.JTable jTablePlanos;
    private javax.swing.JTextField jTextFieldID_ItemPlano;
    private javax.swing.JTextField jTextFieldID_Plano;
    private javax.swing.JButton jbSair;
    // End of variables declaration//GEN-END:variables
}