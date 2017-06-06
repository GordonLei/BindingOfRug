import Java.util.Scanner;
import Java.util.Stack;

public class Room{
        //Instance variables
        private Tile[][] _room;
        private Tile _playerTile;
        private int _row;
        private int _col;
        //private Monster _monster;
        private Player _player;
        private boolean _isDone; //to check if room is completed.
        private Stack _monsterStack;

        //constructor for a not same dimension room (length != width)
        private Room(int row, int column){
                //creates new player
                _player = new Player();
                _playerTile = new Tile(_player, 0,0);
                //create a new monster
                _monsterStack = new Stack();
                for (int i = 0; i < 1 + (int) (Math.random() * 3); i++){
                        Monster enemy = new Monster();
                        _monsterStack.add(enemy);
                }
                //creates the room
                _room = new Title[row][column];
                //just some holder variables
                _row = row;
                _col = column;
                _isDone = false;

                //creates the panel
                for(int r = 0; r < _room.length; r++){
                        for(int c = 0; c < _room[r].length; c++){
                                _room[r][c] = new Title(row, col);
                        }
                }
        }

        //constructor for a square room
        public Room(int square){
                //creates new player
                _player = new Player();
                _playerTile = new Tile(_player, 0,0);
                //create a new monster
                _monsterStack = new Stack();
                for (int i = 0; i < 1 + (int) (Math.random() * 3); i++){
                        Monster enemy = new Monster();
                        _monsterStack.add(enemy);
                }
                _row = row;
                _col = column;
                _room = new String[square][square];
                _isDone = false;
                for(int r = 0; r < _room.length; r++){
                        for(int c = 0; c < _room[r].length; c++){
                                _room[r][c] = new Tile();
                        }
                }
        }

        //displays the room
        public void print(){
                for(Tile[] row : _room){
                        for(Tile pos: row){
                                Sytem.out.print(pos.checkType());
                        }
                        System.out.println();
                }
        }

        //update the current Player stats into the room.
        public void updatePlayer(Player player){
                _player = player;
        }

        //return if the Room is done.
        public void checkDone(){
                return _isDone;
        }

        //asks a player to move
        public void askPlayerMove(){
                Scanner s = new Scanner(System.in);
                System.out.println("Input a direction");
                String input = s.next();
                //Check if a direction is inputed.
                        //If not loop again3
                while (input.indexOf("wasd") < 0){
                        System.out.println("Invalid direction. Input a direction as w,a,s,or d.");
                        String input = s.next();
                        //checkMove(_player.getChar(), input);
                        //MORE CODE
                }
                checkMove(_player.getChar(), input);
        }

        /*
        CHANGE TILES THING
        */
        public void checkMove(String input){
                String dir = player.getChar();
                int row = _playerTile.getRow();
                int col = _playerTile.getCol();
                if (dir.equals("↑")){
                        if (input.equals("w")){
                                move(Tile[row][_col], Tile[row - 1][col]);
                        }
                        else if (input.equals("a")){
                                move(Tile[row][col], Tile[row][col - 1]);
                        }
                        else if(input.equals("s")){
                                move(Tile[row][col], Tile[row + 1][col]);
                        }
                        else{ //when input is "d"
                                move(Tile[row][col], Tile[row][col + 1]);
                        }
                }
                else if (dir.equals("↓")){
                        if (input.equals("w")){
                                move(Tile[row][col], Tile[row + 1][col]);
                        }
                        else if (input.equals("a")){
                                move(Tile[row][col], Tile[row][col - 1]);
                        }
                        else if(input.equals("s")){
                                move(Tile[row][col], Tile[row - 1][col]);
                        }
                        else{ //when input is "d"
                                move(Tile[row][col], Tile[row][col + 1]);
                        }
                }
                else if(dir.equals("→")){
                        if (input.equals("w")){
                                move(Tile[row][col], Tile[row][col + 1]);
                        }
                        else if (input.equals("a")){
                                move(Tile[row][col], Tile[row - 1][col]);
                        }
                        else if(input.equals("s")){
                                move(Tile[row][col], Tile[row][col - 1]);
                        }
                        else{ //when input is "d"
                                move(Tile[row][col], Tile[row + 1][col]);
                        }
                }
                else { //when dir is ←
                        if (input.equals("w")){
                                move(Tile[row][col], Tile[row][col - 1]);
                        }
                        else if (input.equals("a")){
                                move(Tile[row][col], Tile[row + 1][col]);
                        }
                        else if(input.equals("s")){
                                move(Tile[row][col], Tile[row - 1][col]);
                        }
                        else{ //when input is "d"
                                move(Tile[row][col], Tile[row][col + 1]);
                        }
                }
        }

        public void move(Tile origin, Tile destination){
                //GOAL: swap the tiles + check walls + check if out of bounds

                //Check if out of bound
                if (destination.getRow() < 0 || destination.getRow() > _row ||
                        destination.getCol() < 0 || destination.getCol() > _col){
                                return;
                }

                //Check if destination is empty
                else if(destination.getChar() == "_"){
                        //SWAP ENTITIES
                        E temp = origin.getEntity();
                        origin.setEntity(destination.getEntity());
                        destination.setEntity(temp);
                        _playerTile = destination;
                }

                //Check if destination is a wall
                else if(destination.getChar() == "█"){
                        return;
                }

                //do stuff if destination has an entity
                else{
                        return; //PROBABLY CHANGE
                }
        }
        //asks the Monster to move
        public void askMonsterMove(){
                move();
        }

}
