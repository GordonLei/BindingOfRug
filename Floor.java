import java.util.PriorityQueue;

public class Floor{
        //instance variables
        private boolean _isDone; //checks if floor is Done
        private PriorityQueue<Room> _roomQueue; //the queue of rooms
        //constructor
        public Floor(int n){
                _roomQueue = new PriorityQueue<Room>();
                _isDone = false;
                // 50% of making a squre room and not a square room.
                for (int i = 0; i < n; i++){
                        if ((int) (Math.random() * 2) == 1){
                                room = new Room((int) (Math.random() * 10));
                                _roomQueue.add(room);
                        }
                        else{
                                room = new Room((int) (Math.random() * 10), (int) (Math.random() * 10));
                                _roomQueue.add(room);
                        }
                }
        }
}
