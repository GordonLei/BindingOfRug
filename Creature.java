public abstract class Creature{
    //Each creature can only move a distance of 1 but can move multiple times
    private int _health, _speed, _attack;
    private String _dir;

    /*
    public void talk(){
        System.out.println("hyillo is me kyirmit");
    }
    */
    public Creature(int health, int speed, int attack, String dir){
            _health = health;
            _speed = speed;
            _attack =  attack;
            _dir = dir;
    }

    public Creature()

    public boolean attack(Creature target){}

    public void die(){}
}
