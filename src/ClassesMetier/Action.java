/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    private int numero;
    private String nom;
    private double valeurActuelle;
    private double achatTrader;
    private int achete;

    public Action(int numero, String nom, double valeurActuelle, double achatTrader, int achete) {
        this.numero = numero;
        this.nom = nom;
        this.valeurActuelle = valeurActuelle;
        this.achatTrader = achatTrader;
        this.achete = achete;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeurActuelle() {
        return valeurActuelle;
    }

    public void setValeurActuelle(double valeurActuelle) {
        this.valeurActuelle = valeurActuelle;
    }

    public double getAchatTrader() {
        return achatTrader;
    }

    public void setAchatTrader(double achatTrader) {
        this.achatTrader = achatTrader;
    }

    public int getAchete() {
        return achete;
    }

    public void setAchete(int achete) {
        this.achete = achete;
    }
    
    
    
    
    
}
