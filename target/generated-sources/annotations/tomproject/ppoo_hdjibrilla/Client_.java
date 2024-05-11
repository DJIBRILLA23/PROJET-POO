package tomproject.ppoo_hdjibrilla;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tomproject.ppoo_hdjibrilla.Sms;
import tomproject.ppoo_hdjibrilla.Souscription;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-08T14:48:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile CollectionAttribute<Client, Sms> smsCollection;
    public static volatile SingularAttribute<Client, String> telephone;
    public static volatile CollectionAttribute<Client, Souscription> souscriptionCollection;
    public static volatile SingularAttribute<Client, Integer> id;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> prenom;

}