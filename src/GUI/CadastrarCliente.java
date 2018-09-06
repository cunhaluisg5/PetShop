/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dao.ClienteDao;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import model.Categorias;
import model.Cliente;
import model.Endereco;

/**
 *
 * @author Luis
 */
public class CadastrarCliente extends javax.swing.JDialog {

    ClienteDao dao;
    
    public CadastrarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grestadocivil = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tfnome = new javax.swing.JTextField();
        tfidade = new javax.swing.JTextField();
        tfcpf = new javax.swing.JFormattedTextField();
        tfdatanascimento = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        rbsolteiro = new javax.swing.JRadioButton();
        rbcasado = new javax.swing.JRadioButton();
        rbdivorciado = new javax.swing.JRadioButton();
        rbviuvo = new javax.swing.JRadioButton();
        cbsexo = new javax.swing.JComboBox<>();
        lbsexo = new javax.swing.JLabel();
        lbnome = new javax.swing.JLabel();
        lnidade = new javax.swing.JLabel();
        lbcpf = new javax.swing.JLabel();
        lbdatanascimento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbrua = new javax.swing.JLabel();
        tfrua = new javax.swing.JTextField();
        lbbairro = new javax.swing.JLabel();
        tfbairro = new javax.swing.JTextField();
        lbcomplemento = new javax.swing.JLabel();
        tfcomplemento = new javax.swing.JTextField();
        lbnumero = new javax.swing.JLabel();
        tfnumero = new javax.swing.JTextField();
        lbestado = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox<>();
        lbcidade = new javax.swing.JLabel();
        cbcidade = new javax.swing.JComboBox<>();
        lbtelefone = new javax.swing.JLabel();
        tftelefone = new javax.swing.JFormattedTextField();
        lbcelular = new javax.swing.JLabel();
        tfcelular = new javax.swing.JFormattedTextField();
        btcadastrar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tfnome.setToolTipText("Preencha o nome");
        tfnome.setBorder(null);

        tfidade.setToolTipText("Preencha a idade");
        tfidade.setBorder(null);

        tfcpf.setBorder(null);
        try {
            tfcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfcpf.setToolTipText("Preencha o CPF");

        tfdatanascimento.setBorder(null);
        try {
            tfdatanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdatanascimento.setToolTipText("Preencha a data de nascimento");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado Civil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setToolTipText("Escolha uma opção");

        grestadocivil.add(rbsolteiro);
        rbsolteiro.setText("Solteiro");

        grestadocivil.add(rbcasado);
        rbcasado.setText("Casado");

        grestadocivil.add(rbdivorciado);
        rbdivorciado.setText("Divorciado");

        grestadocivil.add(rbviuvo);
        rbviuvo.setText("Viúvo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rbsolteiro)
                .addGap(57, 57, 57)
                .addComponent(rbcasado)
                .addGap(52, 52, 52)
                .addComponent(rbdivorciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbviuvo)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsolteiro)
                    .addComponent(rbcasado)
                    .addComponent(rbdivorciado)
                    .addComponent(rbviuvo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cbsexo.setToolTipText("Escolha uma opção");
        cbsexo.setBorder(null);

        lbsexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbsexo.setText("Sexo:");

        lbnome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbnome.setText("Nome:");

        lnidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lnidade.setText("Idade:");

        lbcpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcpf.setText("CPF:");

        lbdatanascimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbdatanascimento.setText("Data de Nascimento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbnome)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfnome)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lnidade)
                                .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbsexo))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbcpf))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbdatanascimento)
                                .addComponent(tfdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnidade)
                    .addComponent(lbsexo)
                    .addComponent(lbcpf)
                    .addComponent(lbdatanascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lbrua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbrua.setText("Rua:");

        tfrua.setToolTipText("Preencha a rua");
        tfrua.setPreferredSize(new java.awt.Dimension(6, 25));

        lbbairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbbairro.setText("Bairro:");

        tfbairro.setToolTipText("Preencha o bairro");
        tfbairro.setPreferredSize(new java.awt.Dimension(6, 25));

        lbcomplemento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcomplemento.setText("Complemento:");

        tfcomplemento.setToolTipText("Preencha o complemento");
        tfcomplemento.setPreferredSize(new java.awt.Dimension(6, 25));

        lbnumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbnumero.setText("Número:");

        tfnumero.setToolTipText("Preencha o número");
        tfnumero.setPreferredSize(new java.awt.Dimension(6, 25));

        lbestado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbestado.setText("Estado:");

        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "ES", "MG" }));
        cbestado.setToolTipText("Escolha uma opção");
        cbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbestadoActionPerformed(evt);
            }
        });

        lbcidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcidade.setText("Cidade:");

        cbcidade.setToolTipText("Escolha uma opção");

        lbtelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtelefone.setText("Telefone:");

        try {
            tftelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tftelefone.setToolTipText("Preencha o telefone");
        tftelefone.setPreferredSize(new java.awt.Dimension(48, 25));

        lbcelular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcelular.setText("Celular:");

        try {
            tfcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfcelular.setToolTipText("Preencha o celular");
        tfcelular.setPreferredSize(new java.awt.Dimension(54, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbbairro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfrua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbrua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfbairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(lbestado)
                                            .addGap(113, 113, 113)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbcidade)
                                        .addComponent(cbcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbtelefone)
                                        .addComponent(tftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbcelular)
                                        .addComponent(tfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3)))
                            .addComponent(lbcomplemento)
                            .addComponent(tfcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbnumero)
                            .addComponent(tfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbrua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbbairro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcomplemento)
                    .addComponent(lbnumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbestado)
                    .addComponent(lbcidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtelefone)
                    .addComponent(lbcelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btcadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        btcadastrar.setText("Cadastrar");
        btcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastrarActionPerformed(evt);
            }
        });

        btlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.setMaximumSize(new java.awt.Dimension(117, 41));
        btlimpar.setPreferredSize(new java.awt.Dimension(117, 41));

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.setMaximumSize(new java.awt.Dimension(117, 41));
        Sair.setPreferredSize(new java.awt.Dimension(117, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btcadastrar)
                        .addGap(83, 83, 83)
                        .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcadastrar)
                    .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastrarActionPerformed
        try{
            Cliente cliente = new Cliente();
            cliente.setNome(tfnome.getText());
            cliente.setIdade(Integer.parseInt(tfidade.getText()));
            cliente.setSexo(cbsexo.getSelectedItem().toString());
            cliente.setCpf(tfcpf.getText());
            SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
            cliente.setDataNascimento(fm.parse(tfdatanascimento.getText()));
            radioEstadoCivil(cliente);
            Endereco endereco = new Endereco();
            endereco.setRua(tfrua.getText());
            endereco.setBairro(tfbairro.getText());
            endereco.setComplemento(tfcomplemento.getText());
            endereco.setNumero(Integer.parseInt(tfnumero.getText()));
            endereco.setEstado(cbestado.getSelectedItem().toString());
            endereco.setCidade(cbcidade.getSelectedItem().toString());
            endereco.setTelefone(tftelefone.getText());
            endereco.setCelular(tfcelular.getText());
            cliente.setEndereco(endereco);
            dao = new ClienteDao();
            dao.cadastrarCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btcadastrarActionPerformed

    private void cbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbestadoActionPerformed
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        Categorias c1 = new Categorias();
        Categorias c2 = new Categorias();
        
        switch(cbestado.getSelectedIndex()){
            case 0:
                c1.setId(1);
                c1.setDescricao("São Paulo");
                combo.addElement(c1);
                c2.setId(2);
                c2.setDescricao("Indaiatuba");
                combo.addElement(c2);
                break;
            case 1:
                c1.setId(1);
                c1.setDescricao("Rio de Janeiro");
                combo.addElement(c1);
                c2.setId(2);
                c2.setDescricao("Niterói");
                combo.addElement(c2);
                break;
            case 2:
                c1.setId(1);
                c1.setDescricao("Vitória");
                combo.addElement(c1);
                c2.setId(2);
                c2.setDescricao("Linhares");
                combo.addElement(c2);
                break;
            case 3:
                c1.setId(1);
                c1.setDescricao("Juiz de Fora");
                combo.addElement(c1);
                c2.setId(2);
                c2.setDescricao("Matias Barbosa");
                combo.addElement(c2);
                break;
        }
        cbcidade.setModel(combo);
    }//GEN-LAST:event_cbestadoActionPerformed

    private void radioEstadoCivil(Cliente cliente) {
        JRadioButton radio;
        Enumeration jr = grestadocivil.getElements();
        while ( jr.hasMoreElements() )
        {
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
            {
                cliente.setEstadoCivil(radio.getText());
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarCliente dialog = new CadastrarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Sair;
    private javax.swing.JButton btcadastrar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JComboBox<String> cbcidade;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JComboBox<String> cbsexo;
    private javax.swing.ButtonGroup grestadocivil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbbairro;
    private javax.swing.JLabel lbcelular;
    private javax.swing.JLabel lbcidade;
    private javax.swing.JLabel lbcomplemento;
    private javax.swing.JLabel lbcpf;
    private javax.swing.JLabel lbdatanascimento;
    private javax.swing.JLabel lbestado;
    private javax.swing.JLabel lbnome;
    private javax.swing.JLabel lbnumero;
    private javax.swing.JLabel lbrua;
    private javax.swing.JLabel lbsexo;
    private javax.swing.JLabel lbtelefone;
    private javax.swing.JLabel lnidade;
    private javax.swing.JRadioButton rbcasado;
    private javax.swing.JRadioButton rbdivorciado;
    private javax.swing.JRadioButton rbsolteiro;
    private javax.swing.JRadioButton rbviuvo;
    private javax.swing.JTextField tfbairro;
    private javax.swing.JFormattedTextField tfcelular;
    private javax.swing.JTextField tfcomplemento;
    private javax.swing.JFormattedTextField tfcpf;
    private javax.swing.JFormattedTextField tfdatanascimento;
    private javax.swing.JTextField tfidade;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfnumero;
    private javax.swing.JTextField tfrua;
    private javax.swing.JFormattedTextField tftelefone;
    // End of variables declaration//GEN-END:variables
}
