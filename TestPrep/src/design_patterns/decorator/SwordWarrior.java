package design_patterns.decorator;

public class SwordWarrior implements Warrior {
    private final Warrior decorated;

    public SwordWarrior(Warrior decorated){
        this.decorated = decorated;
    }
    @Override
    public int attack() {
        return 10 + decorated.attack();
    }

    @Override
    public int jumpHeight() {
        return -2+decorated.jumpHeight();
    }

    @Override
    public String addedItem() {
        if(decorated instanceof BasicWarrior){
            return "I am warrior holding a sword";
        }else{
            return decorated.addedItem() + " and a sword";
        }

    }

}
