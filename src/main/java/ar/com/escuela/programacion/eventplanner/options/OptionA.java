package ar.com.escuela.programacion.eventplanner.options;

public class OptionA {

    private String username;

    public OptionA(String username){
        this.username = username;
    }

    public void printUserNameMessage() {
        System.out.println("--");
        System.out.println("Usted es " + this.username);
        System.out.println("--");
        System.out.println("Presione cualquier tecla para volver al menú.");
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    
}
