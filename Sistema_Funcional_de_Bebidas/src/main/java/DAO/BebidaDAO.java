/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Bebida;
import java.sql.Connection;
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
public class BebidaDAO {
    public void CadastrarBebida(Bebida bebida) throws SQLException{
        String sql = "INSERT INTO bebida (cod_de_barras, descricao, marca, gp_mercadoria, t_do_item, q_estoque, v_unitario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
            pstmt.setString(1, bebida.getCod_de_barras());
            pstmt.setString(2, bebida.getDescricao());
            pstmt.setString(3, bebida.getMarca());
            pstmt.setString(4, bebida.getGp_mercadoria());
            pstmt.setString(5, bebida.getT_do_item());
            pstmt.setInt(6, bebida.getQ_estoque());
            pstmt.setDouble(7, bebida.getV_unitario());
            
            pstmt.executeUpdate();
            
            try(ResultSet generatedkeys = pstmt.getGeneratedKeys()){
                if(generatedkeys.next()){
                    bebida.setCod(generatedkeys.getInt(1));
                }
            }
        }
    }
    //A classe BebidaDAO permite a inserção de uma nova bebida no banco de dados.
    //O metodo Cadastrarbebida tem a função de prepara e executar  a intrução SQL.
    //Para inserção de dados da bebida.
    //depois recupera a chave primária gerada para definir ao codigo da bebida no objeto instanciado logo acima.
    
    public boolean DescricaoExiste(String descricao) throws SQLException{
        String sql = "SELECT COUNT(*) FROM bebida WHERE descricao = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, descricao);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }
    //Metodo da classe BebidaDAO que permite ver se a descrição ja existe na tabela bebida do banco de dados.
    //Ele executa um sql  que conta o numero de registro com a descrição fornecida.
    //Retorna verdadeiro se a conexão for maior que 0.
    //Indicando que a descricão ja existe.
    //Caso o contrario ele retorna falso.
    
    public List<Bebida> ListarBebida(){
        List<Bebida> bebidas = new ArrayList<>();
        String sql = "SELECT * FROM bebida";
        try(Connection conn = ConexaoDAO.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
                Bebida bebida = new Bebida();
                bebida.setCod(rs.getInt("cod"));
                bebida.setCod_de_barras(rs.getString("cod_de_barras"));
                bebida.setDescricao(rs.getString("descricao"));
                bebida.setMarca(rs.getString("marca"));
                bebida.setGp_mercadoria(rs.getString("gp_mercadoria"));
                bebida.setT_do_item(rs.getString("t_do_item"));
                bebida.setQ_estoque(rs.getInt("q_estoque"));
                bebida.setV_unitario(rs.getDouble("v_unitario"));
                bebidas.add(bebida);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar as bebidas: " +e.getMessage());
        }
        return bebidas;
    }
    //Metodo da classe Bebida tem a função de consultar no banco de dados para obter todas as informações das bebidas e retorna a lista de objetos bebida.
    //Ele utiliza mais uma vez a conexão com o banco de dados para executar a consulta.
    //Cria um objeto bebida com os dados retornados e adiciona a uma lista.
    //Em caso de erro ele exibe uma mensagem dando erro, logo apos finalizando informando o tipo de erro.
    
    public List<Bebida> ListarBebidaSec(){
        return ListarBebida();
    }
    //ListarBebidaSec é essencialmente aliases para o método ListarBebida.
    
    public List<Bebida> ListarBebidaCli(){
        return ListarBebida();
    }
    //ListarBebidaCli é essencialmente aliases para o método ListarBebida.
    
    public Bebida BuscarBebidaPorCod(int cod){
        String sql = "SELECT * FROM bebida WHERE cod = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, cod);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    Bebida bebida = new Bebida();
                    bebida.setCod(rs.getInt("cod"));
                    bebida.setCod_de_barras(rs.getString("cod_de_barras"));
                    bebida.setDescricao(rs.getString("descricao"));
                    bebida.setMarca(rs.getString("marca"));
                    bebida.setGp_mercadoria(rs.getString("gp_mercadoria"));
                    bebida.setT_do_item(rs.getString("t_do_item"));
                    bebida.setQ_estoque(rs.getInt("q_estoque"));
                    bebida.setV_unitario(rs.getDouble("v_unitario"));
                    return bebida;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar uma bebida: " +e.getMessage());
        }
        return null;
    }
    //Metodo da classe BebidaDAO busca o administrador no banco de dados pelo codigo.
    //Ele utiliza mais uma vez uma conexão com banco de dados.
    //Para executar o SQL.
    //cria e preenche o objeto bebida com os dados obtidos e retorna o encontrado.
    //Em caso de erro retorna o erro e retorna null, dando indice que nenhum bebida foi encontrado.
   
    public void AlterarBebida(Bebida bebida) throws SQLException{
        String sql = "UPDATE bebida SET cod_de_barras = ?, descricao = ?, marca = ?, gp_mercadoria = ?, t_do_item = ?, q_estoque = ?, v_unitario = ? WHERE cod = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, bebida.getCod_de_barras());
            pstmt.setString(2, bebida.getDescricao());
            pstmt.setString(3, bebida.getMarca());
            pstmt.setString(4, bebida.getGp_mercadoria());
            pstmt.setString(5, bebida.getT_do_item());
            pstmt.setInt(6, bebida.getQ_estoque());
            pstmt.setDouble(7, bebida.getV_unitario());
            pstmt.setInt(8, bebida.getCod());
            
            pstmt.executeUpdate();
        }
    }
    //Metodo da classe BebidDAO que atualiza as informações de uma bebida existente no banco de dados.
    //com base no cod.
    //Ele utiliza a conexão com banco de dados, para executar a consulta SQL.
    //define os dados/valores dos paramentros com os dados do objeto bebida.
    
    public void ExcluirBebida(int cod) throws SQLException{
        String sql = "DELETE FROM bebida WHERE cod = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, cod);
            pstmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir uma bebida: " +e.getMessage());
        }
    }
}
//Metodo da classe BebidaDAO que tem como objetivo excluir uma bebida do banco de dados.
//Ele utiliza uma conexão com o banco de dados.
//para executar um sql e define o valor do parametro com o codigo da bebida.
//Em caso de erro  exibe uma mensagem com o problema ocorrido.
