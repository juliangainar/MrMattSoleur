package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.*;
import fr.rodez3il.a2022.mrmatt.sourcespartielles.*;

public class Noeud {

  // Attributs
  private DictionnaireChaine<String, Noeud> confConnues; // stocke les configurations connues
  private Niveau etatNiveau; // reference vers l'etat du niveau actuel
  private ListeTableau<Noeud> fils; // represente les quatre fils
  private ListeChainee<Commande> commandes; // succession de commandes necessaires pour atteindre cette configuration
  private boolean visite; // indique si le noeud est visité ou non


  // Constructeurs
  public Noeud(DictionnaireChaine<String, Noeud> confConnues, Niveau etatNiveau, ListeTableau<Noeud> fils,
      ListeChainee<Commande> commandes) {
    this.confConnues = confConnues;
    this.etatNiveau = etatNiveau;
    this.fils = fils;
    this.commandes = commandes;
    this.visite = false;

    // A VERFIFIER

  }

  // Accesseurs
  public boolean getVisite() {
    return this.visite;
  }

  public ListeTableau<Noeud> getFils() {
    return this.fils;
  }

  // Methodes

  /**
   * Redefinition de la methode equals
   * 
   * @params Object objet
   * @author Iulian GAINAR
   */
  @Override
  public boolean equals(Object objet) {
    if (this == objet) {
      return true;
    }
    return false;
  }

  /**
   * Methode calculerFils
   * Calcule
   * 
   * @params Aucun
   * @returns void
   * @authors Iulian GAINAR
   */
  public void calculerFils() {
    // on considere que le noeud est visite
    this.visite = true;
    // pour chaque direction (haut, bas, gauche, droite)
    for (Commande dir : Commande.values()) {
      if(dir == dir.HAUT){
        Niveau niveauFils = niveauFils.deplacer(dir.HAUT);
      }
      if(dir == dir.BAS){
        
      }
      if(dir == dir.GAUCHE){
        
      }
      if(dir == dir.DROITE){
        
      }
      
    }
  }
}
