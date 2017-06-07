import java.util.Stack;
import java.util.PriorityQueue;

public class BindingOfRug{
        //instance variables
        private Player _player; // the current player
        private Stack _floorStack; // a stack of monsters

        //constructor
        public BindingOfRug(){
                _player = new Player(); // create a new Player
                _floorStack = new Stack(); // create the stack of Floors
        }

        //adds Floors to the stack of Floors
        public void addFloor(int num){
                for (int i = 0; i < num; i++){
                        //create a floor with at least one room, at max four rooms
                        Floor floor = new Floor(1 + ((int) Math.floor(Math.random() * 4)));
                        _floorStack.add(floor);
                }
        }

        //play the game
        public void play(){
                //while there are still floors to complete...
                while(!(_floorStack.empty())){
                        //check if there are still rooms within a Floor...
                        Floor currentFloor = (Floor) (_floorStack.peek());
                        while(!(currentFloor.checkDone())){
                                Room currentRoom = (Room) (currentFloor.popRoom());
                                //then check if the current room is Done...
                                while(!currentRoom.checkDone()){
                                        //Process to play!!!
                                        /*
                                        COOL
                                        CODE HERE
                                        */
                                        currentRoom.print();
                                        currentRoom.askPlayerMove();
                                        if(checkMonsterClear()){
                                                currentFloor.remove(currentRoom);
                                        }
                                }
                                //what do do when currentRoom is done...



                        }
                        //what to do when currentFloor is done...
                }
                //what to do when WHOLE GAME IS BEAT

        }

        //Run this file to start the game
        public static void main(String[] args){
                BindingOfRug game = new BindingOfRug();
                game.play();
        }
}
