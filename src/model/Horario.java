/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class Horario {
    private int id;
    private int idAnimal;
    private int idCliente;
    private String data;
    private String horario;

    public Horario() {
    }

    public Horario(int id, int idAnimal, int idCliente, String data, String horario) {
        this.id = id;
        this.idAnimal = idAnimal;
        this.idCliente = idCliente;
        this.data = data;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Horario{" + "id=" + id + ", idAnimal=" + idAnimal + ", idCliente=" + idCliente + ", data=" + data + ", horario=" + horario + '}';
    }
}
