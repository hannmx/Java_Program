package j_oop.java_RationalComplex;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
    private static FileHandler fileHandler;
    Rational rat = new Rational(getUserChoice(), getUserChoice());

    static {
        try {
            fileHandler = new FileHandler("Calculator.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error creating log file.", e);
        }
    }

    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            printMenu();
            int choice = getUserChoice();
            if (choice == 0) {
                LOGGER.log(Level.INFO, "Exiting calculator.");
                break;
            }
            performOperation(choice);
        }
    }

    private void printMenu() {
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }

    private int getUserChoice() {
        int choice;
        while (true) {
            System.out.print("Enter choice: ");
            try {
                choice = scanner.nextInt();
                if (choice >= 0 && choice <= 4) {
                    break;
                } else {
                    System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid choice.");
                scanner.nextLine();
            }
        }
        return choice;
    }

    private void performOperation(int choice) {
        switch (choice) {
            case 1:
                rat.add(rat);
                break;
            case 2:
                rat.subtract(rat);
                break;
            case 3:
                rat.multiply(rat);
                break;
            case 4:
                rat.divide(rat);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
