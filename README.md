# What is BindingOfRug?
Basically, BindingOfRug is the game Rouge played in your terminal / console.
The goal of the player is to defeat every monster in each room to progress through the floors and eventually "escape" the dungeon. 
To help him/her on his way, there are randomly spawned items that increase or decrease his/her stats. 

# To do list:
- Edit Player Stats by getting items
- Items to apply effects
- Bosses
- Different mobs
- room walls
- mob stats based on levels / floor
- Monster movement
- Items spawn
- Make sure code can be played.
- Documentation + directions on how to run this.
- Send code to Mr.Platek.

# Bugs / Possible Errors
Depending on what OS you are using, the terminal / command prompt / console may act strangely due to code not necessarily working for that OS.

Ex) Emptying the console only works in Linux / Macs

Ex) ASCII / unicode characters may not work depending on the OS
- ex) IDE packages that emulate terminals (ex. platformio-ide-terminal package of the Atom IDE does not support ASCII characters of arrows)

# How to Play
1. Javac BindingOfRug.java before doing anything else.
2. Java BindingOfRug.
3. Read and follow any directions and enjoy!

# Complicated Data Structure "Map"
- _floorStack is a stack of Floors
- Floors are priorityqueues with ___________ precedence (in other words the player enters the ________ room first).
- Rooms are two-dimensional arrays with Tile objects that represent the spaces within the room.
- Tile objects hold an entity (a monster, player, or null) and have a type (space or a wall).

# ASCII / UNICODE character guideline & representation

# Misc. 
We also used codenvy (https://codenvy.com/) to collectively write code on an online IDE.
