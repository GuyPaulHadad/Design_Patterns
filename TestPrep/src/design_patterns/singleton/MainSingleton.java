package design_patterns.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instanceOf();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singleton.startSomeOperation();
        singletonEnum.startSomeOperation();
    }
}
