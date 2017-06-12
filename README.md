# What is BindingOfRug?
Basically, BindingOfRug is the game Rogue played in your terminal / console.
The goal of the player is to defeat every monster in each room to progress through the floors and eventually "escape" the dungeon. 

To help him/her on his way, there are randomly spawned items (in chests) that increase or decrease his/her stats. 

The player can decide to keep the item or not take take the item as he / she sees fit.


# Bugs / Possible Errors
Depending on what OS you are using, the terminal / command prompt / console may act strangely due to code not necessarily working for that OS.

Ex) Emptying the console only works in Linux / Macs
NOTE: Works kinda weird due to ordering (if you walk to a wall it does not print the room).

Ex) ASCII / unicode characters may not work depending on the OS. 
NOTE: This is now deprecated since we are using letters and symbols found on the keyboard. 

However you can still change the code to reflect the better looking characters (most of these characters can be found commented in methods).

- ex) IDE packages that emulate terminals (ex. platformio-ide-terminal package of the Atom IDE does not support ASCII characters of arrows)

Monster Movement needs to be polished some more 

  Ex) There is a possibility that some monsters get stuck 
  
# How to Play
1. Javac BindingOfRug.java before doing anything else.
2. Java BindingOfRug.
3. Read and follow any directions and enjoy!

# Complicated Data Structure "Map" + How it works
- _floorStack is a stack of Floors
- Floors are priorityqueues that contain Rooms
- Rooms are two-dimensional arrays with Tile objects that represent the spaces within the room.
  - For the most part, every action is done within the Room but they affect instance variables within the Tile(s).
- Tile objects hold an entity (a monster, player, or null) and have a type (space or a wall).
   - Actions edit the entities (monsters or players) or the types of the Tiles (wall, chest ,or empty space)
- Spawning
  - Players always spawn at _room[1][1]. 
  - Monsters spawn randomly and replace the Tile's type to "empty". 
  - Chests spawn randomly.
- Attacking
  - Attack(Tile t1, Tile t2) takes in 2 tiles, where t1 is the attacking Tile and t2 is the Tile receiving the damage.
- General Movement:
  - the move methods swap the entities of adjacent Tile(s) and also checks if the types of the Tile(s) are walls / chests.
    - If so, then entities can move onto walls and chests disappear if the Player steps on it.
- Monster Movement: 
  Version of the A* algorithm - checks all tiles around it and "moves" to the one with the closest manhattandistance. 
   - It does this by adding itself to a closedlist such that the next tile cannot be one it already visited - should not get stuck.
   
# Random Item Generation
- When a player opens a chest, a random Item is generated.
- Items have 4 different rarities: common, rare, epic, and legendary.
  -The number of effects and power of effects increases with rarity
- Items have a random _effects array of Effects, which are randomly generated from a preset list of effects
  - Effects can be positive or negative
- Item power ramps up with level, which is determined by the floor it is found in.
- You start with a no-effect sword and no-effect armor

# ASCII / UNICODE character guideline & representation
- \"#" = wall
- " " = empty space
- "C" = chest
- "M" = monster
- "P" = player(you!)

# Misc. 
We also used codenvy (https://codenvy.com/) to collectively write code on an online IDE and GitHub for version control.
