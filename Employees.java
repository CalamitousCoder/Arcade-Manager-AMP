import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Employees {
    String fullName;
    int idNumber;
    String role;
    double pay;
    char performanceRating;

    public Employees(String fullName, int idNumber, String role, double pay, char performanceRating) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.role = role;
        this.pay = pay;
        this.performanceRating = performanceRating;
    }

    public static void listCurrentEmployees(ArrayList<String> workersList) throws InterruptedException {
        System.out.println();
        // Takes an array from the user and then prints all elements within it
        System.out.println("The current employees are:");
        sleep(1200);

        for (String employees : workersList) {
            System.out.println(employees);
            sleep(1400);
        }
        System.out.println();
    }

    public static void getEmployee(Employees givenWorker) throws InterruptedException {
        // gets worker from user
        // prints out information about that worker
        System.out.println();
        System.out.println("This is " + givenWorker.fullName);
        Thread.sleep(1400);
        System.out.println("Their ID number is " + givenWorker.idNumber);
        System.out.println();

        Thread.sleep(1400);
        System.out.println("They are a " + givenWorker.role);
        Thread.sleep(1400);
        System.out.println("Their hourly wage is " + givenWorker.pay);
        Thread.sleep(1400);
        System.out.println("Their current performance rates at a " + givenWorker.performanceRating);
        System.out.println();
        Thread.sleep(3400);
    }
}