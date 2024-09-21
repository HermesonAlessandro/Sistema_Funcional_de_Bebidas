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
        LocalDateTime agora = LocalDateTime.now();
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
    
    public static String getDataHoraAtual(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatar);
    }
}
