package design_patterns.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Warrior basicWarrior = new BasicWarrior();
        System.out.println(basicWarrior.addedItem());
        System.out.println("Attack value: "+basicWarrior.attack());
        System.out.println("Jump Height: "+ basicWarrior.jumpHeight());

        Warrior shieldedWarrior = new ShieldWarrior(new BasicWarrior());
        System.out.println(shieldedWarrior.addedItem());
        System.out.println("Attack value: "+ shieldedWarrior.attack());
        System.out.println("Jump Height: "+ shieldedWarrior.jumpHeight());

        Warrior fullyEquipedWarrior = new SwordWarrior(new ShieldWarrior(new BasicWarrior()));
        System.out.println(fullyEquipedWarrior.addedItem());
        System.out.println("Attack value: "+fullyEquipedWarrior.attack());
        System.out.println("Jump Height: "+ fullyEquipedWarrior.jumpHeight());

    }
}
