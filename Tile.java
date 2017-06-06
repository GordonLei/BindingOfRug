public class Tile<E>{
    private E _entity;
    private String _type;
    private int _row, _col;
    public Tile(int row, int col){
            _entity = null;
            _type = "empty";
            _row = row;
            _col = col;
    }
    public Tile(E entity, int row, int col){
            _entity = entity;
            _type = "empty";
            _row = row;
            _col = col;
    }
    public Tile(String type, int row, int col){
            _entity = null;
            _type = type;
            _row = row;
            _col = col;
    }
    public Tile(E entity, String type, int row, int col){
            _entity = entity;
            _type = type;
            _row = row;
            _col = col;
    }
    public void addEntity(E entity){
            _entity = entity;
    }
    public void deleteEntity(){
            _entity = null;
    }
    public String checkType(){
            //empty returns "_"
            if (_type.equals("empty"))
                return "_";
            //if entity exists, return the entity's char
            if(_entity != null)
                return _entity.getChar();
    }
}
