/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author DELL
 */
public class Etudiant {
   
    private String nom;
    private String prenom;
    private int ni;
    private String email;

        public Etudiant(String nom, String prenom, int ni, String email) {
            this.nom = nom;
            this.prenom = prenom;
            this.ni = ni;
            this.email = email;
        }
        //get et set nom
        public String getNom(){
            return this.nom;}
        public  void setNom(String nom){
            this.nom=nom;}
        //get et set prenom
        public String getPrenom(){
            return this.prenom;}
        public  void setPrenom(String prenom){
            this.prenom=prenom;}
        //get et set numero d'inscription
         public int getNi(){
            return this.ni;}
        public  void setNi(int ni){
            this.ni=ni;}
        //get et set email
        public String getEmail(){
            return this.email;}
        public  void setEmail(String email){
            this.email=email;}
        //methode toString
    @Override
        public String toString(){
            return "nom: "+this.nom + " prenom: "+this.prenom+" le numero dinscription: "+this.ni+" email "+this.email; }
}

