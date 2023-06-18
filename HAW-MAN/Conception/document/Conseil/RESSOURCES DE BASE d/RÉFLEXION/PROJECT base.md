Projet : Hwa-Man - Bibliothèque virtuelle de mangas avec fonctionnalités de commentaires, d'ajout de produits et de gestion des utilisateurs avec différents groupes et rôles

Durée du projet : Du 9 juin au 30 juin

Objectif : Créer une application de bibliothèque virtuelle de mangas permettant aux utilisateurs de rechercher des mangas, d'afficher les détails des mangas, de commenter les mangas existants, d'ajouter de nouveaux mangas et de gérer les utilisateurs avec différents groupes et rôles. L'application aura un administrateur général qui aura un contrôle total sur l'ensemble de l'application, des administrateurs-utilisateurs qui pourront gérer les contenus et les utilisateurs, et des utilisateurs avec des rôles d'administrateurs spécifiques qui s'appliqueront uniquement aux groupes auxquels ils sont associés. L'application sera développée en utilisant Spring Boot pour la partie backend et React pour la partie frontend.

Fonctionnalités principales :

1. Recherche de mangas : Les utilisateurs pourront rechercher des mangas en fonction du titre, de l'auteur, du genre, etc.
    
2. Affichage des détails des mangas : Les utilisateurs pourront afficher les détails des mangas, y compris le titre, l'auteur, la description, la couverture du manga, etc.
    
3. Commentaires : Les utilisateurs pourront commenter les mangas existants et partager leurs opinions. Chaque commentaire sera associé à un manga spécifique.
    
4. Ajout de nouveaux mangas : Les administrateurs-utilisateurs pourront ajouter de nouveaux mangas à la bibliothèque virtuelle en fournissant les informations nécessaires, telles que le titre, l'auteur, la description, etc.
    
5. Gestion des utilisateurs : L'administrateur général pourra gérer tous les utilisateurs de l'application, y compris la création de nouveaux comptes, la modification des rôles des utilisateurs, etc. Les administrateurs-utilisateurs pourront gérer les utilisateurs uniquement dans les groupes auxquels ils sont associés.
    
6. Gestion des groupes : L'administrateur général pourra créer des groupes spécifiques et attribuer des utilisateurs à ces groupes. Chaque groupe peut avoir des autorisations et des fonctionnalités spécifiques. Les administrateurs-utilisateurs pourront gérer les utilisateurs uniquement dans les groupes auxquels ils sont associés.
    
7. Gestion des rôles : L'administrateur général pourra attribuer des rôles spécifiques aux utilisateurs dans l'ensemble de l'application, tels que "administrateur général" et "administrateur-utilisateur". Les administrateurs-utilisateurs auront des rôles d'administrateurs uniquement dans les groupes auxquels ils sont associés.
    

Technologies utilisées :

- Spring Boot : Framework Java pour le développement de l'API RESTful backend.
- Spring Data JPA : Pour l'accès à la base de données et la persistance des données.
- React : Framework JavaScript pour le développement de l'interface utilisateur frontend.
- MySQL : Base de données relationnelle pour stocker les informations sur les mangas, les commentaires, les utilisateurs, les groupes, les rôles, etc.

Livraison attendue :

- Une application fonctionnelle de bibliothèque virtuelle de mangas avec une interface utilisateur attrayante et réactive.
- Les fonctionnalités de recherche, d'affichage des détails des mangas, de commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs avec différents groupes et rôles doivent être implémentées.
- L'application doit être testée pour s'assurer qu'elle fonctionne correctement et qu'elle répond aux exigences spécifiées.

Planning prévisionnel :

- Du 9 juin au 13 juin : Configuration de l'environnement de développement, création du projet Spring Boot, et mise en place de la base de données.

- Du 14 juin au 20 juin : Développement de l'API RESTful avec les fonctionnalités de recherche, d'affichage des détails des mangas, de gestion des commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs, des groupes et des rôles.

- Du 21 juin au 27 juin : Développement de l'interface utilisateur React avec les fonctionnalités de recherche, d'affichage des détails des mangas, de commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs, des groupes et des rôles.

- Du 28 juin au 30 juin : Tests, correction des bugs et finalisation du projet.




V2



Formulaire d'ajout de produit : Vous devez concevoir une interface utilisateur qui permettra aux administrateurs-utilisateurs d'ajouter de nouveaux produits à la bibliothèque virtuelle. Le formulaire devrait inclure des champs tels que le nom, la description, le prix, la quantité et la possibilité de télécharger une image du produit.

    Gestion des produits : Les administrateurs-utilisateurs auront la possibilité de gérer les produits existants, y compris l'édition des informations, la mise à jour des quantités, la suppression de produits, etc.

    Association de produits aux mangas : Lors de l'ajout d'un produit, les administrateurs-utilisateurs pourront le lier à un manga spécifique en sélectionnant l'identifiant du manga correspondant.

    Affichage des produits associés à un manga : Dans l'interface utilisateur de détails d'un manga, vous pouvez afficher les produits associés à ce manga spécifique. Cela permettra aux utilisateurs de voir les produits disponibles en rapport avec le manga qu'ils consultent.

implémenter les fonctionnalités liées à l'ajout de produits dans votre application Hwa-Man,  étapes à  suivre :

1. Formulaire d'ajout de produit :
    
    - Créez une page dans votre interface utilisateur React pour afficher le formulaire d'ajout de produit.
    - Concevez le formulaire avec les champs nécessaires tels que le nom, la description, le prix, la quantité et la possibilité de télécharger une image du produit.
    - Capturez les données saisies par l'utilisateur et préparez-les pour l'envoi au backend.
2. Gestion des produits :
    
    - Créez une page ou une section dans l'interface utilisateur pour afficher la liste des produits existants.
    - Permettez aux administrateurs-utilisateurs de visualiser, éditer et supprimer les produits existants.
    - Implémentez les fonctionnalités d'édition pour permettre la modification des informations du produit, la mise à jour des quantités, etc.
3. Association de produits aux mangas :
    
    - Lorsque vous ajoutez un produit, incluez un champ pour sélectionner l'identifiant du manga correspondant.
    - Utilisez une liste déroulante ou une autre interface pour permettre aux administrateurs-utilisateurs de choisir le manga auquel le produit sera associé.
    - Associez l'identifiant du manga sélectionné au produit lors de son enregistrement.
4. Affichage des produits associés à un manga :
    
    - Dans l'interface utilisateur de détails d'un manga, ajoutez une section pour afficher les produits associés à ce manga.
    - Récupérez les produits associés au manga spécifique à partir de votre backend en utilisant l'identifiant du manga.
    - Affichez les détails des produits, y compris le nom, la description, le prix, la quantité et l'image, s'ils sont disponibles.

333333333333333333333333333333333333333333333333333333333333333333333333333333333

Projet : Hwa-Man - Bibliothèque virtuelle de mangas avec fonctionnalités de commentaires, d'ajout de produits et de gestion des utilisateurs avec différents groupes et rôles

Durée du projet : Du 9 juin au 30 juin

Objectif : Créer une application de bibliothèque virtuelle de mangas permettant aux utilisateurs de rechercher des mangas, d'afficher les détails des mangas, de commenter les mangas existants, d'ajouter de nouveaux mangas et de gérer les utilisateurs avec différents groupes et rôles. L'application aura un administrateur général qui aura un contrôle total sur l'ensemble de l'application, des administrateurs-utilisateurs qui pourront gérer les contenus et les utilisateurs, et des utilisateurs avec des rôles d'administrateurs spécifiques qui s'appliqueront uniquement aux groupes auxquels ils sont associés. L'application sera développée en utilisant Spring Boot pour la partie backend et React pour la partie frontend.

Fonctionnalités principales :

- Recherche de mangas : Les utilisateurs pourront rechercher des mangas dans la bibliothèque virtuelle.
- Affichage des détails des mangas : Les utilisateurs pourront voir les informations détaillées sur chaque manga.
- Commentaires : Les utilisateurs pourront laisser des commentaires sur les mangas existants.
- Ajout de nouveaux mangas : Les administrateurs pourront ajouter de nouveaux mangas à la bibliothèque.
- Gestion des utilisateurs, groupes et rôles : Les administrateurs pourront gérer les utilisateurs, les groupes et les rôles.

Technologies utilisées :

- Spring Boot : Framework Java pour le développement de l'API RESTful backend.
- Spring Data JPA : Pour l'accès à la base de données et la persistance des données.
- React : Framework JavaScript pour le développement de l'interface utilisateur frontend.
- MySQL : Base de données relationnelle pour stocker les informations sur les mangas, les commentaires, les utilisateurs, les groupes, les rôles, etc.

Livraison attendue :

- Une application fonctionnelle de bibliothèque virtuelle de mangas avec une interface utilisateur attrayante et réactive.
- Les fonctionnalités de recherche, d'affichage des détails des mangas, de commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs avec différents groupes et rôles doivent être implémentées.
- L'application doit être testée pour s'assurer qu'elle fonctionne correctement et qu'elle répond aux exigences spécifiées.

Planning prévisionnel :

- Du 9 juin au 13 juin : Configuration de l'environnement de développement, création du projet Spring Boot et mise en place de la base de données.
- Du 14 juin au 20 juin : Développement de l'API RESTful avec les fonctionnalités de recherche, d'affichage des détails des mangas, de gestion des commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs, des groupes et des rôles.
- Du 21 juin au 27 juin : Développement de l'interface utilisateur React avec les fonctionnalités de recherche, d'affichage des détails des mangas, de commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs, des groupes et des rôles.
- Du 28 juin au 30 juin : Tests, correction des bugs et finalisation du projet.

Voir [[CONSEIL]] pour gérer ton temps efficacement afin de respecter les délais fixés. Bonne chance pour le projet Hwa-Man !
