package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.util.Arrays;

public class ListeTableau<E> implements Liste<E> {

  // Attributs
  private E[] tableau;

  // Constructeurs
  public ListeTableau(int tailleInitiale) {
    this.tableau = (E[]) new Object[tailleInitiale];
  }
  // Accesseurs

  // Méthodes


  @Override
  public boolean estVide() {
    return this.tableau.length == 0;
  }

  @Override
  public int taille() {
    return this.tableau.length;
  }

  @Override
  public boolean contient(E e) {
    for (int i = 0; i < this.tableau.length; i++) {
      if (this.tableau[i].equals(e)) {
        return true;
      }
    }
    return false;
  }
}