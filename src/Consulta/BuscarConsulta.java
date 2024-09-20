package Consulta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class BuscarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form BuscarConsulta
     */
    public BuscarConsulta() {
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

        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblEmail4 = new javax.swing.JLabel();
        txtIdCon = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Consulta");
        getContentPane().setLayout(null);

        jPanel10.setBackground(new java.awt.Color(51, 102, 0));
        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(51, 153, 0));
        jPanel11.setLayout(null);

        lblEmail4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail4.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail4.setText("Informe seu e-mail:");
        jPanel11.add(lblEmail4);
        lblEmail4.setBounds(10, 60, 270, 50);

        txtIdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConActionPerformed(evt);
            }
        });
        jPanel11.add(txtIdCon);
        txtIdCon.setBounds(190, 60, 420, 50);

        bntBuscar.setText("Buscar Consulta");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });
        jPanel11.add(bntBuscar);
        bntBuscar.setBounds(190, 150, 310, 50);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(110, 40, 690, 240);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(0, 80, 880, 400);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/logosite.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 80, 80);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saúde e Bem Estar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 0, 480, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 80);

        setSize(new java.awt.Dimension(893, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        // 1 - Obter o nome do usuário a alterar
        String u;
        u = txtIdCon.getText();
       // 2 - Conectar com banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/clinica_saude", "root", "p@$$w0rd");
            // 3 - Buscar o usuario na tebela de banco de dados
            PreparedStatement st = conectar.prepareStatement("SELECT * FROM consulta WHERE email = ?");
            st.setString(1, u);
            ResultSet usuario = st.executeQuery(); // EXECUTA O SELECT
            // 4 - Verificar se encontra o usuário na tebela de banco de dados
            if (usuario.next()) { // se encontrou o usuario
                // 5 - enviar os dados do usuario para a tela AlterarUsuairos
                String idCon,dataCons,horaCons,medCons,ema;
                ema = usuario.getString("email");
                idCon = usuario.getString("id_cons");
                dataCons = usuario.getString("Data");
                horaCons = usuario.getString("Hora");
                medCons = usuario.getString("med");
                new AlterarConsulta(idCon,dataCons,horaCons,medCons,ema).setVisible(true);
                dispose();
            } else {// se não encontou 
                JOptionPane.showMessageDialog(null, "Consulta não encontrada!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_bntBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JLabel lblEmail4;
    private javax.swing.JTextField txtIdCon;
    // End of variables declaration//GEN-END:variables
}
