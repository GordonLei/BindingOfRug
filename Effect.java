public class Effect{
	public static final String[][] EFFECT_LIST=
	{
		//general effects
		{"VIS", "2"},
		{"SPD", "2"},
		{"DEX", "1"},
		{"HP", "1"},
		{"LUK", "1"},
		//{},

		//sword effects
		{"ATK", "1"},
		{"ACC", "1"},
		{"DOT", "1"},
		//{},
		//{},
		//{},

		//armor effects
		{"DEF", "1"},
		{"THRN", "1"},
		//{},
		//{},
		//{},
		//{},

	};
	private String _itemType;
	private String[] _effect;
	private int _power;

	public Effect(String itemType){
    	_itemType=itemType;
		init();
	}

	public int getPower(){
		return _power;
	}

	public String[] getEffect(){
		return _effect;
	}

	public void init(){
		double index = Math.random();
		switch(_itemType){
			case "Sword":
				if(index<0.5) _effect=EFFECT_LIST[(int)(Math.random()*5)];
				else _effect=EFFECT_LIST[5+(int)(Math.random()*3)];
				break;
			case "Armor":
				if(index<0.5) _effect=EFFECT_LIST[(int)(Math.random()*5)];
				else _effect=EFFECT_LIST[8+(int)(Math.random()*2)];
				break;
		}
		_power=(int)(Math.random()*5)-2;
	}

	public String toString(){
		if (_power<0) return _effect[0]+_power;
		return _effect[0]+"+"+_power;
	}

	public static void main(String[] args){
		System.out.println(new Effect("Sword"));
		System.out.println(new Effect("Armor"));

	}
}
