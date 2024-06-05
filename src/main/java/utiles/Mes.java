/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package utiles;

import javax.swing.JOptionPane;

/**
 *
 * @author valkiria
 */
public enum Mes {
    ENERO("Enero",1,"January"),
    FEBRERO("Febrero",2,"February"),
    MARZO("Marzo",3,"March"),
    ABRIL("Abril",4,"April"),
    MAYO("Mayo",5,"May"),
    JUNIO("Junio",6,"June"),
    JULIO("Julio",7,"July"),
    AGOSTO("Agosto",8,"August"),
    SEPTIEMBRE("Septiembre",9,"September"),
    OCTUBRE("Octubre",10,"October"),
    NOVIEMBRE("Noviembre",11,"November"),
    DICIEMBRE("Diciembre",12,"December");
    
    private String nombreMes;
    private int id;
    private String nombreInglesMes;
    private Mes(String nombreMes,int id, String nombreIngles){
        this.nombreMes=nombreMes;
        this.id=id;
        this.nombreInglesMes=nombreIngles;
    }
    
    public String obtenerStringMes(){
        return this.nombreMes;
    }
    
    public static final Mes getMesXid(int id){
        for (Mes mes : Mes.values()) {
            if(mes.id==id){
                return mes;
            }
        }
        JOptionPane.showMessageDialog(null, "No hemos encontrado el mes especificado");
        return null;
    }
    
    public static Mes getMesXName(String name){
        for (Mes mes : Mes.values()) {
            if(mes.nombreMes.equalsIgnoreCase(name)){
                return mes;
            }
        }
        //JOptionPane.showMessageDialog(null, "No hemos encontrado el mes especificado");
        return null;
    }
    public static Mes getMesXNameIngles(String name){
        for (Mes mes : Mes.values()) {
            if(mes.nombreInglesMes.equalsIgnoreCase(name)){
                return mes;
            }
        }
        JOptionPane.showMessageDialog(null, "No hemos encontrado el mes especificado en ingles");
        return null;
    }
}
