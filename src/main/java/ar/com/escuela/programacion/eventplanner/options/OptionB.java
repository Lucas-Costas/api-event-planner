package ar.com.escuela.programacion.eventplanner.options;

public class OptionB {

    private String nextEventDate;

    public OptionB(){
        this.nextEventDate = "02/03/2024";
    }

    public void printNextEventDateMessage(){
        System.out.println("--");
        System.out.println("Siguiente evento es el " + this.nextEventDate);
        System.out.println("--");
        System.out.println("Presione cualquier tecla para volver al menú.");
    }
}
