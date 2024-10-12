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
    
    private List<Bebida> ListarBebida(){
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
    
    public List<Bebida> ListarBebidaSec(){
        return ListarBebida();
    }
    
    public List<Bebida> ListarBebidaCli(){
        return ListarBebida();
    }
    
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
