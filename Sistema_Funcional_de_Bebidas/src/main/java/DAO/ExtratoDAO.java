/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Extrato;
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
    //A classe ExtratoDAO permite a inserção de um novo extrato no banco de dados.
    //O metodo CadastrarExtrato tem a função de prepara e executar  a intrução SQL.
    //Para inserção de dados do extrato.
    
    public List<Extrato> ListarExtrato(){
        List<Extrato> extratos = new ArrayList<>();
        String sql = "SELECT * FROM extrato";
        try(Connection conn = ConexaoDAO.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()){
            while(rs.next()){
                Extrato extrato = new Extrato();
                extrato.setExt_id_pedido(rs.getInt("ext_id_pedido"));
                extrato.setExt_fk_cpf_cliente(rs.getString("ext_fk_cpf_cliente"));
                extrato.setExt_nome_cliente(rs.getString("ext_nome_cliente"));
                extrato.setExt_endereco_cliente(rs.getString("ext_endereco_cliente"));
                extrato.setExt_telefone_cliente(rs.getLong("ext_telefone_cliente"));
                extrato.setExt_email_cliente(rs.getString("ext_email_cliente"));
                extrato.setExt_descricao_bebida(rs.getString("ext_descricao_bebida"));
                extrato.setExt_cod_de_barras_bebida(rs.getString("ext_cod_de_barras_bebida"));
                extrato.setExt_marca_bebida(rs.getString("ext_marca_bebida"));
                extrato.setExt_gp_mercadoria_bebida(rs.getString("ext_gp_mercadoria_bebida"));
                extrato.setExt_t_do_item_bebida(rs.getString("ext_t_do_item_bebida"));
                extrato.setExt_q_adquirida_do_pedido(rs.getInt("ext_q_adquirida_do_pedido"));
                extrato.setExt_v_unitario_bebida(rs.getDouble("ext_v_unitario_bebida"));
                extrato.setExt_v_total_pedido(rs.getDouble("ext_v_total_pedido"));
                extrato.setExt_fk_cod_bebida(rs.getInt("ext_fk_cod_bebida"));
                extrato.setExt_status_pagamento(rs.getString("ext_status_pagamento"));
                extratos.add(extrato);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar os pedidos: " +e.getMessage());
        }
        return extratos;
    }
}
//Metodo da classe ExtratoDAO tem a função de consultar no banco de dados para obter todas as informações dos extratos e retorna a lista de objetos extrato.
//Ele utiliza mais uma vez a conexão com o banco de dados para executar a consulta.
//Cria um objeto extrato com os dados retornados e adiciona a uma lista.
//Em caso de erro ele exibe uma mensagem dando erro, logo apos finalizando informando o tipo de erro.
