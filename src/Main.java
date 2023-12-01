//Scrivere una funzione che controlli se un carattere
//è un numero altrimenti lanciare una eccezione.

public class Main {
    public static void main(String[] args) {
        try {
            controlloCarattere('u');
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void controlloCarattere(char qualcuno) throws ArithmeticException {
        if (Character.isDigit(qualcuno)) {
            System.out.println("Il carattere inserito è un numero");
        } else {
            throw new ArithmeticException("Il carattere inserito non è un numero");
        }
    }
}