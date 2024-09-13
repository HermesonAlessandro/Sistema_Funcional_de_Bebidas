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
public class Secretaria {
    private long rg;
    private String nome;
    private LocalDate d_nasc;
    private String sexo;
    private String endereco;
    private long telefone;
    private String email;
    private String senha;
    private int fk_cod_adm;
    
    public Secretaria(){
        
    }

    public Secretaria(long rg, String nome, LocalDate d_nasc, String sexo, String endereco, long telefone, String email, String senha, int fk_cod_adm) {
        this.rg = rg;
        this.nome = nome;
        this.d_nasc = d_nasc;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.fk_cod_adm = fk_cod_adm;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
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
            throw new IllegalArgumentException("Email inválido!");
        }
        this.email = email;
    }

    public String getSenha() {
        if(senha == null || senha.length() < 8){
            throw new IllegalArgumentException("Senha deve ter no mínimo 8 caracteres!");
        }
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getFk_cod_adm() {
        return fk_cod_adm;
    }

    public void setFk_cod_adm(int fk_cod_adm) {
        this.fk_cod_adm = fk_cod_adm;
    } 
}