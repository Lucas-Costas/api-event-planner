package ar.com.escuela.programacion.eventplanner.options;

public class OptionD {

    private String firstEvent;
    private String secondEvent;
    private String thirdEvent;

    public void setFirstEvent(String event) {
        firstEvent = event;
    }

    public void setSecondEvent(String event) {
        secondEvent = event;
    }

    public void setThirdEvent(String event) {
        thirdEvent = event;
    }

    public String getFirstEvent() {
        return firstEvent;
    }

    public String getSecondEvent() {
        return secondEvent;
    }

    public String getThirdEvent() {
        return thirdEvent;
    }

    public void printNextEventsListMessage() {
        System.out.println("--");
        System.out.println("Eventos:");
        System.out.println("-" + this.firstEvent);
        System.out.println("-" + this.secondEvent);
        System.out.println("-" + this.thirdEvent);
        System.out.println("Presione cualquier tecla para volver al menú.");
        System.out.println("--");
    }

}