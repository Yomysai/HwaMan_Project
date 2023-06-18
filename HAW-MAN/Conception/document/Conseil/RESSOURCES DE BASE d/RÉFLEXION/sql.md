Table "Users" (utilisateurs) :

- user_id (identifiant de l'utilisateur)
- username (nom d'utilisateur)
- password (mot de passe)
- email (adresse e-mail de l'utilisateur)

Table "Roles" (rôles) :

- role_id (identifiant du rôle)
- role_name (nom du rôle)

Table "Groups" (groupes) :

- group_id (identifiant du groupe)
- group_name (nom du groupe)

Table "Items" (éléments) :

- item_id (identifiant de l'élément)
- title (titre de l'élément)
- author (auteur de l'élément)
- description (description de l'élément)
- cover_image (chemin de l'image de couverture de l'élément)
- item_type (type d'élément, par exemple "Manga" ou "Book")

Table "Mangas" :

- manga_id (identifiant du manga, clé étrangère vers "Items")
- manga_specific_column1 (attribut spécifique au manga 1)
- manga_specific_column2 (attribut spécifique au manga 2)
- ...

Table "Books" :

- book_id (identifiant du livre, clé étrangère vers "Items")
- book_specific_column1 (attribut spécifique au livre 1)
- book_specific_column2 (attribut spécifique au livre 2)
- ...

Table "Comments" (commentaires) :

- comment_id (identifiant du commentaire)
- item_id (identifiant de l'élément auquel le commentaire est associé)
- item_type (type d'élément associé, par exemple "Manga" ou "Book")
- user_id (identifiant de l'utilisateur qui a laissé le commentaire)
- comment_text (contenu du commentaire)
- created_at (date de création du commentaire)

Table "UserRoles" (rôles des utilisateurs) :

- user_role_id (identifiant du rôle de l'utilisateur)
- user_id (identifiant de l'utilisateur)
- role_id (identifiant du rôle)

Table "UserGroups" (groupes d'utilisateurs) :

- user_group_id (identifiant du groupe d'utilisateur)
- user_id (identifiant de l'utilisateur)
- group_id (identifiant du groupe)

Table "GroupRoles" (rôles des groupes) :

- group_role_id (identifiant du rôle du groupe)
- group_id (identifiant du groupe)
- role_id (identifiant du rôle)