/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.LocalDate;

/**
 *
 * @author Hermeson Alessandro
 */
public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate d_nasc;
    private String sexo;
    private String endereco;
    private long telefone;
    private String email;
    private String senha;
    private String fk_rg_sec;
    
    public Cliente(){
        
    }

    public Cliente(String cpf, String nome, LocalDate d_nasc, String sexo, String endereco, long telefone, String email, String senha, String fk_rg_sec) {
        this.cpf = cpf;
        this.nome = nome;
        this.d_nasc = d_nasc;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.fk_rg_sec = fk_rg_sec;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getD_nasc() {
        return d_nasc;
    }

    public void setD_nasc(LocalDate d_nasc) {
        this.d_nasc = d_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
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

    public String getFk_rg_sec() {
        return fk_rg_sec;
    }

    public void setFk_rg_sec(String fk_rg_sec) {
        this.fk_rg_sec = fk_rg_sec;
    }
}
//Tenho a classe Cliente que representa uma cliente com atributos basicos como cpf, nome, data de nascimento e etc.
//possui construtores para inicializar objetos dessa classe.
//metodos getters e setters para acessar e modificar os campos privados da classe.
//Uma validação basica de email e senha utilizada na tela de login mais para frente do codigo.
