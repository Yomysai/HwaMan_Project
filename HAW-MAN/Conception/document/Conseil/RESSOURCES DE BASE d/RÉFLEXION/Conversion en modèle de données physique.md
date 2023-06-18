 conversion du modèle de données logique en un modèle de données physique pour le projet Hwa-Man :

Table "Users" :

- user_id (PK, int)
- username (varchar)
- password (varchar)
- email (varchar)

Table "Roles" :

- role_id (PK, int)
- role_name (varchar)

Table "Groups" :

- group_id (PK, int)
- group_name (varchar)

Table "Items" :

- item_id (PK, int)
- title (varchar)
- author (varchar)
- description (varchar)
- cover_image (varchar)
- item_type (varchar)

Table "Mangas" :

- manga_id (PK, int, FK référençant "Items.item_id")
- manga_specific_column1 (datatype)
- manga_specific_column2 (datatype)
- ...

Table "Books" :

- book_id (PK, int, FK référençant "Items.item_id")
- book_specific_column1 (datatype)
- book_specific_column2 (datatype)
- ...

Table "Comments" :

- comment_id (PK, int)
- item_id (int, FK référençant "Items.item_id")
- item_type (varchar)
- user_id (int, FK référençant "Users.user_id")
- comment_text (varchar)
- created_at (datetime)

Table "UserRoles" :

- user_role_id (PK, int)
- user_id (int, FK référençant "Users.user_id")
- role_id (int, FK référençant "Roles.role_id")

Table "UserGroups" :

- user_group_id (PK, int)
- user_id (int, FK référençant "Users.user_id")
- group_id (int, FK référençant "Groups.group_id")

Table "GroupRoles" :

- group_role_id (PK, int)
- group_id (int, FK référençant "Groups.group_id")
- role_id (int, FK référençant "Roles.role_id")

