package design_patterns.singleton;
/*
An Enum with only one value can be used as a Singleton.
First we name the value (INSTANCE).
Note: In the example below I added an argument for the constructor. You may add more or use no argument at all.

 */
public enum SingletonEnum {
    INSTANCE(5);

    private final int OPERATION_VALUE;

    private SingletonEnum(int someValue){
        this.OPERATION_VALUE = someValue;
    }

    public void startSomeOperation(){
        System.out.println("SingletonEnum operation "+OPERATION_VALUE+ " Started!");
    }

}
