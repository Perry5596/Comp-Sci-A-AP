# Player

For this assignment, you will create a class which must be named Player to represent a player in a 3D video game. You will need to create appropriate variables to store the information in these fields, all of which should be private.

You will also need to add all of the public constructors and methods. More detailed descriptions of the variables, constructors and methods are provided below. You may choose to add other methods to help you implement these.

## Variables

- `numPlayers` - an integer representing the total number of player objects that have been created.
- `x` - an integer. Can be positive or negative. Represents the horizontal position of the player (North and South) where "North" is represented by the positive x-coordinates and South is represented by the negative x-coordinates.
- `y` - an integer. Can be positive or negative. Represents the vertical position of the player (up and down) where "Up" is represented by the positive y coordinates and "Down" is represented by the negative y-coordinates.
- `z` - an integer. Can be positive or negative. Represents the horizontal position of the player (East and West)
- `direction` - an integer representing the direction the player is facing. The direction to integer mapping is as follows: North, 1; South, 2; Up, 3; Down, 4; East, 5; West, 6.
- `hp` - an integer, greater than or equal to 0, representing the health of the player
name - a string representing the name of a player in the game.

## Constructors

- `Player()` - creates a new, default player starting at the x = 0, y = 0, z = 0 with 20 health points facing due North. The player's name should be the letter, P followed by the number of players in the game. In other words, if we do `p3 = new Player()` and p3 is our third player object, p3's name should be, P3.
- `Player(String name, int x, int y, int z)` - creates a new player with the provided name and initial x, y, and z coordinates with 20 health points facing due North.
- `Player(String name, int x, int y, int z, int health, int direction)` - creates a new player object with the given name, at the given x, y, and z coordinates, with the given amount of health, facing the given direction. If the health is less than 0, it should be set to 0. If the direction is not in the range of 1-6, the direction should be set to 1.

## Accessors

- `int getNumPlayers()` - returns the total number of player objects that have been created.
- `String getName()` - returns the name of the player
- `int getX()` - returns the x-coordinate of the player
- `int getY()` - returns the y-coordinate of the player
- `int getZ()` - returns the z-coordinate of the player
- `int getHp()` - returns the health of the player
- `int getDirection()` - returns the direction of the player
- `String toString()` - returns a string representing the player. An example of the toString methods return value for the default player is provided below:
Name: P1
Health: 20
Coordinates: X 0 Y 0 Z 0
Direction: 1

## Mutators

- `void setHp(int hp)` - sets the health of the player. A player should not have less than 0 health points. If the number of health points passed to the method is less than 0, the method should set the number of health points to 0.
- `void setDirection(int direction)` - sets the current direction the player is facing. If the direction passed to the method is not in the range of 1-6, the method should not modify the direction at all.
- `void move(int direction, int units)` - moves the player in the given direction by the given number of units.
- `void teleport(int x, int y, int z)` - teleports the player to the given x, y, and z coordinates.
- `void teleport(Player player)` - teleports the player to the x, y, and z coordinates of the given player
- `void attack(Player player, int damage)` - attacks the given player by subtracting the given amount of damage from the given player's health. If the other player has less than 0 health, their health should be reset to 0. The method should also increase the attacking player's health by half the damage dealt.

## Additional Methods

- `double getDistance(int x, int y, int z)` - gets the distance from this player to the given coordinates
- `double getDistance(Player player)` - gets the distance between this player and the given player

## Notes

To calculate the distance between two points in the 3D plane, you should use the distance formula, which is as follows:

### 3D Distance formula

To test your code, you will need to run the runner_Player class main method. Don't add a main method to your Player class as your code will not be checked or scored correctly.

This runner class is a little more advanced than some of the others you have seen so far. The runner first creates an initial player by using the default constructor which you write in the Player class. You then have the option to test each method individually by typing the name of the method, or to create a new Player using the other Player constructor. When a method requires parameters you'll be asked to input these, and if there is an overloaded method you'll be asked to specify which method signature you want to use by typing 1 or 2.

As the runner code has calls to all the required public Player methods, it won't compile or run until it can see headers for all these methods. So it's a good idea to add headers for each method you have to write in the Player class when you first start. You can leave the method bodies blank until you are ready to write them, or if a return is required add a dummy return like return 0; or return "";. This way you'll be able to test the methods you write as you go along.



## Milestones
As you work on this assignment, you can use the milestones below to inform your development process.

### Milestone 1: 

Write the method and constructor headers for all the public methods/constructors described, and add dummy return statements (e.g. return ""; or return 0;) to any non-void methods. This will allow you to compile your runner class and test methods as you go along. Create private variables to store the class information (name, x, y, z, health, direction, and the number of players).

### Milestone 2: 

Write the setDirection and setHp methods and set up the three class constructors to initialize the name, coordinates, and health of each new Player. Write the accessor methods getX, getY, getZ, getHp, and toString methods and test all these methods using the runner class.

### Milestone 3:

Add the move and attack methods to the class. Add code to the constructors to keep track of the number of players, then implement the static getNumPlayers method. Test your code using the runner.

### Milestone 4: 

Write the mutator method teleport(int x, int y, int z) and then overload this method by writing the teleport(Player player) method. Repeat this process for both of the distance methods. Test all methods thoroughly using the runner class.