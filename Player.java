public class Player extends Creature{
	//instance variables
	private int _health, _speed, _attack;


	//Player starting stats
	public Player(){
		_health = 100;
		_speed = 1;
		_attack = 10;

	}

	//get representation of the Player
	public String getChar(){
		return "⚇";
	}
	
}
