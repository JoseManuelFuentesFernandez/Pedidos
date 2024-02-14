package ies.torredelrey.modelo;

import ies.torredelrey.modelo.Empleados;
import ies.torredelrey.modelo.Ordenes;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-14T11:14:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, Date> fechaNac;
    public static volatile SingularAttribute<Empleados, Integer> extension;
    public static volatile CollectionAttribute<Empleados, Empleados> empleadosCollection;
    public static volatile SingularAttribute<Empleados, Integer> empleadoid;
    public static volatile SingularAttribute<Empleados, String> apellido;
    public static volatile SingularAttribute<Empleados, String> nombre;
    public static volatile CollectionAttribute<Empleados, Ordenes> ordenesCollection;
    public static volatile SingularAttribute<Empleados, Empleados> reportaA;

}