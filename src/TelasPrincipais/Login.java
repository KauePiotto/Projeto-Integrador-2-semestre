package TelasPrincipais;


import AlterarSenha.InformeSeuEmail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        bntEsqueciSenha = new javax.swing.JButton();
        bntCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 204, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Saúde e Bem Estar");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(290, 0, 440, 80);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/logosite.png"))); // NOI18N
        jPanel1.add(lblLogo);
        lblLogo.setBounds(70, 0, 60, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));
        jPanel3.setLayout(null);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");
        jPanel3.add(lblEmail);
        lblEmail.setBounds(60, 40, 90, 40);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        jPanel3.add(lblSenha);
        lblSenha.setBounds(60, 100, 100, 40);

        txtEmail.setToolTipText("");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail);
        txtEmail.setBounds(130, 42, 290, 40);
        jPanel3.add(pswSenha);
        pswSenha.setBounds(130, 100, 290, 40);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEntrar);
        btnEntrar.setBounds(130, 160, 290, 40);

        bntEsqueciSenha.setBackground(new java.awt.Color(51, 102, 0));
        bntEsqueciSenha.setForeground(new java.awt.Color(255, 255, 255));
        bntEsqueciSenha.setText("Esqueci a senha");
        bntEsqueciSenha.setPreferredSize(new java.awt.Dimension(92, 23));
        bntEsqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEsqueciSenhaActionPerformed(evt);
            }
        });
        jPanel3.add(bntEsqueciSenha);
        bntEsqueciSenha.setBounds(130, 220, 130, 30);
        bntEsqueciSenha.getAccessibleContext().setAccessibleDescription("");

        bntCadastrar.setBackground(new java.awt.Color(51, 102, 0));
        bntCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bntCadastrar.setText("Cadastra-se");
        bntCadastrar.setToolTipText("");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(bntCadastrar);
        bntCadastrar.setBounds(290, 220, 130, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(220, 100, 530, 290);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 970, 530);

        setSize(new java.awt.Dimension(973, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // 1 - obeter o usuário e senha digitada
        String ema, sen;
        ema = txtEmail.getText();
        sen = pswSenha.getText();
        // 2 - Conectar no Banco de Dados
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/clinica_saude", "root", "p@$$w0rd");
                // 3 - Buscar esse usuário na tabela do Banco de Dados
                PreparedStatement st = conectar.prepareStatement("SELECT * FROM usuarios WHERE  email = ? AND senha = ?");
                st.setString(1, ema);
                st.setString(2, sen);
                ResultSet usuario = st.executeQuery();
                //4 - Verificar se o usuário foi encontrado na tabela
                   if (usuario.next()) {
               String objetivo;
                objetivo = usuario.getString("objetivo");
                new Menu(objetivo).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "E-mail e/ou senha inválidos");
            }    
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador e informe o erro: " + ex.getMessage());
            }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void bntEsqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEsqueciSenhaActionPerformed
        new InformeSeuEmail().setVisible(true);
    }//GEN-LAST:event_bntEsqueciSenhaActionPerformed

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed

        new Cadastrar().setVisible(true);
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JButton bntEsqueciSenha;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
