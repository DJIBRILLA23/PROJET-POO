/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hairath.services;

import hairath.entities.Sms;
import java.util.List;

/**
 *
 * @author HAIRATH
 */
public interface SmsService {
    
    void save(Sms t,String nom);
    List<Sms> findAll();
    Sms findById(int k);
    void deleteById(int k);
    List<Sms> findAllActif();
    List<Sms> findAllNotActif();
    
}
