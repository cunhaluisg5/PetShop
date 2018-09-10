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
    private Animal animal;
    private Cliente cliente;
    private Date data;
    private Date horario;

    public Horario() {
    }

    public Horario(int id, Animal animal, Cliente cliente, Date data, Date horario) {
        this.id = id;
        this.animal = animal;
        this.cliente = cliente;
        this.data = data;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Horario{" + "id=" + id + ", animal=" + animal + ", cliente=" + cliente + ", data=" + data + ", horario=" + horario + '}';
    }
}
