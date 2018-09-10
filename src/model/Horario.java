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
    private Animal animal;
    private Cliente cliente;
    private Date data;

    public Horario() {
    }

    public Horario(Animal animal, Cliente cliente, Date data) {
        this.animal = animal;
        this.cliente = cliente;
        this.data = data;
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

    @Override
    public String toString() {
        return "Horario{" + "animal=" + animal + ", cliente=" + cliente + ", data=" + data + '}';
    }
}
