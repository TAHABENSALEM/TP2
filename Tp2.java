/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2;
import java.util.ArrayList;
public class Tp2 {
    public static void main(String[] args){
        ArrayList list= new ArrayList();
        SystemeGestionEtudiants syst= new SystemeGestionEtudiants(list);
        syst.ajouterEtudiant("ben salem","taha",1,"fhkjlkj"); 
        syst.ajouterEtudiant("ben saad","ismail",2,"bakha"); 
        syst.ajouterEtudiant("adel","najd",3,"tiwtiw"); 
        syst.afficherEtudiants();
        syst.modifierEmailEtudiant(1, "bensalem@gmail");
        syst.supprimerEtudiant(3);
        syst.afficherEtudiants();
        
        //exercice2
         
        Livre l1 = new Livre("aha ben salem","hnh;h;;");
        Livre l2 = new Livre("qsdfzfedsv","jhkhfghhlk",2020);
        Livre l3 = new Livre("pmlmlm","bnbn",2023,7127536);
        Livre l4 =new Livre("ghgdkgk");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        System.out.println(l4.toString());
        
    
        
    }
}
  
   

