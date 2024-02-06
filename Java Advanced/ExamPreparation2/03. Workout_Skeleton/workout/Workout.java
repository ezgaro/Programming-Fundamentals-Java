package workout;

import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.exercises = new ArrayList<>();
        this.type = type;
        this.exerciseCount = exerciseCount;
    }

    public void addExercise(Exercise exercise) {
        if(this.exercises.size() < this.exerciseCount) {
            //add
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        return this.exercises.removeIf(ex -> ex.getName().equals(name) && ex.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle) {
        for (Exercise exercise : this.exercises) {
             if(exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                return exercise;
             }
        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        int calories = 0;
        Exercise exercise = null;
        if(!this.exercises.isEmpty()) {
            for (Exercise ex : this.exercises) {
                if(ex.getBurnedCalories() > calories) {
                    calories = ex.getBurnedCalories();
                }
            }
            for(Exercise exe : this.exercises) {
                if(exe.getBurnedCalories() == calories) {
                    exercise = exe;
                    break;
                }
            }
        }
        return exercise;
    }


    public int getExerciseCount() {
        return this.exercises.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Workout type: %s", this.type));
        this.exercises.forEach(exercise -> {sb.append(System.lineSeparator());
        sb.append(exercise);});

        return sb.toString();
    }


}
