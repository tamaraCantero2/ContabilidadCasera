package Entidades;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-05T18:03:18", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, String> descripcion;
    public static volatile SingularAttribute<Compra, Double> precio;
    public static volatile SingularAttribute<Compra, LocalDate> fechaDeCompra;
    public static volatile SingularAttribute<Compra, Long> idCompra;
    public static volatile SingularAttribute<Compra, String> lugarDeCompra;

}