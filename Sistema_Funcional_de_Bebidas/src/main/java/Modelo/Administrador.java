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
    private long telefone;
    private String categoria_tel;
    private String endereco;
    private String bairro;
    private String email;
    private String senha;
    private String sexo;
    
    public Administrador(){
        
    }
    
    public Administrador(int cod, String nome, long telefone, String categoria_tel, String endereco, String bairro, String email, String senha, String sexo) {
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

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
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
        if(email == null || !email.contains("@")){
            throw new IllegalArgumentException("Email invalido!");
        }
        this.email = email;
    }

    public String getSenha() {
        if(senha == null || senha.length() < 8){
            throw new IllegalArgumentException("Senha deve ter no minimo 8 caracteres!");
        }
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
//Tenho a classe Administrador que representa um administrador com atributos basicos como codigo, nome, telefone e etc.
//possui construtores para inicializar objetos dessa classe.
//metodos getters e setters para acessar e modificar os campos privados da classe.
//Uma validação basica de email e senha utilizada na tela de login mais para frente do codigo.
