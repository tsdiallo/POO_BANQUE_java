/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;
import metier.MetierTableau;
import models.Client;
import models.Compte;
import models.Epargne;
import models.Payant;
import models.Simple;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        MetierTableau metier=new MetierTableau();
        int choix=0;
        
        do{
            System.out.println("1-Creer Compte"
                    + "\n2-Verser"
                    + "\n3-Retrait"
                    + "\n4-Quitter"
                    + "\nFaites Votre choix");
                  choix=Integer.parseInt(clavier.nextLine());
            switch(choix){
                case 1:
         System.out.println("Choisir le Type de Compte"
                   + "\n1-Simple\n"
                   + "2-Epargne\n"
                   + "3-Payant ");
                 int type=Integer.parseInt(clavier.nextLine());
                 System.out.println("Entrer le Solde");
                 double solde=Double.parseDouble(clavier.nextLine());
                 Compte cp=null;
                 if(type==1){
                System.out.println("Entrer le Decouvert");
                 double decouvert=Double.parseDouble(clavier.nextLine());
                     cp=new Simple(decouvert, solde);
                 }else if(type==2){
                     System.out.println("Entrer le Taux d'Interet");
                 double tauxInteret=Double.parseDouble(clavier.nextLine());
                     cp=new Epargne(tauxInteret, solde);
                 }else{
                     cp=new Payant(solde);
                 }
                 
                 //Données du Client
                  System.out.println("Client Existe?"
                   + "\n1- Oui"
                   + "\n2- Non"
                   );
                  int rep=Integer.parseInt(clavier.nextLine());
                  Client client=null;
                    if(rep==1){
                        System.out.println("Entrer le Numero");
                        int num=Integer.parseInt(clavier.nextLine());
                        client=metier.rechercheClient(num);
                    }else{
                        System.out.println("Entrer le Nom");
                        String nom=clavier.nextLine();
                        System.out.println("Entrer le Prenom");
                        String prenom=clavier.nextLine();
                        //Creer un Client
                        client=new Client(nom, prenom);
                        
                    }
                    cp.setClient(client);
 
                    System.out.println(metier.creerCompte(cp));
                    System.out.println("Infos Compte\n"
                            + cp.toString()+"\nInfos Clients\n"
                            + cp.getClient().toString());
                    break;
            }
            
            
        }while(choix!=4);
    }
    
}
