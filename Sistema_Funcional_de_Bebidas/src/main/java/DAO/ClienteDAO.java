/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    
    public List<Cliente> ListarCliente(){
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try(Connection conn = ConexaoDAO.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
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
                clientes.add(cliente);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar o cliente: " +e.getMessage());
        }
        return clientes;
    }
}
