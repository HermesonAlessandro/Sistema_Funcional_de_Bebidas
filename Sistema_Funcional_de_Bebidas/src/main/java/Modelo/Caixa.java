/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hermeson Alessandro
 */
public class Caixa {
    private int id_pedido;
    private String nome_produto_pedido;
    private double valor_total_pedido;
    private String pagamento;
    
    public Caixa(){
        
    }

    public Caixa(int id_pedido, String nome_produto_pedido, double valor_total_pedido, String pagamento) {
        this.id_pedido = id_pedido;
        this.nome_produto_pedido = nome_produto_pedido;
        this.valor_total_pedido = valor_total_pedido;
        this.pagamento = pagamento;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNome_produto_pedido() {
        return nome_produto_pedido;
    }

    public void setNome_produto_pedido(String nome_produto_pedido) {
        this.nome_produto_pedido = nome_produto_pedido;
    }

    public double getValor_total_pedido() {
        return valor_total_pedido;
    }

    public void setValor_total_pedido(double valor_total_pedido) {
        this.valor_total_pedido = valor_total_pedido;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
}
//Tenho a classe Caixa que representa um caixa com atributos basicos como id do pedido, nome do produto, pagamento e etc.
//possui construtores para inicializar objetos dessa classe.
//metodos getters e setters para acessar e modificar os campos privados da classe.
