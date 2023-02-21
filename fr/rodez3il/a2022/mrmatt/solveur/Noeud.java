package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.*;
import fr.rodez3il.a2022.mrmatt.sourcespartielles.*;

public class Noeud {

  // Attributs
  private DictionnaireChaine<String, Noeud> confConnues;
  private Niveau etatNiveauActuel;
  private ListeTableau<Noeud> fils;
  private ListeChainee<String> commandes;
  // un moyen de représenter la succession de commandes nécessaires pour
  // atteindre cette configuration.

  // Constructeurs
  public Noeud(DictionnaireChaine<String, Noeud> confConnues, Niveau niveauActuel, ListeTableau<Noeud> fils,
      ListeChainee<String> commandes) {
    this.confConnues = confConnues;
    this.etatNiveauActuel = niveauActuel;
    this.fils = fils;
    this.commandes = commandes;

    // A VERFIFIER
  }

  // Accesseurs

  // Methodes

}
