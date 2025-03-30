package com.mycompany.centroveterinarioixtepec.logical;

import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-01-26T20:28:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> apeMaterno;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> apePaterno;
    public static volatile SingularAttribute<Cliente, String> curp;
    public static volatile ListAttribute<Cliente, Mascota> listaMascotas;

}