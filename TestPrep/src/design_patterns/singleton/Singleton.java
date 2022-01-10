package design_patterns.singleton;

public class Singleton {
    private static Singleton instance = new Singleton(3);
    private final int OPERATION_VALUE;
    private Singleton(int someValue){
        this.OPERATION_VALUE = someValue;
    }

    public void startSomeOperation(){
        System.out.println("Singleton operation "+OPERATION_VALUE+ " Started!");
    }
    public static Singleton instanceOf(){
        return instance;
    }
}
