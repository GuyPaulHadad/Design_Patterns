package design_patterns.state;
/*
Avatar Aang's normal avatar state.
 */
public class NormalState implements State{
    //To be used if needed
    private final Aang aang;

    public NormalState(Aang aang){
        this.aang = aang;
    }
    @Override
    public void onEnterState() {
        System.out.println(String.format("%s is Becoming less powerful.",aang.toString()));
    }

    @Override
    public void observedAppearance() {
        System.out.println(String.format("%s Looks like a Ballerina.",aang.toString()));
    }

    @Override
    public int stateAttackDamage() {
        return 12;
    }
    @Override
    public String toString(){
        return "Normal State.";
    }
}
