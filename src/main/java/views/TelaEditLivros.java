/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import controllers.UserController;

/**  
 *
 * @author USER
 */
public class TelaEditLivros extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditLivros
     */

    public TelaEditLivros() {
        super("Tela dos Livros");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab_info = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        label_pesqLivro = new javax.swing.JLabel();
        label_buscaNome = new javax.swing.JLabel();
        txt_buscarNome = new javax.swing.JTextField();
        btn_pesquisarNome = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_info2 = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        itemBiblioteca = new javax.swing.JMenu();
        menuLivro_ver = new javax.swing.JMenuItem();
        menuLivro_Pesquisar = new javax.swing.JMenuItem();
        menuLivro_Cadastro = new javax.swing.JMenuItem();
        itemClientes = new javax.swing.JMenu();
        menuCliente_Pesquisar = new javax.swing.JMenuItem();
        menuCliente_Cadastro = new javax.swing.JMenuItem();
        itemAvaliacao = new javax.swing.JMenu();
        menuAvalia_Fazer = new javax.swing.JMenuItem();

        tab_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Usuario", "Senha"
            }
        ));
        jScrollPane1.setViewportView(tab_info);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        label_pesqLivro.setText("Pesquisar nome do Livro: ");

        label_buscaNome.setText("Nome: ");

        btn_pesquisarNome.setText("Pesquisar");
        btn_pesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarNomeActionPerformed(evt);
            }
        });

        tab_info2 = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int colindex){
                return false;
            }
        };
        tab_info2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sinopse", "Gênero", "Capa", "Arquivo do Livro"
            }
        ));
        tab_info2.setFocusable(false);
        tab_info2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tab_info2);
        if (tab_info2.getColumnModel().getColumnCount() > 0) {
            tab_info2.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        itemBiblioteca.setText("Biblioteca");
        itemBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBibliotecaActionPerformed(evt);
            }
        });

        menuLivro_ver.setText("Ver Livros");
        menuLivro_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivro_verActionPerformed(evt);
            }
        });
        itemBiblioteca.add(menuLivro_ver);

        menuLivro_Pesquisar.setText("Pesquisar Livros");
        menuLivro_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivro_PesquisarActionPerformed(evt);
            }
        });
        itemBiblioteca.add(menuLivro_Pesquisar);

        menuLivro_Cadastro.setText("Cadastrar Livros");
        menuLivro_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivro_CadastroActionPerformed(evt);
            }
        });
        itemBiblioteca.add(menuLivro_Cadastro);

        menu.add(itemBiblioteca);

        itemClientes.setText("Clientes");

        menuCliente_Pesquisar.setText("Pesquisar Cliente");
        menuCliente_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliente_PesquisarActionPerformed(evt);
            }
        });
        itemClientes.add(menuCliente_Pesquisar);

        if (UserController.verificacaoUsuarioAdmin(views.TelaLogin.passarUser())) {
            menuCliente_Cadastro.setText("Cadastrar Cliente");
            menuCliente_Cadastro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuCliente_CadastroActionPerformed(evt);
                }
            });
            itemClientes.add(menuCliente_Cadastro);
        }
        
        menu.add(itemClientes);

        itemAvaliacao.setText("Avaliações");

        menuAvalia_Fazer.setText("Fazer Avaliação");
        menuAvalia_Fazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAvalia_FazerActionPerformed(evt);
            }
        });
        itemAvaliacao.add(menuAvalia_Fazer);

        menu.add(itemAvaliacao);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(label_pesqLivro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_buscaNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_pesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_pesqLivro)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisarNome)
                    .addComponent(label_buscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarNomeActionPerformed
        String pegarNome = txt_buscarNome.getText();
                 
        DefaultTableModel tb = (DefaultTableModel)tab_info2.getModel();
        tb.addRow(
            new Object[]{
                78, "null", "null", 4, "null", "48"
        });

        tab_info2.validate();
    }//GEN-LAST:event_btn_pesquisarNomeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((DefaultTableModel) tab_info2.getModel()).setRowCount(0);
    }//GEN-LAST:event_formWindowOpened

    private void menuLivro_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivro_verActionPerformed
        // TODO add your handling code here:
        var TelaBiblioteca = new TelaBiblioteca();
        TelaBiblioteca.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuLivro_verActionPerformed

    private void menuLivro_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivro_PesquisarActionPerformed
        var TelaEditLivros = new TelaEditLivros();
        TelaEditLivros.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuLivro_PesquisarActionPerformed

    private void menuLivro_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivro_CadastroActionPerformed
        var TelaCadastroLivro = new TelaCadastroLivro();
        TelaCadastroLivro.setVisible(true);
    }//GEN-LAST:event_menuLivro_CadastroActionPerformed

    private void itemBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBibliotecaActionPerformed

    }//GEN-LAST:event_itemBibliotecaActionPerformed

    private void menuCliente_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliente_PesquisarActionPerformed
        var TelaEditClient = new TelaEditClient();
        TelaEditClient.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuCliente_PesquisarActionPerformed

    private void menuCliente_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliente_CadastroActionPerformed
        var TelaCadastroClient = new TelaCadastroClient();
        TelaCadastroClient.setVisible(true);
    }//GEN-LAST:event_menuCliente_CadastroActionPerformed

    private void menuAvalia_FazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAvalia_FazerActionPerformed
        var TelaAvaliacao = new TelaAvaliacao();
        TelaAvaliacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAvalia_FazerActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesquisarNome;
    private javax.swing.JMenu itemAvaliacao;
    private javax.swing.JMenu itemBiblioteca;
    private javax.swing.JMenu itemClientes;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_buscaNome;
    private javax.swing.JLabel label_pesqLivro;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuAvalia_Fazer;
    private javax.swing.JMenuItem menuCliente_Cadastro;
    private javax.swing.JMenuItem menuCliente_Pesquisar;
    private javax.swing.JMenuItem menuLivro_Cadastro;
    private javax.swing.JMenuItem menuLivro_Pesquisar;
    private javax.swing.JMenuItem menuLivro_ver;
    private javax.swing.JTable tab_info;
    private javax.swing.JTable tab_info2;
    private javax.swing.JTextField txt_buscarNome;
    // End of variables declaration//GEN-END:variables
}
