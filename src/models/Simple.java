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
public class Simple extends Compte {
    
    private double decouvert;

    public Simple() {       
    }
    public Simple(double decouvert, double solde) {
         super(solde);
         this.decouvert = decouvert;      
    }
    
    @Override
    public String retirer(double mnt) {
        if(solde+decouvert<mnt){
            return "Retrait Impossible";
        }else{
            solde-=mnt;
            return "Retrait effectué avec succes";
        }
    }

    @Override
    public String verser(double mnt) {
        solde+=mnt;
        return "Depot effectué avec succes";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nDecouvert:" + decouvert ;
    }
    
}
