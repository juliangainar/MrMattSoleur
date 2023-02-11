package fr.rodez3il.a2022.mrmatt.solveur.structures;

public class ListeChainee<T> implements Liste<T> {
  // cours utilisé
  // http://deptinfo.cnam.fr/Enseignement/CycleA/APA/nfa032/docs/cours-listes.pdf

  // Classes

  private class Maillon {

    // Attributs
    private T donnee;
    private Maillon suivant;

    // Constructeurs
    public Maillon(T donnee, Maillon suivant) {
      this.donnee = donnee;
      this.suivant = suivant;
    }
    // Accesseurs
    // Methodes
  }

  // Attributs
  private Maillon premierElement;
  private int taille;

  // Constructeurs
  public ListeChainee() {
    this.premierElement = null;
    this.taille = 0;
  }

  // Accesseurs

  // Methodes

  /**
   * Ajoute un élément à la liste.
   * 
   * @authors Iulian GAINAR
   * @param element l'élément à ajouter
   */
  @Override
  public void ajouter(T element) {
    // on cree le nouveau maillon à rajouter à la liste
    Maillon nouveauMaillon = new Maillon(element, null);
    // on parcourt la liste et on l'ajoute en dernier
    // si la liste est vide, on l'ajoute en tant que premier element
    if (this.estVide()) { // ou this.premierElement == null
      this.premierElement = nouveauMaillon;
    } else {
      // sinon, on cherche le dernier maillon et on l'ajoute à la suite
      Maillon dernierMaillon = this.premierElement;
      while (dernierMaillon.suivant != null) {
        dernierMaillon = dernierMaillon.suivant; // (recursivité, un maillon dans un maillon dans un maillon...)
      }
      dernierMaillon.suivant = nouveauMaillon;
    }
    // on augmente la taille de la liste
    this.taille++;
  }

  /**
   * Indique si la liste est vide.
   * 
   * @authors Iulian GAINAR
   * @return true si la liste est vide.
   */
  @Override
  public boolean estVide() {
    return this.premierElement == null;
  }

  /**
   * Indique la taille de la liste.
   * 
   * @authors Iulian GAINAR
   * @return La taille de la liste.
   */
  @Override
  public int taille() {
    return this.taille;
  }

  /**
   * Enlève (et retourne) l'élément à la position
   * i.
   * 
   * @authors Iulian GAINAR
   * @param i la position de l'élément.
   * @return L'élément qui a été supprimé.
   */
  @Override
  public T enlever(int i) {
    // il faut parcourir la liste en recherche du dernier maillon

    // si la liste est vide, ou si i depasse les bords de la liste, on ne peut
    // rien supprimer
    if (this.estVide() || i < 0 || i > this.taille) { // ou this.premierElement == null
      System.err.println("La liste est vide ou le numéro ne correspond dépasse la taille de la liste.");
    } else {
      // sinon il faut trouver le maillon à l'index i et le supprimer et retourner
      // la donnee de l'element supprime
      Maillon maillonAvant = null;
      Maillon maillonApres = this.premierElement;

      // on parcourt la liste et on garde le maillon i et i-1
      for (int j = 0; j < i; j++) {
        maillonAvant = maillonApres;
        maillonApres = maillonApres.suivant;
      }

      // on echange les references des deux maillons = on supprime le maillon
      // (raccrocher)
      maillonAvant.suivant = maillonApres.suivant;
      // si on supprime le premier ?!?!?! A REVOIR

      // on garde la donnée pour la renvoyer
      T donneeMaillonSupprime = maillonApres.donnee;
      // on reduit la taille de la liste
      this.taille--;
      // on renvoit la donnee
      return donneeMaillonSupprime;
    }
  }

  /**
   * Renvoie l'élément à la position i.
   * 
   * @authors Iulian GAINAR
   * @param i
   * @return
   */
  @Override
  public T element(int i) {
    Maillon maillonARetourner = this.premierElement;
    // on verifie d'abord si i est dans les limites de la liste
    if (i < 0 || i > this.taille) {
      throw new IndexOutOfBoundsException();
    } else {
      for (int j = 0; j < i; j++) {
        maillonARetourner = maillonARetourner.suivant;
      }
      return maillonARetourner.donnee;
    }
  }

  /**
   * Indique s'il existe un élément f dans la liste
   * tel que f.equals(e) est VRAI.
   * 
   * @authors Iulian GAINAR
   * @param e L'élément à comparer.
   * 
   **/

  @Override
  public boolean contient(T e) {
    // on declare le premier maillon
    Maillon maillonParcouru = this.premierElement;
    // on parcourt la liste des elements et on verifie s'il existe un maillon ayant
    // l'element e dans son .donnee
    for (int i = 0; i < taille; i++) {
      if (maillonParcouru.donnee.equals(e)) {
        return true;
      }
      // on passe au suivant
      maillonParcouru = maillonParcouru.suivant;
    }
    return false;
  }

}
