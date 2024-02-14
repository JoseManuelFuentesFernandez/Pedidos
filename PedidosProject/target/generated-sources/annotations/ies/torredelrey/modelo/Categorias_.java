package ies.torredelrey.modelo;

import ies.torredelrey.modelo.Productos;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-14T11:14:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile CollectionAttribute<Categorias, Productos> productosCollection;
    public static volatile SingularAttribute<Categorias, Integer> categoriaid;
    public static volatile SingularAttribute<Categorias, String> nombrecat;

}