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
public class Epargne extends Compte{
    private double tauxInteret;

    public Epargne() {
    }

    public Epargne(double tauxInteret, double solde) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }
    
    
    @Override
    public String retirer(double mnt) {
        return "Retrait Impossible dans Compte Epargne";
    }

    private double calculInteret(double mnt){
        return mnt*(tauxInteret/100);
    }
    @Override
    public String verser(double mnt) {
        solde+=mnt+calculInteret(mnt);
        return "Depot effectué avec Succes";
    }

    @Override
    public String toString() {
        return  super.toString()+""
                + "\nTaux Interet=" + tauxInteret ;
    }
    
    
    
}
