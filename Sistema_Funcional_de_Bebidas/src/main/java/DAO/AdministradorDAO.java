/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Administrador;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public List<Administrador> ListarAdministrador(){
        List<Administrador> administradores = new ArrayList<>();
        String sql = "SELECT * FROM administrador";
        try(Connection conn = ConexaoDAO.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
                Administrador administrador = new Administrador();
                administrador.setCod(rs.getInt("cod"));
                administrador.setNome(rs.getString("nome"));
                administrador.setTelefone(rs.getInt("telefone"));
                administrador.setCategoria_tel(rs.getString("categoria_tel"));
                administrador.setEndereco(rs.getString("endereco"));
                administrador.setBairro(rs.getString("bairro"));
                administrador.setEmail(rs.getString("email"));
                administrador.setSenha(rs.getString("senha"));
                administrador.setSexo(rs.getString("sexo"));
                administradores.add(administrador);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar o administrador: " +e.getMessage());
        }
        return administradores;
    }
    
    public Administrador BuscarAdministradorPorCod(int cod){
        String sql = "SELECT * FROM administrador WHERE cod = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, cod);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    Administrador administrador = new Administrador();
                    administrador.setCod(rs.getInt("cod"));
                    administrador.setNome(rs.getString("nome"));
                    administrador.setTelefone(rs.getInt("telefone"));
                    administrador.setCategoria_tel(rs.getString("categoria_tel"));
                    administrador.setEndereco(rs.getString("endereco"));
                    administrador.setBairro(rs.getString("bairro"));
                    administrador.setEmail(rs.getString("email"));
                    administrador.setSenha(rs.getString("senha"));
                    administrador.setSexo(rs.getString("sexo"));
                    return administrador;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar administrador: " +e.getMessage());
        }
        return null;
    }
    
    public void AlterarAdministrador(Administrador administrador) throws SQLException{
        String sql = "UPDATE administrador SET nome = ?, telefone = ?, categoria_tel = ?, endereco = ?, bairro = ?, email = ?, senha = ?, sexo = ? WHERE cod = ?";
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
            pstmt.setInt(9, administrador.getCod());
            
            pstmt.executeUpdate();
        }
    }
}
