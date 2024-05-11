/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hairath.managedbeans;

import hairath.entities.Sms;
import hairath.services.implementations.SmsServiceImp;
/**
 *
 * @author HAIRATH
 */
public class SmsController {
    
    
   private SmsServiceImp mesService;

    public SmsController() {
        this.mesService= new SmsServiceImp();
    }
    
    
    public void instance(){
        Sms sms=new Sms(1,"cher client votre souscription est validé");
        Sms sms1=new Sms(2,"cher client votre souscription est en attente");
        mesService.save(sms, "AFFO");
        mesService.save(sms1, "Radia");
    }
    public void listeSmsEnvoyé(){
        System.out.println("collections des sms envoyé! ");
        mesService.findAllActif();
    }
    
    public void listeSmsEnAttente(){
        System.out.println("collections des sms en attente");
        mesService.findAllNotActif();
    }
    
}
