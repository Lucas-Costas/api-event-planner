package ar.com.escuela.programacion.eventplanner;

import ar.com.escuela.programacion.eventplanner.options.OptionA;
import ar.com.escuela.programacion.eventplanner.options.OptionB;
import ar.com.escuela.programacion.eventplanner.options.OptionD;

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
        System.out.println("C + Enter: Mostrar lista de invitados de siguiente evento");
        System.out.println("D + Enter: Mostrar lista de futuros eventos");
        System.out.println();
        System.out.println("Si desea salir ingrese 0 + Enter");
        System.out.println("--");
    }

    private static String waitForUserInput() {
        return new Scanner(System.in).nextLine();
    }

    private static void executeSelectedOption(String userInput) {
        if (EXIT_VALUE.equalsIgnoreCase(userInput)){
            return;
        } else if ("A".equalsIgnoreCase(userInput)) {
            OptionA optionA = new OptionA("EventsMaster2023");
            optionA.printUserNameMessage();
        } else if ("B".equalsIgnoreCase(userInput)) {
            OptionB optionB = new OptionB();
            optionB.setNextEventDate("29/12/2569");
            optionB.printNextEventDateMessage();
        } else if ("C".equalsIgnoreCase(userInput)) {
            printOptionC();
        } else if ("D".equalsIgnoreCase(userInput)) {
            OptionD optionD = new OptionD();
            optionD.setFirstEvent("02/02/2024: Cumpleaños 15 de Carol");
            optionD.setSecondEvent("05/05/2024: Bautismo de Steve");
            optionD.setThirdEvent("15/07/2024: Casamiento de Natasha y Bruce");

            optionD.printNextEventsListMessage();
        } else {
            printInvalidOption();
        }
        waitForUserInput();
    }

    private static void printOptionC() {
        System.out.println("--");
        System.out.println("Invitados:");
        System.out.println("Federico Saurio");
        System.out.println("Nana Costas");
        System.out.println("Nati Chispita (PO)");
        System.out.println("Lucas Costas (PO-LLO)");
        System.out.println("Presione cualquier tecla para volver al menú.");
        System.out.println("--");
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
