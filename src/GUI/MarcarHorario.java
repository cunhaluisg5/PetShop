/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dao.AnimalDao;
import dao.ClienteDao;
import dao.HorarioDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Animal;
import model.Cliente;
import model.Horario;

/**
 *
 * @author Luis
 */
public class MarcarHorario extends javax.swing.JDialog {

    ClienteDao daoCliente;
    AnimalDao daoAnimal;
    DefaultTableModel modeloAnimal;
    DefaultTableModel modeloInfo;
    Cliente cliente;
    Animal animal;
    List<Animal> animais;
    
    public MarcarHorario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcabecalho = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbcpf = new javax.swing.JLabel();
        tfcpf = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbanimal = new javax.swing.JTable();
        btbuscar = new javax.swing.JButton();
        lbhorario = new javax.swing.JLabel();
        tfhorario = new javax.swing.JFormattedTextField();
        lbdia = new javax.swing.JLabel();
        tfdia = new javax.swing.JFormattedTextField();
        btadicionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbinfo = new javax.swing.JTable();
        btlimpar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        btfinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marcar Horário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbcabecalho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbcabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcabecalho.setText("Marcar Horário");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lbcpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcpf.setText("CPF:");

        try {
            tfcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Selecione o Animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tbanimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Idade", "Espécie", "Raça", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbanimal.getTableHeader().setReorderingAllowed(false);
        tbanimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbanimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbanimal);
        if (tbanimal.getColumnModel().getColumnCount() > 0) {
            tbanimal.getColumnModel().getColumn(0).setResizable(false);
            tbanimal.getColumnModel().getColumn(1).setResizable(false);
            tbanimal.getColumnModel().getColumn(2).setResizable(false);
            tbanimal.getColumnModel().getColumn(3).setResizable(false);
            tbanimal.getColumnModel().getColumn(4).setResizable(false);
            tbanimal.getColumnModel().getColumn(5).setResizable(false);
        }

        btbuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buscar.png"))); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.setMaximumSize(new java.awt.Dimension(117, 41));
        btbuscar.setPreferredSize(new java.awt.Dimension(117, 41));
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        lbhorario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbhorario.setText("Horário:");

        try {
            tfhorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbdia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbdia.setText("Dia:");

        try {
            tfdia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btadicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/finalizar.png"))); // NOI18N
        btadicionar.setText("Adicionar");
        btadicionar.setMaximumSize(new java.awt.Dimension(117, 41));
        btadicionar.setPreferredSize(new java.awt.Dimension(117, 41));
        btadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbcpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbdia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfdia, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(lbhorario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcpf)
                    .addComponent(tfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbdia)
                    .addComponent(tfdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbhorario)
                    .addComponent(tfhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Dados da Marcação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tbinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Animal", "Dia", "Horário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbinfo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbinfo);
        if (tbinfo.getColumnModel().getColumnCount() > 0) {
            tbinfo.getColumnModel().getColumn(0).setResizable(false);
            tbinfo.getColumnModel().getColumn(1).setResizable(false);
            tbinfo.getColumnModel().getColumn(2).setResizable(false);
            tbinfo.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btlimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.setMaximumSize(new java.awt.Dimension(117, 41));
        btlimpar.setPreferredSize(new java.awt.Dimension(117, 41));
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        btsair.setText("Sair");
        btsair.setMaximumSize(new java.awt.Dimension(117, 41));
        btsair.setPreferredSize(new java.awt.Dimension(117, 41));
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        btfinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        btfinalizar.setText("Finalizar");
        btfinalizar.setMaximumSize(new java.awt.Dimension(117, 41));
        btfinalizar.setPreferredSize(new java.awt.Dimension(117, 41));
        btfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbcabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbcabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btsairActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        try{
            String cpf = tfcpf.getText();
            cliente = new Cliente();
            daoCliente = new ClienteDao();
            List<Cliente> clientes = daoCliente.listarClientes();
            for(Cliente c : clientes){
                if(c.getCpf().equals(cpf)){
                    cliente = c;
                }
            }
            
            daoAnimal = new AnimalDao();
            animais = daoAnimal.listarAnimais();
            
            modeloAnimal = (DefaultTableModel) tbanimal.getModel();
            modeloAnimal.setNumRows(0);
            
            for(Animal a : animais){
                if(a.getCpfProprietario().equals(cpf)){
                    modeloAnimal.addRow(new Object[]{
                    a.getId(),
                    a.getNome(),
                    a.getIdade(),
                    a.getEspecie(),
                    a.getRaca(),
                    a.getSexo()
                    });
                    
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btbuscarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencherHorario();
    }//GEN-LAST:event_formWindowActivated

    private void preencherHorario() {
        Date dataAtual = new Date();
        SimpleDateFormat fmd = new SimpleDateFormat("dd/MM/yyyy");
        tfdia.setText(fmd.format(dataAtual));
        SimpleDateFormat fmh = new SimpleDateFormat("HH:mm");
        tfhorario.setText(fmh.format(dataAtual));
    }

    private void btadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadicionarActionPerformed
        modeloInfo = (DefaultTableModel) tbinfo.getModel();
        modeloInfo.setNumRows(0);
        modeloInfo.addRow(new Object[]{
        cliente.getNome(),
        animal.getNome(),
        tfdia.getText(),
        tfhorario.getText()
        });
    }//GEN-LAST:event_btadicionarActionPerformed

    private void tbanimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbanimalMouseClicked
        for(Animal a : animais){
            int id = (int) tbanimal.getValueAt(tbanimal.getSelectedRow(), 0);
            if(a.getId() == id){
                animal = a;
            }
        }
    }//GEN-LAST:event_tbanimalMouseClicked

    private void btfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfinalizarActionPerformed
        try{
            Horario horario = new Horario();
            HorarioDao daoHorario = new HorarioDao();
            horario.setIdCliente(cliente.getId());
            horario.setIdAnimal(animal.getId());
            horario.setData(tfdia.getText());
            horario.setHorario(tfhorario.getText());
            
            daoHorario.incluirHorario(horario);
            JOptionPane.showMessageDialog(null, "Marcação registrada com sucesso!", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao finalizar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btfinalizarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        tfcpf.setValue("");
        limparTabelaAnimal();
        limparTabelaInfo();
        preencherHorario();
        tfcpf.requestFocus();
        
    }//GEN-LAST:event_btlimparActionPerformed

    private void limparTabelaAnimal() {
        for(int i = tbanimal.getRowCount()-1; i >= 0; i--){
            modeloAnimal.removeRow(i);
        }
    }
    
    private void limparTabelaInfo() {
        for(int i = tbinfo.getRowCount()-1; i >= 0; i--){
            modeloInfo.removeRow(i);
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
            java.util.logging.Logger.getLogger(MarcarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MarcarHorario dialog = new MarcarHorario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btadicionar;
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btfinalizar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbcabecalho;
    private javax.swing.JLabel lbcpf;
    private javax.swing.JLabel lbdia;
    private javax.swing.JLabel lbhorario;
    private javax.swing.JTable tbanimal;
    private javax.swing.JTable tbinfo;
    private javax.swing.JFormattedTextField tfcpf;
    private javax.swing.JFormattedTextField tfdia;
    private javax.swing.JFormattedTextField tfhorario;
    // End of variables declaration//GEN-END:variables
}
