/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.Administrador;

/**
 *
 * @author Hermeson Alessandro
 */
public class AdministradorDAO {
    public void CadastrarAdministrador(Administrador administrador){
        String sql = "INSERT INTO administrador (cod, nome, telefone, categoria_tel, endereco, bairro, email, senha, sexo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }
}
