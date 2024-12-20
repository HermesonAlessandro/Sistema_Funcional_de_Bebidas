/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import Modelo.Sessao;
import Visao.Tela_inicial_administrador;
import Modelo.Administrador;
import DAO.AdministradorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_ajuste_administrador extends javax.swing.JFrame {//Tela para cuidar dos ajustes do administrador.

    /**
     * Creates new form Tela_ajuste_administrador
     */
    public Tela_ajuste_administrador() {
        initComponents();
        ListarAdministrador();
        setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
    }
    
    public void setSaudacao(String saudacao, String dataHora) {
        jLabel4.setText(saudacao + " - " + dataHora);
    }
    /*
    Quando a tela Tela_ajuste_administrador é instânciada.
    Ela inicializa seus componentes, lista os administradores e define uma saudação que inclui a data e hora do login ativo.
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        setTitle("Tela_ajuste_administrador");
        setMinimumSize(new java.awt.Dimension(682, 653));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Administradores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 20, 350, 64);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Telefone", "Categoria_tel", "Endereço", "Bairro", "Email", "Senha", "Sexo"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 90, 650, 330);

        jLabel2.setText("Para alterar administrador vá para a aba chamada \"Alterar\" em seguida clique em \"Alterar/ADM\"");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 440, 530, 16);

        jLabel3.setText("Para excluir administrador vá para a aba chamada \"Excluir\" em seguida clique em \"Excluir/ADM\"");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 460, 540, 16);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 490, 80, 40);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 570, 670, 16);

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 720, 650);

        jMenu1.setText("Alterar");

        jMenuItem1.setText("Alterar/ADM");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Excluir");

        jMenuItem2.setText("Excluir/ADM");
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
        if(AdministradorSelecionado != null){
            Tela_alterar_administrador taa = new Tela_alterar_administrador(AdministradorSelecionado);
            taa.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, selecione um administrador(a) para alterar!");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /*
    Quando o item de menu é clicado, o código verifica se um administrador está selecionado.
    Se estiver, abre uma nova tela (Tela_alterar_administrador) com o administrador selecionado e fecha a janela atual.
    Se não houver um administrador selecionado, exibe uma mensagem de alerta para o usuário.
    */
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Tela_excluir_administrador tea = new Tela_excluir_administrador();
        tea.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int selectedRow = jTable2.getSelectedRow();
        if(selectedRow != -1){
            int cod = (int) jTable2.getValueAt(selectedRow, 0);
            AdministradorDAO dao = new AdministradorDAO();
            AdministradorSelecionado = dao.BuscarAdministradorPorCod(cod);
            if(AdministradorSelecionado != null){
                JOptionPane.showMessageDialog(null, "Administrador(a) selecionado: "+AdministradorSelecionado.getNome());
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao selecionar o administrador(a)!");
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela_inicial_administrador tia = new Tela_inicial_administrador();
        tia.setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
        tia.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    Este código busca um administrador selecionado em uma tabela (jTable2). Ele obtém o
    código do administrador da linha selecionada, usa esse código para buscar o
    administrador no banco de dados, e exibe uma mensagem com o nome do administrador,
    caso encontrado. Se nenhum administrador for encontrado, exibe uma mensagem de erro.
    */
        private Administrador AdministradorSelecionado;
    private void ListarAdministrador(){
        AdministradorDAO dao = new AdministradorDAO();
        List<Administrador> administradores = dao.ListarAdministrador();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        
        for(Administrador administrador : administradores){
            model.addRow(new Object[]{
                administrador.getCod(),
                administrador.getNome(),
                administrador.getTelefone(),
                administrador.getCategoria_tel(),
                administrador.getEndereco(),
                administrador.getBairro(),
                administrador.getEmail(),
                administrador.getSenha(),
                administrador.getSexo(),
            });
        }
    }
    /*
    O método ListarAdministrador busca uma lista de administradores do banco de dados
    usando AdministradorDAO, limpa a tabela jTable2 e preenche-a com os dados dos
    administradores. Cada administrador é adicionado à tabela como uma nova linha com
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
            java.util.logging.Logger.getLogger(Tela_ajuste_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_ajuste_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_ajuste_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_ajuste_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_ajuste_administrador().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
