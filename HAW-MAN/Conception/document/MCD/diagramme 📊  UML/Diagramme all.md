


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

+------------------------+          +------------------------+
|   Utilisateur/Membre   |          |       Administrateur    |
+------------------------+          +------------------------+
           |                              |
           |                              |
+------------------------+  <<deploy>>  +------------------------+
|  Interface Utilisateur | ------------ |   Serveur d'Application |
+------------------------+              +------------------------+
           |                              |
           |                              |
+------------------------+              +------------------------+
|       Contrôleur       |              |   Serveur de Base de    |
|                        |              |       Données           |
+------------------------+              +------------------------+


+--------------------------------------------------+
|             Serveur d'Application                 |
+--------------------------------------------------+
           |                              
           |   <<deploy>>                  
           |                              
+--------------------------------------------------+
|            Serveur Web                           |
|                                                  |
|  +--------------------------------------------+  |
|  |        Conteneur d'Application              |  |
|  |                                            |  |
|  |  +--------------------------------------+  |  |
|  |  |            Composant Web              |  |  |
|  |  +--------------------------------------+  |  |
|  |                                            |  |
|  +--------------------------------------------+  |
|                                                  |
|  +--------------------------------------------+  |
|  |        Services Web                        |  |
|  |                                            |  |
|  |  +--------------------------------------+  |  |
|  |  |            Composant de Service       |  |  |
|  |  +--------------------------------------+  |  |
|  |                                            |  |
|  +--------------------------------------------+  |
|                                                  |
+--------------------------------------------------+


+--------------------------------------------------+
|              Serveur de Base de Données           |
+--------------------------------------------------+
           |                              
           |   <<deploy>>                  
           |                              
+--------------------------------------------------+
|                Système de Gestion de Base de      |
|                   Données (SGBD)                  |
|                                                  |
|  +--------------------------------------------+  |
|  |          Base de Données                    |  |
|  +--------------------------------------------+  |
|                                                  |
+--------------------------------------------------+
