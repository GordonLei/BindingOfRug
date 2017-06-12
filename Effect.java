public class Effect{
	public static final String[][] EFFECT_LIST=
	{
		{"SPD", "2"},
		{"DEX", "1"},
		{"HP", "1"}
		//{},
	};
	public static final String[][] SWORD_EFFECT_LIST=
	{
		{"ATK", "1"},
		{"ACC", "1"}
		//{},
	};
	public static final String[][] ARMOR_EFFECT_LIST=
	{
		{"DEF", "1"},
		{"THRN", "1"}
		//{},
	};
	private String _itemType;
	private String[] _effect;
	private int _power;

	public Effect(String itemType){
    	_itemType=itemType;
		init();
	}

	public String getType(){
		return getEffect()[0];
	}

	public int getPower(){
		return _power;
	}

	public void addPower(int num){
		_power+=num;
	}

	public String[] getEffect(){
		return _effect;
	}

	public void init(){
		double index = Math.random();
		switch(_itemType){
			case "Sword":
				if(index<0.5) _effect=EFFECT_LIST[(int)(Math.random()*EFFECT_LIST.length)];
				else _effect=SWORD_EFFECT_LIST[(int)(Math.random()*SWORD_EFFECT_LIST.length)];
				break;
			case "Armor":
				if(index<0.5) _effect=EFFECT_LIST[(int)(Math.random()*EFFECT_LIST.length)];
				else _effect=ARMOR_EFFECT_LIST[(int)(Math.random()*ARMOR_EFFECT_LIST.length)];
				break;
			case "Potion":
				_effect=EFFECT_LIST[2];
				break;
		}
		_power=(int)(Math.random()*5)-2;
	}

	// public String toString(){
	// 	if (_power<0) return _effect[0]+_power;
	// 	return _effect[0]+"+"+_power;
	// }

	public String toString(){
		return "{"+_effect[0]+","+getPower()+"}";
	}

	public static void main(String[] args){
		System.out.println(new Effect("Sword"));
		System.out.println(new Effect("Armor"));

	}
}
