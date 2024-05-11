package hairath.entities;

import hairath.entities.Produit;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-08T14:48:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Souscription.class)
public class Souscription_ { 

    public static volatile SingularAttribute<Souscription, Integer> idSous;
    public static volatile SingularAttribute<Souscription, Date> dateHeureSous;
    public static volatile SingularAttribute<Souscription, Produit> idProduit;
    public static volatile SingularAttribute<Souscription, String> actif;

}