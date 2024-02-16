package ies.torredelrey.modelo;

import ies.torredelrey.modelo.Categorias;
import ies.torredelrey.modelo.DetalleOrdenes;
import ies.torredelrey.modelo.Proveedores;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-16T08:50:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Double> preciounit;
    public static volatile SingularAttribute<Productos, Integer> existencia;
    public static volatile CollectionAttribute<Productos, DetalleOrdenes> detalleOrdenesCollection;
    public static volatile SingularAttribute<Productos, Proveedores> proveedorid;
    public static volatile SingularAttribute<Productos, Integer> productoid;
    public static volatile SingularAttribute<Productos, Categorias> categoriaid;

}