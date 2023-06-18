     +-----------------------------------+
     |          Utilisateur              |
     +-----------------------------------+
                |                   |
    +-----------|-------------------|------------+
    |           |                   |            |
+---|----+  +---|----+       +------|-----+  +---|----+
| Se     |  | Gérer  |       | Consulter |  | Quitter |
| Connect|  | Utilisateurs |  |   Articles |  | l'appli |
| ion    |  | et Rôles    |  |  et Images |  |        |
+---|----+  +---|----+       +------|-----+  +---|----+
    |           |                   |            |
    +-----------|-------------------|------------+
                |                   |
     +-----------------------------------+
     |             Administrateur         |
     +-----------------------------------+


Cas d'utilisation : S'inscrire

Acteurs : Utilisateur

Description : Ce cas d'utilisation permet à un utilisateur de créer un compte dans l'application.

Scénario principal :
1. L'utilisateur lance l'application.
2. Le système affiche l'écran d'inscription.
3. L'utilisateur saisit son nom d'utilisateur, son mot de passe et son adresse e-mail.
4. L'utilisateur clique sur le bouton "S'inscrire".
5. Le système vérifie les informations fournies.
6. Si les informations sont valides, le système crée le compte utilisateur et redirige l'utilisateur vers l'écran de connexion.
7. Si les informations sont invalides, le système affiche un message d'erreur et permet à l'utilisateur de corriger les informations.

Extensions :
6a. L'utilisateur fournit une adresse e-mail déjà utilisée par un autre compte.
    1. Le système affiche un message d'erreur demandant à l'utilisateur de choisir une autre adresse e-mail.


Cas d'utilisation : Se Déconnecter

Acteurs : Utilisateur

Description : Ce cas d'utilisation permet à un utilisateur de se déconnecter de l'application.

Scénario principal :
1. L'utilisateur est connecté à l'application.
2. L'utilisateur sélectionne l'option "Se Déconnecter".
3. Le système demande confirmation.
4. Si l'utilisateur confirme, le système met fin à la session de l'utilisateur et redirige vers l'écran de connexion.
5. Si l'utilisateur annule, le système retourne à l'écran précédent.
