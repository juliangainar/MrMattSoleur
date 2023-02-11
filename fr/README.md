- Question : quel est le type du tableau à utiliser ?
Vu que la classe est générique (ListeTableau<E>), le type de tableau serait le type générique E : private E[] tableau;

- Question : Selon vous, quelles sont les différences majeures entre ListeTableau et ListeChainee ?
  ListeTableau contient un tableau, ce qui nous donne acces immediat aux elements a travers l'indice. Elle possede ainsi une taille fixe (qu'on augmente à chaque fois qu'on l'attend).
  ListeChainee contient une liste, ce qui nous donne un acces séquentiel, un par un en partant du premier element. De plus, sa taille peut augmenter indéfiniment, on pourra toujours ajouter un element de plus à la liste.