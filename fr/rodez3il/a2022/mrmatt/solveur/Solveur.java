package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.*;
import fr.rodez3il.a2022.mrmatt.solveur.*;

import fr.rodez3il.a2022.mrmatt.sources.Niveau;
import fr.rodez3il.a2022.mrmatt.solveur.structures.*;
import fr.rodez3il.a2022.mrmatt.sources.*;

public class Solveur {

  public static String trouverSolution(Niveau niveau) {
    // creation des listes traites et aTraiter
    ListeChainee<Noeud> traites = new ListeChainee<>();
    ListeChainee<Noeud> aTraiter = new ListeChainee<>();

    // creation du premier noeud a traiter
    DictionnaireChaine<String, Noeud> configurations = new DictionnaireChaine<>();
    ListeTableau<Noeud> lesFils = new ListeTableau<>(10);
    ListeChainee<Commande> lesCommandes = new ListeChainee<>();
    Noeud initial = new Noeud(configurations, niveau, lesFils, lesCommandes);
    aTraiter.ajouter(initial);
    // COMMENTE POUR POUVOIR COMPILER...
    // // on boucle jusqu'à trouver une solution ou jusqu'a epuiser la liste aTraiter
    //  while (!aTraiter.estVide()) {
    //  // on recupere le premier noeud à traiter de la liste
    //  Noeud noeudCourant = aTraiter.element(0);
    //  aTraiter.enlever(0);

    //  // on deplace le noeud courant vers la liste des noeuds traités
    //  traites.ajouter(noeudCourant);

    //  // on verifie que la solution ne soit pas donné par calculerFils
    //  String chaineGagnante = noeudCourant.calculerFils();
    //  if (chaineGagnante != null) {
    //    return chaineGagnante;
    //   }

    // // parcours des noeus fils du noeud courant
    //    for(int i = 0; i < 4; i++){
    //      // on verifie si le noeud fils n'a pas déjà été traité
    //      Noeud noeudFils = noeudCourant.getFils()[i];
    //      if(!traites.contient(noeudCourant.)){
    //        // on ajoute le noeud fils à la liste à traiter
    //        aTraiter.ajouter();
    //      }
    //    }
    // }

    // sinon, il n'y a pas de solution
    return null;
  }

  public static void main(String[] args) {
    String solution = trouverSolution(new Niveau("niveaux/1rocher.txt"));
    if (solution == null) {
      System.out.println("Pas de solution.");
    } else {
      System.out.println("Une solution est : " + solution);
    }
  }

}
