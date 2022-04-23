# spring-MVC-thymeleaf-server-side-rendering

### Par Hamza Ahmouny 4IIR G3

## Table des matières 
<ol>
<li><a href="#introduction">Introduction</a></li>
<li><a href="#enonce">Enoncé</a></li>
<li><a href="#conception">Conception & Architecture</a></li>
<li><a href="#codesource">Code Source</a></li>
<li><a href="#screen">Capture d’Ecran</a></li>
<li><a href="#conclusion">Conclusion</a></li>
</ol>



## Introduction

<details>
<summary>Introduction</summary>
<p>L'économie et la technologie d'aujourd'hui ont intensifié la nécessité de disposer de solutions de gestion des informations plus rapides, plus efficaces et à plus grande échelle. La spécification J2EE répond à ces défis en offrant un modèle de programmation qui améliore la productivité de développement, qui standardise la plateforme d'hébergement des applications d'entreprise et qui garantit la portabilité des applications développées grâce à une vaste suite de tests.</p>

<p>L'architecture J2EE prend en charge le développement à base de composants d'applications d'entreprise multiniveaux. Un système d'application J2EE comprend en général les niveaux suivants :</p>

### Niveau client
<p>Au niveau client, les composants Web (servlets ou fichiers JavaServer Pages (JSP), par exemple) ou les applications Java autonomes offrent une interface dynamique vers le niveau intermédiaire.</p>

### Niveau intermédiaire
<p>Au niveau serveur, ou niveau intermédiaire, les beans enterprise et les services Web encapsulent une logique applicative réutilisable et distribuable pour l'application. Ces composants de niveau serveur sont contenus dans un serveur d'applications J2EE qui offre une plateforme permettant à ces composants d'exécuter des actions et de stocker des données.</p>

### Niveau données d'entreprise
<p>C'est à ce niveau que les données de l'entreprise sont stockées et conservées, en général dans une base de données relationnelle.</p>
</details>


## Enonce

<details>
<summary>Consignes</summary>
<ol>
    <li>Présenter l'application web JEE Gestion des patients de l'activité pratique N°3 et N°4 avec ses quatres parties :
        <ul>
            <li>Partie 1 : Rechercher les patients, pagination et suppression des patients</li>
            <li>Partie 2 : Page template, Ajout des patients, validation des formulaires, édition et mise à jour des patients</li>
            <li>Partie 3 : Spring Security (Stratégies : InMemoryAuthentication et JDBCAuthentication)</li>
            <li>Partie 4 : Spring Security (Stratégie : UserDetailsService)</li>
        </ul>
    </li>
    <li>Présenter des fonctionnalités  et améliorations apportées à l'application ( Recherche Multi Critère, Ajouter d'autres attributs à la classe Patient, Améliorer le design, corriger quelques imperfections, améliorer la sécurité, etc.)</li>
    <li>Présenter le repository GitHub de votre application ainsi que les différentes branches et commits effectués</li>
    <li>Répondre aux questions que je vous poserai au niveau du code source de votre application</li>
    <li>Bonus : Ajouter la gestion d'autres entités en plus de Patient , comme : Médecin, Rendez-vous, Consultation, etc...)</li>
    <li>Il aussi important de montrer l'état d'avancement de votre projet dans les séances TP avant le contrôle</li>
    <li>Remettre un compte rendu dans un repository GitHub (Code source et Rapport (README.MD ou PDF))</li>
</ol>
</details>

## Conception
<ol>
    <li><a href="https://www.youtube.com/watch?v=vU6kcFEYeV8">Inversion de contrôle et Injection des dépendances Master IIBDCC FC 2022</a></li>
    <ul>
        <li><a href="https://www.youtube.com/watch?v=kvGL01TIvz8">Part 1 Rappel API JDBC</a></li>
        <li><a href="https://www.youtube.com/watch?v=kvGL01TIvz8">Part 2 JPA, Hibernate</a></li>
        <li><a href="https://www.youtube.com/watch?v=BftLthOpfm4">Part 3 JPA Hibernate</a></li>
        <li><a href="https://www.youtube.com/watch?v=xr-kMrV4gEo">Part 4 Spring Data</a></li>
        <li><a href="https://www.youtube.com/watch?v=X1ts0D4uPlo">Part 5 Mapping des associations et héritage</a></li>
    </ul>
    <li><a href="https://www.youtube.com/watch?v=vl1sKA-6aYE">Concepts de base Technologie Web JEE Servlet JSP MVC Spring MVC</a></li>
    <ul>
        <li><a href="https://www.youtube.com/watch?v=Zaf3XIP2wss">Part 1 : Bases de Spring MVC</a></li>
        <li><a href="https://www.youtube.com/watch?v=eoBE745lDE0">Part 2 : Thymeleaf Layout et Validation des formulaires</a></li>
        <li><a href="https://www.youtube.com/watch?v=Ejdeqs4rWek">Part 3 : Spring Security (Authentification)</a></li>
    </ul>
    <li><a href="https://youtu.be/vI185qymSVo">Introduction à la sécurité des applications Web</a></li>
</ol>

## Code source

Voir le repository sur cette page pour le code source.

## Screen

<details>
<summary>Capture d'ecran</summary>

### liste des patients
![listepatient](https://user-images.githubusercontent.com/46407388/160884884-fd1449ea-1a65-407b-8309-91ba528a48b4.png)
### rechercher un patient
![recherchepatient](https://user-images.githubusercontent.com/46407388/160884887-340ef4a1-e930-4561-9ab6-fbb63bdfe27a.png)
### supprimer un patient
![deletepatient](https://user-images.githubusercontent.com/46407388/160884881-4153cc72-54c2-4917-b619-452ac7f1b796.png)
### ajouter un patient
![ajouterpatient](https://user-images.githubusercontent.com/46407388/164934234-5ee7d5c8-fa5d-41d0-a011-dfa5780f8505.png)
### editer un patient
![editerpatient](https://user-images.githubusercontent.com/46407388/164934236-4ea365d9-bfc9-4410-a8d7-0fa3ded07d02.png)
### login 
![login](https://user-images.githubusercontent.com/46407388/164934239-c23f4a70-7971-48b8-ab4a-04960104702e.png)
### liste des patients version ADMIN
![listepatientADMIN](https://user-images.githubusercontent.com/46407388/164934237-95e7d4de-f303-41cd-8979-6d1147d17d30.png)
### liste des patients version USER
![listepatientUSER](https://user-images.githubusercontent.com/46407388/164934238-ae2428e0-389f-4b65-9132-1a0e7435d891.png)

</details>

## Conclusion

En travaillant dans sur cette activité, nous avons eu l'opportunité d'apprendre à développer une application Web JEE basée sur Spring MVC de Gestion des patients.


## Acknowledgments

<a href="https://www.youtube.com/channel/UCCwIYNpQVHZTd3Vx_krnmdA">Professeur Mohamed Youssfi</a>

## Fin