Voici les relations entre les entités du projet Hwa-Man :

- La table "Users" (utilisateurs) a une relation avec la table "UserRoles" (rôles des utilisateurs) de type "Many-to-Many". Un utilisateur peut avoir plusieurs rôles, et un rôle peut être associé à plusieurs utilisateurs.
    
- La table "Users" (utilisateurs) a une relation avec la table "UserGroups" (groupes d'utilisateurs) de type "Many-to-Many". Un utilisateur peut appartenir à plusieurs groupes, et un groupe peut avoir plusieurs utilisateurs.
    
- La table "Roles" (rôles) a une relation avec la table "UserRoles" (rôles des utilisateurs) de type "One-to-Many". Un rôle peut être associé à plusieurs utilisateurs, mais un utilisateur ne peut avoir qu'un seul rôle pour une relation donnée.
    
- La table "Roles" (rôles) a une relation avec la table "GroupRoles" (rôles des groupes) de type "One-to-Many". Un rôle peut être associé à plusieurs groupes, mais un groupe ne peut avoir qu'un seul rôle pour une relation donnée.
    
- La table "Groups" (groupes) a une relation avec la table "UserGroups" (groupes d'utilisateurs) de type "One-to-Many". Un groupe peut avoir plusieurs utilisateurs, mais un utilisateur ne peut appartenir qu'à un seul groupe pour une relation donnée.
    
- La table "Items" (éléments) a une relation avec la table "Mangas" de type "One-to-One". Chaque élément peut être un manga et avoir des attributs spécifiques stockés dans la table "Mangas".
    
- La table "Items" (éléments) a une relation avec la table "Books" de type "One-to-One". Chaque élément peut être un livre et avoir des attributs spécifiques stockés dans la table "Books".
    
- La table "Items" (éléments) a une relation avec la table "Comments" (commentaires) de type "One-to-Many". Un élément peut avoir plusieurs commentaires, mais un commentaire ne peut être associé qu'à un seul élément pour une relation donnée.