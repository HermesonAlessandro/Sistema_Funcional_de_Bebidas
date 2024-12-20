/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import Modelo.Administrador;
import DAO.AdministradorDAO;
import Modelo.Sessao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_alterar_administrador extends javax.swing.JFrame {//Atualiza, carrega e limpa os Campos.
private Administrador administrador;

    /**
     * Creates new form Tela_alterar_administrador
     */
    public Tela_alterar_administrador() {
        initComponents();
    }
    
    public Tela_alterar_administrador(Administrador administrador){
        initComponents();
        this.administrador = administrador;
        PreencherCampos();
        setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
    }
    
    public void setSaudacao(String saudacao, String dataHora) {
        jLabel2.setText(saudacao + " - " + dataHora);
    }
    /*
    Tela_alterar_administrador é instânciada.
    Ela inicializa seus componentes, armazena o administrador passado como parametro.
    Preenche os campos da interface com as informações desse administrador.
    Define uma saudação que inclui a data e hora do login ativo.
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_alterar_administrador");
        setMinimumSize(new java.awt.Dimension(679, 621));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Alterar Administrador(a)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 520, 64);

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 110, 33, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 110, 380, 22);

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 150, 60, 16);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 150, 360, 20);

        jLabel5.setText("Categoria_tel");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 190, 80, 16);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefone Residencial ", "Celular" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(210, 190, 160, 22);

        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 230, 60, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(190, 230, 360, 22);

        jLabel7.setText("Bairro");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 270, 40, 16);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(170, 270, 380, 22);

        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 310, 40, 16);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(170, 310, 380, 22);

        jLabel9.setText("Senha");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 350, 50, 16);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 350, 380, 22);

        jLabel10.setText("Sexo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 390, 40, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "Outros" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 390, 72, 22);

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 450, 72, 40);

        jButton3.setText("Limpar Campos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 450, 140, 40);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(490, 450, 72, 40);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 560, 670, 16);

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 690, 640);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()
            || jComboBox2 == null || jTextField5.getText().isEmpty()
            || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty()
            || jPasswordField1.getPassword().length == 0 || jComboBox1 == null){
            JOptionPane.showMessageDialog(null, "Campos vazios, por favor preencher todos os campos!");
        }else{
            try{
                String telefone = jTextField3.getText();
                if(!telefone.matches("\\d+")){//Usa o método matches da classe String para verificar se o texto corresponde à expressão regular "\\d+".
                    throw new NumberFormatException("Numero deve conter apenas digitos!");
                }//Garante que o valor do campo de texto jTextField3 contenha apenas dígitos.
                administrador.setNome(jTextField2.getText());
                administrador.setTelefone(Long.parseLong(telefone));
                administrador.setCategoria_tel((String)jComboBox2.getSelectedItem());
                administrador.setEndereco(jTextField5.getText());
                administrador.setBairro(jTextField6.getText());
                administrador.setEmail(jTextField7.getText());
                administrador.setSenha(new String(jPasswordField1.getPassword()));
                administrador.setSexo((String)jComboBox1.getSelectedItem());

                AdministradorDAO dao = new AdministradorDAO();
                dao.AlterarAdministrador(administrador);
                JOptionPane.showMessageDialog(null, "Administrador(a) atualizado com sucesso!");
                Tela_ajuste_administrador taa = new Tela_ajuste_administrador();
                taa.setVisible(true);
                dispose();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de formataçao: " +e.getMessage());
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao atualizar o administrador(a): " +e.getMessage());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro inesperado: " +e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox2.setSelectedItem(0);
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jPasswordField1.setText("");
        jComboBox1.setSelectedItem(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tela_ajuste_administrador taa = new Tela_ajuste_administrador();
        taa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    /*
    O método jButton2ActionPerformed valida os campos da interface.
    Atualiza os dados do administrador, e trata possíveis erros durante o processo.
    Fornecendo feedback ao usuário. Caso tudo ocorra bem, a tela atual é fechada e a tela de ajustes do administrador é aberta.
    */
       /*
    Esse metodo é responsável por realizar a limpeza dos campos.
    Ou seja aonde tiver String vai ser substituida por "" e aonde tiver inteiro vai ser 0 ou seja nada.
    */
        
    private void PreencherCampos(){
        jTextField2.setText(administrador.getNome());
        jTextField3.setText(String.valueOf(administrador.getTelefone()));
        jComboBox2.setSelectedItem(administrador.getCategoria_tel());
        jTextField5.setText(administrador.getEndereco());
        jTextField6.setText(administrador.getBairro());
        jTextField7.setText(administrador.getEmail());
        jPasswordField1.setText(administrador.getSenha());
        jComboBox1.setSelectedItem(administrador.getSexo());
    }
    /*
    Esse metodo preenche todos os campos da interface com os dados atuais do objeto administrador.
    Permitindo que o usuário visualize e se necessário, edite as informações do administrador.
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
            java.util.logging.Logger.getLogger(Tela_alterar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_alterar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_alterar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_alterar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_alterar_administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
