package design_patterns.singleton;

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
