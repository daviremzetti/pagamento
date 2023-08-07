package Telas;

import br.com.senac.projetointegradordb.ExceptionVazio;
import br.com.senac.projetointegradordb.Lotacao;
import br.com.senac.projetointegradordb.LotacaoDAO;
import br.com.senac.projetointegradordb.Militar;
import br.com.senac.projetointegradordb.MilitarDAO;
import br.com.senac.projetointegradordb.PostoGraduacao;
import br.com.senac.projetointegradordb.PostoGraduacaoDAO;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Classe da tela de cadastro de militar
 * @author biancamarques
 */
public class MilitarCadastrar extends javax.swing.JFrame {

    public MilitarCadastrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbNome = new javax.swing.JLabel();
        LbCpf = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        LbMatricula = new javax.swing.JLabel();
        LbMatricula1 = new javax.swing.JLabel();
        CbPosto = new javax.swing.JComboBox<>();
        LbLotacao = new javax.swing.JLabel();
        CbLotacao = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Inserir = new javax.swing.JButton();
        TfCpf = new javax.swing.JFormattedTextField();
        TfMatricula = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        PGCadastrar = new javax.swing.JMenuItem();
        PGConsultar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        LotCadastrar = new javax.swing.JMenuItem();
        LotConsultar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MilCadastrar = new javax.swing.JMenuItem();
        MilitarConsultar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        DepCadastrar = new javax.swing.JMenuItem();
        DepConsultar = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        MovCadastrar = new javax.swing.JMenuItem();
        MovConsultar = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        ContGerar = new javax.swing.JMenuItem();
        ContConsultar = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAGAMENTO CBMSC");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        LbNome.setText("Nome:");

        LbCpf.setText("CPF:");

        TfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNomeActionPerformed(evt);
            }
        });

        LbMatricula.setText("Matrícula:");

        LbMatricula1.setText("Posto/Graduação:");

        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();

        PostoGraduacaoDAO dao = new PostoGraduacaoDAO();
        List<PostoGraduacao> lista = dao.listar();

        for(int i = 0; i < lista.size(); i++){
            String posto = lista.get(i).getPosto_graduacao();

            String[] item = {
                posto.toString()
            };

            comboModel.addElement(posto.toString());
        }
        CbPosto.setModel(comboModel);

        LbLotacao.setText("Lotação:");

        DefaultComboBoxModel comboModelLot = new DefaultComboBoxModel();

        LotacaoDAO daoLot = new LotacaoDAO();
        List<Lotacao> listaLot = daoLot.listar();

        for(int i = 0; i < listaLot.size(); i++){
            String lotacao = listaLot.get(i).getNome();

            String[] itemLot = {
                lotacao
            };

            comboModelLot.addElement(lotacao);
        }
        CbLotacao.setModel(comboModelLot);

        jButton1.setText("Voltar");

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        try {
            TfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TfMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TfMatricula.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                TfMatriculaComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbMatricula)
                            .addComponent(LbNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(LbLotacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CbLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LbCpf)
                                .addGap(18, 18, 18)
                                .addComponent(TfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LbMatricula1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbPosto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCpf)
                    .addComponent(TfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbMatricula)
                    .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbLotacao)
                    .addComponent(CbLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbMatricula1)
                    .addComponent(CbPosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Inserir))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        Menu.setText("Menu");

        jMenu3.setText("Posto/Graduacao");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        PGCadastrar.setText("Cadastrar");
        PGCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGCadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(PGCadastrar);

        PGConsultar.setText("Consultar");
        PGConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGConsultarActionPerformed(evt);
            }
        });
        jMenu3.add(PGConsultar);

        Menu.add(jMenu3);

        jMenu4.setText("Lotação");

        LotCadastrar.setText("Cadastrar");
        LotCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LotCadastrarActionPerformed(evt);
            }
        });
        jMenu4.add(LotCadastrar);

        LotConsultar.setText("Consultar");
        LotConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LotConsultarActionPerformed(evt);
            }
        });
        jMenu4.add(LotConsultar);

        Menu.add(jMenu4);

        jMenu5.setText("Militar");

        MilCadastrar.setText("Cadastrar");
        MilCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilCadastrarActionPerformed(evt);
            }
        });
        jMenu5.add(MilCadastrar);

        MilitarConsultar.setText("Consultar");
        MilitarConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilitarConsultarActionPerformed(evt);
            }
        });
        jMenu5.add(MilitarConsultar);

        Menu.add(jMenu5);

        jMenu6.setText("Dependente");

        DepCadastrar.setText("Cadastrar");
        DepCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepCadastrarActionPerformed(evt);
            }
        });
        jMenu6.add(DepCadastrar);

        DepConsultar.setText("Consultar");
        DepConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepConsultarActionPerformed(evt);
            }
        });
        jMenu6.add(DepConsultar);

        Menu.add(jMenu6);

        jMenu7.setText("Movimentação");

        MovCadastrar.setText("Cadastrar");
        MovCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovCadastrarActionPerformed(evt);
            }
        });
        jMenu7.add(MovCadastrar);

        MovConsultar.setText("Consultar");
        MovConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovConsultarActionPerformed(evt);
            }
        });
        jMenu7.add(MovConsultar);

        Menu.add(jMenu7);

        jMenu8.setText("Contracheque");

        ContGerar.setText("Gerar pagamento");
        ContGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContGerarActionPerformed(evt);
            }
        });
        jMenu8.add(ContGerar);

        ContConsultar.setText("Consultar");
        ContConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContConsultarActionPerformed(evt);
            }
        });
        jMenu8.add(ContConsultar);

        Menu.add(jMenu8);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu.add(Sair);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNomeActionPerformed

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed

        String nome = TfNome.getText().toUpperCase();
        String cpf = TfCpf.getText();
        String matricula = TfMatricula.getText();

        String postoSelecionado = (String) CbPosto.getSelectedItem();
        PostoGraduacao posto = selecionarPosto(postoSelecionado);

        String lotacaoDigitada = (String) CbLotacao.getSelectedItem();
        Lotacao lotacao = selecionarLotacao(lotacaoDigitada);

        try {
            this.conferirVazios();

            Militar novoMilitar = new Militar();
            novoMilitar.setCpf(cpf);
            novoMilitar.setLotacao(lotacao);
            novoMilitar.setPostoGraduacao(posto);
            novoMilitar.setMatricula(matricula);
            novoMilitar.setNome(nome);

            MilitarDAO dao = new MilitarDAO();
            boolean cadastrado = dao.cadastrar(novoMilitar);

            if (cadastrado == true) {
                JOptionPane.showMessageDialog(null, "Militar cadastrado com sucesso!");
            }

            TfNome.setText("");
            TfCpf.setText("");
            TfMatricula.setText("");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Erro de conversão: " + e.getMessage());
        } catch (ExceptionVazio e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_InserirActionPerformed
    
    /**
     * Método para verificar se há campos não preenchidos pelo usuário
     * @throws ExceptionVazio 
     */
    private void conferirVazios() throws ExceptionVazio {
        if (TfNome.getText().isEmpty() || TfCpf.getText().equals("   .   .   -  ") || TfMatricula.getText().equals("   .   - ")) {
            throw new ExceptionVazio();
        }
    }
    
    /**
     * Função para buscar a lotação no banco de dados pelo nome
     * @param lotacaoSelecionada
     * @return 
     */
    private Lotacao selecionarLotacao(String lotacaoSelecionada) {
        LotacaoDAO dao = new LotacaoDAO();
        Lotacao lotacao = dao.buscarNome(lotacaoSelecionada);
        return lotacao;
    }
    
    
    /**
     * Função para buscar a posto/graduação no banco de dados pelo nome
     * @param postoSelecionado
     * @return 
     */
    private PostoGraduacao selecionarPosto(String postoSelecionado) {
        PostoGraduacaoDAO dao = new PostoGraduacaoDAO();
        PostoGraduacao posto = dao.buscaPostoPorNome(postoSelecionado);
        return posto;
    }

    private void TfMatriculaComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TfMatriculaComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_TfMatriculaComponentResized

    private void PGCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGCadastrarActionPerformed
        this.setVisible(false);
        PostoGraduacaoCadastrar novoPosto = new PostoGraduacaoCadastrar();
        novoPosto.setVisible(true);
    }//GEN-LAST:event_PGCadastrarActionPerformed

    private void PGConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGConsultarActionPerformed
        this.setVisible(false);
        PostoGraduacaoConsultar novoDependente = new PostoGraduacaoConsultar();
        novoDependente.setVisible(true);
    }//GEN-LAST:event_PGConsultarActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void LotCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LotCadastrarActionPerformed
        this.setVisible(false);
        LotacaoCadastrar novaLotacao = new LotacaoCadastrar();
        novaLotacao.setVisible(true);
    }//GEN-LAST:event_LotCadastrarActionPerformed

    private void LotConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LotConsultarActionPerformed
        this.setVisible(false);
        LotacaoConsultar novaConsulta = new LotacaoConsultar();
        novaConsulta.setVisible(true);
    }//GEN-LAST:event_LotConsultarActionPerformed

    private void MilCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilCadastrarActionPerformed
        this.setVisible(false);
        MilitarCadastrar novoMilitar = new MilitarCadastrar();
        novoMilitar.setVisible(true);
    }//GEN-LAST:event_MilCadastrarActionPerformed

    private void MilitarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilitarConsultarActionPerformed
        this.setVisible(false);
        MilitarConsultar novaConsulta = new MilitarConsultar();
        novaConsulta.setVisible(true);
    }//GEN-LAST:event_MilitarConsultarActionPerformed

    private void DepCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepCadastrarActionPerformed
        this.setVisible(false);
        DependenteCadastrar novaConsulta = new DependenteCadastrar();
        novaConsulta.setVisible(true);
    }//GEN-LAST:event_DepCadastrarActionPerformed

    private void DepConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepConsultarActionPerformed
        this.setVisible(false);
        DependenteConsultar novaConsulta = new DependenteConsultar();
        novaConsulta.setVisible(true);
    }//GEN-LAST:event_DepConsultarActionPerformed

    private void MovCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovCadastrarActionPerformed
        this.setVisible(false);
        MovimentacaoCadastrar novaMovimentacao = new MovimentacaoCadastrar();
        novaMovimentacao.setVisible(true);
    }//GEN-LAST:event_MovCadastrarActionPerformed

    private void MovConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovConsultarActionPerformed
        this.setVisible(false);
        MovimentacaoConsultar novaConsulta = new MovimentacaoConsultar();
        novaConsulta.setVisible(true);
    }//GEN-LAST:event_MovConsultarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void ContGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContGerarActionPerformed
        ContrachequeGerar novoContracheque = new ContrachequeGerar();
        this.setVisible(false);
        novoContracheque.setVisible(true);
    }//GEN-LAST:event_ContGerarActionPerformed

    private void ContConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContConsultarActionPerformed
        ContrachequeConsultar novaConsulta = new ContrachequeConsultar();
        this.setVisible(false);
        novaConsulta.setVisible(true);
    }//GEN-LAST:event_ContConsultarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MilitarCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbLotacao;
    private javax.swing.JComboBox<String> CbPosto;
    private javax.swing.JMenuItem ContConsultar;
    private javax.swing.JMenuItem ContGerar;
    private javax.swing.JMenuItem DepCadastrar;
    private javax.swing.JMenuItem DepConsultar;
    private javax.swing.JButton Inserir;
    private javax.swing.JLabel LbCpf;
    private javax.swing.JLabel LbLotacao;
    private javax.swing.JLabel LbMatricula;
    private javax.swing.JLabel LbMatricula1;
    private javax.swing.JLabel LbNome;
    private javax.swing.JMenuItem LotCadastrar;
    private javax.swing.JMenuItem LotConsultar;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem MilCadastrar;
    private javax.swing.JMenuItem MilitarConsultar;
    private javax.swing.JMenuItem MovCadastrar;
    private javax.swing.JMenuItem MovConsultar;
    private javax.swing.JMenuItem PGCadastrar;
    private javax.swing.JMenuItem PGConsultar;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JFormattedTextField TfCpf;
    private javax.swing.JFormattedTextField TfMatricula;
    private javax.swing.JTextField TfNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
