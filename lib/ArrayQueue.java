package lib;

public class ArrayQueue<E> implements Queue<E>{

    private E[] _queue;
    private int _size, _front, _rear;
    private final static  int CAPACITY = 1000;


    // _rear == _front only when the queue is full
    // otherwise _rear refers to an empty location
    // When the queue is empty, The Empty State, _front = -1, _rear = 0.

    public ArrayQueue(int capacity){
	_queue = (E[]) new Object[capacity]; // produces a compiler warning - ignore it
	_size = _rear = 0;
	_front = -1; // optional
    }

    public ArrayQueue(){
	this(CAPACITY);
    }

    public int size(){
	return _size;
    }

    public boolean empty(){
	return size() == 0;
    }

    public E front() throws EmptyQueueException{
	if (empty())
	    throw new EmptyQueueException("Queue is empty.");
	return _queue[_front];
    }

    public E dequeue() throws EmptyQueueException{
	E ans = front();
	_queue[_front] = null; // release the object
	_size--;
	if (!empty())
	    _front = (1 + _front) % _queue.length; //  wrap _front around the array when necessary
	else{// return to the empty state
	    _front = -1;
	    _rear = 0;
	}
	return ans;
    }

    public void enqueue(E value) throws FullQueueException{
	if (size() == _queue.length)
	    throw new FullQueueException("Full stack.");
	_queue[_rear] = value;
	_size++;
	if (size() == 1) _front = _rear; // transition out of the empty state
	_rear = (_rear + 1) % _queue.length;
    }

    // postcondition :returns a String representing the ArrayQueue.
    //                "[]" is an empty queue
    //                [5,10,15] where 5 is at the front of the queue.
    public String toString(){
	String ans ="[";
	// Your Code Goes Here
        ans += "]";
        return ans;
    }

    public static void main(String [] args){
	Queue<Integer> q = new ArrayQueue<Integer>(10);
	System.out.println(q);

	for (int i = 0; i < 5 ; i++){
	    q.enqueue(i);
	    System.out.println("enqueue : " + i + " q: " + q);
	}

	while (!q.empty()){
	    if (Math.random() < 0.75)
		System.out.println("dequeue " + q.dequeue() + " q: " + q);
	    else {
		int x = (int)(Math.random() * 100) ;
		q.enqueue(x);
		System.out.println("enqueue : " + x + " q: " + q);
	    }
	}

    }



}
