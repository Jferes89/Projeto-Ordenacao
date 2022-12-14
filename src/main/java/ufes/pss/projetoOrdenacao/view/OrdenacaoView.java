/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ufes.pss.projetoOrdenacao.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import ufes.pss.projetoOrdenacao.presenter.BuscarSalariosPresente;
import ufes.pss.projetoOrdenacao.presenter.MetodosOrdenacaoPresente;
import ufes.pss.projetoOrdenacao.presenter.inteface.Ordenacao;
import ufes.pss.projetoOrdenacao.service.MetodosOrdenacaoService;

/**
 *
 * @author itix
 */
public class OrdenacaoView extends javax.swing.JFrame {

    private HashMap<String, Ordenacao> listMetodosOrdenacao;
    private ArrayList<Double> listaNaoOrdenada;

    public OrdenacaoView() {
        initComponents();
    }

    public JButton getBtnCarregarArquivo() {
        return btnCarregarArquivo;
    }

    public JButton getBtnOrdenar() {
        return btnOrdenar;
    }

    public JComboBox<String> getCmbMetodo() {
        return cmbMetodo;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public JLabel getLbMetodoOrdenacao() {
        return lbMetodoOrdenacao;
    }

    public JLabel getLblOrdenados() {
        return lblOrdenados;
    }

    public JLabel getLblSemOrdem() {
        return lblSemOrdem;
    }

    public JList<Double> getListOrdenados() {
        return listOrdenados;
    }

    public JList<Double> getListSemOrdem() {
        return listSemOrdem;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSemOrdem = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOrdenados = new javax.swing.JList<>();
        rbtDecrescente = new javax.swing.JRadioButton();
        rbtnCresente = new javax.swing.JRadioButton();
        btnOrdenar = new javax.swing.JButton();
        btnCarregarArquivo = new javax.swing.JButton();
        cmbMetodo = new javax.swing.JComboBox<>();
        lblSemOrdem = new javax.swing.JLabel();
        lblOrdenados = new javax.swing.JLabel();
        lbMetodoOrdenacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        listSemOrdem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listSemOrdemAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(listSemOrdem);

        jScrollPane2.setViewportView(listOrdenados);

        rbtDecrescente.setText("Decrescente");
        rbtDecrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDecrescenteActionPerformed(evt);
            }
        });

        rbtnCresente.setText("Cresente");
        rbtnCresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCresenteActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.setEnabled(false);
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnCarregarArquivo.setText("Carregar do arquivo..");
        btnCarregarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarArquivoActionPerformed(evt);
            }
        });

        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma op????o" }));
        cmbMetodo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cmbMetodoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cmbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMetodoActionPerformed(evt);
            }
        });

        lblSemOrdem.setText("Elementos a serem ordenados");

        lblOrdenados.setText("Elementos ordenados");

        lbMetodoOrdenacao.setText("M??todo de ordena????o");

        jLabel1.setText("Ordem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSemOrdem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbMetodoOrdenacao))
                                    .addComponent(rbtDecrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnCresente))
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrdenados))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCarregarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblSemOrdem)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOrdenados)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(btnCarregarArquivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbMetodoOrdenacao)
                .addGap(5, 5, 5)
                .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnCresente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtDecrescente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrdenar)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        MetodosOrdenacaoPresente mmop = new MetodosOrdenacaoPresente();
        this.listMetodosOrdenacao = mmop.getListMetodosOrdencao();
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void cmbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMetodoActionPerformed

    }//GEN-LAST:event_cmbMetodoActionPerformed

    private void cmbMetodoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cmbMetodoAncestorAdded
        this.getCmbMetodo().addItem("M??todo BubbleSort");
        this.getCmbMetodo().addItem("M??todo Sort");
    }//GEN-LAST:event_cmbMetodoAncestorAdded

    private void btnCarregarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarArquivoActionPerformed
        BuscarSalariosPresente buscarSalariosPresente = new BuscarSalariosPresente();
        
        this.listaNaoOrdenada = buscarSalariosPresente.busca();
        this.getListSemOrdem().setListData(new Vector<Double>(buscarSalariosPresente.busca()));
        this.getBtnOrdenar().setEnabled(true);
    }//GEN-LAST:event_btnCarregarArquivoActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        MetodosOrdenacaoPresente metodosOrdencaoPresente = new MetodosOrdenacaoPresente();
        this.listMetodosOrdenacao = metodosOrdencaoPresente.getListMetodosOrdencao();
        BuscarSalariosPresente buscarSalariosPresente = new BuscarSalariosPresente();
        
        if (!(String.valueOf(this.getCmbMetodo().getSelectedItem()).equals("Escolha uma op????o")) && !(this.listMetodosOrdenacao.isEmpty()) ) {
            if (this.rbtDecrescente.isSelected() && !this.rbtnCresente.isSelected()) {
                 this.getListOrdenados().setListData(new Vector<Double>(metodosOrdencaoPresente.ordenarDecresente(String.valueOf(this.getCmbMetodo().getSelectedItem()),this.listMetodosOrdenacao ,this.listaNaoOrdenada )));
            } else if (!this.rbtDecrescente.isSelected() && this.rbtnCresente.isSelected()) {
                 this.getListOrdenados().setListData(new Vector<Double>(metodosOrdencaoPresente.ordenarCresente(String.valueOf(this.getCmbMetodo().getSelectedItem()),this.listMetodosOrdenacao ,this.listaNaoOrdenada )));   
            }
        }
        this.listaNaoOrdenada = buscarSalariosPresente.busca();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void rbtnCresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCresenteActionPerformed

    }//GEN-LAST:event_rbtnCresenteActionPerformed

    private void rbtDecrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDecrescenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtDecrescenteActionPerformed

    private void listSemOrdemAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listSemOrdemAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listSemOrdemAncestorAdded

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
            java.util.logging.Logger.getLogger(OrdenacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenacaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarArquivo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JComboBox<String> cmbMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbMetodoOrdenacao;
    private javax.swing.JLabel lblOrdenados;
    private javax.swing.JLabel lblSemOrdem;
    private javax.swing.JList<Double> listOrdenados;
    private javax.swing.JList<Double> listSemOrdem;
    private javax.swing.JRadioButton rbtDecrescente;
    private javax.swing.JRadioButton rbtnCresente;
    // End of variables declaration//GEN-END:variables
}
