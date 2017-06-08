public class NodeQueue<E> implements Queue<E>{
        private Node<E> _head,_tail;
        private int _size;

        // constructor
        public NodeQueue(){
                _tail = _head = null;
                _size = 0;
        }

        public int size() {
                return _size;
        }

        public boolean empty(){
                return size() == 0;
        }

        public E front() throws EmptyQueueException{
                // **** Your Code Goes Here ****
                return _head.getValue();
        }

        public E dequeue() throws EmptyQueueException{
                // **** Your Code Goes Here ****

                /*
                if (_head.getNext() == null){
                        _head = null;
                        _size--;
                        return value;
                }
                else{
                        _head = _head.getNext();
                        _size--;
                        return value;
                }
                */
                if (empty()) throw new EmptyQueueException("Empty Queue");
                E value = _head.getValue();
                Node <E> temp = _head;

                _head = _head.getNext();
                temp.setNext(null);
                _size--;
                return value;
        }

        public void  enqueue(E value){
                // **** Your Code Goes Here ****
                //Node temp = _head;
                if (_head == null){
                        _head = _tail = new Node(value,null);
                        _size++;
                }
                else{
                        _tail.setNext(new Node(value,null));
                        _tail = _tail.getNext();
                        _size++;}
                }

        public String toString(){
                String ans = "[";
                if (size() > 0) ans += front();
                if (size() > 1){
                        Node<E> curr = _head.getNext();
                        while (curr != null){
                                ans += ", "  + curr.getValue();
                                curr = curr.getNext();
                        }
                }
                ans += "]";
                return ans;
        }
        public static void main(String [] args){
                Queue<Integer> q = new NodeQueue<Integer>();
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
