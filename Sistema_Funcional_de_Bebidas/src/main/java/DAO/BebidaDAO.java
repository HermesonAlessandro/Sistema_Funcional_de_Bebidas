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
}
