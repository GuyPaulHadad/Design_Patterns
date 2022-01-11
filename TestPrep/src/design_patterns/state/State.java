package design_patterns.state;

public interface State {
    void onEnterState();
    void observedAppearance();
    int stateAttackDamage();
}
