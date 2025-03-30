package com.mycompany.centroveterinarioixtepec.logical;

import com.mycompany.centroveterinarioixtepec.entidades.Vacunacion;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-26T20:28:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vacunacion.class)
public class Vacunacion_ { 

    public static volatile SingularAttribute<Vacunacion, String> nombreVacuna;
    public static volatile SingularAttribute<Vacunacion, Integer> idVacunacion;
    public static volatile SingularAttribute<Vacunacion, Double> peso;
    public static volatile SingularAttribute<Vacunacion, String> fechaProxVacunacion;
    public static volatile SingularAttribute<Vacunacion, Double> dosis;
    public static volatile SingularAttribute<Vacunacion, Mascota> mascota;
    public static volatile SingularAttribute<Vacunacion, Double> temperatura;
    public static volatile SingularAttribute<Vacunacion, String> fechaVacunacion;

}