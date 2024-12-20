/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import DAO.BebidaDAO;
import DAO.ConexaoDAO;
import Modelo.Bebida;
import Modelo.Cliente;
import Modelo.Sessao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Tela_comprar_bebida extends javax.swing.JFrame {//Tela da comprar da bebida.

    /**
     * Creates new form Tela_comprar_bebida
     */
    public Tela_comprar_bebida() {
        initComponents();
        ListarBebida();
        setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
    }
    
    public void setSaudacao(String saudacao, String dataHora) {
        jLabel2.setText(saudacao + " - " + dataHora);
    }
    /*
    Quando uma nova instância da Tela_comprar_bebida é criada ela inicializar todos os componentes da interface.
    Lista todas as bebidas disponiveis e define uma mensagem de saudação que inclui a data e hora do login ativo do usuário.
    O método setSaudacao é usado para formatar e definir essa mensagem no componente jlabel2.
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
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_comprar_bebida");
        setMinimumSize(new java.awt.Dimension(752, 683));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Comprar Bebida");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 343, 64);

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
        jScrollPane1.setBounds(10, 90, 720, 402);

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 520, 100, 50);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 520, 100, 50);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 620, 750, 16);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 770, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow != -1){
            int cod = (int) jTable1.getValueAt(selectedRow, 0);
            BebidaDAO dao = new BebidaDAO();
            BebidaSelecionada = dao.BuscarBebidaPorCod(cod);
            if(BebidaSelecionada != null){
                if(BebidaSelecionada.getQ_estoque() > 0){
                    JOptionPane.showMessageDialog(null, "Bebida selecionada: "+BebidaSelecionada.getDescricao());
                }else{
                    JOptionPane.showMessageDialog(null, "Esta bebida está esgotada e não pode ser selecionada!");
                    BebidaSelecionada = null;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao selecionar uma bebida!");
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(BebidaSelecionada != null){
            try{
                Connection conn = ConexaoDAO.getConnection();
                String sql = "SELECT cpf, nome, endereco, telefone, email FROM cliente WHERE cpf = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, Sessao.getCpfUsuarioCli());
                ResultSet rs = pstmt.executeQuery();

                Cliente pegardadoscliente = new Cliente();
                if(rs.next()){
                    pegardadoscliente.setCpf(rs.getString("cpf"));
                    pegardadoscliente.setNome(rs.getString("nome"));
                    pegardadoscliente.setEndereco(rs.getString("endereco"));
                    pegardadoscliente.setTelefone(rs.getLong("telefone"));
                    pegardadoscliente.setEmail(rs.getString("email"));
                }
                Tela_confirmacao_pedido tcp = new Tela_confirmacao_pedido(pegardadoscliente, BebidaSelecionada);
                tcp.setVisible(true);
                dispose();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do cliente: " +e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma bebida selecionada!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tela_inicial_cliente tic = new Tela_inicial_cliente();
        tic.setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
        tic.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    O método jButton1ActionPerformed verifica se uma bebida foi selecionada e, em
    seguida, busca os dados do cliente correspondente no banco de dados. Se os dados
    forem encontrados, cria uma nova tela de confirmação de pedido com as informações do
    cliente e da bebida selecionada. Caso contrário, exibe uma mensagem de erro. Este
    método garante que todas as informações necessárias estejam disponíveis antes de
    avançar para a confirmação do pedido.
    */
        /*
    Este código busca uma bebida selecionada em uma tabela (jTable1). Ele obtém o
    código da bebida da linha selecionada, usa esse código para buscar o
    bebida no banco de dados, e exibe uma mensagem com o nome da bebida,
    caso encontrado. Se nenhuma bebida for encontrada, exibe uma mensagem de erro.
    */
    
    private Bebida BebidaSelecionada;
    private void ListarBebida(){
        BebidaDAO dao = new BebidaDAO();
        List<Bebida> bebidas = dao.ListarBebidaCli();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00", symbols);
        //Capturar e formatar um valor monetário, removendo o símbolo de moeda e ajustando o formato de decimal.
        //Criar um formatador numérico que segue as convenções dos Estados Unidos, permitindo manipulação e conversão consistentes de números.
        
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
    O método ListarBebida busca uma lista de bebias do banco de dados
    usando BebidaDAO, limpa a tabela jTable1 e preenche-a com os dados das
    bebidas. Cada secretaria é adicionada à tabela como uma nova linha com
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
            java.util.logging.Logger.getLogger(Tela_comprar_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_comprar_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_comprar_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_comprar_bebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_comprar_bebida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
