package design_patterns.state;

/*
Aang the avatar has two states. The first, his normal state, and the second, the Avatar state.
We would like to change his states in runtime and have him act and be able to do things based on that state.
First we save a private State type variable.
Then depending on implementation we can initialize with a certain state.
We also supply a change state method if needed.
 */

import java.util.Random;

public class Aang {
    private State state;
    public Aang(){
        this.state = new NormalState(this);
    }

    public void changeState(){
        if(state instanceof AvatarState){
            state = new NormalState(this);
            System.out.println("Aang entered his Normal state.");
        }else{
            state = new AvatarState(this);
            System.out.println("Aang entered his Avatar state.");
        }
    }

    public State getState() {
        return state;
    }
    public int getAttackDamage(){
        return state.stateAttackDamage();
    }
}
