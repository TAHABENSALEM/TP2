/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author DELL
 */
public class Livre {
    private String Titre ;
    private String Auteur ;
    public int Anneepub ;
    public int ISBN ;

    public Livre(String Titre) {
        this.Titre = Titre;
    }
    
    
    
    public Livre(String Titre , String Auteur){
        this.Titre = Titre;
        this.Auteur=Auteur ;
        this.Anneepub=0;
        this.ISBN=0;
    }
    public Livre(String Titre , String Auteur, int Anneepub){
        this.Titre = Titre;
        this.Auteur=Auteur ;
        this.Anneepub=Anneepub;
        this.ISBN=0;
    }
    public Livre(String Titre , String Auteur,int Anneepub,int ISBN){
        this.Titre = Titre;
        this.Auteur=Auteur ;
        this.Anneepub=Anneepub;
        this.ISBN=ISBN;
    }
    public String getTitre(){
        return this.Titre;
    }
    public String getAuteur(){
        return this.Auteur;
    }
    public void setTitre(String Titre){
        this.Titre=Titre;
    }
    public void setAuteur(String Auteur){
        this.Auteur=Auteur;
    }
    @Override
    public String toString(){
        return("[Titre = "+this.Titre+" ,Auteur = "+this.Auteur+" ,Annee de publication = "+this.Anneepub+" ,ISBN = "+this.ISBN); 
    }
    
    
   
    
    
}

