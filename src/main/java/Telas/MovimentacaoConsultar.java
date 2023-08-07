
package Telas;

import br.com.senac.projetointegradordb.Movimentacao;
import br.com.senac.projetointegradordb.MovimentacaoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class MovimentacaoConsultar extends javax.swing.JFrame {
    
    /**
     * Classe tela de consulta de movimentações
     */
    public MovimentacaoConsultar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        LbNome = new javax.swing.JLabel();
        LbMatricula = new javax.swing.JLabel();
        TfMatricula = new javax.swing.JFormattedTextField();
        TfNome = new javax.swing.JTextField();
        Consultar = new javax.swing.JButton();
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
        setTitle("PAGAMENTO CBMSC");

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filtro"));

        LbNome.setText("Nome:");

        LbMatricula.setText("Matricula:");

        try {
            TfMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(LbNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LbMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfMatricula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Consultar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Consultar)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbMatricula)
                            .addComponent(LbNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbMatricula)
                    .addComponent(TfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Consultar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        String[] colunas = {
            "id","Matricula","Nome","Data","Origem","Destino","Ajuda de Custo","Pago"};

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
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

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        MovimentacaoDAO dao = new MovimentacaoDAO();
        List <Movimentacao> lista;
        
        boolean listarTodos = this.listarTodos();
        
        if(listarTodos == true){
            lista = dao.listar();
        }else{
            lista = dao.filtrar(TfNome.getText(), TfMatricula.getText());
        }
        listar(lista);
        TfMatricula.setText("");
        TfNome.setText("");
    }//GEN-LAST:event_ConsultarActionPerformed
    
    
    private boolean listarTodos(){
        String matriculaDigitada = TfMatricula.getText();
        String nomeDigitado = TfNome.getText();
        boolean listar;
        
        if(matriculaDigitada.equals("   .   - ") && nomeDigitado.isEmpty()){
            listar = true;
        }else{
            listar = false;
        }
        return listar;
    }
    
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
     * Método para listar as movimentações em tela
     * @param lista
     */
    public void listar(List<Movimentacao>lista){
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
        tabelaModelo.setNumRows(0);
        
        for(int i = 0; i < lista.size(); i++){
            Movimentacao novaMovimentacao = lista.get(i);
            String id = String.valueOf(novaMovimentacao.getId());
            String matricula = novaMovimentacao.getMilitar().getMatricula();
            String nome = novaMovimentacao.getMilitar().getNome().toUpperCase();
            String data = novaMovimentacao.getData_Mov().toString();
            String origem = novaMovimentacao.getOrigem().getNome().toUpperCase();
            String destino = novaMovimentacao.getDestino().getNome().toUpperCase();
            String valor = String.valueOf(novaMovimentacao.getValor());
            String pago = novaMovimentacao.getPago().toUpperCase();
            
            String[] linha = {
                id, matricula,nome,data,origem,destino,valor,pago
            };
            tabelaModelo.addRow(linha);
            TbLista.setModel(tabelaModelo);
            
        }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentacaoConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JMenuItem ContConsultar;
    private javax.swing.JMenuItem ContGerar;
    private javax.swing.JMenuItem DepCadastrar;
    private javax.swing.JMenuItem DepConsultar;
    private javax.swing.JLabel LbMatricula;
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
    private javax.swing.JTable TbLista;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
