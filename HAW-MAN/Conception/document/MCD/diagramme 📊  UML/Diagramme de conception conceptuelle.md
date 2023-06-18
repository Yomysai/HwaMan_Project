           +--------------+
           |    User      |
           +--------------+
           | user_id      |
           | username     |
           | password     |
           | email        |
           +--------------+
               |          |
               |          |
       +-------+          +-------+
       |                         |
       |                         |
+--------------+           +---------------+
|    Role      |           |     Team      |
+--------------+           +---------------+
| role_id_Role |           | group_id_Teams|
| role_name_User|           | group_name    |
| user_id      |           +---------------+
+--------------+
       |
       |
+------------------+
|      Item        |
+------------------+
| item_id          |
| title            |
| author_User      |
| description      |
| cover_image      |
| item_type        |
| book_book_id_books   |
| manga_manga_id   |
| comment_comment_id   |
| page_page_id_pages   |
+------------------+
       |          |
       |          |
+---------------+  +---------------+
|     Manga     |  |    Comment    |
+---------------+  +---------------+
| manga_id      |  | comment_id    |
| manga_specific_column1| item_id      |
| manga_specific_column2| item_type_Comments |
| item_item_id  |  | user_id_Comments |
|               |  | comment_text  |
|               |  | created_at    |
+---------------+  | item_item_id  |
                   | user_user_id  |
                   +---------------+
       |
       |
+---------------+
|      Book     |
+---------------+
| book_id_Books |
| book_specific_column1|
| book_specific_column2|
| item_item_id  |
+---------------+
       |
       |
+---------------+
|      Page     |
+---------------+
| page_id_Pages |
| item_id_Pages |
| page_number   |
| content       |
| item_item_id  |
+---------------+
       |
       |
+------------------+
|      Image       |
+------------------+
| image_id_Images  |
| item_id_Images   |
| image_url   |
| item_id          |
+------------------+
       |
       |
+----------------------+
|      Categorie       |
+----------------------+
| category_id_Categories|
| item_id_Categories   |
| category_name        |
+----------------------+
       |
       |
+----------------------+
|   AjouterCatégorie   |
+----------------------+
| item_id              |
| category_id_Categories|
+----------------------+
       |
       |
+------------------+
|  AjouterMembre   |
+------------------+
| group_id_Teams   |
| user_id          |
+------------------+


- User:
    
    - getUserById(userId): User
    - createUser(username, password, email): User
    - updateUser(userId, username, password, email): void
    - deleteUser(userId): void
- Role:
    
    - getRoleById(roleId): Role
    - createRole(roleName, userId): Role
    - updateRole(roleId, roleName): void
    - deleteRole(roleId): void
- Team:
    
    - getTeamById(teamId): Team
    - createTeam(groupName): Team
    - updateTeam(teamId, groupName): void
    - deleteTeam(teamId): void
- Item:
    
    - getItemById(itemId): Item
    - createItem(title, author, description, coverImage, itemType): Item
    - updateItem(itemId, title, author, description, coverImage): void
    - deleteItem(itemId): void
- Manga:
    
    - getMangaById(mangaId): Manga
    - createManga(mangaSpecificColumn1, mangaSpecificColumn2, itemId): Manga
    - updateManga(mangaId, mangaSpecificColumn1, mangaSpecificColumn2): void
    - deleteManga(mangaId): void
- Comment:
    
    - getCommentById(commentId): Comment
    - createComment(itemId, itemType, userId, commentText, createdAt): Comment
    - updateComment(commentId, commentText): void
    - deleteComment(commentId): void
- Book:
    
    - getBookById(bookId): Book
    - createBook(bookSpecificColumn1, bookSpecificColumn2, itemId): Book
    - updateBook(bookId, bookSpecificColumn1, bookSpecificColumn2): void
    - deleteBook(bookId): void
- Page:
    
    - getPageById(pageId): Page
    - createPage(itemId, pageNumber, content): Page
    - updatePage(pageId, pageNumber, content): void
    - deletePage(pageId): void
- Image:
    
    - getImageById(imageId): Image
    - createImage(itemId, imageUrl): Image
    - updateImage(imageId, imageUrl): void
    - deleteImage(imageId): void
- Categorie:
    
    - getCategorieById(categorieId): Categorie
    - createCategorie(itemId, categoryName): Categorie
    - updateCategorie(categorieId, categoryName): void
    - deleteCategorie(categorieId): void
- AjouterCatégorie:
    
    - addCategoryToItem(itemId, categoryId): void
    - removeCategoryFromItem(itemId, categoryId): void
- AjouterMembre:
    
    - addMemberToTeam(teamId, userId): void
    - removeMemberFromTeam(teamId, userId): void

- User :
    
    - user_id: INT
    - username: VARCHAR
    - password: VARCHAR
    - email: VARCHAR
- Role :
    
    - role_id_Role: INT
    - role_name_User: VARCHAR
    - user_id: INT (relation avec User)
- Team :
    
    - group_id_Teams: INT
    - group_name: VARCHAR
- Item :
    
    - item_id: INT
    - title: VARCHAR
    - author_User: VARCHAR
    - description: VARCHAR
    - cover_image: VARCHAR
    - item_type: VARCHAR
    - book_book_id_books: INT (relation avec Book)
    - manga_manga_id: INT (relation avec Manga)
    - comment_comment_id: INT (relation avec Comment)
    - page_page_id_pages: INT (relation avec Page)
- Manga :
    
    - manga_id: INT
    - manga_specific_column1: VARCHAR
    - manga_specific_column2: VARCHAR
    - item_item_id: INT (relation avec Item)
- Comment :
    
    - comment_id: INT
    - item_id: INT
    - item_type_Comments: VARCHAR
    - user_id_Comments: INT
    - comment_text: TEXT
    - created_at: TIMESTAMP
    - item_item_id: INT (relation avec Item)
    - user_user_id: INT (relation avec User)
- Book :
    
    - book_id_Books: INT
    - book_specific_column1: VARCHAR
    - book_specific_column2: VARCHAR
    - item_item_id: INT (relation avec Item)
- Page :
    
    - page_id_Pages: INT
    - item_id_Pages: INT
    - page_number: INT
    - content: TEXT
    - item_item_id: INT (relation avec Item)
- Image :
    
    - image_id_Images: INT
    - item_id_Images: INT
    - image_url_User: VARCHAR
    - item_id: INT (relation avec Item)
- Categorie :
    
    - category_id_Categories: INT
    - item_id_Categories: INT
    - category_name: VARCHAR
- AjouterCatégorie :
    
    - item_id: INT
    - category_id_Categories: INT
- AjouterMembre :
    
    - group_id_Teams: INT
    - user_id: INT