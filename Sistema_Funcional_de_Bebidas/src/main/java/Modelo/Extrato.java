/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hermeson Alessandro
 */
public class Extrato {
    private int ext_id_pedido;
    private String ext_fk_cpf_cliente;
    private String ext_nome_cliente;
    private String ext_endereco_cliente;
    private long ext_telefone_cliente;
    private String ext_email_cliente;
    private String ext_descricao_bebida;
    private String ext_cod_de_barras_bebida;
    private String ext_marca_bebida;
    private String ext_gp_mercadoria_bebida;
    private String ext_t_do_item_bebida;
    private int ext_q_adquirida_do_pedido;
    private double ext_v_unitario_bebida;
    private double ext_v_total_pedido;
    private int ext_fk_cod_bebida;
    private String ext_status_pagamento;
    
    public Extrato(){
        
    }

    public Extrato(int ext_id_pedido, String ext_fk_cpf_cliente, String ext_nome_cliente, String ext_endereco_cliente, long ext_telefone_cliente, String ext_email_cliente, String ext_descricao_bebida, String ext_cod_de_barras_bebida, String ext_marca_bebida, String ext_gp_mercadoria_bebida, String ext_t_do_item_bebida, int ext_q_adquirida_do_pedido, double ext_v_unitario_bebida, double ext_v_total_pedido, int ext_fk_cod_bebida, String ext_status_pagamento) {
        this.ext_id_pedido = ext_id_pedido;
        this.ext_fk_cpf_cliente = ext_fk_cpf_cliente;
        this.ext_nome_cliente = ext_nome_cliente;
        this.ext_endereco_cliente = ext_endereco_cliente;
        this.ext_telefone_cliente = ext_telefone_cliente;
        this.ext_email_cliente = ext_email_cliente;
        this.ext_descricao_bebida = ext_descricao_bebida;
        this.ext_cod_de_barras_bebida = ext_cod_de_barras_bebida;
        this.ext_marca_bebida = ext_marca_bebida;
        this.ext_gp_mercadoria_bebida = ext_gp_mercadoria_bebida;
        this.ext_t_do_item_bebida = ext_t_do_item_bebida;
        this.ext_q_adquirida_do_pedido = ext_q_adquirida_do_pedido;
        this.ext_v_unitario_bebida = ext_v_unitario_bebida;
        this.ext_v_total_pedido = ext_v_total_pedido;
        this.ext_fk_cod_bebida = ext_fk_cod_bebida;
        this.ext_status_pagamento = ext_status_pagamento;
    }

    public int getExt_id_pedido() {
        return ext_id_pedido;
    }

    public void setExt_id_pedido(int ext_id_pedido) {
        this.ext_id_pedido = ext_id_pedido;
    }

    public String getExt_fk_cpf_cliente() {
        return ext_fk_cpf_cliente;
    }

    public void setExt_fk_cpf_cliente(String ext_fk_cpf_cliente) {
        this.ext_fk_cpf_cliente = ext_fk_cpf_cliente;
    }

    public String getExt_nome_cliente() {
        return ext_nome_cliente;
    }

    public void setExt_nome_cliente(String ext_nome_cliente) {
        this.ext_nome_cliente = ext_nome_cliente;
    }

    public String getExt_endereco_cliente() {
        return ext_endereco_cliente;
    }

    public void setExt_endereco_cliente(String ext_endereco_cliente) {
        this.ext_endereco_cliente = ext_endereco_cliente;
    }

    public long getExt_telefone_cliente() {
        return ext_telefone_cliente;
    }

    public void setExt_telefone_cliente(long ext_telefone_cliente) {
        this.ext_telefone_cliente = ext_telefone_cliente;
    }

    public String getExt_email_cliente() {
        return ext_email_cliente;
    }

    public void setExt_email_cliente(String ext_email_cliente) {
        this.ext_email_cliente = ext_email_cliente;
    }

    public String getExt_descricao_bebida() {
        return ext_descricao_bebida;
    }

    public void setExt_descricao_bebida(String ext_descricao_bebida) {
        this.ext_descricao_bebida = ext_descricao_bebida;
    }

    public String getExt_cod_de_barras_bebida() {
        return ext_cod_de_barras_bebida;
    }

    public void setExt_cod_de_barras_bebida(String ext_cod_de_barras_bebida) {
        this.ext_cod_de_barras_bebida = ext_cod_de_barras_bebida;
    }

    public String getExt_marca_bebida() {
        return ext_marca_bebida;
    }

    public void setExt_marca_bebida(String ext_marca_bebida) {
        this.ext_marca_bebida = ext_marca_bebida;
    }

    public String getExt_gp_mercadoria_bebida() {
        return ext_gp_mercadoria_bebida;
    }

    public void setExt_gp_mercadoria_bebida(String ext_gp_mercadoria_bebida) {
        this.ext_gp_mercadoria_bebida = ext_gp_mercadoria_bebida;
    }

    public String getExt_t_do_item_bebida() {
        return ext_t_do_item_bebida;
    }

    public void setExt_t_do_item_bebida(String ext_t_do_item_bebida) {
        this.ext_t_do_item_bebida = ext_t_do_item_bebida;
    }

    public int getExt_q_adquirida_do_pedido() {
        return ext_q_adquirida_do_pedido;
    }

    public void setExt_q_adquirida_do_pedido(int ext_q_adquirida_do_pedido) {
        this.ext_q_adquirida_do_pedido = ext_q_adquirida_do_pedido;
    }

    public double getExt_v_unitario_bebida() {
        return ext_v_unitario_bebida;
    }

    public void setExt_v_unitario_bebida(double ext_v_unitario_bebida) {
        this.ext_v_unitario_bebida = ext_v_unitario_bebida;
    }

    public double getExt_v_total_pedido() {
        return ext_v_total_pedido;
    }

    public void setExt_v_total_pedido(double ext_v_total_pedido) {
        this.ext_v_total_pedido = ext_v_total_pedido;
    }

    public int getExt_fk_cod_bebida() {
        return ext_fk_cod_bebida;
    }

    public void setExt_fk_cod_bebida(int ext_fk_cod_bebida) {
        this.ext_fk_cod_bebida = ext_fk_cod_bebida;
    }

    public String getExt_status_pagamento() {
        return ext_status_pagamento;
    }

    public void setExt_status_pagamento(String ext_status_pagamento) {
        this.ext_status_pagamento = ext_status_pagamento;
    }
}
//Tenho a classe Extrato que representa uma extrato com atributos basicos como id do pedido, nome do cliente, descrição da bebida e etc.
//possui construtores para inicializar objetos dessa classe.
//metodos getters e setters para acessar e modificar os campos privados da classe.
