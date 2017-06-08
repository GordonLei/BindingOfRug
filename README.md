# BindingOfRug
Rouge played in terminal / console

# To do list:
- Progression of rooms --> floors --> end game...
- Monster movement
- Items?
- Make sure code can be played.
- Documentation + directions on how to run this.
- Send code to Mr.Platek.

# Bugs / Possible Errors
Depending on what OS you are using, the terminal / command prompt / console may act strangely due to code not necessarily working for that OS.

Ex) Emptying the console only works in Linux / Macs

Ex) ASCII / unicode characters may not work depending on the OS
- For example, on IDE packages (ex. platformio-ide-terminal package of the Atom IDE does not support ASCII characters of  arrows)

# How to Play
1. Javac BindingOfRug.java before doing anything else.
2. Java BindingOfRug.
3. Read and follow any directions and enjoy!

# How it works / Complicated Data Structure "Map"
- _floorStack is a stack of Floors
- Floors are priorityqueues with ___________ precedence (in other words the player enters the ________ room first).
- Rooms are two-dimensional arrays with Tile objects that represent the spaces within the room.
- Tile objects hold an entity (a monster, player, or null) and have a type (space or a wall).

# ASCII / UNICODE character guideline / representation

# Misc. 
We also used codenvy (https://codenvy.com/) to write code on an online IDE collectively.
