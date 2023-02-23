package fr.rodez3il.a2022.mrmatt.solveur.Tests;

import fr.rodez3il.a2022.mrmatt.solveur.*;
import fr.rodez3il.a2022.mrmatt.solveur.structures.*;

class TestUnitaires {

  public static void main(String[] args) {

    // tests sur la classe ListeTableau
    testLTEstVide();
    testLTTaille();
    testLTEnlever();

    // tests sur la classe DictionnaireChaine
    testDCContient();
    testDCValeur();
    testDCInserer();

  }

  // test si la liste est vide lors de sa creation
  public static void testLTEstVide() {
    ListeTableau<String> laListe = new ListeTableau<>(10);
    if (laListe.estVide() == true) {
      System.out.println("TestLTEstVide est reussi !");
    } else {
      System.out.println("TestLTEstVide a echoue !");
    }
  }

  // teste la taille de la liste
  public static void testLTTaille() {
    ListeTableau<String> laListe = new ListeTableau<>(10);
    laListe.ajouter("Bonjour !");
    laListe.ajouter("Adieu !");

    if (laListe.taille() == 2) {
      System.out.println("TestLTEstVide est reussi !");
    } else {
      System.out.println("TestLTEstVide a echoue !");
    }
  }

  // teste la suppression d'un element de la liste
  public static void testLTEnlever() {
    ListeTableau<String> laListe = new ListeTableau<>(10);
    laListe.ajouter("Bonjour !");
    laListe.enlever(0);
    if (laListe.estVide() == true) {
      System.out.println("TestLTEstVide est reussi !");
    } else {
      System.out.println("TestLTEstVide a echoue !");
    }
  }

  // teste si le dictionnaire possede bien un element qu'on a insere
  public static void testDCContient() {
    DictionnaireChaine<Integer, String> dico = new DictionnaireChaine<>();
    dico.inserer(1, "Je suis un test!");
    if (dico.contient(1)) {
      System.out.println("TestDCContient est reussi !");
    } else {
      System.out.println("TestDCContient a echoue !");
    }
  }

  // teste si le dictionnaire renvoie bien la valeur pour une cle donnee
  public static void testDCValeur() {
    DictionnaireChaine<Integer, String> dico = new DictionnaireChaine<>();
    dico.inserer(1, "Je suis un test!");
    if (dico.valeur(1) == "Je suis un test!") {
      System.out.println("TestDCValeur est reussi !");
    } else {
      System.out.println("TestDCValeur a echoue !");
    }
  }

  // teste si la uniquement la valeur est changee lorsqu'on a deja la clé
  public static void testDCInserer() {
    DictionnaireChaine<Integer, String> dico = new DictionnaireChaine<>();
    dico.inserer(1, "Je suis un test!");
    dico.inserer(1, "Hello !");
    if (dico.valeur(1) == "Hello !") {
      System.out.println("TestDCInserer est reussi !");
    } else {
      System.out.println("TestDCInserer a echoue !");
    }
  }

}