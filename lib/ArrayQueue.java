public class ArrayQueue<E> implements Queue<E>{
        private E[] _queue;
        private int _size, _front, _rear;
        private final static int CAPACITY = 10;

        //_rear holds the next empty slot
        public ArrayQueue(int capacity){
                _queue = (E[]) (new Object[capacity]);
                _size = _rear = 0;
                _front = -1;
        }

        public ArrayQueue(){
                this(CAPACITY);
        }

        public int size(){
                return _size;
        }
        public E front(){
                if (empty())
                        throw new EmptyQueueException("Empty Queue");
                return _queue[_front];
        }
        public boolean empty(){
                return !(_size == _queue.length);
        }
        public E dequeue() throws EmptyQueueException{
                if (empty())
                        throw new EmptyQueueException("Empty Queue");
                E temp = _queue[_front];
                _queue[_front] = null;
                _front = (_front + 1) % _queue.length;
                _size--;
                if (empty()){
                        _rear = 0;
                        _front = -1;
                }
                return temp;
        }
        public void enqueue(E value) throws FullQueueException{
                if (isFull())
                        throw new FullQueueException("Full Queue");
                if (empty())
                        _front = 0;
                _queue[_rear] = value;
                _size++;
                _rear = (_rear + 1) % _queue.length;
        }
        public boolean isFull(){
                return (_front == _rear);
        }

        public String toString(){
                String ans = "[";
                for (int i = _front; i < _front + _size; i++){
                        ans += _queue[i % _queue.length] + ",";
                }
                if (!empty())
                        ans = ans.substring(0, ans.length() - 2);
                ans += "]";
                /*
                if (size() == 0){
                        ans+= front();
                }
                else{
                        for (int i = _front; i < _front + _size; i++){
                                ans += _queue[i % _queue.length] + ", ";
                        }
                        ans += "]";
                }
                */
                return ans;
        }

}
