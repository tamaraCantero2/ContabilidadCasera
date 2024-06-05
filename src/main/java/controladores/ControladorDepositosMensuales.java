/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import Entidades.DepositoMensual;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import utiles.Mes;
/**
 *
 * @author valkiria
 */
public class ControladorDepositosMensuales extends ControladorGeneral<DepositoMensual>{
    
    public ControladorDepositosMensuales(){
        setClase(DepositoMensual.class);
    }
    
    public ArrayList<DepositoMensual> buscarDepositosXAño(int año){
        ArrayList<DepositoMensual> depositos=new ArrayList<>();
        Query query= entityManager.createNativeQuery("SELECT * FROM contabilidadcaseradb WHERE año=?");
        query.setParameter(0, año);
        List<Object[]> arraysDepositos=query.getResultList();
        arraysDepositos.forEach(a->depositos.add(new DepositoMensual((int)a[1], (Mes)a[4], (double)a[2], (String)a[3])));
        return depositos;
    }
    
    public ArrayList<DepositoMensual> buscarDepositosXMes(String mes){
        ArrayList<DepositoMensual> depositos=new ArrayList<>();
        Query query= entityManager.createNativeQuery("SELECT * FROM contabilidadcaseradb.depositos_mensuales WHERE mes=?");
        query.setParameter(1, mes);
        List<Object[]> arraysDepositos=query.getResultList();
        arraysDepositos.forEach(a->depositos.add(new DepositoMensual((int)a[1], Mes.getMesXName(a[4].toString()), (double)a[2], (String)a[3])));
        return depositos;
    }   
    
}
