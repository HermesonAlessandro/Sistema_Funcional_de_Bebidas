/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import DAO.ConexaoDAO;
import Modelo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class AdministradorDTO {
    public Administrador VerificarAdministrador(String email, String senha) throws SQLException{//Método que pode lançar uma exceção SQL.
        String sql = "SELECT * FROM administrador WHERE email = ? AND senha = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    Administrador administrador = new Administrador();
                    administrador.setCod(rs.getInt("cod"));
                    administrador.setNome(rs.getString("nome"));
                    administrador.setTelefone(rs.getLong("telefone"));
                    administrador.setCategoria_tel(rs.getString("categoria_tel"));
                    administrador.setEndereco(rs.getString("endereco"));
                    administrador.setBairro(rs.getString("bairro"));
                    administrador.setEmail(rs.getString("email"));
                    administrador.setSenha(rs.getString("senha"));
                    administrador.setSexo(rs.getString("sexo"));
                    return administrador;
               }
           }
        }
        return null;
    } 
}
//A classe AdministradorDTO tem como principal objetivo verificar a existência de um administrador no banco de dados.
//Atraves do email e senha
//Ele vai utilizar a classe ConexaoDAO para estabelecer conexão com banco de dados
//Execute uma consulta SQL para buscar os dados.
//Se os dados forem encontrados eles são mapeados para o objeto administrador que então vai ser retornado.
//Caso ao contrario o valor vai ser null.