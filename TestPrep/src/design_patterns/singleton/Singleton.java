package design_patterns.singleton;
/*
Class which we want only one instance of it to exist.
First we create a private variable with an instance of the class.
Note: This instance is initialized using a private constructor. (Singleton will have only private constructors).
Lastly, we make a public method - instanceOf/getInstanceOf - to return the instance of the class.
Note: The constructor can receive as many parameters as you want.
 */
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
