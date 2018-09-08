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
import jdbc.ConectionFactory;
import model.Cliente;

/**
 *
 * @author Luis
 */
public class ClienteDao {
    Connection conecta;

    public ClienteDao() {
        this.conecta = new ConectionFactory().conecta();
    }
    
    public void cadastrarCliente(Cliente obj){
        try{
            String sql = "insert into cliente(nome, idade, sexo, cpf, dataNascimento, estadoCivil, rua, bairro, "
            + "complemento, numero, estado, cidade, telefone, celular) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getSexo());
            stmt.setString(4, obj.getCpf());
            stmt.setDate(5, new java.sql.Date(obj.getDataNascimento().getTime()));
            stmt.setString(6, obj.getEstadoCivil());
            stmt.setString(7, obj.getRua());
            stmt.setString(8, obj.getBairro());
            stmt.setString(9, obj.getComplemento());
            stmt.setInt(10, obj.getNumero());
            stmt.setString(11, obj.getEstado());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getTelefone());
            stmt.setString(14, obj.getCelular());
            
            stmt.execute();
            stmt.close();            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
