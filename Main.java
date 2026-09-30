import ScenarioFileValidation.Flyable;

import java.io.*;

import static ScenarioFileValidation.Validation.isScenarioFileValid;


public class Main {
    public static void main(String[] args)
    {
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) ->
            System.err.printf("[GLOBAL ERROR] %s%n", throwable.getMessage()));

        // iterations are the amount of weather changes



    }




}


/**
 * find * -name "*.java" > sources.txt
 * javac @sources.txt
 */