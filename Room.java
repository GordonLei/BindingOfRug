import Java.util.Scanner;

public class Room{
        //Instance variables
        private Tile[][] _room;
        private int _row;
        private int _col;
        private Monster _monster;
        private Player _player;
        private boolean _isDone; //to check if room is completed.

        //constructor for a not same dimension room (length != width)
        private Room(int row, int column){
                //creates new player
                _player = new Player();
                //create a new monster
                _monster = new Monster();
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
                //create a new monster
                _monster = new Monster();
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

        //creates random placement of Monster + Player
        public void randomDesign(){
                //places Monster on a random square
                _room[(int)(Math.random()) * _row][(int)(Math.random()) * _col] = "M";
                /*
                P -> player
                M -> Monster
                */
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
                        checkMove(_player.getChar(), input);
                        //MORE CODE
                }
        }

        public void checkMove(Player player, String input){
                String dir = player.getChar();
                if (dir.equals("↑")){
                        if (input.equals("w")){

                        }
                        else if (input.equals("a")){

                        }
                        else if(input.equals("s")){

                        }
                        else{ //when input is "d"

                        }
                }
                else if (dir.equals("↓")){
                        if (input.equals("w")){

                        }
                        else if (input.equals("a")){

                        }
                        else if(input.equals("s")){

                        }
                        else{ //when input is "d"

                        }
                }
                else if(dir.equals("→")){
                        if (input.equals("w")){

                        }
                        else if (input.equals("a")){

                        }
                        else if(input.equals("s")){

                        }
                        else{ //when input is "d"

                        }
                }
                else { //when dir is ←
                        if (input.equals("w")){

                        }
                        else if (input.equals("a")){

                        }
                        else if(input.equals("s")){

                        }
                        else{ //when input is "d"

                        }
                }
        }

        public void move(Tile origin, Tile destination){

        }
        //asks the Monster to move
        public void askMonsterMove(){
                //MORE CODE
        }

}
