/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.Agenda;
import br.ulbra.model.AgendaDao;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diogo
 */
public class FrmCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastro
     */
    public FrmCadastro() throws SQLException 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
        controlarTela(1);
    }
    
    public void limpar()
    {
        txtId.setText(null);
        txtNome.setText(null);
        txtEmail.setText(null);
        txtSenha.setText(null);
        txtTelefone.setText(null);
        txtRecado.setText(null);
    }
    
    public void showTable() throws SQLException
    {
        DefaultTableModel modelo = (DefaultTableModel)tbPesquisa.getModel();
        modelo.setNumRows(0);
        AgendaDao adao = new AgendaDao();
        for(Agenda a: adao.read())
        {
            modelo.addRow(new Object[]
            {
                a.getId(), 
                a.getNome(),
                a.getEmail(),
                a.getSenha(),
                a.getTelefone(),
                a.getRecado()
            });
           
        }
    }
    
    public void showTableForName(String nome) throws SQLException 
    {
        DefaultTableModel modelo = (DefaultTableModel) tbPesquisa.getModel();
        modelo.setNumRows(0);
        AgendaDao adao = new AgendaDao();
        for (Agenda a: adao.readPesq(nome)) 
        {
            modelo.addRow(new Object[]{
                a.getId(), 
                a.getNome(),
                a.getEmail(),
                a.getSenha(),
                a.getTelefone(),
                a.getRecado()
            });
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/iconfinder_Picture1_3289576 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" CADASTRAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CÓDIGO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOME:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SENHA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FONE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RECADO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 460, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 460, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 460, -1));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 460, -1));
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 460, -1));

        txtRecado.setColumns(20);
        txtRecado.setRows(5);
        jScrollPane1.setViewportView(txtRecado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 460, 60));

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-Mail", "Senha", "Telefone", "Recado"
            }
        ));
        tbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPesquisa);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 520, 110));
        jPanel1.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 470, -1));

        btnNovo.setBackground(new java.awt.Color(0, 51, 255));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, -1));

        btnSalvar.setBackground(new java.awt.Color(51, 255, 51));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, -1));

        btnAlterar.setBackground(new java.awt.Color(255, 255, 51));
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 90, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 0, 204));
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 90, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 90, -1));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/iconfinder_search_4092559.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 40, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try 
        {
            showTableForName(txtPesquisar.getText());
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FrmCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Agenda a = new Agenda();
        //UsuarioDao udao = new UsuarioDao();
        
        a.setNome(txtNome.getText());
        a.setEmail(txtEmail.getText());
        a.setSenha(txtSenha.getText());
        a.setTelefone(txtTelefone.getText());
        a.setRecado(txtRecado.getText());
        
        try
        {
            AgendaDao adao = new AgendaDao();
            try 
            {
                adao.create(a);
            } 
            catch (NoSuchAlgorithmException ex) 
            {
                Logger.getLogger(FrmCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            showTable();
            
            controlarTela(1);
            limpar();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaMouseClicked
        if(tbPesquisa.getSelectedRow()!= -1)
        {
            txtId.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 0).toString());
            txtNome.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 1).toString());
            txtEmail.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 2).toString());
            txtSenha.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 3).toString());
            txtTelefone.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 4).toString());   
            txtRecado.setText(tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 4).toString());  
            
            controlarTela(3);
        }
    }//GEN-LAST:event_tbPesquisaMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Agenda a = new Agenda();
        //UsuarioDao udao = new UsuarioDao();
        
        a.setNome(txtNome.getText());
        a.setEmail(txtEmail.getText());
        a.setSenha(txtSenha.getText());
        a.setTelefone(txtTelefone.getText());
        a.setRecado(txtRecado.getText());
        
        try
        {
            AgendaDao adao = new AgendaDao();
            try 
            {
                adao.update(a);
            } 
            catch (NoSuchAlgorithmException ex) 
            {
                Logger.getLogger(FrmCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            showTable();
            
            controlarTela(1);            

        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Agenda a = new Agenda();
        a.setId(Integer.parseInt(txtId.getText()));
        
        try 
        {
            AgendaDao adao = new AgendaDao();
            adao.delete(a);
            showTable();
            
            controlarTela(1);
            limpar();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FrmCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
        controlarTela(1);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        controlarTela(2);
    }//GEN-LAST:event_btnNovoActionPerformed

    public void controlarTela(int op)
    {
        if(op ==1) //iniciar
        {
            txtId.setEnabled(false); 
           
            txtNome.setEnabled(false);
            txtEmail.setEnabled(false);
            txtSenha.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtRecado.setEnabled(false);
            
            btnSalvar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(true);
        }
        else if(op ==2) //botao novo
        {
            txtId.setEnabled(false); 
            
            txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            txtSenha.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtRecado.setEnabled(true);
            
            btnSalvar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(false);
            
            txtNome.requestFocus();
            
            limpar();
        }
        else if(op==3) //tabela 
        {
            txtId.setEnabled(true); 
            
            txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            txtSenha.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtRecado.setEnabled(true);
            
            btnSalvar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnNovo.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmCadastro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrmCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextArea txtRecado;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
