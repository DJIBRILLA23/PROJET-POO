/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hairath.managedbeans;

import hairath.services.implementations.ProduitServiceImp;
import java.util.ArrayList;
import java.util.List;
import hairath.entities.Produit;


/**
 *
 * @author HAIRATH
 */
public class ProduitController {
    
    private ProduitServiceImp mesService;

    public ProduitController() {
        this.mesService = new ProduitServiceImp();
    }
    
    public void instances(){
        List<Produit> listProd= new ArrayList<>();
        listProd.add(new Produit(1,"Epargne","O"));
        listProd.add(new Produit(2,"Courant","N"));
        
        for(Produit p:listProd){
            mesService.save(p);
        }
    }
    
}
