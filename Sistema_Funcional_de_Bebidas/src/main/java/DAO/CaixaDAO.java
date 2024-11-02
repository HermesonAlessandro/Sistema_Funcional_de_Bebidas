/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Caixa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class CaixaDAO {
    public void CadastrarCaixa(Caixa caixa) throws SQLException{
        String sql = "INSERT INTO caixa (id_pedido, nome_produto_pedido, valor_total_pedido, pagamento) VALUES (?, ?, ?, ?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareCall(sql)){
            pstmt.setInt(1, caixa.getId_pedido());
            pstmt.setString(2, caixa.getNome_produto_pedido());
            pstmt.setDouble(3, caixa.getValor_total_pedido());
            pstmt.setString(4, caixa.getPagamento());
            
            pstmt.execute();
        }
    }
}
