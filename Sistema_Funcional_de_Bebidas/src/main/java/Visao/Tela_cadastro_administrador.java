/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import DAO.AdministradorDAO;
import Modelo.Administrador;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_cadastro_administrador extends javax.swing.JFrame {//Tela de Cadastro do administrador.

    /**
     * Creates new form Tela_cadastro_administrador
     */
    public Tela_cadastro_administrador() {
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
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_cadastro_administrador");
        setMinimumSize(new java.awt.Dimension(760, 630));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Cadastrar Administrador(a)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 570, 64);

        jLabel2.setText("Cod");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 110, 30, 16);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 110, 440, 22);

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 150, 33, 16);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 150, 430, 22);

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 190, 60, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 190, 410, 22);

        jLabel5.setText("Categoria_tel");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 230, 80, 16);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefone Residencial ", "Celular" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(230, 230, 150, 22);

        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 270, 60, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(210, 270, 410, 22);

        jLabel7.setText("Bairro");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 310, 40, 16);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(190, 310, 430, 22);

        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 350, 40, 16);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(190, 350, 430, 22);

        jLabel9.setText("Senha");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 390, 40, 16);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(190, 390, 430, 22);

        jLabel10.setText("Sexo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(150, 430, 30, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "Outros" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(190, 430, 72, 22);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 500, 90, 40);

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 500, 80, 40);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 500, 80, 40);

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 780, 640);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()
            || jComboBox2.getSelectedItem() == null
            || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty()
            || jTextField7.getText().isEmpty() || jPasswordField1.getPassword().length == 0
            ||jComboBox1.getSelectedItem()== null){
            JOptionPane.showMessageDialog(null, "Campos vazios, por favor preencher todos os campos!");
        }else{
            try{
                String telefone = jTextField3.getText();
                if(!telefone.matches("\\d+")){
                    throw new NumberFormatException("Numero deve conter apenas digitos!");
                }//Faz a verificação para ver se tem apenas dígitos.
                if(telefone.length() != 11){
                    throw new IllegalArgumentException("Numero deve conter exatamente 11 dígitos");
                }//Faz a verificação para ver se tem apenas 11 dígitos.
                Administrador administrador = new Administrador();
                administrador.setNome(jTextField2.getText());
                administrador.setTelefone(Long.parseLong(telefone));
                administrador.setCategoria_tel(jComboBox2.getSelectedItem().toString());
                administrador.setEndereco(jTextField5.getText());
                administrador.setBairro(jTextField6.getText());
                administrador.setEmail(jTextField7.getText());
                administrador.setSenha(new String(jPasswordField1.getPassword()));
                administrador.setSexo(jComboBox1.getSelectedItem().toString());

                AdministradorDAO dao = new AdministradorDAO();
                dao.CadastrarAdministrador(administrador);
                JOptionPane.showMessageDialog(null, "Administrador(a) cadastrado com sucesso!");
                Tela_login tl = new Tela_login();
                tl.setVisible(true);
                dispose();
            }catch(NumberFormatException e ){
                JOptionPane.showMessageDialog(null, "Erro de formataçao: " +e.getMessage());
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o administrador(a): " +e.getMessage());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro inesperado: " +e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tela_login tl = new Tela_login();
        tl.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    /*
    Esse método verifica se todos os componentes obrigatórios estão preenchidos.
    Valida os dados do administrador.
    Cria um novo objeto Administrador.
    Salva no banco de dados.
    Fornece feedback ao usuario.
    Se ocorrerem erros durante o processo, as exceções são tratadas adequadamente.
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
            java.util.logging.Logger.getLogger(Tela_cadastro_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_cadastro_administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
