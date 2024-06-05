package Entidades;

import Entidades.Compra;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T18:03:18", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(GastoMensual.class)
public class GastoMensual_ { 

    public static volatile SingularAttribute<GastoMensual, LocalDate> vencimiento;
    public static volatile SingularAttribute<GastoMensual, Compra> compra;
    public static volatile SingularAttribute<GastoMensual, Double> precio;
    public static volatile SingularAttribute<GastoMensual, LocalDate> fechaPagado;
    public static volatile SingularAttribute<GastoMensual, Integer> idGastoMensual;
    public static volatile SingularAttribute<GastoMensual, String> cuotasTotal;
    public static volatile SingularAttribute<GastoMensual, String> mes;
    public static volatile SingularAttribute<GastoMensual, String> nombre;

}