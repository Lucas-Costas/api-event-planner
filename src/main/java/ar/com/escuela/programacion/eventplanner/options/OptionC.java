package ar.com.escuela.programacion.eventplanner.options;

public class OptionC {
    private String firstGuest;
    private String secondGuest;
    private String thirdGuest;
    private String fourthGuest;

    public OptionC(String firstGuestName, String secondGuestName, String thirdGuestName, String fourthGuestName){
        this.firstGuest = firstGuestName;
        this.secondGuest = secondGuestName;
        this.thirdGuest = thirdGuestName;
        this.fourthGuest = fourthGuestName;
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
        System.out.println("- " + this.firstGuest);
        System.out.println("- " + this.secondGuest);
        System.out.println("- " + this.thirdGuest);
        System.out.println("- " + this.fourthGuest);
    }
}
