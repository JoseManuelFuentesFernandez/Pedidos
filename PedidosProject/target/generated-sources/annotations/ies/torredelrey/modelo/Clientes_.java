package ies.torredelrey.modelo;

import ies.torredelrey.modelo.Ordenes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:10:13", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> nombrecia;
    public static volatile SingularAttribute<Clientes, Integer> clienteid;
    public static volatile SingularAttribute<Clientes, String> nombrecontacto;
    public static volatile SingularAttribute<Clientes, String> fijo;
    public static volatile SingularAttribute<Clientes, String> celular;
    public static volatile SingularAttribute<Clientes, String> cedulaRuc;
    public static volatile SingularAttribute<Clientes, String> fax;
    public static volatile SingularAttribute<Clientes, String> email;
    public static volatile CollectionAttribute<Clientes, Ordenes> ordenesCollection;
    public static volatile SingularAttribute<Clientes, String> direccioncli;

}