/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hermeson Alessandro
 */
public class Pedido {
    private int id;
    private String fk_cpf_cliente;
    private String nome_cliente;
    private String endereco_cliente;
    private long telefone_cliente;
    private String email_cliente;
    private String descricao_bebida;
    private String cod_de_barras_bebida;
    private String marca_bebida;
    private String gp_mercadoria_bebida;
    private String t_do_item_bebida;
    private int q_estoque_bebida;
    private int q_adquirida_do_pedido;
    private double v_unitario_bebida;
    private double v_total_pedido;
    private int fk_cod_bebida;
    
    public Pedido(){
        
    }

    public Pedido(int id, String fk_cpf_cliente, String nome_cliente, String endereco_cliente, long telefone_cliente, String email_cliente, String descricao_cliente, String cod_de_barras_bebida, String marca_bebida, String gp_mercadoria_bebida, String t_do_item_bebida, int q_estoque_bebida, int q_adquirida_do_pedido, double v_unitario_bebida, double v_total_pedido, int fk_cod_bebida) {
        this.id = id;
        this.fk_cpf_cliente = fk_cpf_cliente;
        this.nome_cliente = nome_cliente;
        this.endereco_cliente = endereco_cliente;
        this.telefone_cliente = telefone_cliente;
        this.email_cliente = email_cliente;
        this.descricao_bebida = descricao_bebida;
        this.cod_de_barras_bebida = cod_de_barras_bebida;
        this.marca_bebida = marca_bebida;
        this.gp_mercadoria_bebida = gp_mercadoria_bebida;
        this.t_do_item_bebida = t_do_item_bebida;
        this.q_estoque_bebida = q_estoque_bebida;
        this.q_adquirida_do_pedido = q_adquirida_do_pedido;
        this.v_unitario_bebida = v_unitario_bebida;
        this.v_total_pedido = v_total_pedido;
        this.fk_cod_bebida = fk_cod_bebida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFk_cpf_cliente() {
        return fk_cpf_cliente;
    }

    public void setFk_cpf_cliente(String fk_cpf_cliente) {
        this.fk_cpf_cliente = fk_cpf_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public long getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(long telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getDescricao_bebida() {
        return descricao_bebida;
    }

    public void setDescricao_bebida(String descricao_bebida) {
        this.descricao_bebida = descricao_bebida;
    }

    public String getCod_de_barras_bebida() {
        return cod_de_barras_bebida;
    }

    public void setCod_de_barras_bebida(String cod_de_barras_bebida) {
        this.cod_de_barras_bebida = cod_de_barras_bebida;
    }

    public String getMarca_bebida() {
        return marca_bebida;
    }

    public void setMarca_bebida(String marca_bebida) {
        this.marca_bebida = marca_bebida;
    }

    public String getGp_mercadoria_bebida() {
        return gp_mercadoria_bebida;
    }

    public void setGp_mercadoria_bebida(String gp_mercadoria_bebida) {
        this.gp_mercadoria_bebida = gp_mercadoria_bebida;
    }

    public String getT_do_item_bebida() {
        return t_do_item_bebida;
    }

    public void setT_do_item_bebida(String t_do_item_bebida) {
        this.t_do_item_bebida = t_do_item_bebida;
    }

    public int getQ_estoque_bebida() {
        return q_estoque_bebida;
    }

    public void setQ_estoque_bebida(int q_estoque_bebida) {
        this.q_estoque_bebida = q_estoque_bebida;
    }

    public int getQ_adquirida_do_pedido() {
        return q_adquirida_do_pedido;
    }

    public void setQ_adquirida_do_pedido(int q_adquirida_do_pedido) {
        this.q_adquirida_do_pedido = q_adquirida_do_pedido;
    }

    public double getV_unitario_bebida() {
        return v_unitario_bebida;
    }

    public void setV_unitario_bebida(double v_unitario_bebida) {
        this.v_unitario_bebida = v_unitario_bebida;
    }

    public double getV_total_pedido() {
        return v_total_pedido;
    }

    public void setV_total_pedido(double v_total_pedido) {
        this.v_total_pedido = v_total_pedido;
    }

    public int getFk_cod_bebida() {
        return fk_cod_bebida;
    }

    public void setFk_cod_bebida(int fk_cod_bebida) {
        this.fk_cod_bebida = fk_cod_bebida;
    }
}
//Tenho a classe Pedido que representa um pedido com atributos basicos como id do pedido, nome do cliente, valor total e etc.
//possui construtores para inicializar objetos dessa classe.
//metodos getters e setters para acessar e modificar os campos privados da classe.
