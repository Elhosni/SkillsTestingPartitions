##author: 
m.elhosni.

##description:
Implémentation de la méthode partionner().
param inputList.
param taille.
return retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
La méthode est générique. On utilise a variable class type dans l'implémentation <E>.
La méthode est écrite pour le type int ou la classe de type int qui est Integer().
cas spécial:
*Si inputList est une liste vide la méthode retourne une liste vide.
*Si taille <= 0 la méthode retourne une liste vide.
	 
	 
##Pour faire le build/install/unit Testing/Deploy
Pour faire le build/install: on va dans l'arborscence du projet skillsTesting et on exécute la commande. 
$mvn clean install.
	 
Pour faire le unit Testing: on va dans l'arborscence du projet skillsTesting et on exécute la commande. 
$mvn verify.
	 
Pour deployer le jar dans le repo interne: on va dans l'arborscence du projet skillsTesting et on exécute la commande 
$mvn deploy.

On trouve dans ce cas la library (api) dans le répertoire de repo interne créé: 
partitions\target\mvn-artifact\com\skillsTesting\java\partitions\1.0\partitions-1.0.jar.
	 
##Jar: partitions-1.0.jar
Une copie du jar existe dans le repo.
Ce jar peut être ajouté dans votre projet comme external jar, 
ou on crée un repository dans maven central et puis l'ajouter dans pom comme dépendence maven.

## Ce projet est hosté par Github public: https://github.com/Elhosni/SkillsTestingPartitions.git



 