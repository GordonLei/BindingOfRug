public class Monster extends Creature{
        //private instance variables
        private int _health, _speed, _attack;

        //constructor for default monster
        public Monster(){
                _health = 100;
                _speed = 1;
                _attack = 10;
        }

        //constructor for custom monster
        public Monster(int health, int speed, int attack){
                _health = health;
                _speed = speed;
                _attack = attack;
        }

        //Monster takes damage to lose health
        public void takeDamage(int damage){
                _health -= damage;
        }

        //check if Monster's _health <= 0. If yes, then it is dead.
        public boolean isDead(){
                return (_health <= 0);
        }

        //return the ASCII / Unicode character representation
        public String getChar(){
                return "M";
        }
}
