            +---------------------+
            |        User         |
            +---------------------+
            | user_id             |
            | username            |
            | password            |
            | email               |
            +---------------------+
                   |
                   |
            +---------------------+
            |        Role         |
            +---------------------+
            | role_id        |
            | role_name_User      |
            | user_id             |
            +---------------------+
                   |
                   |
            +---------------------+
            |        Teams        |
            +---------------------+
            | group_id_Teams      |
            | group_name          |
            +---------------------+
                   |
                   |
            +---------------------+
            |        Items        |
            +---------------------+
            | item_id             |
            | title               |
            | author_User         |
            | description         |
            | cover_image         |
            | item_type           |
            | books_book_id_books |
            | mangas_manga_id     |
            | comments_comment_id |
            +---------------------+
                   |
             ______|_______
            |              |
    +---------------+  +---------------+
    |    Mangas     |  |    Books      |
    +---------------+  +---------------+
    | manga_id      |  | book_id_Books |
    | manga_specific_column1     |  | book_specific_column1 |
    | manga_specific_column2     |  | book_specific_column2 |
    | items_item_id |  | items_item_id      |
    +---------------+  +---------------+
                   |
            +---------------------+
            |       Comments      |
            +---------------------+
            | comment_id          |
            | item_id             |
            | item_type_Comments  |
            | user_id_Comments    |
            | comment_text        |
            | created_at          |
            | items_item_id       |
            | user_user_id        |
            +---------------------+
                   |
                   |
            +---------------------+
            |        Pages        |
            +---------------------+
            | page_id      |
            | item_id_Pages       |
            | page_number         |
            | content             |
            +---------------------+
                   |
                   |
            +---------------------+
            |       Images        |
            +---------------------+
            | image_id     |
            | item_id_Images      |
            | image_url_User      |
            | item_id             |
            +---------------------+
                   |
                   |
            +---------------------+
            |     Categories      |
            +---------------------+
            | category_id_Categories |
            | item_id_Categories     |
            | category_name          |
            +---------------------+
                   |
             ______|_______
            |              |
    +-----------------+  +-----------------+
    | AjouterCatégorie |  |  AjouterPage   |
    +-----------------+  +-----------------+
    | item_id              |  | item_id              |
    | category_id_Categories |  | page_id_Pages        |
    +-----------------+  +-----------------+
                   |
            +---------------------+
            |    AjouterMembre    |
            +---------------------+
            | group_id_Teams      |
            | user_id             |
            +---------------------+
