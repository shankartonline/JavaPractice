package CoreJava;

public class SingleTonClass {
    private static SingleTonClass singleTonClassInstance = null;
    private SingleTonClass(){

    }

    public static SingleTonClass getInstance() {
        if (singleTonClassInstance == null) {
            singleTonClassInstance = new SingleTonClass();
        }
        return singleTonClassInstance;
    }
}
