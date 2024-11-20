/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import DAO.ClienteDAO;
import Modelo.Cliente;
import Modelo.Sessao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_excluir_cliente extends javax.swing.JFrame {//Tela de exclusão do cliente.

    /**
     * Creates new form Tela_excluir_cliente
     */
    public Tela_excluir_cliente() {
        initComponents();
        setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
        ListarCliente();
        jTable1.getSelectionModel().addListSelectionListener(event ->{
           if(!event.getValueIsAdjusting()){
               int selectedRow = jTable1.getSelectedRow();
               if(selectedRow != -1){
                  CpfSelecionado = (String) jTable1.getValueAt(selectedRow, 0);
               }
           }
        });
    }
    
    public void setSaudacao(String saudacao, String dataHora) {
        jLabel2.setText(saudacao + " - " + dataHora);
    }
    /*
    Quando uma nova instância da tela Tela_excluir_cliente é criada, ela inicializa todos os componentes da interface.
    Define uma saudação com a data e hora do login ativo do usuário.
    Lista todos os clientes na tabela jtable1.
    Adiciona um ouvinte de eventos à tabela para monitorar a seleção de linhas.
    Quando uma linha é selecionada, o valor da primeira coluna da linha selecionada é armazena na variavel cpfSelecionado.
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_excluir_cliente");
        setMinimumSize(new java.awt.Dimension(748, 644));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Excluir Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 296, 64);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cpf", "Nome", "D_nasc", "Sexo", "Endereço", "Telefone", "Email", "Senha", "Fk_rg_sec"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 710, 402);

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 490, 80, 40);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 580, 740, 16);

        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(640, 490, 80, 40);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!CpfSelecionado.equals("-1")){
            int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir um cliente?", "Confirmaçao!", JOptionPane.YES_NO_OPTION);
            if(confirmacao == JOptionPane.YES_NO_OPTION){
                try{
                    ClienteDAO dao = new ClienteDAO();
                    dao.ExcluirCliente(CpfSelecionado);
                    JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
                    if(Sessao.getCpfUsuarioCli().equals(CpfSelecionado)){
                        JOptionPane.showMessageDialog(null, "Voce se autoexcluiu e sera redirecionado para a tela de login!");
                        Sessao.LimparSessao();
                        Tela_login tl = new Tela_login();
                        tl.setVisible(true);
                        dispose();
                        return;
                    }
                    ListarCliente();
                    List<Cliente> clientes = dao.ListarCliente();
                    if(clientes.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum cliente restante, voce sera deslogado!");
                        Tela_login tl = new Tela_login();
                        tl.setVisible(true);
                        dispose();
                    }
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Erro ao excluir um cliente: " + e.getMessage());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Tela_ajuste_cliente tac = new Tela_ajuste_cliente();
        tac.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    /*
    O método verifica sem um cliente foi selecionado.
    Solicita confirmação do usuário para a exclusão.
    Tenta excluir o cliente e atualiza a lista de clientes.
    Se o cliente excluído for usuário atualmente logado.
    Limpa a sessão e redireciona para a tela de login.
    O método trata possíveis erros e fornece feedback ao usuário em cada etapa do processo.
    */
    
    private void ListarCliente(){
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.ListarCliente();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        for(Cliente cliente : clientes){
            model.addRow(new Object[]{
                cliente.getCpf(),
                cliente.getNome(),
                cliente.getD_nasc(),
                cliente.getSexo(),
                cliente.getEndereco(),
                cliente.getTelefone(),
                cliente.getEmail(),
                cliente.getSenha(),
                cliente.getFk_rg_sec(),
            });
        }
    }
    /*
    O método ListarCliente é utilizado para preencher a tabela jTable1 com os dados de todos os clientes.
    Ele obtém a lista de clientes do banco de dados.
    Limpa a tabela.
    Adiciona uma nova linha para cada cliente na lista.
    A variavel CpfSelecionado é usada para armazenar o cpf do cliente atualmente selecionado na tabela.
    */
    private String CpfSelecionado = "-1";//Variável de instância.
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
            java.util.logging.Logger.getLogger(Tela_excluir_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_excluir_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_excluir_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_excluir_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_excluir_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
