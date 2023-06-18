
v3
a prendre 


- Table "Users" (utilisateurs) :
    
    - Cardinalité avec "UserRoles" : (1,n) entre Users et UserRoles (Un utilisateur peut avoir plusieurs rôles)
    - Cardinalité avec "UserGroups" : (1,n) entre Users et UserGroups (Un utilisateur peut appartenir à plusieurs groupes)
    - 
- Table "Roles" (rôles) :
    
    - Cardinalité avec "UserRoles" : (1,n) entre Roles et UserRoles (Un rôle peut être attribué à plusieurs utilisateurs)
    - Cardinalité avec "GroupRoles" : (1,n) entre Roles et GroupRoles (Un rôle peut être attribué à plusieurs groupes)
    - 
- Table "Teams" (groupes) :
    
    - Cardinalité avec "UserTeams" : (1,n) entre Teams et UserTeams (Un groupe peut avoir plusieurs utilisateurs)
    - Cardinalité avec "GroupRoles" : (1,n) entre Teams et GroupRoles (Un groupe peut avoir plusieurs rôles)
    - 
- Table "Items" (éléments) :
    
    - Aucune cardinalité spécifique définie pour le moment
    - 
- Table "Mangas" :
    
    - Cardinalité avec "Items" : (0,1) entre Mangas et Items (Un manga est un type d'élément, mais tous les éléments ne sont pas forcément des mangas)
- Table "Books" :
    
    - Cardinalité avec "Items" : (0,1) entre Books et Items (Un livre est un type d'élément, mais tous les éléments ne sont pas forcément des livres)
    - 
- Table "Comments" (commentaires) :
    
    - Cardinalité avec "Items" : (1,1) entre Comments et Items (Un commentaire est associé à un seul élément)
    - Cardinalité avec "Users" : (1,1) entre Comments et Users (Un commentaire est écrit par un seul utilisateur)
    - 
- Table "UserRoles" (rôles des utilisateurs) :
    
    - Cardinalité avec "Users" : (0,n) entre UserRoles et Users (Un rôle peut être attribué à plusieurs utilisateurs)
    - 
- Table "UserGroups" (groupes d'utilisateurs) :
    
    - Cardinalité avec "Users" : (0,n) entre UserGroups et Users (Un utilisateur peut appartenir à plusieurs groupes)
    - 
- Table "GroupRoles" (rôles des groupes) :
    
    - Cardinalité avec "Groups" : (0,n) entre GroupRoles et Groups (Un rôle peut être attribué à plusieurs groupes)
    - 
- Table "Pages" :
    
    - Cardinalité avec "Items" : (1,n) entre Pages et Items (Une page est associée à un seul élément, mais un élément peut avoir plusieurs pages)
    - 
- Table "Images" :
    
    - Cardinalité avec "Items" : (1,n) entre Images et Items (Une image est associée à un seul élément, mais un élément peut avoir plusieurs images)

- Table "Categories" :
    
    - Cardinalité avec "Items" : (1,n) entre Categories et Items (Une catégorie est associée à un seul élément, mais un élément peut avoir plusieurs catégories)


- La relation entre "Users" et "Comments" est de 1 à N.
- La relation entre "Users" et "UserRoles" est de 1 à N.
- La relation entre "Roles" et "UserRoles" est de 1 à N.
- La relation entre "Teams" et "UserTeams" est de 1 à N.
- La relation entre "Groups" et "UserTeams" est de 1 à N.
- La relation entre "Groups" et "GroupRoles" est de 1 à N.
- La relation entre "Roles" et "GroupRoles" est de 1 à N.
- La relation entre "Items" et "Comments" est de 1 à N.
- La relation entre "Items" et "Pages" est de 1 à N.
- La relation entre "Items" et "Images" est de 1 à N.
- La relation entre "Items" et "Categories" est de 1 à N.
- La relation entre "Mangas" et "Items" est de 1 à 1 (un manga est associé à un seul élément).
- La relation entre "Books" et "Items" est de 1 à 1 (un livre est associé à un seul élément).

