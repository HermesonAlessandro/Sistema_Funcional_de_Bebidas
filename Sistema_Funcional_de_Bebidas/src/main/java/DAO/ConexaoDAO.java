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
    private static final String URL = "jdbc:postgresql://localhost:5432/Sistema_Funcional_de_Bebidas";//Variavel estática e privada.
    private static final String USUARIO = "postgres";//Variavel estática e privada.
    private static final String SENHA = "Admin123@";//Variavel estática e privada.
    
    public static Connection getConnection(){
        Connection conexao = null;
        try{
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao se conectar ao banco de dados: "+e.getMessage());
        }
        return conexao;
    }
}
//A classe ConexaoDAO gerencia a conexão do banco de dados postgresql.
//O metodo getconnection estabele conexão utilizando a url do banco de dados, nome de usuario e senha.
//ele trata possivel exceções exibindo mensagens apropiadas. Caso ocorra tudo como esperado o banco de dados é conectado.
