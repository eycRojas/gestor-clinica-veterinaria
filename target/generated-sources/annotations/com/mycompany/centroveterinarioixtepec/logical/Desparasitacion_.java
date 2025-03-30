package com.mycompany.centroveterinarioixtepec.logical;

import com.mycompany.centroveterinarioixtepec.entidades.Desparasitacion;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-26T20:28:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Desparasitacion.class)
public class Desparasitacion_ { 

    public static volatile SingularAttribute<Desparasitacion, Double> peso;
    public static volatile SingularAttribute<Desparasitacion, String> nombreDesparasitante;
    public static volatile SingularAttribute<Desparasitacion, Double> dosis;
    public static volatile SingularAttribute<Desparasitacion, String> fechaDesparasitacion;
    public static volatile SingularAttribute<Desparasitacion, Mascota> mascota;
    public static volatile SingularAttribute<Desparasitacion, Integer> idDesparasitante;
    public static volatile SingularAttribute<Desparasitacion, Double> temperatura;
    public static volatile SingularAttribute<Desparasitacion, String> fechaProxDesparasitacion;

}