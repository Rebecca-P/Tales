# Projet Mobile: Tales of Data
## Par Rebecca Porchette 3A 33

<img src="http://document.nintendo-difference.com/44167/artworks/9a0716800f1906ead48d64bafe71a7a3.jpg">


## Mais à quoi sert l'application?

Pour les personnes jouant à Tales of Vesperia et souhaitant en apprendre plus sur différentes parties du jeu.

## Mais qu coup c'est quoi Tales of Vesperia?

C'est une bonne question!

Tales of vesperia est un RPG sorti initialement au japon le 8 Aout 2008 et en Europe en juin 2009.

### Histoire

*Wikipedia*

>Dans le quartier inférieur de Zaphias, capitale de Terca Lumeiris, Yuri Lowell, ancien chevalier impérial qui a démissionné pour cause de contradiction avec l'empire, aide désormais ceux qui sont dans le besoin. Un jour, le quartier inférieur de Zaphias est envahit d'eau de la fontaine. Voulant l'examiner, il découvre que le noyau de la fontaine (qui est un blastia: l'aque blastia) a disparu. Après avoir appris qu'un certain Mordio a été le dernier à avoir approcher le blastia, Yuri décide de se rendre dans le quartier noble.

Pour les 10 ans du jeu, Bandai Namco décida de sortir une édition spécial du jeu

*Bandai Namco*

>Célébrant son 10e anniversaire, Tales of Vesperia est l’un des jeux les plus appréciés de la série Tales of et revient avec une résolution améliorée ainsi que des personnages, événements et tenues encore jamais dévoilés hors du Japon.

## Comment l'obtenir?
* Une APK est disponible sur le git
* Vous pouvez recuperer la derniere version sur ____(Veuillez récuperer la branche Recherche!)____ :
```
https://github.com/Rebecca-P/Tales.git
```

## Ce que j'ai utilisé:

* Appel d'un API REST( crée moi-même pour l'application)
* Utilisation de plusieurs écran dont plusieurs avec des RecyclerView et au clic un détail de l'item
* Stockage d'informations en cache
* Architecture MVC
* Animation entre écrans (Splash Screen)
* Notifications Push : 
<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-29-22-25-05.png">
</p>
* GitFlow : 2 branches: "Master" et "Recherche"

## Du coup à quoi ressemble ton application?

Vous êtes accueilli par un **écran titre** rappelant les 10 ans du jeu:

<p align="center">
<img src="https://github.com/Rebecca-P/Tales/blob/recherche/app/src/main/res/drawable/ver2.gif">
</p>
Ensuite, vous vous retrouviez sur le menu principal de l'application :
<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-28-21-18-13.png">
</p>

Comme vous pouvez le voir, vous avez le choix parmi plusieurs sélection.

Allons par exemple dans la parti *ITEM>CONSOMMABLE*
On peut voir chaque item consommable du jeu!

<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-29-22-18-08.png">
</p>

Ces items ne dispose pas plus de détail donc ils ne sont pas cliquable

Mais si nous allons dans *EQUIPEMENT>ARMES* , on est peut voir que nous avons le choix parmi les armes =D !


<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-28-21-20-04.png">
</p>
En cliquant sur un nom, on peut avoir le **detail de l'item**!


<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-29-22-18-40.png">
</p>

De plus , il existe un systeme de filtrage permettant à vous utilisateur de faciliter vos recherches!
* Dans le cas des armes : **TYPE D'ARMES**
* Dans les autres parties de : **PAR PERSONNAGE**


<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-28-21-20-17.png">
</p>
Vous pouvez remarquer qu'en allant dans chaque partie de l'équipement vous êtes d'abord accueilli par Repede <img src="https://github.com/Rebecca-P/Tales/blob/recherche/app/src/main/res/drawable/repede.gif">


<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-28-21-18-22.png">
</p>

Ensuite vous pouvez aussi profiter de l'opening du jeu 


<p align="center">
<img  src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-29-22-20-56.png">
</p>
Et enfin, **la meilleur des fonctionalités de l'application: La Recherche**

## Recherche <img src="https://github.com/Rebecca-P/Tales/blob/recherche/app/src/main/res/drawable/wait.gif">

Vous êtes à nouveau accueilli par Repede et Estellise s'occupera de vous aider dans vos recherches!


<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-28-21-18-28.png">
</p>
Une fois qu'elle sera prête , vous pourrez y effectuer une recherche dynamique !

<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-28-21-19-39.png">
</p>

Et si par hasard vous avez oublié de verifier une information concernant le précédent item, vous pourrez cliquer sur **derniere recherche**
pour retrouver votre derniere recherche grace à la **mise en cache du dernier item**!

<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/Screenshot_2019-03-28-21-19-16.png">
</p>
<p align="center">
<img width ="250" height="440" src="https://github.com/Rebecca-P/Tales_ofData/blob/master/screen.png">
</p>

