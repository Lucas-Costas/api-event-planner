package ar.com.escuela.programacion.eventplanner.options;

public class OptionC {
    private String firstGuest;
    private String secondGuest;
    private String thirdGuest;
    private String fourthGuest;

    public OptionC(String firstGuestNombre, String secondGuestNombre, String thirdGuestNombre, String fourthGuestNombre){
        this.firstGuest = firstGuestNombre;
        this.secondGuest = secondGuestNombre;
        this.thirdGuest = thirdGuestNombre;
        this.fourthGuest = fourthGuestNombre;
    }

    public String getFirstGuest() {
        return firstGuest;
    }

    public void setFirstGuest(String newFirstGuest) {
        this.firstGuest = newFirstGuest;
    }

    public String getSecondGuest() {
        return secondGuest;
    }

    public void setSecondGuest(String newSecondGuest) {
        this.secondGuest = newSecondGuest;
    }

    public String getThirdGuest() {
        return thirdGuest;
    }

    public void setThirdGuest(String newThirdGuest) {
        this.thirdGuest = newThirdGuest;
    }

    public String getFourthGuest() {
        return fourthGuest;
    }

    public void setFourthGuest(String newFourthGuest) {
        this.fourthGuest = newFourthGuest;
    }

    public void printNextEventGuestListMessage(){
        System.out.println("Los invitados al evento son:");
        System.out.println("- " + getFirstGuest());
        System.out.println("- " + getSecondGuest());
        System.out.println("- " + getThirdGuest());
        System.out.println("- " + getFourthGuest());
    }
}
