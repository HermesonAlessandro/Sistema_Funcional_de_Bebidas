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
    //A classe SecretariaDAO permite a inserção de um nova xecretaria no banco de dados.
    //O metodo CadastrarSecretaria tem a função de prepara e executar  a intrução SQL.
    //Para inserção de dados da secretaria.
    
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
    //Metodo da classe SecretariaDAO tem a função de consultar no banco de dados para obter todas as informações das secretarias e retorna a lista de objetos secretaria.
    //Ele utiliza mais uma vez a conexão com o banco de dados para executar a consulta.
    //Cria um objeto administrador com os dados retornados e adiciona a uma lista.
    //Em caso de erro ele exibe uma mensagem dando erro, logo apos finalizando informando o tipo de erro.
    
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
    //Metodo da classe SecretariaDAO busca uma secretaria no banco de dados pelo rg.
    //Ele utiliza mais uma vez uma conexão com banco de dados.
    //Para executar o SQL.
    //cria e preenche o objeto secretaria com os dados obtidos e retorna o encontrado.
    //Em caso de erro retorna o erro e retorna null, dando indice que nenhuma secretaria foi encontrada.
    
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
    //Metodo da classe SecretariaDAO que atualiza as informações de uma secretaria existente no banco de dados.
    //com base no rg.
    //Ele utiliza a conexão com banco de dados, para executar a consulta SQL.
    //define os dados/valores dos paramentros com os dados do objeto secretaria.
    
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
//Metodo da classe SecretariaDAO que tem como objetivo excluir uma secretaria do banco de dados.
//Ele utiliza uma conexão com o banco de dados.
//para executar um sql e define o valor do parametro com o rg da secretaria.
//Em caso de erro  exibe uma mensagem com o problema ocorrido.

