public class Item{
    public static String[] TYPES = {"Sword", "Armor"};
    public static String[] RARITY = {"Common", "Rare", "Epic", "Legendary"};
    private String _type, _rarity;
    private Effect[] _effects;

    public Item(){
        _type = TYPES[(int)(Math.random()*2)];
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
                }while(!(effectPower>=1)||!(effectPower<=3));
                break;
            case "Rare":
                do{
                    effectPower=0;
                    for(int i = 0; i<_effects.length; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower()*Integer.parseInt(_effects[i].getEffect()[1]);
                    }
                }while(!(effectPower>=3)||!(effectPower<=5));
                break;
            case "Epic":
                do{
                    effectPower=0;
                    for(int i = 0; i<_effects.length; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower()*Integer.parseInt(_effects[i].getEffect()[1]);
                    }
                }while(!(effectPower>=5)||!(effectPower<=7));
                break;
            case "Legendary":
                do{
                    effectPower=0;
                    for(int i = 0; i<_effects.length; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower()*Integer.parseInt(_effects[i].getEffect()[1]);
                    }
                }while(!(effectPower>=7)||!(effectPower<=9));
                break;

        }

    }

    public String toString(){
        String ans = _rarity +" "+ _type;
        for(Effect effect:_effects) ans+="\n\t"+effect;
        return ans;
    }

    public static void main(String[] args){
        System.out.println(new Item());
    }

}
