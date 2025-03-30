package com.mycompany.centroveterinarioixtepec.logical;

import com.mycompany.centroveterinarioixtepec.entidades.Ingreso;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-26T20:28:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Ingreso.class)
public class Ingreso_ { 

    public static volatile SingularAttribute<Ingreso, String> fechaIngreso;
    public static volatile SingularAttribute<Ingreso, String> estadoAlta;
    public static volatile SingularAttribute<Ingreso, String> horaIngreso;
    public static volatile SingularAttribute<Ingreso, String> cirugia;
    public static volatile SingularAttribute<Ingreso, String> horaEgreso;
    public static volatile SingularAttribute<Ingreso, Integer> idIngreso;
    public static volatile SingularAttribute<Ingreso, String> costo;
    public static volatile SingularAttribute<Ingreso, String> estadoPagado;
    public static volatile SingularAttribute<Ingreso, Mascota> mascota;
    public static volatile SingularAttribute<Ingreso, String> fechaEgreso;

}