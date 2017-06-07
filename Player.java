public class Player extends Creature{
        //instance variables
        private int _health, _speed, _attack;
        private String _dir; //direction player is facing

        //Player starting stats
        public Player(){
                _health = 100;
                _speed = 1;
                _attack = 10;
                _dir = "↑";
        }

        //get representation of the Player
        public String getChar(){
                return _dir;
        }

        //change how the character is facing
        public void setDir(String input){
                if(input.equals("w")){
                        _dir = "↑";
                }
                if(input.equals("a")){
                        _dir = "↓";
                }
                if(input.equals("s")){
                        _dir = "→";
                }
                if(input.equals("d")){
                        _dir = "←";
                }
        }

}
