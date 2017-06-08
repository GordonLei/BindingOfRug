public class Item{
    public static String[] TYPES = {"sword", "armor"}
    public static String[] RARITY = {"common", "rare", "epic", "legendary"}
    private String _type, _rarity;
    private Effect[] _effects;
    
    public Item(){
        _type = TYPES[(int)(Math.random()*2)];
        rarityIndex=Math.random();
        if(rarityIndex<0.60){ _rarity="common"; _effects = new Effect[2];}
        else if(rarityIndex<0.85){ _rarity="rare"; _effects = new Effect[3];}
        else if(rarityIndex<0.975){ _rarity="epic"; _effects = new Effect[4];}
        else {_rarity="legendary"; _effects = new Effect[5];}
        generateEffects();
    }
    
    public void generateEffects(){
        switch(rarity){
            case "common":
                do{
                    
                }while(_effects.);
            
        }

    }

}
