package TelasPrincipais;

import Consulta.AgendarConsulta;
import Consulta.BuscarConsulta;
import Consulta.CancelarConsulta;
import DadosPessoais.AlterarDados;
import DadosPessoais.BuscarConta;
import DadosPessoais.BuscarConta2;
import DadosPessoais.ExcluirConta;
import Dieta.Almoço;
import Dieta.AlmoçoHiper;
import Dieta.AlmoçoMan;
import Dieta.CafeDaManha;
import Dieta.CafeDaManhaHiper;
import Dieta.CafeDaManhaMan;
import Dieta.CafeDaTarde;
import Dieta.CafeDaTardeHiper;
import Dieta.CafeDaTardeMan;
import Dieta.Janta;
import Dieta.JantaHiper;
import Dieta.JantaMan;
import Treino.TreinoD;
import Treino.TreinoA;
import Treino.TreinoAHiper;
import Treino.TreinoAMan;
import Treino.TreinoB;
import Treino.TreinoBHiper;
import Treino.TreinoBMan;
import Treino.TreinoC;
import Treino.TreinoCHiper;
import Treino.TreinoCMan;
import Treino.TreinoDHiper;
import Treino.TreinoDMan;
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
 * @author kaue.plfreire
 */
public class Menu extends javax.swing.JFrame {

    public String ema;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    public Menu(String objetivo) {
        initComponents();
        if (objetivo.equalsIgnoreCase("Emagrecer")) {
            itmTreinoAHiper.setVisible(false);
            itmTreinoBHiper.setVisible(false);
            itmTreinoCHiper.setVisible(false);
            itmTreinoDHiper.setVisible(false);
            itmTreinoAMan.setVisible(false);
            itmTreinoBMan.setVisible(false);
            itmTreinoCMan.setVisible(false);
            itmTreinoDMan.setVisible(false);
            separador4.setVisible(false);
            separador5.setVisible(false);
            separador6.setVisible(false);
            separador7.setVisible(false);
            separador8.setVisible(false);
            separador9.setVisible(false);
            itmCafeDaManhaHiper.setVisible(false);
            itmAlmocoHiper.setVisible(false);
            itmCafeDaTardeHiper.setVisible(false);
            itmJantaHiper.setVisible(false);
            itmCafeDaManhaMan.setVisible(false);
            itmAlmocoMan.setVisible(false);
            itmCafeDaTardeMan.setVisible(false);
            itmJantaMan.setVisible(false);
            separador13.setVisible(false);
            separador14.setVisible(false);
            separador15.setVisible(false);
            separador16.setVisible(false);
            separador17.setVisible(false);
            separador18.setVisible(false);
        } else if (objetivo.equalsIgnoreCase(("Hipertrofia"))) {
            itmTreinoAMan.setVisible(false);
            itmTreinoBMan.setVisible(false);
            itmTreinoCMan.setVisible(false);
            itmTreinoDMan.setVisible(false);
            itmTreinoAEma.setVisible(false);
            itmTreinoBEma.setVisible(false);
            itmTreinoCEma.setVisible(false);
            itmTreinoDEma.setVisible(false);
            separador1.setVisible(false);
            separador2.setVisible(false);
            separador3.setVisible(false);
            separador7.setVisible(false);
            separador8.setVisible(false);
            separador9.setVisible(false);
            itmCafeDaManhaMan.setVisible(false);
            itmAlmocoMan.setVisible(false);
            itmCafeDaTardeMan.setVisible(false);
            itmJantaMan.setVisible(false);
            itmCafeDaManhaEma.setVisible(false);
            itmAlmocoEma.setVisible(false);
            itmCafeDaTardeEma.setVisible(false);
            itmJantaEma.setVisible(false);
            separador10.setVisible(false);
            separador11.setVisible(false);
            separador12.setVisible(false);
            separador16.setVisible(false);
            separador17.setVisible(false);
            separador18.setVisible(false);
        } else if (objetivo.equalsIgnoreCase("Manter Peso")) {
            itmTreinoAHiper.setVisible(false);
            itmTreinoBHiper.setVisible(false);
            itmTreinoCHiper.setVisible(false);
            itmTreinoDHiper.setVisible(false);
            itmTreinoAEma.setVisible(false);
            itmTreinoBEma.setVisible(false);
            itmTreinoCEma.setVisible(false);
            itmTreinoDEma.setVisible(false);
            separador1.setVisible(false);
            separador2.setVisible(false);
            separador3.setVisible(false);
            separador4.setVisible(false);
            separador5.setVisible(false);
            separador6.setVisible(false);
            itmCafeDaManhaHiper.setVisible(false);
            itmAlmocoHiper.setVisible(false);
            itmCafeDaTardeHiper.setVisible(false);
            itmJantaHiper.setVisible(false);
            itmAlmocoEma.setVisible(false);
            itmCafeDaTardeEma.setVisible(false);
            itmJantaEma.setVisible(false);
            separador10.setVisible(false);
            separador11.setVisible(false);
            separador12.setVisible(false);
            separador13.setVisible(false);
            separador14.setVisible(false);
            separador15.setVisible(false);
        } else {

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

        lblFotoFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTreino = new javax.swing.JMenu();
        itmTreinoAEma = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        itmTreinoBEma = new javax.swing.JMenuItem();
        separador2 = new javax.swing.JPopupMenu.Separator();
        itmTreinoCEma = new javax.swing.JMenuItem();
        separador3 = new javax.swing.JPopupMenu.Separator();
        itmTreinoDEma = new javax.swing.JMenuItem();
        itmTreinoAHiper = new javax.swing.JMenuItem();
        separador4 = new javax.swing.JPopupMenu.Separator();
        itmTreinoBHiper = new javax.swing.JMenuItem();
        separador5 = new javax.swing.JPopupMenu.Separator();
        itmTreinoCHiper = new javax.swing.JMenuItem();
        separador6 = new javax.swing.JPopupMenu.Separator();
        itmTreinoDHiper = new javax.swing.JMenuItem();
        itmTreinoAMan = new javax.swing.JMenuItem();
        separador7 = new javax.swing.JPopupMenu.Separator();
        itmTreinoBMan = new javax.swing.JMenuItem();
        separador8 = new javax.swing.JPopupMenu.Separator();
        itmTreinoCMan = new javax.swing.JMenuItem();
        separador9 = new javax.swing.JPopupMenu.Separator();
        itmTreinoDMan = new javax.swing.JMenuItem();
        mnuDieta = new javax.swing.JMenu();
        itmCafeDaManhaEma = new javax.swing.JMenuItem();
        separador10 = new javax.swing.JPopupMenu.Separator();
        itmAlmocoEma = new javax.swing.JMenuItem();
        separador11 = new javax.swing.JPopupMenu.Separator();
        itmCafeDaTardeEma = new javax.swing.JMenuItem();
        separador12 = new javax.swing.JPopupMenu.Separator();
        itmJantaEma = new javax.swing.JMenuItem();
        itmCafeDaManhaHiper = new javax.swing.JMenuItem();
        separador13 = new javax.swing.JPopupMenu.Separator();
        itmAlmocoHiper = new javax.swing.JMenuItem();
        separador14 = new javax.swing.JPopupMenu.Separator();
        itmCafeDaTardeHiper = new javax.swing.JMenuItem();
        separador15 = new javax.swing.JPopupMenu.Separator();
        itmJantaHiper = new javax.swing.JMenuItem();
        itmCafeDaManhaMan = new javax.swing.JMenuItem();
        separador16 = new javax.swing.JPopupMenu.Separator();
        itmAlmocoMan = new javax.swing.JMenuItem();
        separador17 = new javax.swing.JPopupMenu.Separator();
        itmCafeDaTardeMan = new javax.swing.JMenuItem();
        separador18 = new javax.swing.JPopupMenu.Separator();
        itmJantaMan = new javax.swing.JMenuItem();
        itemAgendarConsulta = new javax.swing.JMenu();
        itmAgendarConsulta = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ItmAlterarConsulta = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        ItmCancelarConsulta = new javax.swing.JMenuItem();
        mnuDadosPessoais = new javax.swing.JMenu();
        itmAlterarUsuario = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        itmExcluirUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        getContentPane().setLayout(null);

        lblFotoFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/fundo_menu-removebg-preview.png"))); // NOI18N
        getContentPane().add(lblFotoFundo);
        lblFotoFundo.setBounds(0, 0, 820, 570);

        mnuTreino.setText("Treino");

        itmTreinoAEma.setText("Treino A");
        itmTreinoAEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoAEmaActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoAEma);
        mnuTreino.add(separador1);

        itmTreinoBEma.setText("Treino B");
        itmTreinoBEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoBEmaActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoBEma);
        mnuTreino.add(separador2);

        itmTreinoCEma.setText("Treino C");
        itmTreinoCEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoCEmaActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoCEma);
        mnuTreino.add(separador3);

        itmTreinoDEma.setText("Treino D");
        itmTreinoDEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoDEmaActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoDEma);

        itmTreinoAHiper.setText("Treino A");
        itmTreinoAHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoAHiperActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoAHiper);
        mnuTreino.add(separador4);

        itmTreinoBHiper.setText("Treino B");
        itmTreinoBHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoBHiperActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoBHiper);
        mnuTreino.add(separador5);

        itmTreinoCHiper.setText("Treino C");
        itmTreinoCHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoCHiperActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoCHiper);
        mnuTreino.add(separador6);

        itmTreinoDHiper.setText("Treino D");
        itmTreinoDHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoDHiperActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoDHiper);

        itmTreinoAMan.setText("Treino A");
        itmTreinoAMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoAManActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoAMan);
        mnuTreino.add(separador7);

        itmTreinoBMan.setText("Treino B");
        itmTreinoBMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoBManActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoBMan);
        mnuTreino.add(separador8);

        itmTreinoCMan.setText("Treino C");
        itmTreinoCMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoCManActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoCMan);
        mnuTreino.add(separador9);

        itmTreinoDMan.setText("Treino D");
        itmTreinoDMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTreinoDManActionPerformed(evt);
            }
        });
        mnuTreino.add(itmTreinoDMan);

        jMenuBar1.add(mnuTreino);

        mnuDieta.setText("Dieta");

        itmCafeDaManhaEma.setText("Café da manhã");
        itmCafeDaManhaEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCafeDaManhaEmaActionPerformed(evt);
            }
        });
        mnuDieta.add(itmCafeDaManhaEma);
        mnuDieta.add(separador10);

        itmAlmocoEma.setText("Almoço");
        itmAlmocoEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlmocoEmaActionPerformed(evt);
            }
        });
        mnuDieta.add(itmAlmocoEma);
        mnuDieta.add(separador11);

        itmCafeDaTardeEma.setText("Café da tarde");
        itmCafeDaTardeEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCafeDaTardeEmaActionPerformed(evt);
            }
        });
        mnuDieta.add(itmCafeDaTardeEma);
        mnuDieta.add(separador12);

        itmJantaEma.setText("Janta");
        itmJantaEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmJantaEmaActionPerformed(evt);
            }
        });
        mnuDieta.add(itmJantaEma);

        itmCafeDaManhaHiper.setText("Café da manhã");
        itmCafeDaManhaHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCafeDaManhaHiperActionPerformed(evt);
            }
        });
        mnuDieta.add(itmCafeDaManhaHiper);
        mnuDieta.add(separador13);

        itmAlmocoHiper.setText("Almoço");
        itmAlmocoHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlmocoHiperActionPerformed(evt);
            }
        });
        mnuDieta.add(itmAlmocoHiper);
        mnuDieta.add(separador14);

        itmCafeDaTardeHiper.setText("Café da tarde");
        itmCafeDaTardeHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCafeDaTardeHiperActionPerformed(evt);
            }
        });
        mnuDieta.add(itmCafeDaTardeHiper);
        mnuDieta.add(separador15);

        itmJantaHiper.setText("Janta");
        itmJantaHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmJantaHiperActionPerformed(evt);
            }
        });
        mnuDieta.add(itmJantaHiper);

        itmCafeDaManhaMan.setText("Café da manhã");
        itmCafeDaManhaMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCafeDaManhaManActionPerformed(evt);
            }
        });
        mnuDieta.add(itmCafeDaManhaMan);
        mnuDieta.add(separador16);

        itmAlmocoMan.setText("Almoço");
        itmAlmocoMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlmocoManActionPerformed(evt);
            }
        });
        mnuDieta.add(itmAlmocoMan);
        mnuDieta.add(separador17);

        itmCafeDaTardeMan.setText("Café da tarde");
        itmCafeDaTardeMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCafeDaTardeManActionPerformed(evt);
            }
        });
        mnuDieta.add(itmCafeDaTardeMan);
        mnuDieta.add(separador18);

        itmJantaMan.setText("Janta");
        itmJantaMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmJantaManActionPerformed(evt);
            }
        });
        mnuDieta.add(itmJantaMan);

        jMenuBar1.add(mnuDieta);

        itemAgendarConsulta.setText("Consulta");

        itmAgendarConsulta.setText("Agendar Consulta");
        itmAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAgendarConsultaActionPerformed(evt);
            }
        });
        itemAgendarConsulta.add(itmAgendarConsulta);
        itemAgendarConsulta.add(jSeparator1);

        ItmAlterarConsulta.setText("Alterar Consulta");
        ItmAlterarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAlterarConsultaActionPerformed(evt);
            }
        });
        itemAgendarConsulta.add(ItmAlterarConsulta);
        itemAgendarConsulta.add(jSeparator6);

        ItmCancelarConsulta.setText("Cancelar Consulta");
        ItmCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmCancelarConsultaActionPerformed(evt);
            }
        });
        itemAgendarConsulta.add(ItmCancelarConsulta);

        jMenuBar1.add(itemAgendarConsulta);

        mnuDadosPessoais.setText("Dados Pessoais");

        itmAlterarUsuario.setText("Alterar Dados");
        itmAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarUsuarioActionPerformed(evt);
            }
        });
        mnuDadosPessoais.add(itmAlterarUsuario);
        mnuDadosPessoais.add(jSeparator8);

        itmExcluirUsuario.setText("Exluir Conta");
        itmExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuarioActionPerformed(evt);
            }
        });
        mnuDadosPessoais.add(itmExcluirUsuario);

        jMenuBar1.add(mnuDadosPessoais);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(820, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAgendarConsultaActionPerformed
        new AgendarConsulta().setVisible(true);
    }//GEN-LAST:event_itmAgendarConsultaActionPerformed

    private void itmCafeDaManhaEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCafeDaManhaEmaActionPerformed
        new CafeDaManha().setVisible(true);
    }//GEN-LAST:event_itmCafeDaManhaEmaActionPerformed

    private void itmAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarUsuarioActionPerformed
        new BuscarConta2().setVisible(true);
    }//GEN-LAST:event_itmAlterarUsuarioActionPerformed

    private void itmTreinoAEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoAEmaActionPerformed
        new TreinoA().setVisible(true);
    }//GEN-LAST:event_itmTreinoAEmaActionPerformed

    private void itmTreinoBEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoBEmaActionPerformed
        new TreinoB().setVisible(true);
    }//GEN-LAST:event_itmTreinoBEmaActionPerformed

    private void itmTreinoCEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoCEmaActionPerformed
        new TreinoC().setVisible(true);
    }//GEN-LAST:event_itmTreinoCEmaActionPerformed

    private void itmTreinoDEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoDEmaActionPerformed
        new TreinoD().setVisible(true);
    }//GEN-LAST:event_itmTreinoDEmaActionPerformed

    private void ItmAlterarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAlterarConsultaActionPerformed
        new BuscarConsulta().setVisible(true);
    }//GEN-LAST:event_ItmAlterarConsultaActionPerformed

    private void itmExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuarioActionPerformed
        new ExcluirConta().setVisible(true);
    }//GEN-LAST:event_itmExcluirUsuarioActionPerformed

    private void ItmCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmCancelarConsultaActionPerformed
        new CancelarConsulta().setVisible(true);
    }//GEN-LAST:event_ItmCancelarConsultaActionPerformed

    private void itmTreinoAManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoAManActionPerformed
        new TreinoAMan().setVisible(true);
    }//GEN-LAST:event_itmTreinoAManActionPerformed

    private void itmTreinoCManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoCManActionPerformed
        new TreinoCMan().setVisible(true);
    }//GEN-LAST:event_itmTreinoCManActionPerformed

    private void itmTreinoAHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoAHiperActionPerformed
        new TreinoAHiper().setVisible(true);
    }//GEN-LAST:event_itmTreinoAHiperActionPerformed

    private void itmTreinoBHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoBHiperActionPerformed
        new TreinoBHiper().setVisible(true);
    }//GEN-LAST:event_itmTreinoBHiperActionPerformed

    private void itmTreinoCHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoCHiperActionPerformed
        new TreinoCHiper().setVisible(true);
    }//GEN-LAST:event_itmTreinoCHiperActionPerformed

    private void itmTreinoDHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoDHiperActionPerformed
        new TreinoDHiper().setVisible(true);
    }//GEN-LAST:event_itmTreinoDHiperActionPerformed

    private void itmTreinoBManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoBManActionPerformed
        new TreinoBMan().setVisible(true);
    }//GEN-LAST:event_itmTreinoBManActionPerformed

    private void itmTreinoDManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTreinoDManActionPerformed
        new TreinoDMan().setVisible(true);
    }//GEN-LAST:event_itmTreinoDManActionPerformed

    private void itmAlmocoHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlmocoHiperActionPerformed
        new AlmoçoHiper().setVisible(true);
    }//GEN-LAST:event_itmAlmocoHiperActionPerformed

    private void itmCafeDaTardeHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCafeDaTardeHiperActionPerformed
        new CafeDaTardeHiper().setVisible(true);
    }//GEN-LAST:event_itmCafeDaTardeHiperActionPerformed

    private void itmAlmocoManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlmocoManActionPerformed
        new AlmoçoMan().setVisible(true);
    }//GEN-LAST:event_itmAlmocoManActionPerformed

    private void itmAlmocoEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlmocoEmaActionPerformed
        new Almoço().setVisible(true);
    }//GEN-LAST:event_itmAlmocoEmaActionPerformed

    private void itmCafeDaTardeEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCafeDaTardeEmaActionPerformed
        new CafeDaTarde().setVisible(true);
    }//GEN-LAST:event_itmCafeDaTardeEmaActionPerformed

    private void itmJantaEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmJantaEmaActionPerformed
        new Janta().setVisible(true);
    }//GEN-LAST:event_itmJantaEmaActionPerformed

    private void itmCafeDaManhaHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCafeDaManhaHiperActionPerformed
        new CafeDaManhaHiper().setVisible(true);
    }//GEN-LAST:event_itmCafeDaManhaHiperActionPerformed

    private void itmJantaHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmJantaHiperActionPerformed
        new JantaHiper().setVisible(true);
    }//GEN-LAST:event_itmJantaHiperActionPerformed

    private void itmCafeDaManhaManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCafeDaManhaManActionPerformed
        new CafeDaManhaMan().setVisible(true);
    }//GEN-LAST:event_itmCafeDaManhaManActionPerformed

    private void itmCafeDaTardeManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCafeDaTardeManActionPerformed
        new CafeDaTardeMan().setVisible(true);
    }//GEN-LAST:event_itmCafeDaTardeManActionPerformed

    private void itmJantaManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmJantaManActionPerformed
        new JantaMan().setVisible(true);
    }//GEN-LAST:event_itmJantaManActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmAlterarConsulta;
    private javax.swing.JMenuItem ItmCancelarConsulta;
    private javax.swing.JMenu itemAgendarConsulta;
    private javax.swing.JMenuItem itmAgendarConsulta;
    private javax.swing.JMenuItem itmAlmocoEma;
    private javax.swing.JMenuItem itmAlmocoHiper;
    private javax.swing.JMenuItem itmAlmocoMan;
    private javax.swing.JMenuItem itmAlterarUsuario;
    private javax.swing.JMenuItem itmCafeDaManhaEma;
    private javax.swing.JMenuItem itmCafeDaManhaHiper;
    private javax.swing.JMenuItem itmCafeDaManhaMan;
    private javax.swing.JMenuItem itmCafeDaTardeEma;
    private javax.swing.JMenuItem itmCafeDaTardeHiper;
    private javax.swing.JMenuItem itmCafeDaTardeMan;
    private javax.swing.JMenuItem itmExcluirUsuario;
    private javax.swing.JMenuItem itmJantaEma;
    private javax.swing.JMenuItem itmJantaHiper;
    private javax.swing.JMenuItem itmJantaMan;
    private javax.swing.JMenuItem itmTreinoAEma;
    private javax.swing.JMenuItem itmTreinoAHiper;
    private javax.swing.JMenuItem itmTreinoAMan;
    private javax.swing.JMenuItem itmTreinoBEma;
    private javax.swing.JMenuItem itmTreinoBHiper;
    private javax.swing.JMenuItem itmTreinoBMan;
    private javax.swing.JMenuItem itmTreinoCEma;
    private javax.swing.JMenuItem itmTreinoCHiper;
    private javax.swing.JMenuItem itmTreinoCMan;
    private javax.swing.JMenuItem itmTreinoDEma;
    private javax.swing.JMenuItem itmTreinoDHiper;
    private javax.swing.JMenuItem itmTreinoDMan;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JLabel lblFotoFundo;
    private javax.swing.JMenu mnuDadosPessoais;
    private javax.swing.JMenu mnuDieta;
    private javax.swing.JMenu mnuTreino;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador10;
    private javax.swing.JPopupMenu.Separator separador11;
    private javax.swing.JPopupMenu.Separator separador12;
    private javax.swing.JPopupMenu.Separator separador13;
    private javax.swing.JPopupMenu.Separator separador14;
    private javax.swing.JPopupMenu.Separator separador15;
    private javax.swing.JPopupMenu.Separator separador16;
    private javax.swing.JPopupMenu.Separator separador17;
    private javax.swing.JPopupMenu.Separator separador18;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JPopupMenu.Separator separador3;
    private javax.swing.JPopupMenu.Separator separador4;
    private javax.swing.JPopupMenu.Separator separador5;
    private javax.swing.JPopupMenu.Separator separador6;
    private javax.swing.JPopupMenu.Separator separador7;
    private javax.swing.JPopupMenu.Separator separador8;
    private javax.swing.JPopupMenu.Separator separador9;
    // End of variables declaration//GEN-END:variables
}
