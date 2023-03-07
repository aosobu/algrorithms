package DataStructures.Auditing;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLogger {

    public static void logGenericInformation(String message){
        Logger.getGlobal().log(Level.INFO, message);
    }

    public static void logWarningMessage(String message){
        Logger.getGlobal().log(Level.WARNING, message);
    }

    public static void logSevereMessage(String message){
        Logger.getGlobal().log(Level.SEVERE, message);
    }

    public static void logMessage(Level level, String message){
        Logger.getGlobal().log(level, message);
    }
}
