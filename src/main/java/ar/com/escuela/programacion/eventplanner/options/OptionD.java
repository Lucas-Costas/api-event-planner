package ar.com.escuela.programacion.eventplanner.options;

public class OptionD {

    private String firstEvent;
    private String secondEvent;
    private String thirdEvent;

    public OptionD(){
        firstEvent = "02/02/2024: Cumpleaños 15 de Carol";
        secondEvent = "05/05/2024: Bautismo de Steve";
        thirdEvent = "15/07/2024: Casamiento de Natasha y Bruce";
    }

    public String getFirstEvent() {

        return firstEvent;
    }

    public void setFirstEvent(String firstEvent) {

        this.firstEvent = firstEvent;
    }

    public String getSecondEvent() {

        return secondEvent;
    }

    public void setSecondEvent(String secondEvent) {

        this.secondEvent = secondEvent;
    }

    public String getThirdEvent() {

        return thirdEvent;
    }

    public void setThirdEvent(String thirdEvent) {

        this.thirdEvent = thirdEvent;
    }

    public void printNextEventsListMessage() {
        System.out.println(getFirstEvent());
        System.out.println(getSecondEvent());
        System.out.println(getThirdEvent());
    }

}