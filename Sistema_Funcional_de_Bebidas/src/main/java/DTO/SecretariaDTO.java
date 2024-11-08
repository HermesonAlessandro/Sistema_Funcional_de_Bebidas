/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import DAO.ConexaoDAO;
import Modelo.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class SecretariaDTO {
    public Secretaria VerificarSecretaria(String email, String senha) throws SQLException{
        String sql = "SELECT * FROM secretaria WHERE email = ? AND senha = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    Secretaria secretaria = new Secretaria();
                    secretaria.setRg(rs.getString("rg"));
                    secretaria.setNome(rs.getString("nome"));
                    secretaria.setD_nasc(rs.getDate("d_nasc").toLocalDate());
                    secretaria.setSexo(rs.getString("sexo"));
                    secretaria.setEndereco(rs.getString("endereco"));
                    secretaria.setTelefone(rs.getLong("telefone"));
                    secretaria.setEmail(rs.getString("email"));
                    secretaria.setSenha(rs.getString("senha"));
                    secretaria.setFk_cod_adm(rs.getInt("fk_cod_adm"));
                    return secretaria;
                }
            }
        }
        return null;
    }
}
//A classe SecretariaDTO tem como principal objetivo verificar a existência de uma secretaria no banco de dados.
//Atraves do email e senha
//Ele vai utilizar a classe ConexaoDAO para estabelecer conexão com banco de dados
//Execute uma consulta SQL para buscar os dados.
//Se os dados forem encontrados eles são mapeados para o objeto secretaria que então vai ser retornado.
//Caso ao contrario o valor vai ser null.
