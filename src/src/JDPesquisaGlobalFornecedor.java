/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import factory.ConexaoFactory;
import bean.AlunoBean;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronaldo Pedro
 */
public class JDPesquisaGlobalFornecedor extends javax.swing.JDialog {

    private java.sql.Connection con;
    private java.sql.Statement stmtListar;
    private java.sql.ResultSet rsListar;
    public static String cpf;
    public static int id_fornecedor;

    /**
     * Creates new form JDCRUDAluno
     *
     * @param parent
     * @param modal
     */
    public JDPesquisaGlobalFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

//        lookandfell();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldPesquisaNome2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAlunos = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movi Mente - Gerenciar Alunos");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText(" Nome");

        jTextFieldPesquisaNome2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPesquisaNome2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPesquisaNome2CaretUpdate(evt);
            }
        });
        jTextFieldPesquisaNome2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldPesquisaNome2CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextFieldPesquisaNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaNome2ActionPerformed(evt);
            }
        });
        jTextFieldPesquisaNome2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaNome2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPesquisaNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPesquisaNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        JTableAlunos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTableAlunos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Razão Social", "Nome Fantasia", "Endereço", "CNPJ", "Email", "IE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTableAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JTableAlunos.getTableHeader().setReorderingAllowed(false);
        JTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAlunos);
        if (JTableAlunos.getColumnModel().getColumnCount() > 0) {
            JTableAlunos.getColumnModel().getColumn(0).setMinWidth(0);
            JTableAlunos.getColumnModel().getColumn(0).setPreferredWidth(0);
            JTableAlunos.getColumnModel().getColumn(0).setMaxWidth(0);
            JTableAlunos.getColumnModel().getColumn(1).setPreferredWidth(200);
            JTableAlunos.getColumnModel().getColumn(2).setPreferredWidth(200);
            JTableAlunos.getColumnModel().getColumn(3).setResizable(false);
            JTableAlunos.getColumnModel().getColumn(3).setPreferredWidth(25);
            JTableAlunos.getColumnModel().getColumn(4).setMinWidth(100);
            JTableAlunos.getColumnModel().getColumn(4).setPreferredWidth(100);
            JTableAlunos.getColumnModel().getColumn(4).setMaxWidth(100);
            JTableAlunos.getColumnModel().getColumn(5).setPreferredWidth(35);
            JTableAlunos.getColumnModel().getColumn(6).setMinWidth(70);
            JTableAlunos.getColumnModel().getColumn(6).setPreferredWidth(70);
            JTableAlunos.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButtonSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/delete_button.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaNome2ActionPerformed

    private void JTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAlunosMouseClicked
        int linha = JTableAlunos.getSelectedRow();
        String id = JTableAlunos.getValueAt(linha, 0).toString();
        String cpf1 = JTableAlunos.getValueAt(linha, 4).toString();
        id_fornecedor = Integer.parseInt(id);
        cpf = cpf1;
        this.dispose();

    }//GEN-LAST:event_JTableAlunosMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void jTextFieldPesquisaNome2CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaNome2CaretPositionChanged
        // TODO add your handling code here:
        buscarnome();
    }//GEN-LAST:event_jTextFieldPesquisaNome2CaretPositionChanged

    private void jTextFieldPesquisaNome2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaNome2CaretUpdate
        // TODO add your handling code here:
        buscarnome();
        if (jTextFieldPesquisaNome2.getText().isEmpty()) {
            ((DefaultTableModel) JTableAlunos.getModel()).setNumRows(0);
            ((DefaultTableModel) JTableAlunos.getModel()).setNumRows(100);
        }
    }//GEN-LAST:event_jTextFieldPesquisaNome2CaretUpdate

    private void jTextFieldPesquisaNome2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaNome2KeyPressed
        // TODO add your handling code here:
        enterTodos(evt);
    }//GEN-LAST:event_jTextFieldPesquisaNome2KeyPressed

    private void enterTodos(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                listartodos();
            } catch (Exception e) {
            }
        }
    }

    private void montarTabela() {
        int linha = 0;
        try {
            while (rsListar.next()) {
                String id = rsListar.getString("id_empresa");
                String nome = rsListar.getString("razao_social");
                String nome2 = rsListar.getString("nome_fantasia");
                String cpf = rsListar.getString("endereco");
                String rg = rsListar.getString("cnpj");
                String endereco = rsListar.getString("email");
                String bairro = rsListar.getString("inscricao_estadual");

                JTableAlunos.getModel().setValueAt(id, linha, 0);
                JTableAlunos.getModel().setValueAt(nome, linha, 1);
                JTableAlunos.getModel().setValueAt(nome2, linha, 2);
                JTableAlunos.getModel().setValueAt(cpf, linha, 3);
                JTableAlunos.getModel().setValueAt(rg, linha, 4);
                JTableAlunos.getModel().setValueAt(endereco, linha, 5);
                JTableAlunos.getModel().setValueAt(bairro, linha, 6);

                linha++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
        }
    }

    private void iniciarBD() {
        try {
            con = ConexaoFactory.getConnection();
            stmtListar = con.createStatement();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
        }
    }

    private void buscarnome() {
        try {
            System.out.println("src.JDPesquisaGlobalAluno.buscarnome()");
            AlunoBean aluno = new AlunoBean();
            aluno.setNome(jTextFieldPesquisaNome2.getText());
            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_empresa WHERE nome_fantasia LIKE '" + aluno.getNome() + "%'");
            if (!rsListar.next()) {
                ((DefaultTableModel) JTableAlunos.getModel()).setNumRows(0);
                ((DefaultTableModel) JTableAlunos.getModel()).setNumRows(100);
                jTextFieldPesquisaNome2.requestFocus();
            } else {
                rsListar = stmtListar.executeQuery("SELECT * FROM cad_empresa WHERE nome_fantasia LIKE '" + aluno.getNome() + "%'");
                ((DefaultTableModel) JTableAlunos.getModel()).setNumRows(0);
                ((DefaultTableModel) JTableAlunos.getModel()).setNumRows(100);
                montarTabela();
            }
        } catch (SQLException ex) {

        }
    }

    private void listartodos() {
        iniciarBD();
        try {
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_empresa WHERE ativo='1' order by razao_social asc");
            montarTabela();

        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(JDPesquisaGlobalAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDPesquisaGlobalAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDPesquisaGlobalAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDPesquisaGlobalAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDPesquisaGlobalFornecedor dialog = new JDPesquisaGlobalFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable JTableAlunos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPesquisaNome2;
    // End of variables declaration//GEN-END:variables
}
