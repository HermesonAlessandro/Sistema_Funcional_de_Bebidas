/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Secretaria;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class SecretariaDAO {
    public void CadastrarSecretaria(Secretaria secretaria) throws SQLException{
        String sql = "INSERT INTO secretaria (rg, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_cod_adm) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareCall(sql)){
            pstmt.setLong(1, secretaria.getRg());
            pstmt.setString(2, secretaria.getNome());
            pstmt.setDate(3, Date.valueOf(secretaria.getD_nasc()));
            pstmt.setString(4, secretaria.getSexo());
            pstmt.setString(5, secretaria.getEndereco());
            pstmt.setLong(6, secretaria.getTelefone());
            pstmt.setString(7, secretaria.getEmail());
            pstmt.setString(8, secretaria.getSenha());
            pstmt.setInt(9, secretaria.getFk_cod_adm());
            
            pstmt.execute();
        }
    } 
}
