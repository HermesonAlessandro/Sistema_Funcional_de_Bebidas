/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hermeson Alessandro
 */
public class Saudacao {
    public static String getCumprimento(String nomeUsuario){
        LocalTime agora = LocalTime.now();
        String comprimento;
        if(agora.isBefore(LocalTime.NOON)){
            comprimento = "Bom dia";
        }else if(agora.isBefore(LocalTime.of(18, 0))){
            comprimento = "Boa tarde";
        }else{
            comprimento = "Boa noite";
        }
        return comprimento + ", " + nomeUsuario;
    }
    
    public static String getDataHoraAtual(){
        LocalTime agora = LocalTime.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatar);
    }
}
