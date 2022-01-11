package design_patterns.state;

public class MainState {
    public static void main(String[] args){
        Aang aang = new Aang();
        System.out.println(aang.getState());
        System.out.println("Attack Damage in this state: "+ aang.getAttackDamage());
        aang.changeState();
        System.out.println("Attack Damage in this state: "+ aang.getAttackDamage());
        aang.changeState();

    }
}
