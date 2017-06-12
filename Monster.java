public class Monster extends Creature{
        //private instance variables
        private int _health, _speed, _attack;
        private String _char;

        //constructor for default monster
        public Monster(){
                _health = 20*BindingOfRug._floorNumber;
                _speed = 1;
                _attack = 10*BindingOfRug._floorNumber;
                _char = "M";
        }

        //constructor for custom monster
        public Monster(String character, int health, int speed, int attack){
                _health = health;
                _speed = speed;
                _attack = attack;
                _char = character;
        }

        //Monster takes damage to lose health
        public void takeDamage(int damage){
                _health -= damage;
        }
        public int dealDamage(){
                return _attack;
        }

        //check if Monster's _health <= 0. If yes, then it is dead.
        public boolean isDead(){
                return (_health <= 0);
        }

        //return the ASCII / Unicode character representation
        public String getChar(){
                return _char;
        }

        public int getHealth(){
                return _health;
        }

        public int getAttack(){
                return _attack;
        }
}
