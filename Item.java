import static java.Math.random;

public class Item{
    public static String[] TYPES = {"sword", "armor"}
    public static String[] RARITY = {"common", "rare", "epic", "legendary"}
    private String _type, _rarity;
    private Effect[] _effects;
    
    public Item(){
        _type = TYPES[(int)(random()*2)];
        rarityIndex=random();
        if(rarityIndex<0.60){ _rarity="common"; _effects = new Effect[2];}
        else if(rarityIndex<0.85){ _rarity="rare"; _effects = new Effect[3];}
        else if(rarityIndex<0.975){ _rarity="epic"; _effects = new Effect[4];}
        else {_rarity="legendary"; _effects = new Effect[5];}
        generateEffects();
    }
    
    public void generateEffects(){
        int effectPower=0;
        switch(rarity){
            case "common":
                do{
                    for(int i = 0; i<_effects.size; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower;
                    }
                }while(effectPower>1+BindingOfRug.getFloor()&&effectPower<3+BindingOfRug.getFloor());
                break;
            case "rare":
                do{
                    for(int i = 0; i<_effects.size; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower;
                    }
                }while(effectPower>2+BindingOfRug.getFloor()&&effectPower<4+BindingOfRug.getFloor());
                break;
            case "epic":
                do{
                    for(int i = 0; i<_effects.size; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower;
                    }
                }while(effectPower>3+BindingOfRug.getFloor()&&effectPower<5+BindingOfRug.getFloor());
                break;
            case "legendary":
                do{
                    for(int i = 0; i<_effects.size; i++){
                        _effects[i]=new Effect(_type);
                        effectPower+=_effects[i].getPower;
                    }
                }while(effectPower>4+BindingOfRug.getFloor()&&effectPower<6+BindingOfRug.getFloor());
                break;
            
        }

    }

}
