package Entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T18:03:18", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DepositoMensual.class)
public class DepositoMensual_ { 

    public static volatile SingularAttribute<DepositoMensual, String> descripcion;
    public static volatile SingularAttribute<DepositoMensual, String> mes;
    public static volatile SingularAttribute<DepositoMensual, Integer> id;
    public static volatile SingularAttribute<DepositoMensual, Double> depositado;
    public static volatile SingularAttribute<DepositoMensual, Integer> anio;

}