package com.example.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List <String> getworkout(String workouttype)
    {
        List <String> workout = new ArrayList<>();

        if (workouttype.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if (workouttype.equals("Triceps"))
        {
            workout.add("Tricep Extension");
            workout.add("Tricep Pushdown");
        }
        else if (workouttype.equals("Shoulders"))
        {
            workout.add("Shoulder Press");
            workout.add("Shoulder Extension");
        }
        else if (workouttype.equals("Biceps"))
        {
            workout.add("Bicep Curls");
        }
        else if (workouttype.equals("Legs"))
        {
            workout.add("Leg Curl");
            workout.add("Leg Extension");
        }

        return workout;
    }
}