import java.util.Scanner;

//


public class TestProgram {

    public static void delayedPrintln(String printedString,int delayinMS) throws InterruptedException{
        // Method Prints a string and delays the message for a given ammount in milliseconds
        System.out.println(printedString);
        Thread.sleep(delayinMS);

    }
    public static void delayedPrint (String printedString, int delayinMS) throws InterruptedException{
        // Method is the same as DelayedPrintln, but doesn't print a new line
        System.out.print(printedString);
        Thread.sleep(delayinMS);
    }
    }
