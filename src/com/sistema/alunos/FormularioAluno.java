/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sistema.alunos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author melin
 */
public class FormularioAluno extends javax.swing.JFrame {
    
    private final List<Aluno> listaAlunos = new ArrayList<>();
    
    public FormularioAluno() {
        initComponents();
        setLocationRelativeTo(null); // Centralizar na tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        panelInferior = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro de Alunos");
        setPreferredSize(new java.awt.Dimension(400, 180));
        getContentPane().setLayout(new java.awt.BorderLayout());

        panelSuperior.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelSuperior.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        jLabel1.setText("Nome:");
        panelSuperior.add(jLabel1);
        panelSuperior.add(txtNome);

        jLabel2.setText("Idade:");
        panelSuperior.add(jLabel2);
        panelSuperior.add(txtIdade);

        jLabel3.setText("Endereço:");
        panelSuperior.add(jLabel3);
        panelSuperior.add(txtEndereco);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.CENTER);

        panelInferior.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        panelInferior.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        panelInferior.add(btnOk);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        panelInferior.add(btnLimpar);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        panelInferior.add(btnMostrar);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        panelInferior.add(btnSair);

        getContentPane().add(panelInferior, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>                        

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Cadastrar aluno na lista
        try {
            // Validar campos
            if (txtNome.getText().trim().isEmpty() || 
                txtIdade.getText().trim().isEmpty() || 
                txtEndereco.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(txtNome.getText().trim());
            aluno.setIdade(Integer.parseInt(txtIdade.getText().trim()));
            aluno.setEndereco(txtEndereco.getText().trim());
            
            listaAlunos.add(aluno);
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!\nTotal de alunos: " + listaAlunos.size());
            
            // Limpar campos após cadastro
            btnLimparActionPerformed(evt);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Idade deve ser um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtIdade.requestFocus();
        }
    }                                        

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Limpar campos
        txtNome.setText("");
        txtIdade.setText("");
        txtEndereco.setText("");
        txtNome.requestFocus(); // Colocar foco no primeiro campo
    }                                         

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Mostrar lista de alunos
        if (listaAlunos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum aluno cadastrado!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        StringBuilder mensagem = new StringBuilder("=== ALUNOS CADASTRADOS ===\n\n");
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);
            mensagem.append("Aluno #").append(i + 1).append(":\n")
                    .append("ID: ").append(aluno.getUuid()).append("\n")
                    .append("Nome: ").append(aluno.getNome()).append("\n")
                    .append("Idade: ").append(aluno.getIdade()).append("\n")
                    .append("Endereço: ").append(aluno.getEndereco()).append("\n")
                    .append("------------------------\n");
        }
        
        mensagem.append("\nTotal: ").append(listaAlunos.size()).append(" aluno(s) cadastrado(s)");
        
        JOptionPane.showMessageDialog(this, mensagem.toString(), "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);
    }                                          

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Confirmar saída
        int confirm = JOptionPane.showConfirmDialog(
            this, 
            "Deseja realmente sair?", 
            "Confirmação", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
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
            java.util.logging.Logger.getLogger(FormularioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration                   
}