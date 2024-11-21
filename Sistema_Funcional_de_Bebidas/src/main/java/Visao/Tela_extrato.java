/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import DAO.CaixaDAO;
import DAO.ConexaoDAO;
import DAO.ExtratoDAO;
import DAO.PedidoDAO;
import Modelo.Extrato;
import Modelo.Sessao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_extrato extends javax.swing.JFrame {//Tela de extrato.
private int pedidoId;

    /**
     * Creates new form Tela_extrato
     */
    public Tela_extrato() {
        initComponents(); 
    }
    
    public Tela_extrato(int pedidoId){
        initComponents();
        this.pedidoId = pedidoId;
        BuscarDadosdoPedidoeBebida(pedidoId);
        setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
    }
    
    public void setSaudacao(String saudacao, String dataHora) {
        jLabel36.setText(saudacao + " - " + dataHora);
    }
    /*
    Quando uma nova instância da tela Tela_extrato é criada ela inicializa todos os componentes da interface.
    Armazena o pedidoId.
    Busca e carrega os dados do pedido e da bebida.
    Define uma mensagem de saudação com a data e hora do login ativo do usuário.
    O método setSaudacao é utilizado para formatar e definir essa mensagem no componente jLabel36.
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_extrato");
        setMinimumSize(new java.awt.Dimension(845, 554));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Extrado do Pedido");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 390, 64);

        jLabel2.setText("Id do pedido");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 110, 80, 16);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 110, 250, 16);

        jLabel14.setText("Descrição da bebida");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(450, 110, 120, 16);

        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 110, 240, 16);

        jLabel4.setText("Cpf do cliente");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 140, 90, 16);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 140, 210, 16);

        jLabel16.setText("Codigo de barras da bebida");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(450, 140, 160, 16);

        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(620, 140, 180, 16);

        jLabel6.setText("Nome do cliente");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 170, 100, 16);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 170, 210, 16);

        jLabel18.setText("Marca da bebida");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(450, 170, 100, 16);

        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(550, 170, 240, 16);

        jLabel8.setText("Endereço do cliente");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 200, 120, 16);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 200, 220, 16);

        jLabel20.setText("Grupo de mercadoria da bebida");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(450, 200, 180, 16);

        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(640, 200, 170, 16);

        jLabel10.setText("Telefone do cliente");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 230, 120, 16);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 230, 200, 16);

        jLabel22.setText("Tipo da bebida");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(450, 230, 90, 16);

        jLabel23.setText("jLabel23");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(540, 230, 240, 16);

        jLabel12.setText("Email do cliente");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 260, 100, 20);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(200, 260, 200, 20);

        jLabel28.setText("Valor unitario");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(450, 260, 90, 16);

        jLabel29.setText("jLabel29");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(530, 260, 220, 16);

        jLabel26.setText("Quantidade adquirida");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(100, 290, 130, 16);

        jLabel27.setText("jLabel27");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(230, 290, 180, 16);

        jLabel32.setText("Cod da bebida");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(450, 290, 90, 16);

        jLabel33.setText("jLabel33");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(540, 290, 240, 16);

        jLabel30.setText("Valor total");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(100, 320, 70, 16);

        jLabel31.setText("jLabel31");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(170, 320, 240, 16);

        jLabel34.setText("Status do pagamento");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(450, 320, 130, 16);

        jLabel35.setText("jLabel35");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(580, 320, 220, 16);

        jButton1.setText("Salvar/Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 380, 130, 50);

        jButton2.setText("Voltar Para a Tela Inicial do Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 380, 240, 50);

        jLabel36.setText("jLabel36");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(10, 490, 840, 16);

        jLabel25.setIcon(new javax.swing.ImageIcon("D:\\Sistema_Funcional_de_Bebidas\\Sistema_Funcional_de_Bebidas\\Sistema_Funcional_de_Bebidas\\src\\main\\java\\Imagem\\Fundo Extrato 900-600.png")); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 0, 860, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Extrato extrato = new Extrato();
            extrato.setExt_id_pedido(Integer.parseInt(jLabel3.getText()));//Converte um String para um valor númerico.
            extrato.setExt_fk_cpf_cliente(jLabel5.getText());
            extrato.setExt_nome_cliente(jLabel7.getText());
            extrato.setExt_endereco_cliente(jLabel9.getText());
            extrato.setExt_telefone_cliente(Long.parseLong(jLabel11.getText()));//Converte um String para um valor tipo long.
            extrato.setExt_email_cliente(jLabel13.getText());
            extrato.setExt_descricao_bebida(jLabel15.getText());
            extrato.setExt_cod_de_barras_bebida(jLabel17.getText());
            extrato.setExt_marca_bebida(jLabel19.getText());
            extrato.setExt_gp_mercadoria_bebida(jLabel21.getText());
            extrato.setExt_t_do_item_bebida(jLabel23.getText());
            extrato.setExt_q_adquirida_do_pedido(Integer.parseInt(jLabel27.getText()));//Converte um String para um valor tipo númerico.
            extrato.setExt_v_unitario_bebida(Double.parseDouble(jLabel29.getText().replace(",", ".")));
            extrato.setExt_v_total_pedido(Double.parseDouble(jLabel31.getText().replace(",", ".")));
            /*
            Obtêm o texto dos labels jLabel29 e jLabel31.
            Substituem as vírgulas por pontos nos textos obtidos.
            Convertem os textos formatados em valores Double.
            Definem esses valores nos atributos Ext_v_unitario_bebida e Ext_v_total_pedido do objeto extrato.
            */
            extrato.setExt_fk_cod_bebida(Integer.parseInt(jLabel33.getText()));
            extrato.setExt_status_pagamento(jLabel35.getText());

            ExtratoDAO dao = new ExtratoDAO();
            CaixaDAO dao1 = new CaixaDAO();
            PedidoDAO dao2 = new PedidoDAO();

            dao.CadastrarExtrato(extrato);

            if(extrato.getExt_status_pagamento().equalsIgnoreCase("Não pago")){
                dao1.ExcluirCaixa(extrato.getExt_id_pedido());
                dao2.ExcluirPedido(extrato.getExt_id_pedido());
                JOptionPane.showMessageDialog(null, "Extrato cadastrado, mas pagamento não realizado. Dados deletados do caixa e do pedido!");
                Tela_encerramento te = new Tela_encerramento();
                te.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Extrato cadastrado com sucesso!");
                Tela_encerramento te = new Tela_encerramento();
                te.setVisible(true);
                dispose();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o extrato: "+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tela_inicial_cliente tic = new Tela_inicial_cliente();
        tic.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void BuscarDadosdoPedidoeBebida(int PedidoId){
        try{
            Connection conn = ConexaoDAO.getConnection();
            String sql = "SELECT p.*, b.*, c.pagamento " +
                         "FROM pedido p " +
                         "JOIN bebida b ON p.fk_cod_bebida = b.cod " +
                         "JOIN caixa c ON p.id = c.id_pedido " +
                         "WHERE p.id = ?";
            /*
            Seleciona todas as colunas das tabelas pedido (p) e bebida (b), além da coluna pagamento da tabela caixa (c).
            Realiza junções entre as tabelas pedido, bebida e caixa com base em suas chaves estrangeiras e relações.
            Filtra os resultados para retornar apenas os dados relativos a um pedido específico.
            */
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, pedidoId);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                jLabel3.setText(rs.getString("id"));
                jLabel5.setText(rs.getString("fk_cpf_cliente"));
                jLabel7.setText(rs.getString("nome_cliente"));
                jLabel9.setText(rs.getString("endereco_cliente"));
                jLabel11.setText(String.valueOf(rs.getLong("telefone_cliente")));//Converte de um long para uma String.
                jLabel13.setText(rs.getString("email_cliente"));
                jLabel27.setText(String.valueOf(rs.getInt("q_adquirida_do_pedido")));//Converte de inteiro para uma String.
                jLabel31.setText(String.format("%.2f", rs.getDouble("v_total_pedido")));
                /*
                Obtém o valor da coluna "v_total_pedido" do ResultSet como um double.
                Formata o valor para uma string com duas casas decimais.
                Atualiza o texto do label jLabel31 para exibir o valor formatado.
                */
                
                jLabel35.setText(rs.getString("pagamento"));
                
                jLabel15.setText(rs.getString("descricao_bebida"));
                jLabel17.setText(rs.getString("cod_de_barras"));
                jLabel19.setText(rs.getString("marca"));
                jLabel21.setText(rs.getString("gp_mercadoria"));
                jLabel23.setText(rs.getString("t_do_item"));
                jLabel29.setText(String.format("%.2f", rs.getDouble("v_unitario")));
                /*
                Obtém o valor da coluna "v_total_pedido" do ResultSet como um double.
                Formata o valor para uma string com duas casas decimais.
                Atualiza o texto do label jLabel29 para exibir o valor formatado.
                */
                jLabel33.setText(rs.getString("cod"));
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum dado encontrado para o pedido e bebida especificados!");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do pedido e bebida: " + e.getMessage());
        }
    }
    /*
    O método jButton1ActionPerformed cria um extrato de pedido, verifica o status do
    pagamento e, dependendo do status, exclui os dados correspondentes do caixa e do
    pedido, ou exibe uma mensagem de sucesso.
    
    O método BuscarDadosdoPedidoeBebida busca dados de um pedido específico e da
    bebida correspondente, preenchendo labels com as informações obtidas do banco de
    dados.
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
            java.util.logging.Logger.getLogger(Tela_extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_extrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
