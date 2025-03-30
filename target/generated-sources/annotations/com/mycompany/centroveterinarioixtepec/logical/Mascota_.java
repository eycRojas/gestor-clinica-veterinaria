package com.mycompany.centroveterinarioixtepec.logical;

import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import com.mycompany.centroveterinarioixtepec.entidades.Cita;
import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Desparasitacion;
import com.mycompany.centroveterinarioixtepec.entidades.Ingreso;
import com.mycompany.centroveterinarioixtepec.entidades.Vacunacion;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-26T20:28:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile ListAttribute<Mascota, Ingreso> listaIngreso;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, String> fecha_nacimiento;
    public static volatile SingularAttribute<Mascota, Integer> idMascota;
    public static volatile SingularAttribute<Mascota, String> nombre;
    public static volatile SingularAttribute<Mascota, String> especie;
    public static volatile SingularAttribute<Mascota, Cliente> cliente;
    public static volatile ListAttribute<Mascota, Desparasitacion> listaDesparasitacion;
    public static volatile ListAttribute<Mascota, Vacunacion> listaVacunacion;
    public static volatile ListAttribute<Mascota, Cita> listaCita;
    public static volatile SingularAttribute<Mascota, String> sexo;
    public static volatile SingularAttribute<Mascota, String> senias;

}