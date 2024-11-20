/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import DAO.BebidaDAO;
import Modelo.Bebida;
import Modelo.Sessao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_ajuste_bebida extends javax.swing.JFrame {//Tela para cuidar dos ajustes das bebidas.

    /**
     * Creates new form Tela_ajuste_bebida
     */
    public Tela_ajuste_bebida() {
        initComponents();
        ListarBebida();
        setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
    }
    
    public void setSaudacao(String saudacao, String dataHora) {
        jLabel4.setText(saudacao + " - " + dataHora);
    }
    /*
    Quando a tela Tela_ajuste_bebida é instânciada.
    Ela inicializa seus componentes, lista as bebidas e define uma saudação que inclui a data e hora do login ativo.
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_ajuste_bebida");
        setMinimumSize(new java.awt.Dimension(766, 697));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Bebidas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 20, 165, 64);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Cod_de_barras", "Descriçao", "Marca", "Gp_mercadoria", "T_de_item", "Q_estoque", "V_unitario"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 730, 402);

        jLabel2.setText("Para alterar bebida vá para a aba chamada \"Alterar\" em seguida clique em \"Alterar/BEB\"");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 520, 500, 16);

        jLabel3.setText("Para excluir bebida vá para a aba chamada \"Excluir\" em seguida clique em \"Excluir/BEB\"");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 540, 510, 16);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 570, 80, 40);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 610, 750, 16);

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 790, 700);

        jMenu1.setText("Alterar");

        jMenuItem1.setText("Alterar/BEB");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Excluir");

        jMenuItem2.setText("Excluir/BEB");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(BebidaSelecionada != null){
            Tela_alterar_bebida tab = new Tela_alterar_bebida(BebidaSelecionada);
            tab.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma bebida para alterar!");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /*
    Quando o item de menu é clicado, o código verifica se uma bebida está selecionada.
    Se estiver, abre uma nova tela (Tela_alterar_bebida) com o bebida selecionada e fecha a janela atual.
    Se não houver uma bebida selecionado, exibe uma mensagem de alerta para o usuário.
    */
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Tela_excluir_bebida teb = new Tela_excluir_bebida();
        teb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow != -1){
            int cod = (int) jTable1.getValueAt(selectedRow, 0);
            BebidaDAO dao = new BebidaDAO();
            BebidaSelecionada = dao.BuscarBebidaPorCod(cod);
            if(BebidaSelecionada != null){
                JOptionPane.showMessageDialog(null, "Bebida selecionada: "+BebidaSelecionada.getDescricao());
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao selecionar uma bebida!");
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela_inicial_secretaria tis = new Tela_inicial_secretaria();
        tis.setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
        tis.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    Este código busca uma bebida selecionada em uma tabela (jTable1). Ele obtém o
    código da bebida da linha selecionada, usa esse código para buscar o
    bebida no banco de dados, e exibe uma mensagem com o nome da bebida,
    caso encontrado. Se nenhuma bebida for encontrado, exibe uma mensagem de erro.
    */
    
    private Bebida BebidaSelecionada;
    private void ListarBebida(){
        BebidaDAO dao = new BebidaDAO();
        List<Bebida> bebidas = dao.ListarBebidaSec();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00", symbols);
        
        for(Bebida bebida : bebidas){
            model.addRow(new Object[]{
                bebida.getCod(),
                bebida.getCod_de_barras(),
                bebida.getDescricao(),
                bebida.getMarca(),
                bebida.getGp_mercadoria(),
                bebida.getT_do_item(),
                bebida.getQ_estoque(),
                df.format(bebida.getV_unitario()),
            });
        }
    }
    /*
    O método ListarBebida busca uma lista de bebida do banco de dados
    usando BebidaDAO, limpa a tabela jTable1 e preenche-a com os dados das
    bebidas. Cada bebida é adicionada à tabela como uma nova linha com
    suas informações.
    */
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_ajuste_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_ajuste_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_ajuste_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_ajuste_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_ajuste_bebida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
