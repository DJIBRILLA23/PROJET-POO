package hairath.entities;

import hairath.entities.Souscription;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-08T14:48:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile ListAttribute<Produit, Souscription> souscriptionList;
    public static volatile SingularAttribute<Produit, Integer> idProduit;
    public static volatile SingularAttribute<Produit, String> libelle;
    public static volatile SingularAttribute<Produit, String> actif;

}