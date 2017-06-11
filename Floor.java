import java.util.PriorityQueue;

public class Floor extends PriorityQueue{
	//instance variables
	private boolean _isDone; //checks if floor is Done
	private PriorityQueue<Room> _roomQueue; //the queue of rooms
	//private int _size;
	//constructor
	public int size(){
		return _roomQueue.size();
	}
	public Floor(int n){
		_roomQueue = new PriorityQueue<Room>();
		_isDone = false;
		//Room newRoom;
		for (int i = 0; i < n; i++){
			// 50% of making a squre room and not a square room.
			if ((int) (Math.random() * 2) == 1){
				Room squareRoom = new Room((int) (4 + Math.random() * 2));
				_roomQueue.add(squareRoom);
			}
			else{
				Room  rectRoom= new Room(((int) (4 + Math.random() * 2)), ((int) (4 +Math.random() * 2)));
				_roomQueue.add(rectRoom);
			}
		}
		//System.out.println(_)
	}

	public PriorityQueue<Room> getRooms(){
		return _roomQueue;
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
		//System.out.println(_roomQueue.size());
		_roomQueue.poll();
		return _roomQueue.peek();
	}

	public Boolean empty(){
		return (poll() == null);
	}
}
