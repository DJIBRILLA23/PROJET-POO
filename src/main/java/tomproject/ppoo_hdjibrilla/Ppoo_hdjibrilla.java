/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tomproject.ppoo_hdjibrilla;

import hairath.managedbeans.ClientController;
import hairath.managedbeans.ProduitController;
import hairath.managedbeans.SmsController;
import hairath.managedbeans.SouscriptionController;
import hairath.utils.ConnectBD;
import java.sql.Connection;


/**
 *
 * @author HAIRATH
 */
public class Ppoo_hdjibrilla {

    public static void main(String[] args) {
       ClientController controller = new ClientController();
        controller.instances();
        ProduitController controllerProduit= new ProduitController();
        controllerProduit.instances();
        SouscriptionController sousC=new SouscriptionController();
        sousC.instances();
        Connection con = new ConnectBD().seConnecter();
         SmsController smsC=new SmsController();
         System.out.println("erreur");
        smsC.instance();
    }
}
