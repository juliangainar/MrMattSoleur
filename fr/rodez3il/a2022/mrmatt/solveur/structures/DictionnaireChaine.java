package fr.rodez3il.a2022.mrmatt.solveur.structures;

public class DictionnaireChaine<C, V> implements Dictionnaire<C, V> {
  // Classes
  private class Entree<C, V> {
    // Attributs
    private C cle;
    private V valeur;

    // Constructeurs
    public Entree(C cle, V valeur) {
      this.cle = cle;
      this.valeur = valeur;
    }

    // Accesseurs

    public C getCle() {
      return this.cle;
    }

    public V getValeur() {
      return this.valeur;
    }

    // met à jour la valeur
    public void setValeur(V valeur) {
      this.valeur = valeur;
    }

    // met à jour la cle
    public void setCle(C cle) {
      this.cle = cle;
    }
    // Methodes
  }

  // Atributs

  // liste qui stocke les pairs cle-valeur
  private ListeChainee<Entree<C, V>> liste = new ListeChainee<Entree<C, V>>();

  // Constructeurs
  // Accesseurs

  // Methodes

  /**
   * Ajoute un couple <Clé, Valeur> au dictionnaire.
   * 
   * @param cle
   * @param valeur
   */
  @Override
  public void inserer(C cle, V valeur) {
    Entree<C, V> entree = new Entree<C, V>(cle, valeur);
    // on verifie si la clé n'est pas déjà dans le dictionnaire
    if (this.contient(cle)) {
      // si la cle se trouve déjà dans le dictionnaire
      if (entree.getCle().equals(cle)) {
        // on change juste la valeur pour cette clé
        entree.setValeur(valeur);
      }
    }
    // sinon on crée l'entrée et on la rajoute à laliste
    liste.ajouter(entree);
  }

  /**
   * Indique s'il existe une clé f dans le dictionnaire
   * telle que f.equals(cle) est VRAI.
   * 
   * @param cle
   * @return
   */
  @Override
  public boolean contient(C cle) {
    for (int i = 0; i < liste.taille(); i++) {
      if (liste.element(i).getCle().equals(cle)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Renvoie la valeur associée à la clé.
   * 
   * @param cle
   * @return NULL si la clé n'existe pas.
   */
  @Override
  public V valeur(C cle) {
    for (int i = 0; i < liste.taille(); i++) {
      if (liste.element(i).getCle().equals(cle)) {
        return liste.element(i).getValeur();
      }
    }
    return null;
  }

}