package design_patterns.decorator;

public class ShieldWarrior implements Warrior{
    private final Warrior decorated;

    public ShieldWarrior(Warrior decorated){
        this.decorated = decorated;
    }
    @Override
    public int attack() {
        return 5 + decorated.attack();
    }

    @Override
    public int jumpHeight() {
        return -5+decorated.jumpHeight();
    }

    @Override
    public String addedItem() {
        if(decorated instanceof BasicWarrior){
            return "I am warrior holding a shield";
        }else{
           return decorated.addedItem() + " and a shield";
        }

    }


}
