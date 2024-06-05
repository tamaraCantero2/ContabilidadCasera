/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import utiles.Mes;

/**
 *
 * @author valkiria
 */
@Getter
@Entity

@Table(name = "depositos_mensuales")
public class DepositoMensual implements Serializable{
    @Id
    @Column
    private int id;
    @Column(name="año")
    private int anio;
    
    @Column
    private String mes;
    @Column
    private double depositado;
    
    @Column(name = "descripcion")
    private String descripcion;

    public DepositoMensual(int anio, Mes mes, double depositado,String descripcion) {
        this.anio = anio;
        this.mes = mes.obtenerStringMes();
        this.depositado = depositado;
        this.descripcion=descripcion;
    }
    
    
}
