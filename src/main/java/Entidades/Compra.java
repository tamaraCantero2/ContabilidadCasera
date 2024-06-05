/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author valkiria
 */
@Getter@Setter
@Entity
@Table(name = "compras")
public class Compra implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra",nullable = false,unique = true)
    private long idCompra;
    @Column
    private String descripcion;
    @Column
    private LocalDate fechaDeCompra;
    @Column
    private String lugarDeCompra;
    @Column
    private double precio;

    public Compra(String descripcion, LocalDate fechaDeCompra, String lugarDeCompra, double precio) {
        this.descripcion = descripcion;
        this.fechaDeCompra = fechaDeCompra;
        this.lugarDeCompra = lugarDeCompra;
        this.precio = precio;
        
    }

    public Compra() {
    }
    
    
}
