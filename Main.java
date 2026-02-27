public class Main {
    public static void main(String [] args) {
        Exercise Tag1 = new Exercise("Bankdrücken", 50, 20.0);
        System.out.println(Tag1);
        try {
            Exercise fail = new Exercise("Test", 20, -5);
        } catch {
            (IllegalArgumentException e) {
                System.err.println("Wiederholung oder Gewicht war negativ.");
                System.err.println("Grund: " + e.getMessage());
            }
        }
    }
}