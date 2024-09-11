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
    public Administrador VerificarAdministrador(String email, String senha) throws SQLException{
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
