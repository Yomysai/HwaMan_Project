+---------------------------------------------+
|                  Visiteur                    |
+---------------------------------------------+
      |
      | Recherche de mangas
      |----------------------------------------->>
      |                                           |
+---------------------------------------------+  |
|                 Utilisateur                  |  |
+---------------------------------------------+  |
      |                                           |
      | Affichage des détails des mangas           |
      |----------------------------------------->>
      |                                           |
+---------------------------------------------+  |
|                   Membre                     |  |
+---------------------------------------------+  |
      |                                           |
      |                                           |
      | Ajout de commentaires sur les mangas      |
      |----------------------------------------->>
      |                                           |
+---------------------------------------------+  |
|               Administrateur                 |  |
+---------------------------------------------+  |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      | Ajout de nouveaux mangas                  |
      |----------------------------------------->>
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      | Gestion des utilisateurs                   |
      |----------------------------------------->>
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      | Gestion des groupes                        |
      |----------------------------------------->>
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      | Gestion des rôles                          |
      |----------------------------------------->>
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      | Tableau de bord administrateur             |
      |----------------------------------------->>
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      |                                           |
      v                                           v
+---------------------------------------------+
|           Interface utilisateur              |
+---------------------------------------------+



+----------------------------------------+
|               Visiteur                  |
+----------------------------------------+
           |              
           | Recherche de mangas           
           |----------------------------->>
           |                              
           |     Résultats de recherche          
           |<<-----------------------------|
           |                              
           |                              
+----------------------------------------+
|              Utilisateur                |
+----------------------------------------+



+----------------------------------------+
|               Visiteur                  |
+----------------------------------------+
           |              
           | Affichage des détails des mangas   
           |----------------------------->>
           |                              
           |      Détails du manga          
           |<<-----------------------------|
           |                              
           |                              
+----------------------------------------+
|              Utilisateur                |
+----------------------------------------+



+----------------------------------------+
|              Utilisateur                 |
+----------------------------------------+
           |              
           | Ajout de nouveaux mangas     
           |----------------------------->>
           |                              
           |     Manga ajouté             
           |<<-----------------------------|
           |                              
+----------------------------------------+
|              Membre/Administrateur       |
+----------------------------------------+


composants 

+------------------------+
|   Interface Utilisateur |
+------------------------+
           |              
           |              
    +------------------------+
    |        Contrôleur      |
    +------------------------+
           |              
           |              
    +------------------------+
    |         Service        |
    +------------------------+
           |              
           |              
    +------------------------+
    |       Gestionnaire     |
    +------------------------+
           |              
           |              
    +------------------------+
    |         Base de         |
    |         données         |
    +------------------------+

comunication 
+------------------------+          +-----------------------+
|       Visiteur         |          |      Utilisateur      |
+------------------------+          +-----------------------+
           |                              |
           | Recherche de mangas           |
           |----------------------------->|
           |                              |
           |       Résultats de la recherche     |
           |<-----------------------------|
           |                              |
           |                              |
           | Affichage des détails des mangas     |
           |----------------------------->|
           |                              |
           |        Détails du manga      |
           |<-----------------------------|
           |                              |
           |                              |
           |                              |
           | Ajout de commentaires sur les mangas  |
           |----------------------------->|
           |                              |
           |     Commentaire ajouté      |
           |<-----------------------------|
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           | Ajout de nouveaux mangas     |
           |----------------------------->|
           |                              |
           |        Manga ajouté         |
           |<-----------------------------|
           |                              |
           |                              |
           |                              |
+----------------------------------------+
|              Membre                     |
+----------------------------------------+
           |                              |
           |                              |
           | Gestion des groupes          |
           |----------------------------->|
           |                              |
           |      Groupe géré            |
           |<-----------------------------|
           |                              |
           |                              |
           |                              |
+----------------------------------------+
|        Administrateur                   |
+----------------------------------------+
           |                              |
           |                              |
           | Gestion des utilisateurs     |
           |----------------------------->|
           |                              |
           |    Utilisateur géré         |
           |<-----------------------------|
           |                              |
           |                              |
           |                              |
           | Gestion des rôles            |
           |----------------------------->|
           |                              |
           |       Rôles gérés           |
           |<-----------------------------|
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           | Tableau de bord administrateur   |
           |----------------------------->|
           |                              |
           |       Tableau de bord affiché  |
           |<-----------------------------|
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           |                              |
           v                              v
+------------------------+          +-----------------------+
|        Membre           |          |       Administrateur   |
+------------------------+          +-----------------------+
