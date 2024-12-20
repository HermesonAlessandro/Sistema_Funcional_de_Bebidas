/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao;
import DAO.ClienteDAO;
import Modelo.Cliente;
import Modelo.Saudacao;
import Modelo.Sessao;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hermeson Alessandro
 */
public class Tela_cadastrar_cliente extends javax.swing.JFrame {//Tela de Cadastro do cliente.

    /**
     * Creates new form Tela_cadastrar_cliente
     */
    public Tela_cadastrar_cliente() {
        initComponents();
        setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
    }
    
    public void setSaudacao(String saudacao, String dataHora) {
        jLabel11.setText(saudacao + " - " + dataHora);
    }
    /*
    Quando a nova instância da Tela_cadastrar_cliente é criada, ela inicializa todos os componentes da interface.
    Define uma mensagem de saudação com a data e hora do login ativo do usuário.
    O método setSaudacao é usada para formatar e definir essa mensagem no componentes jlabel11.
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela_cadastrar_cliente");
        setMinimumSize(new java.awt.Dimension(698, 623));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Cadastrar Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 370, 64);

        jLabel2.setText("Cpf");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 100, 30, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 100, 360, 22);

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 140, 33, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 140, 360, 22);

        jLabel4.setText("D_nasc");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 180, 50, 16);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 180, 340, 22);

        jLabel5.setText("Sexo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 220, 30, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "Outros" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(190, 220, 72, 22);

        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 260, 60, 16);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 260, 340, 22);

        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 300, 60, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(220, 300, 330, 22);

        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 340, 40, 16);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(190, 340, 360, 22);

        jLabel9.setText("Senha");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 380, 40, 16);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(200, 380, 350, 22);

        jLabel10.setText("Fk_rg_sec");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(150, 420, 60, 16);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(220, 420, 330, 22);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 480, 100, 40);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(400, 480, 100, 40);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 560, 690, 16);

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 750, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()
            || jComboBox1.getSelectedItem() == null || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty()
            || jTextField6.getText().isEmpty() || jPasswordField1.getPassword().length == 0 || jTextField8.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos vazios, por favor preencher todos os campos!");
        }else{
            try{
                String telefone = jTextField5.getText();
                if(!telefone.matches("\\d+")){
                    throw new NumberFormatException("Numero deve conter apenas digitos!");
                }//Verifica se no campo aonde vamos digitar o numero de telefone contém apenas dígitos.
                if(telefone.length() != 11){
                    throw new IllegalArgumentException("Numero deve conter exatamente 11 digitos");
                }//Verifica se no campo telene possui apenas 11 dígitos.
                String datatexto = jTextField3.getText();
                if (datatexto.isEmpty()) {
                    throw new DateTimeParseException("Data vazia!", datatexto, 0);
                }//Verifica se a data não está vazia.

                if(datatexto.matches("\\d{8}")){
                    datatexto = datatexto.substring(0, 2) + "/" + datatexto.substring(2, 4) + "/" + datatexto.substring(4, 8);
                }
                /*
                Verifica se a string datatexto tem exatamente 8 dígitos.
                Se a verificação for bem-sucedida, formata a string para o formato de data "dd/MM/yyyy".
                */

                String cpf = jTextField1.getText();
                if(cpf.isEmpty()){
                    throw new IllegalArgumentException("Cpf vazio!");
                }//Verifica se o cpf não está vazio.
                String cpfNumerico = cpf.replaceAll("\\D", "");
                if(cpfNumerico.length() != 11){
                    throw new IllegalArgumentException("Cpf deve conter exatamente 11 digitos!");
                }
                /*
                Removem todos os caracteres não numéricos da string do CPF.
                Validam se o CPF resultante contém exatamente 11 dígitos.
                Lançam uma exceção se a validação falhar, informando que o CPF deve conter exatamente 11 dígitos.
                */

                DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate datanascimento = LocalDate.parse(datatexto,formatar);
                //O DateTimeFormatter está configurado para interpretar essa string no formato "dd/MM/yyyy".

                Cliente cliente = new Cliente();
                cliente.setCpf(jTextField1.getText());
                cliente.setNome(jTextField2.getText());
                cliente.setD_nasc(datanascimento);
                cliente.setSexo(jComboBox1.getSelectedItem().toString());
                cliente.setEndereco(jTextField4.getText());
                cliente.setTelefone(Long.parseLong(telefone));
                cliente.setEmail(jTextField6.getText());
                cliente.setSenha(new String(jPasswordField1.getPassword()));
                cliente.setFk_rg_sec(jTextField8.getText());

                ClienteDAO dao = new ClienteDAO();
                dao.CadastrarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                Tela_login tl = new Tela_login();
                tl.setVisible(true);
                dispose();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de formataçao: " +e.getMessage());
            }catch(DateTimeParseException e){
                JOptionPane.showMessageDialog(null, "Erro de formataçao da data: " +e.getMessage());
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar um cliente: " +e.getMessage());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro inesperado: " +e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Tela_inicial_secretaria tis = new Tela_inicial_secretaria();
        tis.setSaudacao("Login ativo desde:", Sessao.getDataHoraEntrada());
        tis.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    /*
    Esse método verifica se todos os campos estão preenchidos.
    Valida e formata os dados do cliente.
    Cria um objeto Cliente.
    Salva no banco de dados.
    Fornece feedback ao usuário.
    Se ocorrer erro durante o processo as exceções são tratadas adequadamente.
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
            java.util.logging.Logger.getLogger(Tela_cadastrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_cadastrar_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
