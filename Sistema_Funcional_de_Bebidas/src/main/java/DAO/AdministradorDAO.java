/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hermeson Alessandro
 */
public class AdministradorDAO {
    public void CadastrarAdministrador(Administrador administrador) throws SQLException{
        String sql = "INSERT INTO administrador (nome, telefone, categoria_tel, endereco, bairro, email, senha, sexo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, administrador.getNome());
            pstmt.setInt(2, administrador.getTelefone());
            pstmt.setString(3, administrador.getCategoria_tel());
            pstmt.setString(4, administrador.getEndereco());
            pstmt.setString(5, administrador.getBairro());
            pstmt.setString(6, administrador.getEmail());
            pstmt.setString(7, administrador.getSenha());
            pstmt.setString(8, administrador.getSexo());
            
            pstmt.execute();
            
            try(ResultSet generatedkeys = pstmt.getGeneratedKeys()){
                if(generatedkeys.next()){
                    administrador.setCod(generatedkeys.getInt(1));
                }
            }
        }
    }
}
