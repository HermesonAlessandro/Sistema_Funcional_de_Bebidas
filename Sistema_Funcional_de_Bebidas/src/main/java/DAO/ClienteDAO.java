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
    //A classe ClienteDAO permite a inserção de um novo cliente no banco de dados.
    //O metodo CadastrarCliente tem a função de prepara e executar  a intrução SQL.
    //Para inserção de dados do cliente.
    
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
    //Metodo da classe ClienteDAO tem a função de consultar no banco de dados para obter todas as informações dos clentes e retorna a lista de objetos cliente.
    //Ele utiliza mais uma vez a conexão com o banco de dados para executar a consulta.
    //Cria um objeto cliente com os dados retornados e adiciona a uma lista.
    //Em caso de erro ele exibe uma mensagem dando erro, logo apos finalizando informando o tipo de erro.
    
    public Cliente BuscarClientePorCpf(String cpf){
        String sql = "SELECT * FROM cliente WHERE cpf = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, cpf);
            
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
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar o cliente: " +e.getMessage());
        }
        return null;
    }
    //Metodo da classe ClienteDAO busca um cliente no banco de dados pelo cpf.
    //Ele utiliza mais uma vez uma conexão com banco de dados.
    //Para executar o SQL.
    //cria e preenche o objeto cliente com os dados obtidos e retorna o encontrado.
    //Em caso de erro retorna o erro e retorna null, dando indice que nenhum cliente foi encontrado.
    
    public void AlterarCliente(Cliente cliente) throws SQLException{
        String sql = "UPDATE cliente SET nome = ?, d_nasc = ?, sexo = ?, endereco = ?, telefone = ?, email = ?, senha = ?, fk_rg_sec = ? WHERE cpf = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, cliente.getNome());
            pstmt.setDate(2, java.sql.Date.valueOf(cliente.getD_nasc()));
            pstmt.setString(3, cliente.getSexo());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setLong(5, cliente.getTelefone());
            pstmt.setString(6, cliente.getEmail());
            pstmt.setString(7, cliente.getSenha());
            pstmt.setString(8, cliente.getFk_rg_sec());
            pstmt.setString(9, cliente.getCpf());
            
            pstmt.executeUpdate();
        }
    }
    //Metodo da classe ClienteDAO que atualiza as informações de um cliente existente no banco de dados.
    //com base no cpf.
    //Ele utiliza a conexão com banco de dados, para executar a consulta SQL.
    //define os dados/valores dos paramentros com os dados do objeto cliente.
    
    public void ExcluirCliente(String cpf) throws SQLException{
        String sql = "DELETE FROM cliente WHERE cpf = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, cpf);
            pstmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir o cliente: " +e.getMessage());
        }
    }
}
//Metodo da classe ClienteDAO que tem como objetivo excluir um cliente do banco de dados.
//Ele utiliza uma conexão com o banco de dados.
//para executar um sql e define o valor do parametro com o cpf do cliente.
//Em caso de erro  exibe uma mensagem com o problema ocorrido.

