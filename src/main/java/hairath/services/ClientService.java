/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hairath.services;

import hairath.entities.Client;
import java.util.List;

/**
 *
 * @author HAIRATH
 */
public interface ClientService {
    
    void save(final Client t);
    List<Client> findAll();
    Client findById(int k);
    
    void deleteById(int k);

    
}
