Dictionnaire des entités :

- Entités :
    
    - Users
        - user_id (int)
        - username (varchar(255))
        - password (varchar(255))
        - email (varchar(255))
    - Roles
        
        - role_id (int)
        - role_name (varchar(255))
    - Groups
        
        - group_id (int)
        - group_name (varchar(255))
    - Items
        
        - item_id (int)
        - title (varchar(255))
        - author (varchar(255))
        - description (text)
        - cover_image (varchar(255))
        - item_type (varchar(255))
    - Mangas
        
        - manga_id (int)
        - manga_specific_column1 (varchar(255))
        - manga_specific_column2 (varchar(255))
    - Books
        
        - book_id (int)
        - book_specific_column1 (varchar(255))
        - book_specific_column2 (varchar(255))
    - Comments
        
        - comment_id (int)
        - item_id (int)
        - item_type (varchar(255))
        - user_id (int)
        - comment_text (text)
        - created_at (timestamp)
    - UserRoles
        
        - user_role_id (int)
        - user_id (int)
        - role_id (int)
    - UserGroups
        
        - user_group_id (int)
        - user_id (int)
        - group_id (int)
    - GroupRoles
        
        - group_role_id (int)
        - group_id (int)
        - role_id (int)
    - Pages
        
        - page_id (int)
        - item_id (int)
        - page_number (int)
        - content (text)
    - Images
        
        - image_id (int)
        - item_id (int)
        - image_url (varchar(255))
    - Categories
        
        - category_id (int)
        - item_id (int)
        - category_name (varchar(255))

Voici les cardinalités correspondantes pour chaque relation :

- La relation entre "Users" et "UserRoles" est de 1 à N (Un utilisateur peut avoir plusieurs rôles, mais un rôle est associé à un seul utilisateur).
- La relation entre "Roles" et "UserRoles" est de 1 à N (Un rôle peut être associé à plusieurs utilisateurs, mais un utilisateur a un seul rôle).
- La relation entre "Users" et "UserTeams" est de 1 à N (Un utilisateur peut appartenir à plusieurs équipes, mais une équipe est associée à un seul utilisateur).
- La relation entre "Teams" et "UserTeams" est de 1 à N (Une équipe peut avoir plusieurs utilisateurs, mais un utilisateur appartient à une seule équipe).
- La relation entre "Teams" et "GroupRoles" est de 1 à N (Une équipe peut avoir plusieurs rôles, mais un rôle est associé à une seule équipe).
- La relation entre "Roles" et "GroupRoles" est de 1 à N (Un rôle peut être associé à plusieurs équipes, mais une équipe a un seul rôle).
- La relation entre "Items" et "Mangas" est de 1 à 0 ou 1 (Un manga est un type spécifique d'élément, donc chaque enregistrement dans "Mangas" est associé à un seul enregistrement dans "Items").
- La relation entre "Items" et "Books" est de 1 à 0 ou 1 (Un livre est un type spécifique d'élément, donc chaque enregistrement dans "Books" est associé à un seul enregistrement dans "Items").
- La relation entre "Items" et "Comments" est de 1 à N (Un élément peut avoir plusieurs commentaires, mais chaque commentaire est associé à un seul élément).
- La relation entre "Items" et "Pages" est de 1 à N (Un élément peut avoir plusieurs pages, mais chaque page est associée à un seul élément).
- La relation entre "Items" et "Images" est de 1 à N (Un élément peut avoir plusieurs images, mais chaque image est associée à un seul élément).
- La relation entre "Items" et "Categories" est de 1 à N (Un élément peut appartenir à plusieurs catégories, mais chaque catégorie est associée à un seul élément).

- "Users" et "UserRoles" : AssignerRôle (AssignRole)
- "Roles" et "UserRoles" : AffecterUtilisateur (AssignUser)
- "Users" et "UserTeams" : JoindreÉquipe (JoinTeam)
- "Teams" et "UserTeams" : AjouterMembre (AddMember)
- "Teams" et "GroupRoles" : AffecterRôle (AssignRole)
- "Roles" et "GroupRoles" : AssignerÉquipe (AssignTeam)
- "Items" et "Mangas" : AssocierManga (AssociateManga)
- "Items" et "Books" : AssocierLivre (AssociateBook)
- "Items" et "Comments" : AjouterCommentaire (AddComment)
- "Items" et "Pages" : AjouterPage (AddPage)
- "Items" et "Images" : AjouterImage (AddImage)
- "Items" et "Categories" : AjouterCatégorie (AddCategory)