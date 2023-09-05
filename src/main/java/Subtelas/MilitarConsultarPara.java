package Subtelas;

import DAO.MilitarDAO;
import Servicos.MilitarServicos;
import Telas.ContrachequeConsultar;
import Telas.ContrachequeGerar;
import Telas.DependenteCadastrar;
import Telas.DependenteConsultar;
import Telas.LotacaoCadastrar;
import Telas.LotacaoConsultar;
import Telas.MilitarCadastrar;
import Telas.MilitarConsultar;
import Telas.MovimentacaoCadastrar;
import Telas.MovimentacaoConsultar;
import Telas.PostoGraduacaoCadastrar;
import Telas.PostoGraduacaoConsultar;
import com.myproject.modelo.Militar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe para consultar militar
 *
 * @author daviremzetti
 */
public class MilitarConsultarPara extends javax.swing.JFrame {

    protected boolean selecionado;
    protected Militar militar;
    protected DependenteCadastrar dependenteCadastro;
    protected DependenteConsultar dependenteConsulta;
    protected MovimentacaoCadastrar movimentacaoCadastro;
    protected ContrachequeConsultar consultaContracheque;
    protected String operacao;

    public boolean getSelecionado() {
        return selecionado;
    }

    public Militar getMilitar() {
        return militar;
    }

    public MilitarConsultarPara() {
        initComponents();
    }

    public void setDependenteCadastrar(DependenteCadastrar cadastro) {
        this.dependenteCadastro = cadastro;
    }

    public void setDependenteConsultar(DependenteConsultar consulta) {
        this.dependenteConsulta = consulta;
    }

    public void setMovimentacaoCadastrar(MovimentacaoCadastrar cadastro) {
        this.movimentacaoCadastro = cadastro;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setConsultarContracheque(ContrachequeConsultar consulta) {
        this.consultaContracheque = consulta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        LbMatricula = new javax.swing.JLabel();
        LbNome = new javax.swing.JLabel();
        LbCpf = new javax.swing.JLabel();
        TfMatricula = new javax.swing.JFormattedTextField();
        TfCpf = new javax.swing.JFormattedTextField();
        TfNome = new javax.swing.JTextField();
        Listar = new javax.swing.JButton();
        Selecionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbLista = new javax.swing.JTable();
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

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filtro"));

        LbMatricula.setText("Matricula:");

        LbNome.setText("Nome:");

        LbCpf.setText("CPF:");

        try {
            TfMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        Selecionar.setText("Selecionar");
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(LbMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LbNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LbCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Listar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Selecionar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbMatricula)
                    .addComponent(LbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Selecionar))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LbCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbMatricula)
                    .addComponent(LbCpf)
                    .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Listar)
                    .addComponent(Selecionar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        String[] colunas = {"Id","Matricula", "Nome", "Posto", "Lotação"};
        DefaultTableModel tabelaModelo = new DefaultTableModel(colunas,0);
        TbLista.setModel(tabelaModelo);
        jScrollPane1.setViewportView(TbLista);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed

        String matriculaDigitada = TfMatricula.getText();
        String cpfDigitado = TfCpf.getText();
        String nomeDigitado = TfNome.getText().toUpperCase();

        MilitarServicos servicoMil = new MilitarServicos(new MilitarDAO());
        List<Militar> lista;

        if (matriculaDigitada.equals("   .   - ") && cpfDigitado.equals("   .   .   -  ") && nomeDigitado.isEmpty()) {
            lista = servicoMil.listar();
        } else {
            lista = servicoMil.buscaFiltro(nomeDigitado, matriculaDigitada, cpfDigitado);
        }

        listar(lista);
        limparCampos();
    }//GEN-LAST:event_ListarActionPerformed

    /**
     * Método para listar todos os militares em tela
     */
    private void listar(List<Militar> lista) {
        DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
        tabelaModelo.setNumRows(0);

        for (int i = 0; i < lista.size(); i++) {
            Militar novoMilitar = lista.get(i);

            String id = String.valueOf(novoMilitar.getId());
            String cpf = novoMilitar.getCpf();
            String matricula = novoMilitar.getMatricula();
            String nome = novoMilitar.getNome().toUpperCase();
            String posto = novoMilitar.getPostoGraduacao().getPosto_graduacao().toUpperCase();
            String lotacao = novoMilitar.getLotacao().getNome().toUpperCase();

            String[] linha = {
                id, matricula, nome, posto, lotacao
            };
            tabelaModelo.addRow(linha);
            TbLista.setModel(tabelaModelo);
        }

    }

    private void limparCampos() {
        TfMatricula.setText("");
        TfCpf.setText("");
        TfNome.setText("");
    }

    /**
     * Método para selecionar militar para consulta de contracheque
     */
    protected void selecionar() {
        try {
            int linhaSelecionada = TbLista.getSelectedRow();
            int idSelecionado = Integer.parseInt((String) TbLista.getValueAt(linhaSelecionada, 0));

            MilitarDAO dao = new MilitarDAO();
            Militar novoMilitar = dao.buscaId(idSelecionado);

            switch (operacao) {
                case "consultarContracheque" -> {
                    consultaContracheque.setNome(novoMilitar.getNome());
                    consultaContracheque.setMatricula(novoMilitar.getMatricula());
                }
                case "cadastrarDependente" -> {
                    dependenteCadastro.setMilitar(novoMilitar);
                    dependenteCadastro.setNomeMantenedor(novoMilitar.getNome());
                    dependenteCadastro.setMatriculaMantenedor(novoMilitar.getMatricula());
                }
                case "movimentar" -> {
                    movimentacaoCadastro.setMilitar(novoMilitar);
                    movimentacaoCadastro.setNomeMilitar(novoMilitar.getNome());
                    movimentacaoCadastro.setMatriculaMil(novoMilitar.getMatricula());
                }
                case "consultarDependente" -> {
                    dependenteConsulta.setMilitar(novoMilitar);
                    dependenteConsulta.setNomeMantenedor();
                    dependenteConsulta.setMatriculaMantenedor();
                }
                default -> {
                }
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Nenhum ítem selecionado. " + e.getMessage());
        }
    }


    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        selecionar();
        this.setVisible(false);

    }//GEN-LAST:event_SelecionarActionPerformed

    private void ContGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContGerarActionPerformed
        ContrachequeGerar novoContracheque = new ContrachequeGerar();
        this.setVisible(false);
        novoContracheque.setVisible(true);
    }//GEN-LAST:event_ContGerarActionPerformed

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
            java.util.logging.Logger.getLogger(MilitarConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MilitarConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MilitarConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MilitarConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MilitarConsultarPara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ContConsultar;
    private javax.swing.JMenuItem ContGerar;
    private javax.swing.JMenuItem DepCadastrar;
    private javax.swing.JMenuItem DepConsultar;
    private javax.swing.JLabel LbCpf;
    private javax.swing.JLabel LbMatricula;
    private javax.swing.JLabel LbNome;
    private javax.swing.JButton Listar;
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
    private javax.swing.JButton Selecionar;
    private javax.swing.JTable TbLista;
    private javax.swing.JFormattedTextField TfCpf;
    private javax.swing.JFormattedTextField TfMatricula;
    private javax.swing.JTextField TfNome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
