package design_patterns.state;
/*
Avatar Aang's Avatar state.
 */
public class AvatarState implements State{
    //To be used if needed
    private final Aang aang;


    public AvatarState(Aang aang){
        this.aang = aang;
    }
    @Override
    public void onEnterState() {
        System.out.println(String.format("%s's Eyes and the Arrows across his body start to glow. He becomes Stronger.",
                        "Aang"));
    }

    @Override
    public void observedAppearance() {
        System.out.println(String.format("%s Looks like an Avatar in his Avatar form.","Aang"));
    }

    @Override
    public int stateAttackDamage() {
        return 10000000;
    }
    @Override
    public String toString(){
        return "Avatar State.";
    }
}
