/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Secretaria;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hermeson Alessandro
 */
public class SecretariaDAO {
    public void CadastrarSecretaria(Secretaria secretaria) throws SQLException{
        String sql = "INSERT INTO secretaria (rg, nome, d_nasc, sexo, endereco, telefone, email, senha, fk_cod_adm) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareCall(sql)){
            pstmt.setString(1, secretaria.getRg());
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
    
    public List<Secretaria> ListarSecretaria(){
        List<Secretaria> secretarias = new ArrayList<>();
        String sql = "SELECT * FROM secretaria";
        try(Connection conn = ConexaoDAO.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
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
                secretarias.add(secretaria);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar a secretaria(o): " +e.getMessage());
        }
        return secretarias;
    }
    
    public Secretaria BuscarSecretariaPorRg(String rg){
        String sql = "SELECT * FROM secretaria WHERE rg = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, rg);
            
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
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar a secretaria(o): " +e.getMessage());
        }
        return null;
    }
    
    public void AlterarSecretaria(Secretaria secretaria) throws SQLException{
        String sql = "UPDATE secretaria SET nome = ?, d_nasc = ?, sexo = ?, endereco = ?, telefone = ?, email = ?, senha = ?, fk_cod_adm = ? WHERE rg = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, secretaria.getNome());
            pstmt.setDate(2, java.sql.Date.valueOf(secretaria.getD_nasc()));
            pstmt.setString(3, secretaria.getSexo());
            pstmt.setString(4, secretaria.getEndereco());
            pstmt.setLong(5, secretaria.getTelefone());
            pstmt.setString(6, secretaria.getEmail());
            pstmt.setString(7, secretaria.getSenha());
            pstmt.setInt(8, secretaria.getFk_cod_adm());
            pstmt.setString(9, secretaria.getRg());
            
            pstmt.executeUpdate();
        }
    }
    
    public void ExcluirSecretaria(String rg) throws SQLException{
        String sql = "DELETE FROM secretaria WHERE rg = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, rg);
            pstmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir a secretaria(o): " +e.getMessage());
        }
    }
}
