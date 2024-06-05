/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import lombok.Getter;

/**
 *
 * @author valkiria
 */
@Getter
public class compraParaCombos {
    long id;
    String descripcion;


    public compraParaCombos(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public compraParaCombos() {
    }

    @Override
    public String toString() {
        return id+" "+ descripcion;
    }
    
}
