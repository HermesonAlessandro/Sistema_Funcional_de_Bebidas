/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import DTO.AdministradorDTO;
import DTO.AdministradorDTO;
import DTO.ClienteDTO;
import DTO.SecretariaDTO;
import Modelo.Administrador;
import Modelo.Cliente;
import Modelo.Secretaria;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Saudacao;
import Modelo.Sessao;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_login extends javax.swing.JFrame { //Tela de login de todo sistema.

    /**
     * Creates new form Tela_login
     */
    public Tela_login() {
        initComponents();
    }

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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_login");
        setMinimumSize(new java.awt.Dimension(834, 608));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Tela de Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 90, 283, 64);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Email:\n");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 200, 50, 25);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 200, 420, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Senha:\n");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 250, 60, 25);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(220, 250, 420, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador(a)", "Secretaria(o)", "Cliente" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(340, 320, 124, 22);

        jButton1.setText("Entrar\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 400, 72, 30);

        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(290, 400, 90, 30);

        jLabel4.setText("Ainda não tem cadastro?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 440, 140, 16);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 400, 72, 30);

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(450, 400, 72, 30);

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 50, 700, 470);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Sistema_Funcional_de_Bebidas\\Sistema_Funcional_de_Bebidas\\Sistema_Funcional_de_Bebidas\\src\\main\\java\\Imagem\\Fundo Login 851-633.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 920, 630);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String email = jTextField1.getText();
        String senha = new String(jPasswordField1.getPassword());
        String tipoUsuario = (String) jComboBox1.getSelectedItem();

        if(email.isEmpty() || senha.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vazios, preencha todos os campos!");
        }else{
            try{
                AdministradorDTO admindto = new AdministradorDTO();
                SecretariaDTO secdto = new SecretariaDTO();
                ClienteDTO clidto = new ClienteDTO();

                Administrador administrador = admindto.VerificarAdministrador(email, senha);
                Secretaria secretaria = secdto.VerificarSecretaria(email, senha);
                Cliente cliente = clidto.VerificarCliente(email, senha);

                if(administrador != null && "Administrador(a)".equals(tipoUsuario)){
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido, bem-vindo administrador(a)!");
                    String cumprimento = Saudacao.getCumprimento(administrador.getNome());
                    String dataHora = Saudacao.getDataHoraAtual();
                    Sessao.setNomeUsuario(administrador.getNome());
                    Sessao.setCodUsuarioAdm(administrador.getCod());
                    Sessao.setCumprimento(cumprimento);
                    Sessao.setDataHoraEntrada(dataHora);
                    Sessao.setTipoUsuario("Administrador(a)");
                    Tela_inicial_administrador tia = new Tela_inicial_administrador();
                    tia.setSaudacao(cumprimento, dataHora);
                    tia.setVisible(true);
                    dispose();
                }else if(secretaria != null && "Secretaria(o)".equals(tipoUsuario)){
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido, bem-vinda secretaria(o)!");
                    String cumprimento = Saudacao.getCumprimento(secretaria.getNome());
                    String dataHora = Saudacao.getDataHoraAtual();
                    Sessao.setNomeUsuario(secretaria.getNome());
                    Sessao.setRgUsuarioSec(secretaria.getRg());
                    Sessao.setDataHoraEntrada(cumprimento);
                    Sessao.setDataHoraEntrada(dataHora);
                    Sessao.setTipoUsuario("Secretaria(o)");
                    Tela_inicial_secretaria tis = new Tela_inicial_secretaria();
                    tis.setSaudacao(cumprimento, dataHora);
                    tis.setVisible(true);
                    dispose();
                }else if(cliente != null && "Cliente".equals(tipoUsuario)){
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido, bem-vindo cliente!");
                    String cumprimento = Saudacao.getCumprimento(cliente.getNome());
                    String dataHora = Saudacao.getDataHoraAtual();
                    Sessao.setNomeUsuario(cliente.getNome());
                    Sessao.setCpfUsuarioCli(cliente.getCpf());
                    Sessao.setDataHoraEntrada(cumprimento);
                    Sessao.setDataHoraEntrada(dataHora);
                    Sessao.setTipoUsuario("Cliente");
                    Tela_inicial_cliente tic = new Tela_inicial_cliente();
                    tic.setSaudacao(cumprimento, dataHora);
                    tic.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Email, senha ou usuario selecionado incorretamente!");
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro na solicitaçao de login: " +e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tela_cadastro_administrador tca = new Tela_cadastro_administrador();
        tca.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Tela_apresentacao ta = new Tela_apresentacao();
        ta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    /*
    Validação de Campos: Verifica se os campos de email e senha estão preenchidos.
    Verificação do Tipo de Usuário: Dependendo do tipo de usuário selecionado
    (Administrador, Secretaria, Cliente), verifica as credenciais correspondentes e, se
    bem-sucedido, inicia a sessão e exibe a tela inicial apropriada.
    Manejo de Sessão: Armazena informações relevantes na sessão (Sessao) e atualiza
    a saudação e hora de entrada.
    Feedback ao Usuário: Exibe mensagens de sucesso ou erro conforme necessário.
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
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
