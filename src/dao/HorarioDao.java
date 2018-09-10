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
import model.Horario;

/**
 *
 * @author Luis
 */
public class HorarioDao {
    private Connection conecta;

    public HorarioDao() {
        this.conecta = new ConectionFactory().conecta();
    }
    
    public void incluirHorario(Horario obj){
        try{
            String sql = "insert into horario(idCliente, idAnimal, data) values(?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setInt(1, obj.getCliente().getId());
            stmt.setInt(2, obj.getAnimal().getId());
            stmt.setDate(3, new java.sql.Date(obj.getData().getTime()));
            
            stmt.execute();
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
