package tomproject.ppoo_hdjibrilla;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tomproject.ppoo_hdjibrilla.Souscription;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-08T14:48:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, String> libelle;
    public static volatile SingularAttribute<Produit, String> actif;
    public static volatile CollectionAttribute<Produit, Souscription> souscriptionCollection;
    public static volatile SingularAttribute<Produit, Integer> id;

}