package Telas;

import DAO.PostoGraduacaoDAO;
import Servicos.PostoGraduacaoServicos;
import com.myproject.modelo.PostoGraduacao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Classe da tela de consulta dos postos/graduações e seus respectivos salários
 * @author daviremzetti
 */
public class PostoGraduacaoConsultar extends javax.swing.JFrame {

    public PostoGraduacaoConsultar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        LbNome = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        Consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbLista = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu2 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        PGCadastrar2 = new javax.swing.JMenuItem();
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

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filtros"));

        LbNome.setLabelFor(TfNome);
        LbNome.setText("Nome:");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(LbNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Consultar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Consultar)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        String[] colunas = {"Id","Posto","Salário"};
        DefaultTableModel tabelaModelo = new DefaultTableModel(colunas,0);
        TbLista.setModel(tabelaModelo);
        jScrollPane1.setViewportView(TbLista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        Menu2.setText("Menu");

        jMenu10.setText("Posto/Graduacao");
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });

        PGCadastrar2.setText("Cadastrar");
        PGCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGCadastrar2ActionPerformed(evt);
            }
        });
        jMenu10.add(PGCadastrar2);

        PGConsultar.setText("Consultar");
        PGConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGConsultarActionPerformed(evt);
            }
        });
        jMenu10.add(PGConsultar);

        Menu2.add(jMenu10);

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

        Menu2.add(jMenu4);

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

        Menu2.add(jMenu5);

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

        Menu2.add(jMenu6);

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

        Menu2.add(jMenu7);

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

        Menu2.add(jMenu8);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu2.add(Sair);

        jMenuBar1.add(Menu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PGCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGCadastrar2ActionPerformed
        this.setVisible(false);
        PostoGraduacaoCadastrar novoPosto = new PostoGraduacaoCadastrar();
        novoPosto.setVisible(true);
    }//GEN-LAST:event_PGCadastrar2ActionPerformed

    private void PGConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGConsultarActionPerformed
        this.setVisible(false);
        PostoGraduacaoConsultar novoDependente = new PostoGraduacaoConsultar();
        novoDependente.setVisible(true);
    }//GEN-LAST:event_PGConsultarActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ActionPerformed

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

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        List <PostoGraduacao> lista;
        String filtro = TfNome.getText();
        boolean filtroVazio = TfNome.getText().isEmpty();
        PostoGraduacaoServicos postGradServico = new PostoGraduacaoServicos(new PostoGraduacaoDAO());
        if (filtroVazio) {
            lista = postGradServico.listar();
        } else {
            lista = postGradServico.buscaNome(filtro);
        }
        listar(lista);
        TfNome.setText("");
    }//GEN-LAST:event_ConsultarActionPerformed

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
     * Método para listar todos os postos/graduações em tela
     */
    
    
    private void listar(List <PostoGraduacao> lista) {
        DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
        tabelaModelo.setNumRows(0);
        for (int i = 0; i < lista.size(); i++) {
            PostoGraduacao novoPosto = lista.get(i);
            String id = String.valueOf(novoPosto.getId());
            String posto = novoPosto.getPosto_graduacao().toUpperCase();
            String salario = String.valueOf(novoPosto.getSalario());

            String[] linha = {
                id,
                posto,
                salario
            };

            tabelaModelo.addRow(linha);
        }

        TbLista.setModel(tabelaModelo);
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
            java.util.logging.Logger.getLogger(PostoGraduacaoConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostoGraduacaoConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostoGraduacaoConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostoGraduacaoConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostoGraduacaoConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JMenuItem ContConsultar;
    private javax.swing.JMenuItem ContGerar;
    private javax.swing.JMenuItem DepCadastrar;
    private javax.swing.JMenuItem DepConsultar;
    private javax.swing.JLabel LbNome;
    private javax.swing.JMenuItem LotCadastrar;
    private javax.swing.JMenuItem LotConsultar;
    private javax.swing.JMenu Menu2;
    private javax.swing.JMenuItem MilCadastrar;
    private javax.swing.JMenuItem MilitarConsultar;
    private javax.swing.JMenuItem MovCadastrar;
    private javax.swing.JMenuItem MovConsultar;
    private javax.swing.JMenuItem PGCadastrar2;
    private javax.swing.JMenuItem PGConsultar;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JTable TbLista;
    private javax.swing.JTextField TfNome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu10;
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
