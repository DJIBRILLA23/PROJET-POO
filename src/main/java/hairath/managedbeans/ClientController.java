/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hairath.managedbeans;

import java.util.ArrayList;
import java.util.List;
import hairath.entities.Client;
import hairath.services.implementations.ClientServiceImp;

/**
 *
 * @author HAIRATH
 */
public class ClientController {
    
    private ClientServiceImp monService;

    public ClientController(ClientServiceImp monService) {
        this.monService = monService;
    }

    public ClientController() {
        this.monService=new ClientServiceImp();
    }
    
    public void instances(){
        List<Client> clients=new ArrayList<>();
        clients.add(new Client(1,"DANBUI","Ulrich","+22877889182"));
        clients.add(new Client(2,"AFFO","Radia","+22893456787"));
        clients.add(new Client(3,"AMA","Afi","+22878906655"));
        clients.add(new Client(4,"VAHAM","Chico","+22990077644"));
        for(Client client: clients){
            monService.save(client);
        }
    }
    
}
