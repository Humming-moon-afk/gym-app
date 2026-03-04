import java.time.LocalDate;

public class Exercise {
    private String name;
    private int reps;
    private double gewicht;
    private LocalDate date;
    public Exercise(String name, int reps, double gewicht) {
        if(gewicht < 0 || reps < 0)  {
            throw new IllegalArgumentException("Ungültig");
        }
        this.name = name;
        this.reps = reps;
        this.gewicht = gewicht;
        this.date = LocalDate.now();
    }
    public String getName() {
        return name;
    }
    public int getReps() {
        return reps;
    }
    public double getGewicht() {
        return gewicht;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setReps(int reps) {
        if(reps < 0) {
            throw new IllegalArgumentException("Ungültig");
        }
        this.reps = reps;
    }
    public void setGewicht(double gewicht) {
        if(gewicht < 0) {
            throw new IllegalArgumentException("Ungültig");
        }
        this.gewicht = gewicht;
    }
    @Override
    public String toString() {
        return name + " " + reps + " " + gewicht + " " + date;
    }
}