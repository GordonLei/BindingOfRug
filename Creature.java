public abstract class Creature{
	//Each creature can only move a distance of 1 but can move multiple times
	private int _health, _speed, _attack;
	private String _dir;

	//constructor to make a custom Creature
	public Creature(int health, int speed, int attack, String dir){
		_health = health;
		_speed = speed;
		_attack =  attack;
		_dir = dir;
	}

	//constructor to make a basic Creature
	public Creature(){
		_health = 100;
		_speed = 1;
		_attack = 10;
		_dir = null;
	}

	//lose _health by taking damage
	public void takeDamage(int damage){
		_health -= damage;
	}

	//checks if the creature is dead
	public boolean isDead(){
		return (_health <= 0);
	}

	//return how much damage the Creature does
	public int dealDamage(){
		return _attack;
	}

	//return the ASCII character of the Creature
	abstract String getChar();
}
