liste complète des tables pour la base de données du projet Hwa-Man :

Table "Users" (utilisateurs) :

- user_id (identifiant de l'utilisateur)
- username (nom d'utilisateur)
- password (mot de passe)
- email (adresse e-mail de l'utilisateur)

Table "Roles" (rôles) :

- role_id (identifiant du rôle)
- role_name (nom du rôle)

Table "Teams" (groupes) :

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

Table "Pages" :

- page_id (identifiant de la page, clé primaire)
- item_id (identifiant de l'élément auquel la page est associée, clé étrangère vers "Items")
- page_number (numéro de la page)
- content (contenu de la page)

Table "Images" :

- image_id (identifiant de l'image, clé primaire)
- item_id (identifiant de l'élément auquel l'image est associée, clé étrangère vers "Items")
- image_url (URL de l'image)

Table "Categories" :

- category_id (identifiant de la catégorie, clé primaire)
- item_id (identifiant de l'élément auquel la catégorie est associée, clé étrangère vers "Items")
- category_name (nom de la catégorie)




	1. liste des tables supplémentaires que vous pouvez considérer pour votre projet Hwa-Man :	

Table "UserGroupRoles" (rôles des utilisateurs dans les groupes) :

- user_group_role_id (identifiant du rôle de l'utilisateur dans le groupe)
- user_id (identifiant de l'utilisateur)
- group_id (identifiant du groupe)
- role_id (identifiant du rôle)

Table "Favorites" (favoris) :

- favorite_id (identifiant du favori)
- user_id (identifiant de l'utilisateur)
- item_id (identifiant de l'élément favori)
- item_type (type d'élément favori, par exemple "Manga" ou "Book")

Table "Likes" (mentions J'aime) :

- like_id (identifiant de la mention J'aime)
- user_id (identifiant de l'utilisateur)
- item_id (identifiant de l'élément aimé)
- item_type (type d'élément aimé, par exemple "Manga" ou "Book")

Table "Genres" (genres) :

- genre_id (identifiant du genre)
- genre_name (nom du genre)

Table "MangaGenres" (genres des mangas) :

- manga_genre_id (identifiant de la relation genre-manga)
- manga_id (identifiant du manga)
- genre_id (identifiant du genre)


voire: [[Script]]




{
  "date_naissance": "1990-01-15",
  "email": "utilisateur@example.com",
  "nom": "Doe",
  "password": "mot_de_passe_secret",
  "prenom": "John",
  "ville": "Villeville",
  "id_role": 2
}
{

  "date_naissance": "1990-01-15",

  "email": "utilisateur@example.com",

  "nom": "Doe",

  "password": "mot_de_passe_secret",

  "prenom": "John",

  "ville": "Villeville",

  "role": {

    "id": 2,

    "nom": "Monderator"

  }

}