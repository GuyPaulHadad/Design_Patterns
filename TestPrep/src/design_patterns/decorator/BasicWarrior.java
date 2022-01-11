package design_patterns.decorator;

public class BasicWarrior implements Warrior{
    @Override
    public int attack() {
        return 1;
    }

    @Override
    public int jumpHeight() {
        return 10;
    }

    @Override
    public String addedItem() {
        return "I am a weaponless sad warrior.";
    }


}
