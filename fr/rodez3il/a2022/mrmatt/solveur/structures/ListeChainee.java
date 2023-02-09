package fr.rodez3il.a2022.mrmatt.solveur.structures;

public class ListeChainee<T> implements Liste<T> {

  // Classes

  class Maillon {

    // attributs
    private T donnee;
    private Maillon suivant;

    // constructeurs
    public Maillon(T donnee, Maillon suivant){
      this.donnee =  donnee;
      this.suivant = suivant;
    }
    
  }

  // Attributs

  // Constructeurs

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

  }

  /**
   * Indique si la liste est vide.
   * 
   * @authors Iulian GAINAR
   * @return true si la liste est vide.
   */
  @Override
  public boolean estVide() {

  }

  /**
   * Indique la taille de la liste.
   * 
   * @authors Iulian GAINAR
   * @return La taille de la liste.
   */
  @Override
  public int taille() {

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

  }

  /**
   * Indique s'il existe un élément f dans la liste
   * tel que f.equals(e) est VRAI.
   * 
   * @authors Iulian GAINAR
   * @param e L'élément à comparer.
   * 

  
  @Override
  public boolean contient(T e) {

  }

}
