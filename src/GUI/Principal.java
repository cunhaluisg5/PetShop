/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.CYAN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        btcadastrarcliente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btcadastraranimal = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btmarcarhorario = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btsair = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmcadastro = new javax.swing.JMenu();
        jmicadastrarcliente = new javax.swing.JMenuItem();
        jmicadastraranimal = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmisair = new javax.swing.JMenuItem();
        jmmarcacao = new javax.swing.JMenu();
        jmimarcarhorario = new javax.swing.JMenuItem();
        jmpesquisa = new javax.swing.JMenu();
        jmipesquisarclientes = new javax.swing.JMenuItem();
        jmipesquisaranimais = new javax.swing.JMenuItem();
        jmipesquisarmarcacoes = new javax.swing.JMenuItem();
        jmsobre = new javax.swing.JMenu();
        jmiinformacoes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetShop");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        btcadastrarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar cliente.png"))); // NOI18N
        btcadastrarcliente.setText("Cadastrar Cliente");
        btcadastrarcliente.setFocusable(false);
        btcadastrarcliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btcadastrarcliente.setMaximumSize(new java.awt.Dimension(120, 57));
        btcadastrarcliente.setPreferredSize(new java.awt.Dimension(120, 57));
        btcadastrarcliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btcadastrarcliente);
        jToolBar2.add(jSeparator2);

        btcadastraranimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar animais.png"))); // NOI18N
        btcadastraranimal.setText("Cadastrar Animal");
        btcadastraranimal.setFocusable(false);
        btcadastraranimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btcadastraranimal.setMaximumSize(new java.awt.Dimension(120, 57));
        btcadastraranimal.setPreferredSize(new java.awt.Dimension(120, 57));
        btcadastraranimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btcadastraranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastraranimalActionPerformed(evt);
            }
        });
        jToolBar2.add(btcadastraranimal);
        jToolBar2.add(jSeparator3);

        btmarcarhorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar marcações.png"))); // NOI18N
        btmarcarhorario.setText("Marcar Horário");
        btmarcarhorario.setFocusable(false);
        btmarcarhorario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btmarcarhorario.setMaximumSize(new java.awt.Dimension(120, 57));
        btmarcarhorario.setPreferredSize(new java.awt.Dimension(120, 57));
        btmarcarhorario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btmarcarhorario);
        jToolBar2.add(jSeparator4);

        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        btsair.setText("Sair");
        btsair.setFocusable(false);
        btsair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btsair.setMaximumSize(new java.awt.Dimension(120, 57));
        btsair.setPreferredSize(new java.awt.Dimension(120, 57));
        btsair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });
        jToolBar2.add(btsair);
        jToolBar2.add(jSeparator5);

        getContentPane().add(jToolBar2, java.awt.BorderLayout.PAGE_START);

        jmcadastro.setMnemonic('c');
        jmcadastro.setText("Cadastro");
        jmcadastro.setToolTipText("Cadastro");

        jmicadastrarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar cliente.png"))); // NOI18N
        jmicadastrarcliente.setMnemonic('c');
        jmicadastrarcliente.setText("Cadastrar Cliente");
        jmicadastrarcliente.setToolTipText("Cadastrar Cliente");
        jmcadastro.add(jmicadastrarcliente);

        jmicadastraranimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar animais.png"))); // NOI18N
        jmicadastraranimal.setMnemonic('a');
        jmicadastraranimal.setText("Cadastrar Animal");
        jmicadastraranimal.setToolTipText("Cadastrar Animal");
        jmicadastraranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmicadastraranimalActionPerformed(evt);
            }
        });
        jmcadastro.add(jmicadastraranimal);
        jmcadastro.add(jSeparator1);

        jmisair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jmisair.setMnemonic('s');
        jmisair.setText("Sair");
        jmisair.setToolTipText("Sair");
        jmisair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmisairActionPerformed(evt);
            }
        });
        jmcadastro.add(jmisair);

        jMenuBar1.add(jmcadastro);

        jmmarcacao.setMnemonic('m');
        jmmarcacao.setText("Marcação");
        jmmarcacao.setToolTipText("Marcação");

        jmimarcarhorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar marcações.png"))); // NOI18N
        jmimarcarhorario.setMnemonic('m');
        jmimarcarhorario.setText("Marcar Horário");
        jmimarcarhorario.setToolTipText("Marcar Horário");
        jmimarcarhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmimarcarhorarioActionPerformed(evt);
            }
        });
        jmmarcacao.add(jmimarcarhorario);

        jMenuBar1.add(jmmarcacao);

        jmpesquisa.setMnemonic('p');
        jmpesquisa.setText("Pesquisa");
        jmpesquisa.setToolTipText("Pesquisa");

        jmipesquisarclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesqquisar clientes.png"))); // NOI18N
        jmipesquisarclientes.setMnemonic('c');
        jmipesquisarclientes.setText("Pesquisar Clientes");
        jmipesquisarclientes.setToolTipText("Pesquisar Clientes");
        jmpesquisa.add(jmipesquisarclientes);

        jmipesquisaranimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar animal.png"))); // NOI18N
        jmipesquisaranimais.setMnemonic('a');
        jmipesquisaranimais.setText("Pesquisar Animais");
        jmipesquisaranimais.setToolTipText("Pesquisar Animais");
        jmpesquisa.add(jmipesquisaranimais);

        jmipesquisarmarcacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/marcar horário.png"))); // NOI18N
        jmipesquisarmarcacoes.setMnemonic('m');
        jmipesquisarmarcacoes.setText("Pesquisar Marcações");
        jmipesquisarmarcacoes.setToolTipText("Pesquisar Marcações");
        jmpesquisa.add(jmipesquisarmarcacoes);

        jMenuBar1.add(jmpesquisa);

        jmsobre.setMnemonic('s');
        jmsobre.setText("Sobre");
        jmsobre.setToolTipText("Sobre");

        jmiinformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/informações.png"))); // NOI18N
        jmiinformacoes.setMnemonic('i');
        jmiinformacoes.setText("Informações");
        jmiinformacoes.setToolTipText("Informações");
        jmiinformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiinformacoesActionPerformed(evt);
            }
        });
        jmsobre.add(jmiinformacoes);

        jMenuBar1.add(jmsobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmicadastraranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmicadastraranimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmicadastraranimalActionPerformed

    private void jmimarcarhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmimarcarhorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmimarcarhorarioActionPerformed

    private void jmiinformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiinformacoesActionPerformed
        String nome = "Luís Gustavo da Cunha Cipriani\n";
        String data = "06/09/2018";
        JOptionPane.showMessageDialog(null, nome + data, "Informações", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmiinformacoesActionPerformed

    private void btcadastraranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastraranimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcadastraranimalActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        int recebe = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da aplicação?", "Encerrar", JOptionPane.YES_NO_OPTION);
        if(recebe == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void jmisairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmisairActionPerformed
        int recebe = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da aplicação?", "Encerrar", JOptionPane.YES_NO_OPTION);
        if(recebe == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jmisairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastraranimal;
    private javax.swing.JButton btcadastrarcliente;
    private javax.swing.JButton btmarcarhorario;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu jmcadastro;
    private javax.swing.JMenuItem jmicadastraranimal;
    private javax.swing.JMenuItem jmicadastrarcliente;
    private javax.swing.JMenuItem jmiinformacoes;
    private javax.swing.JMenuItem jmimarcarhorario;
    private javax.swing.JMenuItem jmipesquisaranimais;
    private javax.swing.JMenuItem jmipesquisarclientes;
    private javax.swing.JMenuItem jmipesquisarmarcacoes;
    private javax.swing.JMenuItem jmisair;
    private javax.swing.JMenu jmmarcacao;
    private javax.swing.JMenu jmpesquisa;
    private javax.swing.JMenu jmsobre;
    // End of variables declaration//GEN-END:variables
}
