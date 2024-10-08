/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hermeson Alessandro
 */
public class Bebida {
    private int cod;
    private String cod_de_barras;
    private String descricao;
    private String marca;
    private String gp_mercadoria;
    private String t_do_item;
    private int q_estoque;
    private double v_unitario;
    
    public Bebida(){
        
    }

    public Bebida(int cod, String cod_de_barras, String descricao, String marca, String gp_mercadoria, String t_do_item, int q_estoque, double v_unitario) {
        this.cod = cod;
        this.cod_de_barras = cod_de_barras;
        this.descricao = descricao;
        this.marca = marca;
        this.gp_mercadoria = gp_mercadoria;
        this.t_do_item = t_do_item;
        this.q_estoque = q_estoque;
        this.v_unitario = v_unitario;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCod_de_barras() {
        return cod_de_barras;
    }

    public void setCod_de_barras(String cod_de_barras) {
        this.cod_de_barras = cod_de_barras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGp_mercadoria() {
        return gp_mercadoria;
    }

    public void setGp_mercadoria(String gp_mercadoria) {
        this.gp_mercadoria = gp_mercadoria;
    }

    public String getT_do_item() {
        return t_do_item;
    }

    public void setT_do_item(String t_do_item) {
        this.t_do_item = t_do_item;
    }

    public int getQ_estoque() {
        return q_estoque;
    }

    public void setQ_estoque(int q_estoque) {
        this.q_estoque = q_estoque;
    }

    public double getV_unitario() {
        return v_unitario;
    }

    public void setV_unitario(double v_unitario) {
        this.v_unitario = v_unitario;
    }
}
