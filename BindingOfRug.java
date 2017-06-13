import java.util.Stack;
import java.util.PriorityQueue;

public class BindingOfRug{
	//instance variables
	public static int _floorNumber;
	public static Floor _currentFloor;
	public static Room _currentRoom;
	private Player _player; // the current player
	private Stack<Floor> _floorStack; // a stack of monsters

	//constructor
	public BindingOfRug(){
		_player = new Player(); // create a new Player
		_floorStack = new Stack<Floor>(); // create the stack of Floors
		_floorNumber = 1;
	}

	//adds Floors to the stack of Floors
	public void addFloor(int num){
		for (int i = 0; i < num; i++){
			//create a floor with at least four rooms, at max six rooms
			Floor floor = new Floor(4 + ((int) (Math.random() * 3)));
			_floorStack.add(floor);
		}
	}

	//play the game
	public void play(){
		addFloor(4);
		//System.out.println(_floorStack.size());
		//while there are still floors to complete...
		while(!(_floorStack.empty())){
			_currentFloor = (_floorStack.pop());
			//check if there are still rooms within a Floor...
			while(!(_currentFloor.checkDone())){
				//System.out.println(_currentFloor.size());
				_currentRoom = (Room) (_currentFloor.getRooms().peek());
				//System.out.println(_currentRoom == null);
				_currentRoom.updatePlayer(_player);
				//then check if the _currentRoom is Done...
				while(!_currentRoom.checkDone()){
					/*
					System.out.print("\033[H\033[2J");
					System.out.flush();
					*/
					int speedcounter = _currentRoom.getPlayer().getSpeed();
					while (speedcounter > 0){
						_currentRoom.print();
						_currentRoom.askPlayerMove();
						speedcounter--;
					}
					_currentRoom.monsterRR();
					_currentRoom.monsterRR();
					if(_currentRoom.checkMonsterClear()){
						_currentRoom.setDone(true);
					}
					//_currentFloor.remove(_currentRoom);
				}
				if(_currentFloor.size()> 0){
					_currentFloor.getRooms().poll();
				}
				//what do do when _currentRoom is done...
				//should do nothing since it is accounted for in the if statement above
				if (_currentFloor.getRooms().size() == 0){
					_currentFloor.setDone(true);
					_floorNumber++;
				}
			}
			//what to do when _currentFloor is done...
			if(_currentFloor.size() == 0){
				_currentFloor.setDone(true);
				_floorStack.remove(_currentFloor);
			}
		}
		//what to do when WHOLE GAME IS BEAT
		System.out.println("CONGRATS U BEAT BINDINGOFRUG 2017 SIMULATOR");
	}

	//Run this file to start the game
	public static void main(String[] args){
		BindingOfRug game = new BindingOfRug();
		game.play();
	}
}
