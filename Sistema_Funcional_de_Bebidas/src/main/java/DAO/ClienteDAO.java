/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class ClienteDAO {
    public void CadastrarCliente(Cliente cliente) throws SQLException{
        String sql = "INSERT INTO cliente (cpf, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_rg_sec) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareCall(sql)){
            pstmt.setString(1, cliente.getCpf());
            pstmt.setString(2, cliente.getNome());
            pstmt.setDate(3, Date.valueOf(cliente.getD_nasc()));
            pstmt.setString(4, cliente.getSexo());
            pstmt.setString(5, cliente.getEndereco());
            pstmt.setLong(6, cliente.getTelefone());
            pstmt.setString(7, cliente.getEmail());
            pstmt.setString(8, cliente.getSenha());
            pstmt.setString(9, cliente.getFk_rg_sec());
            
            pstmt.execute();
        }
    }
}
