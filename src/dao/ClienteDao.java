/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;

/**
 *
 * @author Luis
 */
public class ClienteDao {
    Connection conecta;
    
    public void cadastrarCliente(Cliente obj){
        try{
            String sql = "insert into cliente(nome, idade, sexo, cpf, dataNascimento, estadoCivil, rua, bairro, "
            + "complemento, numero, estado, cidade, telefone, celular) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getSexo());
            stmt.setString(4, obj.getCpf());
            stmt.setDate(5, (Date) obj.getDataNascimento());
            stmt.setString(6, obj.getEstadoCivil());
            stmt.setString(7, obj.getEndereco().getRua());
            stmt.setString(8, obj.getEndereco().getBairro());
            stmt.setString(9, obj.getEndereco().getComplemento());
            stmt.setInt(10, obj.getEndereco().getNumero());
            stmt.setString(11, obj.getEndereco().getEstado());
            stmt.setString(12, obj.getEndereco().getCidade());
            stmt.setString(13, obj.getEndereco().getTelefone());
            stmt.setString(14, obj.getEndereco().getCelular());
            
            stmt.execute();
            stmt.close();            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
