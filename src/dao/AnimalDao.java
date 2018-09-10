/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jdbc.ConectionFactory;
import model.Animal;

/**
 *
 * @author Luis
 */
public class AnimalDao {
    Connection conecta;
    
    public AnimalDao() {
        this.conecta = new ConectionFactory().conecta();
    }
    
    public void cadastrarAnimal(Animal obj){
        try{
            String sql = "insert into animal(nome, idade, especie, raca, sexo, dataNascimento, pelagem, "
            + "observacao) values(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getEspecie());
            stmt.setString(4, obj.getRaca());
            stmt.setString(5, obj.getSexo());
            stmt.setDate(6, new java.sql.Date(obj.getDataNascimento().getTime()));
            stmt.setString(7, obj.getPelagem());
            stmt.setString(8, obj.getObservacao());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
