package Telas;

import Subtelas.MilitarConsultarPara;
import DAO.DependenteDAO;
import Servicos.DependenteServicos;
import com.myproject.modelo.Dependente;
import com.myproject.modelo.Militar;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Classe da tela de consulta de dependente
 *
 * @author daviremzetti
 */
public class DependenteConsultar extends javax.swing.JFrame {

    private Militar militar;
    private DependenteServicos servicoDep = new DependenteServicos(new DependenteDAO());

    public DependenteConsultar() {
        initComponents();
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }

    public Militar getMilitar() {
        return militar;
    }

    /**
     * Método para preencher nome do militar selecionado na tela
     * MilitarConsultarPara
     */
    public void setNomeMantenedor() {
        TfNomeMant.setText(militar.getNome());
    }

    /**
     * Método para preencher matrícula do militar selecionado na tela
     * MilitarConsultarPara
     */
    public void setMatriculaMantenedor() {
        TfMatricula.setText(militar.getMatricula());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbLista = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        LbNome = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        LbCpf = new javax.swing.JLabel();
        TfCpf = new javax.swing.JFormattedTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        LbMatricula = new javax.swing.JLabel();
        LbNome1 = new javax.swing.JLabel();
        TfNomeMant = new javax.swing.JTextField();
        TfMatricula = new javax.swing.JFormattedTextField();
        ConsultarMil = new javax.swing.JButton();
        ConsultarDep = new javax.swing.JButton();
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

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        String[] colunas = {"Id","Nome","CPF","Parentesco","Mantenedor"};
        DefaultTableModel tabelaModelo = new DefaultTableModel(colunas,0);
        TbLista.setModel(tabelaModelo);
        jScrollPane1.setViewportView(TbLista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filtro"));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do dependente"));

        LbNome.setText("Nome:");

        LbCpf.setText("CPF:");

        try {
            TfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLayeredPane2.setLayer(LbNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(TfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(LbCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(TfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addComponent(LbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbCpf)
                .addGap(7, 7, 7)
                .addComponent(TfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCpf)
                    .addComponent(TfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mantenedor"));

        LbMatricula.setText("Matrícula:");

        LbNome1.setText("Nome:");

        TfNomeMant.setEditable(false);
        TfNomeMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNomeMantActionPerformed(evt);
            }
        });

        TfMatricula.setEditable(false);
        try {
            TfMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ConsultarMil.setText("Consultar");
        ConsultarMil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarMilActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(LbMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(LbNome1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(TfNomeMant, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(TfMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(ConsultarMil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsultarMil)
                .addGap(18, 18, 18)
                .addComponent(LbNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfNomeMant, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome1)
                    .addComponent(TfNomeMant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbMatricula)
                    .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarMil))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ConsultarDep.setText("Consultar");
        ConsultarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarDepActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ConsultarDep, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ConsultarDep)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConsultarDep)
                .addGap(17, 17, 17))
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
            .addComponent(jLayeredPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void ConsultarMilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarMilActionPerformed

        MilitarConsultarPara novaConsulta = new MilitarConsultarPara();
        novaConsulta.setDependenteConsultar(this);
        novaConsulta.setOperacao("consultarDependente");
        novaConsulta.setVisible(true);

    }//GEN-LAST:event_ConsultarMilActionPerformed

    private void ConsultarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarDepActionPerformed
        List<Dependente> lista;
        String nomeDep = TfNome.getText();
        String cpfDep = TfCpf.getText();
        String matriculaMant = TfMatricula.getText();
        if (TfNome.getText().isEmpty() && TfCpf.getText().equals("   .   .   -  ") & TfNomeMant.getText().isEmpty()) {
            lista = servicoDep.listar();
        } else {
            lista = servicoDep.filtrar(nomeDep, cpfDep, matriculaMant);
        }
        listar(lista);
        limparCampos();
    }//GEN-LAST:event_ConsultarDepActionPerformed

    private void TfNomeMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNomeMantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNomeMantActionPerformed

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

    /**
     * Método para listar todos os dependentes em tela
     */
    private void listar(List lista) {
        DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
        tabelaModelo.setNumRows(0);

        for (int i = 0; i < lista.size(); i++) {
            Dependente novoDep = (Dependente) lista.get(i);
            String id = String.valueOf(novoDep.getId());
            String nome = novoDep.getNome().toUpperCase();
            String cpf = novoDep.getCpf().toUpperCase();
            String parentesco = novoDep.getRelacaoDependencia().getNomeRelacao().toUpperCase();
            String mantenedor = novoDep.getMilitar().getNome().toUpperCase();
            String[] linha = {
                id, nome, cpf, parentesco, mantenedor
            };
            tabelaModelo.addRow(linha);
            TbLista.setModel(tabelaModelo);
        }
    }

    private void limparCampos() {
        TfNome.setText("");
        TfCpf.setText("");
        TfNomeMant.setText("");
        TfMatricula.setText("");

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DependenteConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarDep;
    private javax.swing.JButton ConsultarMil;
    private javax.swing.JMenuItem ContConsultar;
    private javax.swing.JMenuItem ContGerar;
    private javax.swing.JMenuItem DepCadastrar;
    private javax.swing.JMenuItem DepConsultar;
    private javax.swing.JLabel LbCpf;
    private javax.swing.JLabel LbMatricula;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbNome1;
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
    private javax.swing.JTable TbLista;
    private javax.swing.JFormattedTextField TfCpf;
    private javax.swing.JFormattedTextField TfMatricula;
    private javax.swing.JTextField TfNome;
    private javax.swing.JTextField TfNomeMant;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
