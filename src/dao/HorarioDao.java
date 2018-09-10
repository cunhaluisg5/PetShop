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
            String sql = "insert into horario(idCliente, idAnimal, data, horario) values(?, ?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            stmt.setInt(1, obj.getIdCliente());
            stmt.setInt(2, obj.getIdAnimal());
            stmt.setString(3, obj.getData());
            stmt.setString(4, obj.getHorario());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Horario> listarHorarios(){
        try{
            String sql = "select * from horario";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Horario> lista = new ArrayList<Horario>();
            
            while(rs.next()){
                Horario horario = new Horario();
                horario.setId(rs.getInt("id"));
                horario.setIdCliente(rs.getInt("idCliente"));
                horario.setIdAnimal(rs.getInt("idAnimal"));
                horario.setData(rs.getString("data"));
                horario.setHorario(rs.getString("horario"));
                lista.add(horario);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
