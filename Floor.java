import java.util.PriorityQueue;

public class Floor extends PriorityQueue{
	//instance variables
	private boolean _isDone; //checks if floor is Done
	private PriorityQueue<Room> _roomQueue; //the queue of rooms

	//constructor
	public Floor(int n){
		_roomQueue = new PriorityQueue<Room>();
		_isDone = false;
		
		for (int i = 0; i < n; i++){
			// 50% of making a squre room and not a square room.
			if ((int) (Math.random() * 2) == 1){
				Room squareRoom = new Room((int) (Math.random() * 10));
				_roomQueue.add(squareRoom);
			}
			else{
				Room  rectRoom= new Room(((int) (Math.random() * 10)), ((int) (Math.random() * 10)));
				_roomQueue.add(rectRoom);
			}
		}
	}

	//check if the Floor is completed
	public boolean checkDone(){
		return _isDone;
	}

	//set the Floor as Done
	public void setDone(Boolean value){
		_isDone = value;
	}

	//pop a Room from the queue
	public Room popRoom(){
		return _roomQueue.poll();
	}

	public Boolean empty(){
		return (poll() == null);
	}
}
