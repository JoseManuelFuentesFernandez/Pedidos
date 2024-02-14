package ies.torredelrey.modelo;

import ies.torredelrey.modelo.DetalleOrdenesPK;
import ies.torredelrey.modelo.Ordenes;
import ies.torredelrey.modelo.Productos;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-14T11:14:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(DetalleOrdenes.class)
public class DetalleOrdenes_ { 

    public static volatile SingularAttribute<DetalleOrdenes, Ordenes> ordenes;
    public static volatile SingularAttribute<DetalleOrdenes, Productos> productoid;
    public static volatile SingularAttribute<DetalleOrdenes, Integer> cantidad;
    public static volatile SingularAttribute<DetalleOrdenes, DetalleOrdenesPK> detalleOrdenesPK;

}