public class Room{
        public Tile[][] _room;
        public int _row;
        public int _col;
        //public Mob _mob;
        public Player _player;
        public Room(int row, int column){
                //creates new player
                _player = new Player();
                //create a new monster
                //--Code here--

                _room = new String[row][column];
                _row = row;
                _col = column;
                for(int r = 0; r < _room.length; r++){
                        for(int c = 0; c < _room[r].length; c++){
                                _room[r][c] = "_";
                        }
                }
        }
        public Room(int square){
                _room = new String[square][square];
                for(int r = 0; r < _room.length; r++){
                        for(int c = 0; c < _room[r].length; c++){
                                _room[r][c] = new Tile();
                        }
                }
        }
        public void print(){
                for(String[] row : _room){
                        for(String pos: row){
                                if(pos != "")
                                        System.out.print(pos);
                                else
                                        System.out.print("_");
                        }
                        System.out.println();
                }
        }
        public void randomDesign(){
                //places Monster on a random square
                _room[(int)(Math.random()) * _row][(int)(Math.random()) * _col] = "M";
                /*
                P -> player
                M -> Monster
                */
        }

}
