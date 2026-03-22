# tp1-git--ZeroualReda-
J'ai essayé de manipuler mon 1er projet a l'aide de Git
Pour commencer, j'ai créé un dossier TP1-ZeroualReda ou j'ai pose deux fichiers contenant du code en java 
Apres le 1er commit : on a tracké que le 1er fichier Etudiant.java, on exécute la commande git status : On remarque que le 2eme fichier Prof.java est non suivie par Git 

<img width="945" height="370" alt="image" src="https://github.com/user-attachments/assets/65be3f1d-cacf-4417-9f34-665fba5e975b" />

Ensuite on exécute la commande git add -A suivie par la commande git status et on remarque que le 2eme fichier Prof.java est maintenant suivit pas git

<img width="945" height="459" alt="image" src="https://github.com/user-attachments/assets/bdc9aa59-60a8-4229-8ef9-d5c792329300" />

Puis on a essayé de créer un fichier credential qui a pour contenu un user et un mot de passe 
Apres un 3eme commit on s'est rendu compte qu'on ne doit pas passer notre identifiant et le mdp sur internet alors on doit supprimer ce fichier credential a l'aide de la 
commande git rm

<img width="945" height="319" alt="image" src="https://github.com/user-attachments/assets/7c13386c-a0b6-4358-b6c8-27ad02f7547f" />

A la fin on essaye d'ignorer ce fichier credential pour qu'il ne soit pas commit après 
On crée un fichier .gitignore ou on pose le nom de notre fichier à ignorer on ajoute ce fichier 
On remarque que Git n'afficher plus  le fichier credential dans les Untracked files
Et finalement on pousse notre projet a gitHub 

<img width="945" height="436" alt="image" src="https://github.com/user-attachments/assets/f7c92b86-4d0e-4f80-ba3e-fe66c6f3b7d7" />


