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
    private long cpf;
    private String nome;
    private LocalDate d_nasc;
    private String sexo;
    private String endereco;
    private long telefone;
    private String email;
    private String senha;
    private long fk_rg_sec;
    
    public Cliente(){
        
    }

    public Cliente(long cpf, String nome, LocalDate d_nasc, String sexo, String endereco, long telefone, String email, String senha, long fk_rg_sec) {
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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
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
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getFk_rg_sec() {
        return fk_rg_sec;
    }

    public void setFk_rg_sec(long fk_rg_sec) {
        this.fk_rg_sec = fk_rg_sec;
    }
}
