public class Player extends Creature{
	//instance variables
	private static int _health, _speed, _attack, _thorn;
	private static double _accuracy, _defense, _dexterity;
	private static Item[] _inventory;

	//Player starting stats
	public Player(){
		_health = 100;
		_speed = 1;
		_attack = 0;
		_accuracy = .70;
		_dexterity = .70;
		_thorn = 0;
		_defense = 0.15;
		_inventory = new Item[2];
		pickUp(new Item("Sword", 1));
		pickUp(new Item("Armor", 1));
	}

	public int getThorn(){
		return _thorn;
	}

	public double getAccuracy(){
		return _accuracy;
	}

	public double getDefense(){
		return _defense;
	}

	public double getDexterity(){
		return _dexterity;
	}

	//get representation of the Player
	public String getChar(){
		return "⚇";
		//return "⚇";
	}

	public int getSpeed(){
		return _speed;
	}

	public int getHealth(){
		return _health;
	}

	public int getAttack(){
		return _attack;
	}
	public Item[] getInventory(){
		return _inventory;

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

	public void pickUp(Item newItem){
		switch(newItem.getType()){
			case "Sword":
				if(_inventory[0]!=null) remove(0);
				_inventory[0]=newItem;
				for(Effect effect:_inventory[0].getEffects()){
					switch(effect.getType()){
						case "SPD":
							_speed+=effect.getPower();
							break;
						case "DEX":
							_dexterity+=effect.getPower()*0.05;
							break;
						case "ACC":
							_accuracy+=effect.getPower()*0.05;
							break;
						case "HP":
							_health+=effect.getPower()*25*newItem.getLevel();
							break;
						case "ATK":
							_attack+=(effect.getPower()*10)*newItem.getLevel();
							break;
					}
				}
				_attack+=10*newItem.getLevel();
				break;
			case "Armor":
				if(_inventory[1]!=null) remove(1);
				_inventory[1]=newItem;
				for(Effect effect:_inventory[1].getEffects()){
					switch(effect.getType()){
						case "SPD":
							_speed+=effect.getPower();
							break;
						case "DEX":
							_dexterity+=effect.getPower()*0.05;
							break;
						case "DEF":
							_defense+=effect.getPower()*0.05;
							break;
						case "HP":
							_health+=effect.getPower()*25*newItem.getLevel();
							break;
						case "THRN":
							_thorn+=effect.getPower()*10*newItem.getLevel();
							break;
					}
				}
				break;
			case "Potion":
				for(Effect effect:newItem.getEffects()){
					_health+=effect.getPower()*25*newItem.getLevel();
				}
				break;
		}
	}

	public void remove(int slot){
		for(Effect effect:_inventory[slot].getEffects()){
			switch(effect.getType()){
				case "SPD":
					_speed-=effect.getPower();
					break;
				case "DEX":
					_dexterity-=effect.getPower()*0.05;
					break;
				case "ACC":
					_accuracy-=effect.getPower()*0.05;
					break;
				case "DEF":
					_defense-=0.15+effect.getPower()*0.05;
					break;
				case "HP":
					_health-=effect.getPower()*25*_inventory[slot].getLevel();
					break;
				case "ATK":
					_attack-=effect.getPower()*10*_inventory[slot].getLevel();
					break;
				case "THRN":
					_thorn-=effect.getPower()*10*_inventory[slot].getLevel();
					break;
			}
		}
		if(slot==0) _attack-=10*_inventory[slot].getLevel();
		_inventory[slot]=null;
	}

}
