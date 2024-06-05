/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Entidades.Compra;
import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;
import utiles.Mes;

/**
 *
 * @author valkiria
 */
public class controladorCompras extends ControladorGeneral<Compra>{

    public controladorCompras() {
        setClase(Compra.class);
    }
    
    public ArrayList<Compra> buscarXNombre(Compra compra){
        Query busqueda=entityManager.createNativeQuery("SELECT * FROM contabilidadcaseradb.compras WHERE descripcion like ?");
       
        busqueda.setParameter(0, compra.getDescripcion());
        
        List<Object[]> resultados=busqueda.getResultList();
        
        ArrayList<Compra> comprasResultantes=new ArrayList<>();
        
        resultados.stream()
                .map( resultado -> comprasResultantes.add(
                        new Compra(
                         (String)resultado[1],(LocalDate)resultado[2],(String)resultado[3], (double) resultado[4]
                        )
                    )
                );
        
        return comprasResultantes;
    }

        public ArrayList<Compra> buscarXMes(Mes mes){
            List<Compra> todasLasCompras=buscarTodos();

            
  /*          Query busqueda=entityManager.createNativeQuery("SELECT * FROM contabilidadcaseradb.compras WHERE fechaDeCompra=?");
       
        busqueda.setParameter(0, fecha);
        
        
        ArrayList<Compra> comprasResultantes=new ArrayList<>();
        
        resultados.stream()
                .map( resultado -> comprasResultantes.add(
                        new Compra(
                         (String)resultado[1],(LocalDate)resultado[2],(String)resultado[3], (double) resultado[4]
                        )
                    )
                );
*/
        List<Compra> resultados=new ArrayList<>();
        resultados = todasLasCompras.stream().map(c->Mes.getMesXNameIngles(c.getFechaDeCompra().getMonth().toString())==mes?new Compra(c.getDescripcion(), c.getFechaDeCompra(), c.getLugarDeCompra(), c.getPrecio()):new Compra()).collect(Collectors.toList());
        return (ArrayList<Compra>) resultados;
    }

}
