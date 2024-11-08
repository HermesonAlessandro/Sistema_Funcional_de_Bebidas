/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import DAO.ConexaoDAO;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class ClienteDTO {
    public Cliente VerificarCliente(String email, String senha) throws SQLException{
        String sql = "SELECT * FROM cliente WHERE email = ? AND senha = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setD_nasc(rs.getDate("d_nasc").toLocalDate());
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setTelefone(rs.getLong("telefone"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setSenha(rs.getString("senha"));
                    cliente.setFk_rg_sec(rs.getString("fk_rg_sec"));
                    return cliente;
                }
            }
        }
        return null;
    }
}
//A classe ClienteDTO tem como principal objetivo verificar a existência de um cliente no banco de dados.
//Atraves do email e senha
//Ele vai utilizar a classe ConexaoDAO para estabelecer conexão com banco de dados
//Execute uma consulta SQL para buscar os dados.
//Se os dados forem encontrados eles são mapeados para o objeto cliente que então vai ser retornado.
//Caso ao contrario o valor vai ser null.