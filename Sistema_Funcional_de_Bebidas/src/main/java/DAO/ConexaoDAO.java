/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hermeson Alessandro
 */
public class ConexaoDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/Sistema_Funcional_de_Bebidas";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "Admin123@";
    
    public static Connection getConnection(){
        Connection conexao = null;
        try{
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao se conectar ao banco de dados: "+e.getMessage());
        }
        return conexao;
    }
}
