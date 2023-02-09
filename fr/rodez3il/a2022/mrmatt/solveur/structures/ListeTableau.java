package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.util.Arrays;

public class ListeTableau<T> implements Liste<T> {

  // Attributs
  private int indexTableau;
  private T[] tableau;

  // Constructeurs
  public ListeTableau(int tailleInitiale) {
    // suit la taille du tableau grace à l'index
    this.indexTableau = 0;
    // initialise le tableau à une certaine taille
    this.tableau = (T[]) new Object[tailleInitiale];

  }
  // Accesseurs

  // Méthodes

  /**
   * Ajoute un élément à la liste.
   * 
   * @authors Iulian GAINAR
   * @param element l'élément à ajouter
   */
  @Override
  public void ajouter(T element) {
    // si le tableau est rempli, car l'index est au maximum, on double sa taille
    if (this.indexTableau == this.tableau.length) {
      this.tableau = Arrays.copyOf(this.tableau, this.indexTableau * 2);
    }
    // on ajoute l'élément à la liste
    this.tableau[this.indexTableau] = element;
    // on incrémente l'index du tableau'
    this.indexTableau++;
  }

  /**
   * Indique si la liste est vide.
   * 
   * @authors Iulian GAINAR
   * @return true si la liste est vide.
   */
  @Override
  public boolean estVide() {
    // si l'index est à 0, cela veut dire que le tableau est vide
    return this.indexTableau == 0;
  }

  /**
   * Indique la taille de la liste.
   * 
   * @authors Iulian GAINAR
   * @return La taille de la liste.
   */
  @Override
  public int taille() {
    return this.indexTableau;
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
    // on garde l'element à supprimer
    T elementSupprime = this.tableau[i];
    // on crée un tableau "copie" sans l'élément à supprimer
    ListeTableau<T> temp = new ListeTableau(this.indexTableau);
    for (int j = 0; j < this.indexTableau; j++) {
      if (j != i) {
        temp.ajouter(this.tableau[j]);
      }
    }
    this.tableau = temp.toArray(this.tableau);
    // reduit la taille
    this.indexTableau--;
    // retourne l'element supprimé
    return elementSupprime;
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
    return this.tableau[i];
  }

  /**
   * Indique s'il existe un élément f dans la liste
   * tel que f.equals(e) est VRAI.
   * 
   * @authors Iulian GAINAR
   * @param e L'élément à comparer.
   * @return
   */
  @Override
  public boolean contient(T e) {
    for (int i = 0; i < this.indexTableau; i++) {
      if (this.tableau[i].equals(e)) {
        return true;
      }
    }
    return false;
  }
}