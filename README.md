## Game
Welcome to the RPG project developed by: Diana Jiménez, Pol Bermúdez, Yehosua and Ingrid.

This game consist in a simulation of a battle bewteen two teams, during five rounds. 
The user can create teams between this ways:
* Personalize teams.
* random teams (autogenerate randomly).
* Choose a teams alrady definy by a CSV file.

In this project we used the different knowlage we learn during our fist week on IronHack Bootcamp.

This is the construction of the code:

### INTERTFACE:
Here we have the two principal methods, 
* typeAttack: Implements all kind the attacks who have the diffrent classes (Warriors and Wizards).
* goingCementery: A specific method that the excercice demands. When some player die, needs to go necessary to the graveyard.

### CHARACTER:
This class is abstract an is the father of two sub clases, Warrior and Wizard.

### WIZARD:
This class extends from Character, and have the atributes of this kind of player. Also have
the propertly methods for this player:
 * Strong Attack, called fireBall. Here we put the specification of the instructions.
 * Soft Attack, called stickStrike. Here we put the specification of the instructions.
 * Type AttacK: implements both atacks with the concreate specification.

### WARRIOR:
This class extends from Character, and have the atributes of this kind of player. Also have
the propertly methods for this player:
* Strong Attack, called hardAttack. Here we put the specification of the instructions.
* Soft Attack, called sofAttack. Here we put the specification of the instructions.
* Type Attacl: implements both atacks with the concreate specification.

### INDEX:
The class index have some of the items that we used in our menu. 

### PARTY:
Here we call the index, and we put on a Swich. Inside this Swick we call all the methos we need to 
execute the game.

### BATTLE:

### MAIN:
The principal class from where we initialize all the methods.



