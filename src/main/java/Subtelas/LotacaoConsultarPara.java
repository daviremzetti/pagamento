package Subtelas;

import br.com.senac.projetointegradordb.Lotacao;
import Servicos.LotacaoServicos;
import Telas.MovimentacaoCadastrar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe da tela para selecionar lotação
 * @author biancamarques
 */
public class LotacaoConsultarPara extends javax.swing.JFrame {

    private MovimentacaoCadastrar cadastroMov;
    private LotacaoServicos servicoLot = new LotacaoServicos();

    public LotacaoConsultarPara() {
        initComponents();
    }

    public void setMovimentacao(MovimentacaoCadastrar cadastroMov) {
        this.cadastroMov = cadastroMov;
    }

    public MovimentacaoCadastrar getCadastroMov() {
        return cadastroMov;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        LbBatalhao = new javax.swing.JLabel();
        TfBatalhao = new javax.swing.JTextField();
        LbCompanhia = new javax.swing.JLabel();
        TfCompanhia = new javax.swing.JTextField();
        LbPelotao = new javax.swing.JLabel();
        TfPelotao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Selecionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbLista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filtro"));

        LbBatalhao.setText("Batalhão:");

        TfBatalhao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TfBatalhaoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TfBatalhaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TfBatalhaoKeyTyped(evt);
            }
        });

        LbCompanhia.setText("Companhia:");

        TfCompanhia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TfCompanhiaKeyReleased(evt);
            }
        });

        LbPelotao.setText("Pelotão:");

        TfPelotao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TfPelotaoKeyReleased(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Selecionar.setText("Selecionar");
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(LbBatalhao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfBatalhao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LbCompanhia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfCompanhia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LbPelotao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfPelotao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Consultar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Selecionar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(LbBatalhao)
                        .addGap(18, 18, 18)
                        .addComponent(TfBatalhao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(LbCompanhia)
                        .addGap(18, 18, 18)
                        .addComponent(TfCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(LbPelotao)
                        .addGap(18, 18, 18)
                        .addComponent(TfPelotao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Selecionar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbBatalhao)
                    .addComponent(LbCompanhia)
                    .addComponent(LbPelotao)
                    .addComponent(TfBatalhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfPelotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Consultar)
                    .addComponent(Selecionar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        String[] colunas = {"Id","Batalhão","Companhia","Pelotão","Nome"};
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfBatalhaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfBatalhaoKeyPressed

    }//GEN-LAST:event_TfBatalhaoKeyPressed

    private void TfBatalhaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfBatalhaoKeyReleased

    }//GEN-LAST:event_TfBatalhaoKeyReleased

    private void TfBatalhaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfBatalhaoKeyTyped

    }//GEN-LAST:event_TfBatalhaoKeyTyped

    private void TfCompanhiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfCompanhiaKeyReleased

    }//GEN-LAST:event_TfCompanhiaKeyReleased

    private void TfPelotaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfPelotaoKeyReleased

    }//GEN-LAST:event_TfPelotaoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed

        List<Lotacao>lista;
        String batalhao = TfBatalhao.getText();
        String companhia = TfCompanhia.getText();
        String pelotao = TfPelotao.getText();
        
        boolean listarTodos = listarTodos(batalhao, companhia, pelotao);
        if(listarTodos == true) {
            lista = servicoLot.listar();
        }else{
            lista = servicoLot.filtrar(TfBatalhao.getText(), TfCompanhia.getText(),TfPelotao.getText());
        }
        listar(lista);
    }//GEN-LAST:event_ConsultarActionPerformed
    
    private boolean listarTodos(String batalhao, String companhia, String pelotao){
        boolean listar;
        if(batalhao.isEmpty() && companhia.isEmpty() && pelotao.isEmpty()){
            listar = true;
        }else{
            listar = false;
        }
        return listar;
    }
    /**
     * Método para listar lotações em tela
     */
    private void listar(List<Lotacao>lista) {

        DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
        tabelaModelo.setNumRows(0);

        for (int i = 0; i < lista.size(); i++) {
            Lotacao novaLotacao = lista.get(i);
            String id = String.valueOf(novaLotacao.getId());
            String batalhao = novaLotacao.getBatalhao();
            String companhia = novaLotacao.getCompanhia();
            String pelotao = novaLotacao.getPelotao();
            String nome = novaLotacao.getNome().toUpperCase();

            String[] linha = {
                id, batalhao, companhia, pelotao, nome
            };
            tabelaModelo.addRow(linha);
            TbLista.setModel(tabelaModelo);

        }
    }
    
    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        this.selecionarParaCadastro();
        this.setVisible(false);
    }//GEN-LAST:event_SelecionarActionPerformed
    
    /**
     * Método para selecionar lotação para destino para cadastrar movimentação
     */
    private void selecionarParaCadastro() {
        try {
            int linhaSelecionada = TbLista.getSelectedRow();
            int idSelecionado = Integer.parseInt((String) TbLista.getValueAt(linhaSelecionada, 0));
            Lotacao lot = servicoLot.buscaId(idSelecionado);
            cadastroMov.setDestino(lot);
            cadastroMov.setNomeLotacao(lot.getNome());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Nenhum ítem selecionado. " + e.getMessage());
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
            java.util.logging.Logger.getLogger(LotacaoConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LotacaoConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LotacaoConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LotacaoConsultarPara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LotacaoConsultarPara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JLabel LbBatalhao;
    private javax.swing.JLabel LbCompanhia;
    private javax.swing.JLabel LbPelotao;
    private javax.swing.JButton Selecionar;
    private javax.swing.JTable TbLista;
    private javax.swing.JTextField TfBatalhao;
    private javax.swing.JTextField TfCompanhia;
    private javax.swing.JTextField TfPelotao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
