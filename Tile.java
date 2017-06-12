public class Tile{
	//instance varaibles
	private Creature _entity;
	private String _type;
	private int _row, _col, _manhattanDist;

	//constructor for default Tile
	public Tile(int row, int col){
		_entity = null;
		_type = "empty";
		_row = row;
		_col = col;
		_manhattanDist = 0;
	}

	//SPECIAL CONSTRUCTORS for custom Tiles
	public Tile(Creature entity, int row, int col){
		_entity = entity;
		_type = "empty";
		_row = row;
		_col = col;
		_manhattanDist = 0;
	}
	public Tile(String type, int row, int col){
		_entity = null;
		_type = type;
		_row = row;
		_col = col;
		_manhattanDist = 0;
	}
	public Tile(Creature entity, String type, int row, int col){
		_entity = entity;
		_type = type;
		_row = row;
		_col = col;
		_manhattanDist = 0;
	}

	public void manhattanDist(Tile destination){
                if(_type.equals("wall") || _type.equals("chest")) _manhattanDist = 1000;
                else{
                	int dy = Math.abs(destination.getRow() - _row);
                	int dx = Math.abs(destination.getCol() - _col);
                	int mandist = dx+dy;
                _manhattanDist = mandist;
              }
        }
          public int getmanhattanDist(Tile destination){
            manhattanDist(destination);
            return _manhattanDist;
          }

	//Delete entity on Tile
	public void deleteEntity(){
		_entity = null;
	}
	//put an entity on the Tile
	public void setEntity(Creature entity){
		_entity = entity;
	}
	//get the Entity on the Tile
	public Creature getEntity(){
		return _entity;
	}
	public String getType(){
		return _type;
	}
	//get Tile's row
	public int getRow(){
		return _row;
	}
	//get Tile's column
	public int getCol(){
		return _col;
	}
	//modify Tile's row
	public void setRow(int row){
		_row = row;
	}
	//modify Tile's column
	public void setCol(int col){
		_col = col;
	}

	public void setType(String type){
		_type = type;
	}

	//get ASCII / Unicode representation
	public String getChar(){
		if(getEntity() != null){
			return _entity.getChar();
		}
		else if(_type.equals("wall"))
			return "#";
			//return "█";
		else if(_type.equals("chest"))
			return "C";
			//return "⚀";
		//if not a special type of wall this Tile is empty.
		else{
			return " ";
		}
	}
}
