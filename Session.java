import java.util.ArrayList;
import java.util.List;
public class Session {
    private String name;
    private List<Exercise> workout;
        public Session(String name) {
            this.name = name;
            this.workout = new ArrayList<>();
    }
    public void addExercise(Exercise ex) {
        workout.add(ex);
    }
    public double getGesamtvolumen() {
        double summe = 0;
        for(Exercise e : workout) {
            summe+=e.getReps() * e.getGewicht();
        }
        return summe;
    }
    @Override
    public String toString() {
        return "Training: [ " + name + "]" + "Sätze: [" + workout.size() + "]" + "Volumen: [ " + getGesamtvolumen() + " kg]";
    }
}