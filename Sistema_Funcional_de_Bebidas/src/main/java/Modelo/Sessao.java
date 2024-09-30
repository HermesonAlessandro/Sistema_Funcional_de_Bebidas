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
