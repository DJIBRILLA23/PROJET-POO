/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hairath.services;

import hairath.entities.Produit;
import java.util.List;

/**
 *
 * @author HAIRATH
 */
public interface ProduitService {
    
    void save(Produit t);
    List<Produit> findAll();
    Produit findById(int id);
    void deleteById(int id);
    
}
