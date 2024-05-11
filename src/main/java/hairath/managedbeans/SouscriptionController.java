/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hairath.managedbeans;

import java.util.ArrayList;
import java.util.List;
import hairath.entities.Souscription;
import hairath.services.implementations.SouscriptionServiceImp;
/**
 *
 * @author HAIRATH
 */
public class SouscriptionController {
    
    private SouscriptionServiceImp souscriptionService;

    public SouscriptionController() {
        this.souscriptionService = new SouscriptionServiceImp();
    }
    
    public void instances(){
        Souscription sous=new Souscription(1,"o");
        Souscription sous1=new Souscription(2,"n");
        souscriptionService.save(sous, "AFFO", "Epargne");
        souscriptionService.save(sous1, "Radia", "Courant");
    }
    
}
