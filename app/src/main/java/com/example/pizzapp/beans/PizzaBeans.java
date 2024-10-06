package com.example.pizzapp.beans;

// La classe
public class PizzaBeans {
    private int id;
    private String nom;
    private double prix; // Prix de la pizza
    private int image; // Image de la pizza
    private String temps; // Temps de préparation
    private String preparationMethod; // Méthode de préparation
    private static int count; // Compteur pour les identifiants

    // Constructeur
    public PizzaBeans(String nom, double prix, int image, String temps, String preparationMethod) {
        this.id = ++count; // Incrémenter l'identifiant
        this.nom = nom; // Nom de la pizza
        this.prix = prix; // Prix de la pizza
        this.temps = temps; // Temps de préparation
        this.image = image; // Image de la pizza
        this.preparationMethod = preparationMethod; // Méthode de préparation
    }

    // Getters et setters

    // Pour l'id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Pour le nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Pour le prix
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Pour le temps de préparation
    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    // Pour l'image
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    // Pour la méthode de préparation
    public String getPreparationMethod() {
        return preparationMethod;
    }

    public void setPreparationMethod(String preparationMethod) {
        this.preparationMethod = preparationMethod;
    }
}
