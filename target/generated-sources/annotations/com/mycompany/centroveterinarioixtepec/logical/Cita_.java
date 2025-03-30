package com.mycompany.centroveterinarioixtepec.logical;

import com.mycompany.centroveterinarioixtepec.entidades.Cita;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-26T20:28:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> idCita;
    public static volatile SingularAttribute<Cita, String> descripcion;
    public static volatile SingularAttribute<Cita, String> fecha;
    public static volatile SingularAttribute<Cita, String> estadoAtendida;
    public static volatile SingularAttribute<Cita, String> hora;
    public static volatile SingularAttribute<Cita, String> asunto;
    public static volatile SingularAttribute<Cita, Mascota> mascota;

}