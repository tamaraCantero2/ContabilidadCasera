/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabilidadcasera;

import Entidades.Compra;
import controladores.controladorCompras;
import java.time.LocalDate;
import javax.persistence.*;
import org.eclipse.persistence.internal.jpa.*;
import vistas.MenuPrincipal;

/**
 *
 * @author valkiria
 */
public class ContabilidadCasera {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        MenuPrincipal mp=new MenuPrincipal();
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
    }
}
