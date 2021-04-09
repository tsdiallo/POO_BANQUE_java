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
public abstract class Compte {
    private int code;//Généré
    private static int nbreCompte;
    protected double solde;
    //Terminaison Association
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    

    public Compte() {
        code=++nbreCompte;
    }

    public Compte(double solde) {
        this.solde = solde;
        code=++nbreCompte;
    }

    public double getSolde() {
        return solde;
    }

    public int getCode() {
        return code;
    }

     @Override
    public String toString() {
        return "Code :" + code + ""
                + "\n Solde :" + solde ;
    }
    
    public abstract String retirer(double mnt);
    public abstract String verser(double mnt);
   
    
    
    
    
    
}
