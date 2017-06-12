public class Player extends Creature{
	//instance variables
	private static int _health, _speed, _attack;
	private static Item _inventory;

	//Player starting stats
	public Player(){
		_health = 100;
		_speed = 1;
		_attack = 25;
		_inventory = null;
	}

	//get representation of the Player
	public String getChar(){
		return "P";
		//return "⚇";
	}

	public int getHealth(){
		return _health;
	}

	public int getAttack(){
		return _attack;
	}
	public void takeDamage(int damage){
		_health -= damage;
	}
	public int dealDamage(){
		return _attack;
	}
	//checks if the creature is dead
	public boolean isDead(){
		return (_health <= 0);
	}

	public void setInventory(Item newItem){
		_inventory = newItem;
	}

}
