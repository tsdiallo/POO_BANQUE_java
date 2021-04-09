/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import models.Client;
import models.Compte;

/**
 *
 * @author user
 */
public class MetierTableau {
    
    Compte mescomptes[]=new Compte[10];
    int nbrecompte;
    
    //Creer Compte=>ajouter un Compte dans le Tableau
     public String creerCompte(Compte compte){
         mescomptes[nbrecompte++]=compte;
         return "Compte Créé avec Succes";      
     }
     
     public Client rechercheClient(int numero){
         
         for(int i=0;i<nbrecompte;i++){
             if(mescomptes[i].getClient().getNumero()==numero){
                 return mescomptes[i].getClient();
             }
         }
         return null;
     }

}
