import java.util.Stack;

public class BindingOfRug{
        private Player _player;
        private Stack _floorStack;

        //constructor
        public BindingOfRug(){
                _player = new Player();
                _floorStack = new Stack();
        }

        //adds Floors to the stack of Floors
        public void addFloor(int num){
                for (int i = 0; i < num; i++){
                        floor = new Floor(1 + (int) Math.random(3));
                        _floorStack.add(floor);
                }
        }

        //play the game
        public static void play(){
                while(!_floorStack.empty()){
                        while(!_floor.peek() == null){
                                while(!_floor.peek().checkDone()){
                                        //Process to play
                                }
                        }
                }
        }

        //Run this file to start the game
        public static void main(String[] args){
                BindingOfRug game = new BindingOfRug();
                game.play();
        }
}
