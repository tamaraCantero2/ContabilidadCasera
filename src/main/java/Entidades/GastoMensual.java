/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.Getter;
import utiles.Mes;

/**
 *
 * @author valkiria
 */
@Getter
@Entity
@Table(name = "gastos_mensuales")
public class GastoMensual implements Serializable{
    @Id
    private int idGastoMensual;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = true)
    private double precio;

    @Column(name = "mes_pagado")
    private String mes;
    
    @Column(name = "proximafechaVencimiento")
    private LocalDate vencimiento;

    @Column(name = "pagado_el")
    private LocalDate fechaPagado;
    
    @Column (name ="cuotas")
    private String cuotasTotal;
    
    @OneToOne
    @JoinColumn(name = "id_compra", referencedColumnName = "id_compra")
    private Compra compra;
    
    public GastoMensual(String nombre, double precio, Mes mes, LocalDate vencimiento,LocalDate fechaPagado,int cuotasTotales, int cuotasPagas,Compra compra) {
        this.nombre = nombre;
        this.precio = precio;
        this.mes = mes.obtenerStringMes();
        this.vencimiento = vencimiento;
        this.fechaPagado= fechaPagado;
        this.cuotasTotal=cuotasPagas+"/"+cuotasTotales;
        this.compra=compra;
       
    }
    
    public GastoMensual(){}
}
