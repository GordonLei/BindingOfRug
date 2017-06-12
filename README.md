# What is BindingOfRug?
Basically, BindingOfRug is the game Rouge played in your terminal / console.
The goal of the player is to defeat every monster in each room to progress through the floors and eventually "escape" the dungeon. 
To help him/her on his way, there are randomly spawned items that increase or decrease his/her stats. 


# Bugs / Possible Errors
Depending on what OS you are using, the terminal / command prompt / console may act strangely due to code not necessarily working for that OS.

Ex) Emptying the console only works in Linux / Macs

Ex) ASCII / unicode characters may not work depending on the OS
- ex) IDE packages that emulate terminals (ex. platformio-ide-terminal package of the Atom IDE does not support ASCII characters of arrows)

Monster Movement needs to be polished some more 
  Ex) There is a possibility that some monsters get stuck 
  
# How to Play
1. Javac BindingOfRug.java before doing anything else.
2. Java BindingOfRug.
3. Read and follow any directions and enjoy!

# Complicated Data Structure "Map"
- _floorStack is a stack of Floors
- Floors are priorityqueues with ___________ precedence (in other words the player enters the ________ room first).
- Rooms are two-dimensional arrays with Tile objects that represent the spaces within the room.
- Tile objects hold an entity (a monster, player, or null) and have a type (space or a wall).

- Monster Movement:
  Version of the A* algorithm - checks all tiles around it and "moves" to the one with the closest manhattandistance. 
   - It does this by adding itself to a closedlist such that the next tile cannot be one it already visited - should not get stuck.
# ASCII / UNICODE character guideline & representation
\"#" = wall
" " = empty space
"c" = chest
"m" = monster
"p" = player(you!)

# Misc. 
We also used codenvy (https://codenvy.com/) to collectively write code on an online IDE.
