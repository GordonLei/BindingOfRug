public class Player extends Creature{
        private int _health, _speed, _attack;
        private String _dir;
        public Player(){
                _health = 100;
                _speed = 1;
                _attack = 10;
                _dir = "↑";
        }
        public static String getChar(){
                return _dir;
        }
        
}
