/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class PedidoDAO {
    public void CadastrarPedido(Pedido pedido) throws SQLException{
        String sql = "INSERT INTO administrador (fk_cpf_cliente, nome_cliente, endereco_cliente, telefone_cliente, email_cliente, descricao_cliente, cod_de_barras_bebida, marca_bebida, gp_mercadoria_bebida, t_do_item_bebida, q_estoque_bebida, q_adquirida_do_pedido, v_unitario_bebida, v_total_pedido, fk_cod_bebida) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, pedido.getFk_cpf_cliente());
            pstmt.setString(2, pedido.getNome_cliente());
            pstmt.setString(3, pedido.getEndereco_cliente());
            pstmt.setLong(4, pedido.getTelefone_cliente());
            pstmt.setString(5, pedido.getEmail_cliente());
            pstmt.setString(6, pedido.getDescricao_bebida());
            pstmt.setString(7, pedido.getCod_de_barras_bebida());
            pstmt.setString(8, pedido.getMarca_bebida());
            pstmt.setString(9, pedido.getGp_mercadoria_bebida());
            pstmt.setString(10, pedido.getT_do_item_bebida());
            pstmt.setInt(11, pedido.getQ_estoque_bebida());
            pstmt.setInt(12, pedido.getQ_adquirida_do_pedido());
            pstmt.setDouble(13, pedido.getV_unitario_bebida());
            pstmt.setDouble(14, pedido.getV_total_pedido());
            pstmt.setInt(15, pedido.getFk_cod_bebida());
            
            pstmt.execute();
            
            try(ResultSet generatedkeys = pstmt.getGeneratedKeys()){
                if(generatedkeys.next()){
                    pedido.setId(generatedkeys.getInt(1));
                }
            }
        }
    }
}
