public class Main {
    public static void main(String [] args) {
        Exercise Tag1 = new Exercise("Bankdrücken", 50, 20.0);
        System.out.println(Tag1);
        try {
            Exercise fail = new Exercise("Fail-Test", 20, -1);
        } catch(IllegalArgumentException e) {
            System.err.println("Fehler!" + " Grund: " + e.getMessage());
        }
    }
}