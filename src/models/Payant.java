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
public class Payant extends Compte{
    private final double tauxPayant=0.05;

    public Payant() {
    }

    public Payant(double solde) {
        super(solde);
    }
    
    private double calculTauxPayant(double mnt){
        return mnt*tauxPayant;
    }
    @Override
    public String retirer(double mnt) {
        if(mnt+calculTauxPayant(mnt)<=solde){
            solde-=(mnt+calculTauxPayant(mnt));
            return "Retrait effectué avec Succes";
        }else{
            return "Retrait Impossible";
        }
    }

    @Override
    public String verser(double mnt) {
        solde+=(mnt-calculTauxPayant(mnt));
        return "Depot effectué avec Succes ";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTaux Payant:" + tauxPayant ;
    }
    
}
