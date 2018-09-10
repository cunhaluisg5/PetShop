/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            + "observacao, cpfProprietario) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getEspecie());
            stmt.setString(4, obj.getRaca());
            stmt.setString(5, obj.getSexo());
            stmt.setDate(6, new java.sql.Date(obj.getDataNascimento().getTime()));
            stmt.setString(7, obj.getPelagem());
            stmt.setString(8, obj.getObservacao());
            stmt.setString(9, obj.getCpfProprietario());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Animal> listarAnimais(){
        try{
            String sql = "select * from animal";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Animal> lista = new ArrayList<Animal>();
            
            while(rs.next()){
                Animal animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setNome(rs.getString("nome"));
                animal.setIdade(rs.getInt("idade"));
                animal.setEspecie(rs.getString("especie"));
                animal.setRaca(rs.getString("raca"));
                animal.setSexo(rs.getString("sexo"));
                animal.setDataNascimento(rs.getDate("dataNascimento"));
                animal.setPelagem(rs.getString("pelagem"));
                animal.setObservacao(rs.getString("observacao"));
                animal.setCpfProprietario(rs.getString("cpfProprietario"));
                lista.add(animal);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
