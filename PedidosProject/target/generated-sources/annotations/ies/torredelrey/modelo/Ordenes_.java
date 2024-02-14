package ies.torredelrey.modelo;

import ies.torredelrey.modelo.Clientes;
import ies.torredelrey.modelo.DetalleOrdenes;
import ies.torredelrey.modelo.Empleados;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-14T10:46:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Ordenes.class)
public class Ordenes_ { 

    public static volatile CollectionAttribute<Ordenes, DetalleOrdenes> detalleOrdenesCollection;
    public static volatile SingularAttribute<Ordenes, Clientes> clienteid;
    public static volatile SingularAttribute<Ordenes, Integer> descuento;
    public static volatile SingularAttribute<Ordenes, Empleados> empleadoid;
    public static volatile SingularAttribute<Ordenes, Integer> ordenid;
    public static volatile SingularAttribute<Ordenes, Date> fechaorden;

}