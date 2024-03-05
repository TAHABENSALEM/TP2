/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

import java.util.ArrayList;


public class SystemeGestionEtudiants{
  private ArrayList<Etudiant> liste;
  public SystemeGestionEtudiants(ArrayList<Etudiant> liste){
      this.liste = new ArrayList();
  }
  public void ajouterEtudiant(String nom,String prenom,int ni,String email){
   Etudiant et = new Etudiant(nom,prenom,ni,email);   
   liste.add(et) ; }
  public void afficherEtudiants(){
    for(Etudiant et :liste){
        System.out.println(et.toString());; }  
  }
  public void modifierEmailEtudiant(int ni,String nouvelEmail){
  for(Etudiant et:liste){
  if (et.getNi()==ni){
  et.setEmail(nouvelEmail); } }
  }
  public void supprimerEtudiant(int ni){
  for(int i=0;i<liste.size();i++){
  if (this.liste.get(i).getNi()==ni){
      liste.remove(i);} }
  } 
}