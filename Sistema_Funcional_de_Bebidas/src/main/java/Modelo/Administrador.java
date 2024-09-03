/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hermeson Alessandro
 */
public class Administrador {
    private int cod;
    private String nome;
    private int telefone;
    private String categoria_tel;
    private String endereco;
    private String bairro;
    private String email;
    private String senha;
    private String sexo;
    
    public Administrador(){
        
    }
    
    public Administrador(int cod, String nome, int telefone, String categoria_tel, String endereco, String bairro, String email, String senha, String sexo) {
        this.cod = cod;
        this.nome = nome;
        this.telefone = telefone;
        this.categoria_tel = categoria_tel;
        this.endereco = endereco;
        this.bairro = bairro;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCategoria_tel() {
        return categoria_tel;
    }

    public void setCategoria_tel(String categoria_tel) {
        this.categoria_tel = categoria_tel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
