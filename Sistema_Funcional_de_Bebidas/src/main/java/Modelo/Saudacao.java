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
        String comprimento;
        if(agora.getHour() < 12){
            comprimento = "Bom dia";
        }else if(agora.getHour() < 18){
            comprimento = "Boa tarde";
        }else{
            comprimento = "Boa noite";
        }
        return comprimento + ", " + nomeUsuario;
    }
    
    public static String getDataHoraAtual(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatar);
    }
}
