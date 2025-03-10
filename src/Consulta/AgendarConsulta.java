package Consulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Kaue
 */
public class AgendarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form AgendarConsulta
     */
    public AgendarConsulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblLogo1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblHoraCons = new javax.swing.JLabel();
        lblMedCons = new javax.swing.JLabel();
        btnAgendarConsulta = new javax.swing.JButton();
        txtMedCons = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtHoraCons = new javax.swing.JTextField();
        lblDataCons = new javax.swing.JLabel();
        txtDataCons = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendar Consulta");
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Saúde e Bem Estar");
        jPanel2.add(lblTitulo);
        lblTitulo.setBounds(140, 10, 440, 60);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/logosite.png"))); // NOI18N
        jPanel2.add(lblLogo);
        lblLogo.setBounds(40, 10, 60, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 660, 82);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));
        jPanel3.setLayout(null);

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Saúde e Bem Estar");
        jPanel3.add(lblTitulo1);
        lblTitulo1.setBounds(260, 10, 440, 60);

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/logosite.png"))); // NOI18N
        jPanel3.add(lblLogo1);
        lblLogo1.setBounds(80, 10, 60, 60);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 950, 82);

        jPanel4.setBackground(new java.awt.Color(51, 153, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(null);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("E-mail:");
        jPanel4.add(lblEmail);
        lblEmail.setBounds(0, 30, 120, 40);

        lblHoraCons.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHoraCons.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraCons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraCons.setText("Hora:");
        jPanel4.add(lblHoraCons);
        lblHoraCons.setBounds(0, 130, 120, 40);

        lblMedCons.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMedCons.setForeground(new java.awt.Color(255, 255, 255));
        lblMedCons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedCons.setText("Medico:");
        jPanel4.add(lblMedCons);
        lblMedCons.setBounds(0, 180, 120, 40);

        btnAgendarConsulta.setText("Agendar Consulta");
        btnAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarConsultaActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgendarConsulta);
        btnAgendarConsulta.setBounds(100, 250, 220, 50);
        jPanel4.add(txtMedCons);
        txtMedCons.setBounds(120, 180, 270, 40);
        jPanel4.add(txtEmail);
        txtEmail.setBounds(120, 30, 270, 40);

        txtHoraCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraConsActionPerformed(evt);
            }
        });
        jPanel4.add(txtHoraCons);
        txtHoraCons.setBounds(120, 130, 270, 40);

        lblDataCons.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataCons.setForeground(new java.awt.Color(255, 255, 255));
        lblDataCons.setText("Data da consulta:");
        jPanel4.add(lblDataCons);
        lblDataCons.setBounds(0, 80, 120, 40);
        jPanel4.add(txtDataCons);
        txtDataCons.setBounds(120, 80, 270, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(130, 130, 420, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 500);

        setSize(new java.awt.Dimension(686, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarConsultaActionPerformed
        String data_cons, hora, med, id_cons, ema;
        ema = txtEmail.getText();
        data_cons = txtDataCons.getText();
        hora = txtHoraCons.getText();
        med = txtMedCons.getText();
        id_cons = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/clinica_saude", "root", "p@$$w0rd");
            // 3 - Enviar os dados para a tabela do Banco de dados
            PreparedStatement st = conectar.prepareStatement("INSERT INTO consulta VALUES(?,?,?,?,?)");
            st.setString(1, id_cons);
            st.setString(2, ema);
            st.setString(3, data_cons);
            st.setString(4, hora);
            st.setString(5, med);
            st.executeUpdate();
            // 4 - Enviar mensagem para o usuario
            JOptionPane.showMessageDialog(null, "Consulta Agendada!");
            // 5 - Limpar os campos
            txtDataCons.setText("");
            txtEmail.setText("");
            txtHoraCons.setText("");
            txtMedCons.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAgendarConsultaActionPerformed

    private void txtHoraConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraConsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraConsActionPerformed

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
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarConsulta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel lblDataCons;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoraCons;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblMedCons;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextField txtDataCons;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoraCons;
    private javax.swing.JTextField txtMedCons;
    // End of variables declaration//GEN-END:variables
}
