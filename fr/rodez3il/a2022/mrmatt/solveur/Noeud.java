package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.*;
import fr.rodez3il.a2022.mrmatt.sources.*;

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
   * Calcule les prochains mouvements (si possibles)
   * 
   * @params Aucun
   * @returns void
   * @authors Iulian GAINAR
   */
  public String calculerFils() {
    // on considere que le noeud est visite
    this.visite = true;
    // pour chaque direction (haut, bas, gauche, droite)
    for (Commande direction : Commande.values()) {
      // si le deplacement est possible dans cette direction
      if (this.etatNiveau.deplacementPossible(direction)) {
        // on copie l'etat du niveau
        Niveau niveauFils = this.etatNiveau.copier();
        // on effectue le deplacement
        niveauFils.deplacer(direction);

        // on verifie si cette configuration a deja ete visitee
        String valeurFils = niveauFils.valeurChaine();
        Noeud noeudFils = this.confConnues.valeur(valeurFils);
        // si le niveau est gagnant on renvoie la chaine de direction gagnante
        if (niveauFils.estGagnant()) {
          return valeurFils;
        } else if (noeudFils == null) { // si on n'a pas encore visite cette configuration
          // on cree un nouveau noeud et on l'ajoute a la liste des fils
          ListeChainee<Commande> nouvellesCommandes = this.commandes;
          // on ajoute la commande
          nouvellesCommandes.ajouter(direction);
          noeudFils = new Noeud(this.confConnues, niveauFils, this.fils, nouvellesCommandes);
          this.fils.ajouter(noeudFils);
        } else {
          // sinon on ajoute ce noeud comme fils
          this.fils.ajouter(noeudFils);
        }
      }
    }
    return null;
  }
}
