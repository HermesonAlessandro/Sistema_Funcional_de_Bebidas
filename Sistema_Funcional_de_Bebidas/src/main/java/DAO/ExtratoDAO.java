/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Extrato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hermeson Alessandro
 */
public class ExtratoDAO {
    public void CadastrarExtrato(Extrato extrato) throws SQLException{
        String sql = "INSERT INTO extrato (ext_id_pedido, ext_fk_cpf_cliente, ext_nome_cliente, ext_endereco_cliente, ext_telefone_cliente, ext_email_cliente, ext_descricao_bebida, ext_cod_de_barras_bebida, ext_marca_bebida, ext_gp_mercadoria_bebida, ext_t_do_item_bebida, ext_q_adquirida_do_pedido, ext_v_unitario_bebida, ext_v_total_pedido, ext_fk_cod_bebida, ext_status_pagamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareCall(sql)){
            pstmt.setInt(1, extrato.getExt_id_pedido());
            pstmt.setString(2, extrato.getExt_fk_cpf_cliente());
            pstmt.setString(3, extrato.getExt_nome_cliente());
            pstmt.setString(4, extrato.getExt_endereco_cliente());
            pstmt.setLong(5, extrato.getExt_telefone_cliente());
            pstmt.setString(6, extrato.getExt_email_cliente());
            pstmt.setString(7, extrato.getExt_descricao_bebida());
            pstmt.setString(8, extrato.getExt_cod_de_barras_bebida());
            pstmt.setString(9, extrato.getExt_marca_bebida());
            pstmt.setString(10, extrato.getExt_gp_mercadoria_bebida());
            pstmt.setString(11, extrato.getExt_t_do_item_bebida());
            pstmt.setInt(12, extrato.getExt_q_adquirida_do_pedido());
            pstmt.setDouble(13, extrato.getExt_v_unitario_bebida());
            pstmt.setDouble(14,extrato.getExt_v_total_pedido());
            pstmt.setInt(15, extrato.getExt_fk_cod_bebida());
            pstmt.setString(16, extrato.getExt_status_pagamento());
            
            pstmt.execute();
        }
    }
}
