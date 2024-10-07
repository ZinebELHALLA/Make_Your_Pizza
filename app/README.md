
# Make_Your_Pizza

## Table des matières

- [Description](#description)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Structure du projet](#structure-du-projet)
- [Démonstration](#démonstration)

## Description

**Make_Your_Pizza** est une application mobile qui permet aux utilisateurs de découvrir plusieurs pizzas populaires. L'application propose :

1. Un écran d'accueil  pour souhaiter la bienvenue.
2. Une liste de pizzas avec leur image, nom, prix, et temps de préparation.
3. Un écran détaillé pour chaque pizza où l'utilisateur peut voir l'image de la pizza, la liste de ses ingrédients, et les étapes de préparation.

L'application est conçue pour offrir une interface simple et rapide pour naviguer parmi les pizzas disponibles et découvrir leurs recettes.

## Installation

Pour installer et exécuter **Make_Your_Pizza** localement, suivez ces étapes :

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/ZinebELHALLA/Make_Your_Pizza.git
   ```
2. Ouvrez le projet dans **Android Studio**.
3. Laissez Android Studio installer les dépendances nécessaires.
4. Connectez un appareil Android ou configurez un émulateur.
5. Cliquez sur **Run** pour lancer l'application.

## Utilisation

Ouvrez l'application, un écran de bienvenue s'affichera brièvement.  
Vous verrez ensuite une liste de pizzas avec leurs images, noms, prix, et temps de préparation.  
Sélectionnez une pizza pour voir plus de détails, comme les ingrédients et les étapes de préparation.

## Structure du projet

- **app/java/com.example.pizzaapp/SplashActivity.java** : Affiche l'écran de bienvenue lorsque l'application démarre.
- **app/java/com.example.pizzaapp/MainActivity.java** : Gère l'affichage de la liste des pizzas avec leurs images, noms, prix et temps de préparation.
- **app/java/com.example.pizzaapp/PizzaDetailActivity.java** : Affiche les détails de la pizza sélectionnée, y compris les ingrédients et les étapes de préparation.
- **app/res/layout/activity_splash.xml** : Mise en page de l'écran d'accueil (Splash screen).
- **app/res/layout/activity_main.xml** : Mise en page de l'écran listant les pizzas.
- **app/res/layout/activity_pizza_detail.xml** : Mise en page de l'écran affichant les détails d'une pizza.

## Démonstration

https://github.com/user-attachments/assets/3a715cda-7a2d-49fd-82a3-6c2ed9613625
