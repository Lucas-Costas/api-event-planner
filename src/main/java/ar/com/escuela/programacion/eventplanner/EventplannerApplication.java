package ar.com.escuela.programacion.eventplanner;

import java.util.Scanner;

public class EventplannerApplication {

    private static final String EXIT_VALUE = "0";

    public static void main(String[] args) {
        String userInput = "";
        while (shouldExecuteAnotherOperation(userInput)) {
            userInput = executeNewOperation();
        }
        printSalute();
    }

    private static boolean shouldExecuteAnotherOperation(String userInput) {
        return !EXIT_VALUE.equals(userInput);
    }

    private static String executeNewOperation() {
        printMenu();
        String userInput = waitForUserInput();
        executeSelectedOption(userInput);
        return userInput;
    }

    private static void printMenu() {
        System.out.println("--");
        System.out.println("Bienvenido a EventPlanner.");
        System.out.println("Por favor ingrese una de las siguientes opciones:");
        System.out.println();
        System.out.println("A + Enter: Mostrar nombre de usuario");
        System.out.println("B + Enter: Mostrar fecha próximo evento");
        System.out.println();
        System.out.println("Si desea salir ingrese 0 + Enter");
        System.out.println("--");
        System.out.println("Daniela");
    }

    private static String waitForUserInput() {
        return new Scanner(System.in).nextLine();
    }

    private static void executeSelectedOption(String userInput) {
        if (EXIT_VALUE.equalsIgnoreCase(userInput)){
            return;
        } else if ("A".equalsIgnoreCase(userInput)) {
            printOptionA();
        } else if ("B".equalsIgnoreCase(userInput)) {
            printOptionB();
        } else {
            printInvalidOption();
        }
        waitForUserInput();
    }

    private static void printOptionA() {
        System.out.println("--");
        System.out.println("Usted es EventsMaster2023");
        System.out.println("--");
        System.out.println("Presione cualquier tecla para volver al menú.");
    }

    private static void printOptionB() {
        System.out.println("--");
        System.out.println("Siguiente evento el 02/03/2024");
        System.out.println("--");
        System.out.println("Presione cualquier tecla para volver al menú.");
    }

    private static void printInvalidOption() {
        System.out.println("--");
        System.out.println("La opción ingresada es incorrecta");
        System.out.println("--");
        System.out.println("Presione cualquier tecla para volver al menú.");
    }

    private static void printSalute() {
        System.out.println("--");
        System.out.println("Gracias por usar Event Planner. Vuelva pronto");
        System.out.println("--");
    }
}
