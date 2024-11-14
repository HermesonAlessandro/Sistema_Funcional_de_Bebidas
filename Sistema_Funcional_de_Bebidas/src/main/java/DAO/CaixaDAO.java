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
    public void CadastrarCaixa(Caixa caixa) throws SQLException{//Método que pode lançar uma exceção SQL.
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
    //A classe CaixaDAO permite a inserção de um novo caixa no banco de dados.
    //O metodo CadastrarCaixa tem a função de prepara e executar  a intrução SQL.
    //Para inserção de dados do caixa.
    
    public void ExcluirCaixa(int pedidoId) throws SQLException{//Método que pode lançar uma exceção SQL.
        String sql = "DELETE FROM caixa WHERE id_pedido = ?";
        try(Connection conn = ConexaoDAO.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, pedidoId);
            pstmt.executeUpdate();
        }
    }
}
//Metodo da classe CaixaDAO que tem como objetivo excluir um caixa do banco de dados.
//Ele utiliza uma conexão com o banco de dados.
//para executar um sql e define o valor do parametro com o id_pedido do caixa.
//Em caso de erro  exibe uma mensagem com o problema ocorrido.
