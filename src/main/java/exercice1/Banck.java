/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GHADA
 */
package exercice1;

import java.util.ArrayList;

/**
 *
 * @author chams
 */
public class Banck {
    private ArrayList<Costumer> clients;

    public Banck() {
        this.clients = new ArrayList();
    }
    
    public void addCostumer(Costumer client){
        clients.add(client);
    }
    
     public void removeCostumer(Costumer client){
       int i= clients.indexOf(client);
       clients.remove(i);
    }
     
     
     public Double getTotalBalance(){
          Double r=0.0;
            for(Costumer a:clients){
                r+=a.getTotalAccountBalance();
            }
            return r;
        }

   
     }