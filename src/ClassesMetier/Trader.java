/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;


public class Trader
{
    private int numero;
    private String nom;
    private ArrayList<Action>lesTraders;

    public Trader(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
        lesTraders = new ArrayList<Action>();
    }
    
    
    
}
