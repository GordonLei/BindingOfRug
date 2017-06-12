public class Item{
    public static String[] TYPES = {"Sword", "Armor", "Potion"};
    public static String[] RARITY = {"Common", "Rare", "Epic", "Legendary"};
    private String _type, _rarity;
    private Effect[] _effects;
	private int _level;

    public Item(){
        _type = TYPES[(int)(Math.random()*3)];
		_level = BindingOfRug._currentFloor;
        double rarityIndex=Math.random();
        if(rarityIndex<0.60){ _rarity="Common"; _effects = new Effect[3];}
        else if(rarityIndex<0.85){ _rarity="Rare"; _effects = new Effect[4];}
        else if(rarityIndex<0.975){ _rarity="Epic"; _effects = new Effect[5];}
        else {_rarity="Legendary"; _effects = new Effect[6];}
        generateEffects();
    }

    public void generateEffects(){
        int effectPower=0;
        switch(_rarity){
            case "Common":
                do{
                    effectPower=0;
                    for(int i = 0; i<_effects.length; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower()*Integer.parseInt(_effects[i].getEffect()[1]);
                    }
                }while(!(effectPower>=1)||!(effectPower<=2));
                break;
            case "Rare":
                do{
                    effectPower=0;
                    for(int i = 0; i<_effects.length; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower()*Integer.parseInt(_effects[i].getEffect()[1]);
                    }
                }while(!(effectPower>=3)||!(effectPower<=4));
                break;
            case "Epic":
                do{
                    effectPower=0;
                    for(int i = 0; i<_effects.length; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower()*Integer.parseInt(_effects[i].getEffect()[1]);
                    }
                }while(!(effectPower>=5)||!(effectPower<=6));
                break;
            case "Legendary":
                do{
                    effectPower=0;
                    for(int i = 0; i<_effects.length; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower()*Integer.parseInt(_effects[i].getEffect()[1]);
                    }
                }while(!(effectPower>=7)||!(effectPower<=8));
                break;

        }

    }

	public int getLevel(){
		return _level;
	}

    public String toString(){
        String ans = _rarity +" "+ _type;
        for(int i = 0; i < _effects.length; i++){
			for(int j = i+1; j < _effects.length; j++){
				if(_effects[i].getType().equals(_effects[j].getType())){
					_effects[i].addPower(_effects[j].getPower());
					_effects[j].addPower(-_effects[j].getPower());
				}

			}

		}
		for(Effect effect:_effects)
			if(effect.getPower()!=0){
				if(effect.getPower()>0) {ans+="\n\t"+effect.getType()+"+"+effect.getPower();}
				else {ans+="\n\t"+effect.getType()+effect.getPower();}
			}
        return ans;
    }

    public static void main(String[] args){
        System.out.println(new Item());
    }

}
