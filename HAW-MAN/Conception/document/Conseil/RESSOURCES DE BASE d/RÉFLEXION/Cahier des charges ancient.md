
dernière mise a jour :
## Introduction

Le projet Hwa-Man vise à développer une application de bibliothèque virtuelle de mangas avec des fonctionnalités avancées de commentaires, d'ajout de nouveaux mangas et de gestion des utilisateurs avec différents groupes et rôles. L'application sera développée en utilisant Spring Boot pour la partie backend et React pour la partie frontend.

## Objectif

L'objectif de ce projet est de créer une application de bibliothèque virtuelle de mangas permettant aux utilisateurs de rechercher des mangas, d'afficher les détails des mangas, de commenter les mangas existants, d'ajouter de nouveaux mangas et de gérer les utilisateurs avec différents groupes et rôles. Les fonctionnalités spécifiques comprennent :

1. Recherche de mangas : Les utilisateurs pourront rechercher des mangas en fonction du titre, de l'auteur, du genre, etc.
    
2. Affichage des détails des mangas : Les utilisateurs pourront afficher les détails des mangas, y compris le titre, l'auteur, la description, la couverture du manga, etc.
    
3. Commentaires : Les utilisateurs pourront commenter les mangas existants et partager leurs opinions. Chaque commentaire sera associé à un manga spécifique.
    
4. Ajout de nouveaux mangas : Les administrateurs-utilisateurs pourront ajouter de nouveaux mangas à la bibliothèque virtuelle en fournissant les informations nécessaires, telles que le titre, l'auteur, la description, etc.
    
5. Gestion des utilisateurs : L'administrateur général pourra gérer tous les utilisateurs de l'application, y compris la création de nouveaux comptes, la modification des rôles des utilisateurs, etc. Les administrateurs-utilisateurs pourront gérer les utilisateurs uniquement dans les groupes auxquels ils sont associés.
    
6. Gestion des groupes : L'administrateur général pourra créer des groupes spécifiques et attribuer des utilisateurs à ces groupes. Chaque groupe peut avoir des autorisations et des fonctionnalités spécifiques. Les administrateurs-utilisateurs pourront gérer les utilisateurs uniquement dans les groupes auxquels ils sont associés.
    
7. Gestion des rôles : L'administrateur général pourra attribuer des rôles spécifiques aux utilisateurs dans l'ensemble de l'application, tels que "administrateur général" et "administrateur-utilisateur". Les administrateurs-utilisateurs auront des rôles d'administrateurs uniquement dans les groupes auxquels ils sont associés.

## Durée du projet

Le projet se déroulera du 9 juin au 30 juin.

## Technologies utilisées

- Spring Boot : Framework Java pour le développement de l'API RESTful backend.
- Spring Data JPA : Pour l'accès à la base de données et la persistance des données.
- React : Framework JavaScript pour le développement de l'interface utilisateur frontend.
- MySQL : Base de données relationnelle pour stocker les informations sur les mangas, les commentaires, les utilisateurs, les groupes, les rôles, etc.

## Livrables attendus

- Une application fonctionnelle de bibliothèque virtuelle de mangas avec une interface utilisateur attrayante et réactive.
- Les fonctionnalités de recherche, d'affichage des détails des mangas, de commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs avec différents groupes et rôles doivent être implémentées.
- L'application doit être testée pour s'assurer qu'elle fonctionne correctement et qu'elle répond aux exigences spécifiées.

## Contraintes techniques

- Spring Boot 2.5+ et React 17+ doivent être utilisés.
- L'application doit être compatible avec les navigateurs les plus couramment utilisés (Chrome, Firefox, Safari, etc.).

## Gestion des erreurs

- Les erreurs doivent être gérées de manière appropriée et des messages d'erreur standardisés doivent être renvoyés en cas d'échec de l'API.

## Contraintes de performance

- Les temps de réponse pour les différentes fonctionnalités doivent être optimisés.
- Des mesures telles que la mise en cache des données et l'utilisation d'index dans la base de données doivent être prises pour améliorer les performances.

## Tests

- Différents types de tests doivent être effectués, notamment des tests unitaires, des tests d'intégration et des tests d'interface utilisateur.
- Des outils de tests appropriés doivent être utilisés pour garantir la qualité de l'application.

## Documentation

- Une documentation complète du projet doit être fournie, comprenant des instructions d'installation, des guides d'utilisation et une documentation du code.

## Livraison

- Les livrables doivent être fournis sous forme de code source, de documentation (PDF, HTML, etc.) et de tout autre élément nécessaire.
- Les livrables peuvent être livrés par courrier électronique ou via un dépôt Git.

## Planning prévisionnel

- Du 9 juin au 13 juin : Configuration de l'environnement de développement, création du projet Spring Boot et mise en place de la base de données.
- Du 14 juin au 20 juin : Développement de l'API RESTful avec les fonctionnalités de recherche, d'affichage des détails des mangas, de gestion des commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs, des groupes et des rôles.
- Du 21 juin au 27 juin : Développement de l'interface utilisateur React avec les fonctionnalités de recherche, d'affichage des détails des mangas, de commentaires, d'ajout de nouveaux mangas, de gestion des utilisateurs, des groupes et des rôles.
- Du 28 juin au 30 juin : Tests, correction des bugs et finalisation du projet.

---







9.  Ancien ;



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

Voir [[CONSEIL]] pour gérer ton temps efficacement et respecter les délais fixés. Bonne chance pour le projet Hwa-Man !


