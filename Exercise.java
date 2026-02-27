public class Exercise {
    private String name;
    private int reps;
    private double gewicht;
    public Exercise(String name, int reps, double gewicht) {
        if(gewicht < 0 || reps < 0)  {
            throw new IllegalArgumentException("Ungültig");
        this.name = name;
        this.reps = reps;
        this.gewicht = gewicht;
    }
    }
}