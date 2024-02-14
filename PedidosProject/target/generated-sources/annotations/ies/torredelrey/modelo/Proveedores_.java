package ies.torredelrey.modelo;

import ies.torredelrey.modelo.Productos;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-14T12:26:41", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, String> contacto;
    public static volatile SingularAttribute<Proveedores, Integer> proveedorid;
    public static volatile CollectionAttribute<Proveedores, Productos> productosCollection;
    public static volatile SingularAttribute<Proveedores, String> fijoprov;
    public static volatile SingularAttribute<Proveedores, String> nombreprov;
    public static volatile SingularAttribute<Proveedores, String> celuprov;

}