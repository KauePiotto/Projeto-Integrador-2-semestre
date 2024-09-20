/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DadosPessoais;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BuscarConta extends javax.swing.JFrame {

    /**
     * Creates new form BuscarConta
     */
    public BuscarConta() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Conta");
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));
        jPanel3.setLayout(null);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Informe seu e-mail: ");
        jPanel3.add(lblEmail);
        lblEmail.setBounds(10, 30, 190, 50);
        jPanel3.add(txtEmail);
        txtEmail.setBounds(190, 30, 310, 50);

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(bntBuscar);
        bntBuscar.setBounds(130, 120, 290, 50);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(90, 30, 550, 210);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 740, 320);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/logosite.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 80, 80);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saúde e Bem Estar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 10, 480, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 80);

        setSize(new java.awt.Dimension(754, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        //Pedindo o usuário a excluir
        String ema;
        ema = txtEmail.getText();
        //Conectar ao Banco de Dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/clinica_saude", "root", "p@$$w0rd");

            //Enviar os dados para a tabela BD
            PreparedStatement st = conectar.prepareStatement("DELETE FROM usuarios WHERE email = ?");
            try {
                st.setString(1, ema);
                int retorno = st.executeUpdate();//Executar o delete
                if (retorno == 1) {
                    JOptionPane.showMessageDialog(null, "Conta excluida com sucesso!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Conta não encontrada");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Informar o erro a um administrador: " + ex.getMessage());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
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
            java.util.logging.Logger.getLogger(BuscarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
