/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Hermeson Alessandro
 */
public class Sessao {
    private static String nomeUsuario;
    private static String cumprimento;
    private static String dataHoraEntrada;
    private static String tipoUsuario;
    private static int codUsuarioAdm;
    private static String rgUsuarioSec;
    private static String cpfUsuarioCli;
     
    public static String getNomeUsuario() {
        return nomeUsuario;
    }

    public static void setNomeUsuario(String nomeUsuario) {
        Sessao.nomeUsuario = nomeUsuario;
    }

    public static String getCumprimento() {
        return cumprimento;
    }

    public static void setCumprimento(String cumprimento) {
        Sessao.cumprimento = cumprimento;
    }

    public static String getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public static void setDataHoraEntrada(String dataHoraEntrada) {
        Sessao.dataHoraEntrada = dataHoraEntrada;
    }

    public static String getTipoUsuario() {
        return tipoUsuario;
    }

    public static void setTipoUsuario(String tipoUsuario) {
        Sessao.tipoUsuario = tipoUsuario;
    }

    public static int getCodUsuarioAdm() {
        return codUsuarioAdm;
    }

    public static void setCodUsuarioAdm(int codUsuarioAdm) {
        Sessao.codUsuarioAdm = codUsuarioAdm;
    }

    public static String getRgUsuarioSec() {
        return rgUsuarioSec;
    }

    public static void setRgUsuarioSec(String rgUsuarioSec) {
        Sessao.rgUsuarioSec = rgUsuarioSec;
    }

    public static String getCpfUsuarioCli() {
        return cpfUsuarioCli;
    }

    public static void setCpfUsuarioCli(String cpfUsuarioCli) {
        Sessao.cpfUsuarioCli = cpfUsuarioCli;
    }
    
    public static void LimparSessao(){
        nomeUsuario = null;
        cumprimento = null;
        dataHoraEntrada = null;
        tipoUsuario = null;
        codUsuarioAdm = 0;
        rgUsuarioSec = null;
        cpfUsuarioCli = null;
    }
}
//Tenho a classe Sessão que representa uma sessao com atributos basicos como nome de usuario, data e hora, tipo de usuario e etc.
//possui construtores para inicializar objetos dessa classe.
//metodos getters e setters para acessar e modificar os campos privados da classe.
//Possui um metodo aonde vai limpar esses campos estaticos 0 para int e null para String.
//Em resumo essa classe gerencia as informações de sessão e usa o metodo estatico de limpar quando necessário.
