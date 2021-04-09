/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author user
 */
public class Client {
    private int numero;//Généré
    private String nom;
    private String prenom;
    private static int nbreClient;
     //Constructeur Par defaut
    public Client() {
        nbreClient++;
        numero=nbreClient;
    }
   //Constructeur Surchargé
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;   
        numero=++nbreClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return    "Numero :"+numero+""
                + "Nom  :"+nom+""
                + "Prenom :"+prenom;
    }
    
    
    
    
}
