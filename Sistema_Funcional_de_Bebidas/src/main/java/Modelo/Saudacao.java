/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hermeson Alessandro
 */
public class Saudacao {
    public static String getCumprimento(String nomeUsuario){
        LocalDateTime agora = LocalDateTime.now();//Instância da classe LocalDateTime que representa a data e hora atual.
        String cumprimento;
        if(agora.getHour() < 12){
            cumprimento = "Bom dia";
        }else if(agora.getHour() < 18){
            cumprimento = "Boa tarde";
        }else{
            cumprimento = "Boa noite";
        }
        return cumprimento + ", " + nomeUsuario;
    } 
     //LocalDateTime agora = LocalDateTime.now(); - Obtém a data e hora atual.
     //Possui algumas condições que dependendo do caso vai mostrar "Bom dia", "Boa tarde", "Boa noite".
     //Retorna uma saudação juntamente com o nome de usuario.
    
    public static String getDataHoraAtual(){
        LocalDateTime agora = LocalDateTime.now();//Instância da classe LocalDateTime que representa a data e hora atual.
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//Formato da data e hora.
        return agora.format(formatar);
    }
}
//LocalDateTime agora = LocalDateTime.now(); - Obtém a data e hora atual.
//DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); - Define o formato da data e hora.
//return agora.format(formatar); - Formata a data e hora atuais e as retorna como uma String.

//A classe Saudação oferece um suporte para gerar uma saudação apropiada com base na hora do dia.
//e pra obter a data e hora atual formatadas.
//utilizando a classe LocalDateTime para manipulação  de data e hora e DateTimeFormatter para a formatação da saída.