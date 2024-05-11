package hairath.entities;

import hairath.entities.Sms;
import hairath.entities.Souscription;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-08T14:48:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Integer> idClient;
    public static volatile ListAttribute<Client, Sms> smsCollection;
    public static volatile SingularAttribute<Client, String> telephone;
    public static volatile ListAttribute<Client, Souscription> souscriptionCollection;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> prenom;

}