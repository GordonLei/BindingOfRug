public class Monster extends Creature{
    private int _health, _speed, _attack;
    public Monster(){
        _health = 100;
        _speed = 1;
        _attack = 10;
    }
    public Monster(int health, int speed, int attack){
        _health = health;
        _speed = speed;
        _attack = attack;
    }
    public void move(String direction){}

    public boolean attack(Creature target){}

    public void die(){}
}
