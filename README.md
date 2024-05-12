# 1. 🌠 Présentation du projet :
### 1.1 ◼️ Objectifs généraux du projet : 
> Dans le cadre de la matière « POO Java », les étudiants sont invités à réaliser un mini-projet de conception et de programmation d’une application informatique pour la gestion d’une bibliothèque. Ce projet contient l’analyse, la conception et l’implémentation d’un système de gestion du fonds de livres, des articles et des magazines scientifiques d’une bibliothèque et du prêt de ce fond à ses adhérents.
### 1.2 ⏮️ Expression de la problématique :

  -     La bibliothèque contient un certain nombre de documents disponibles à la consultation ou à l’emprunt ; les personnes désirant emprunter des documents pour une durée donnée doivent être ajoutées en tant que adhérents.
  -     Chaque adhérent est caractérisé par un nom et un prénom, un identifiant, une adresse et un type (étudiant, enseignant ou un visiteur) qui conditionne les critères d’emprunts suivants : le nombre de documents empruntables et la durée de prêt.
  -     De plus, on souhaite savoir pour chaque adhérent le nombre des emprunts effectués, le nombre des emprunts en cours et le nombre des emprunts dépassés.
  -     Les documents disponibles sont des livres, des magazines scientifiques ou des articles scientifiques. Chaque document est caractérisé par un titre, une localisation (salle/rayon) dans la bibliothèque, un code unique et un nombre d’exemplaires.  
  -     Les articles sont des documents possédant les caractéristiques complémentaires : le nom de l’auteur et date de publication.
  -     Les livres sont des documents possédant les caractéristiques complémentaires : le nom de l’auteur, le nom de l’éditeur et la date d’édition.
  -     Les magazines sont des documents possédant les caractéristiques complémentaires : la fréquence de parution.
  -     Le système permet d’afficher les caractéristiques de chaque document ainsi que son type.
  -     Enfin, afin de disposer de statistiques d’utilisation, on souhaite connaitre le nombre d’emprunts effectués pour chaque document.
  -     Chaque sortie de documents entraine la constitution d’une fiche d’emprunt. Sur cette fiche sont notés, l’adhérent emprunteur, la date de début du prêt et la date limite de restitution. Puis il est ajouté à l’ensemble des prêts.
  -     L’emprunt d’un document par un adhérent obéit à certaines règles :
  -     L’adhérent ne peut pas emprunter plus d’un nombre fixé par son type (par exemple 2 pour étudiant et 4 pour enseignant et 1 pour visiteur). Dès que ce nombre maximal est atteint pour un adhérent, tout nouveau prêt devra être impossible.
  -     Tout adhérent qui n’a pas restitué un document avant sa date limite est marqué par le système comme retardataire, ne pourra plus faire de nouvel emprunt tant qu’il n’a pas régularisé sa situation, ceci même si le nombre maximal d’emprunts n’est pas atteint. Pour ce faire, le système parcoure l’ensemble des fiches emprunt chaque jour à l’ouverture, afin de repérer s’il existe des documents pour lesquels la date limite de restitution est dépassée.
  -     La durée est précisée selon le type de l’adhérent (par exemple pour un étudiant 1 semaine, pour un enseignant 3 semaines, pour un visiteur 1 semaine).
  - Le système de gestion doit.prévoir toute opération de gestion des adhérents et des documents :
 ```sh
       o	L’ajout en respectant l’ordre des identifiants.
       o	La suppression à partir de l’identifiant
       o	La modification à partir de l’identifiant
       o	Les recherches selon différents critères, en particulier selon le type.
       o	La recherche des retardataires.
       o	Un inventaire qui édite la liste de tous les documents.
       o	Un inventaire qui édite la liste de tous les adhérents. 
 ```

### 1.3 📚 Les fonctionnalités de l’application :
  - L’application doit permettre de gérer les adhérents et les documents de la bibliothèque.
  - L’application doit permettre de gérer les emprunts des documents par les adhérents.
  - L’application doit permettre de gérer les retards des adhérents.
  - L’application doit permettre de gérer les statistiques d’utilisation des documents.
  - L’application doit permettre de gérer les inventaires des documents et des adhérents.
  - L’application doit permettre de gérer les recherches des documents et des adhérents.
  - L’application doit permettre de gérer les modifications des documents et des adhérents.
  - L’application doit permettre de gérer les suppressions des documents et des adhérents.
  - L’application doit permettre de gérer les ajouts des documents et des adhérents.


### 1.4 Differentes classes implementées

# Main 
- classe Main(classe Bibliotheque) se trouve dans le dossier pricipale (ou contient toutes nethodes lies au bon fonctionnement de la console)

# Entité
- classe Document (classe mere)</br>
  -classe Livre(herite de document)</br>
  -classe Magazine(herite de document)</br>
  -classe Article(herite de document)</br>

- classe Adherent</br>
  -Possedant plusieurs attributs , parmis lesquels le type de l'adherent(Etudiant,Enseignant,Visiteur).

# Service
- classe Historique(Gestion de l'historique en generale).
- classe PretDuDocument(Gestion des pret de document à un adherent).


### 1.5 Comment lancer le projet :

Se positionner dans le dossier pricipale , car c'est labas qu'est ecrit le code main du project :</br>
  - Verifier que votre systeme possede du jdk (java development kit).</br>
  - lancer le projet depuis un editeur (Vscode, Intellj,Eclipse).

Well done 🔥

### 1.6 Participants au projet : 

-     KENGNE KUATE NICK D (Chef de groupe) 🔥🗣️
-     DJOUNDA MOMO CHRISTIAN 🧑
-     TCHIDJEU S. SAURELLE 🧑
-     DOMTCHUENG FOUBI JOAN RAYN🧑

<br/>

<style>
  .container{
    display: flex;
    gap: 9px;
    width: 150px;
  }
</style>

<div class = "container">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-EQsh85HoeAyBxoHVy-bbVbzHO-2g4_ra5Ggd5-d0-w&s" alt width="50px" height="50px">

<img src="https://upload.wikimedia.org/wikipedia/fr/thumb/2/2e/Java_Logo.svg/800px-Java_Logo.svg.png" alt width="50px" height="50px">
</div>
