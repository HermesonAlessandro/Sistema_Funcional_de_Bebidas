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
            pstmt.setLong(2, administrador.getTelefone());
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
    //A classe AdministradorDAO permite a inserção de um novo administrador no banco de dados.
    //O metodo CadastrarAdministrador tem a função de prepara e executar  a intrução SQL.
    //Para inserção de dados do administrador.
    //depois recupera a chave primária gerada para definir ao codigo do administrador no objeto instanciado logo acima.
    
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
                administrador.setTelefone(rs.getLong("telefone"));
                administrador.setCategoria_tel(rs.getString("categoria_tel"));
                administrador.setEndereco(rs.getString("endereco"));
                administrador.setBairro(rs.getString("bairro"));
                administrador.setEmail(rs.getString("email"));
                administrador.setSenha(rs.getString("senha"));
                administrador.setSexo(rs.getString("sexo"));
                administradores.add(administrador);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar o administrador(a): " +e.getMessage());
        }
        return administradores;
    }
    //Metodo da classe AdministradorDAO tem a função de consultar no banco de dados para obter todas as informações dos administradores e retorna a lista de objetos administrador.
    //Ele utiliza mais uma vez a conexão com o banco de dados para executar a consulta.
    //Cria um objeto administrador com os dados retornados e adiciona a uma lista.
    //Em caso de erro ele exibe uma mensagem dando erro, logo apos finalizando informando o tipo de erro.
    
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
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar administrador(a): " +e.getMessage());
        }
        return null;
    }
    //Metodo da classe AdministradorDAO busca o administrador no banco de dados pelo codigo.
    //Ele utiliza mais uma vez uma conexão com banco de dados.
    //Para executar o SQL.
    //cria e preenche o objeto administrador com os dados obtidos e retorna o encontrado.
    //Em caso de erro retorna o erro e retorna null, dando indice que nenhum administrador foi encontrado.
    
    public void AlterarAdministrador(Administrador administrador) throws SQLException{
        String sql = "UPDATE administrador SET nome = ?, telefone = ?, categoria_tel = ?, endereco = ?, bairro = ?, email = ?, senha = ?, sexo = ? WHERE cod = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, administrador.getNome());
            pstmt.setLong(2, administrador.getTelefone());
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
    //Metodo da classe AdministradorDAO que atualiza as informações de um administrador existente no banco de dados.
    //com base no codigo.
    //Ele utiliza a conexão com banco de dados, para executar a consulta SQL.
    //define os dados/valores dos paramentros com os dados do objeto Administrador.
    
    public void ExcluirAdministrador(int cod) throws SQLException{
        String sql = "DELETE FROM administrador WHERE cod = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, cod);
            pstmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir administrador(a): " +e.getMessage());
        }
    }
}
//Metodo da classe AdministradorDAO que tem como objetivo excluir um administrador do banco de dados.
//Ele utiliza uma conexão com o banco de dados.
//para executar um sql e define o valor do parametro com o codigo do administrador.
//Em caso de erro  exibe uma mensagem com o problema ocorrido.
