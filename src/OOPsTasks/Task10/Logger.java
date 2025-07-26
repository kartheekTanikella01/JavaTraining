package OOPsTasks.Task10;

public interface Logger {
    static void logError(){
        System.out.println("log error");
    }

    default void LogInfo(){
        System.out.println("this is a default method.....");
    }





}
