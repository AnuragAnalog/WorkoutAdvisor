package com.example.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List <String> getworkout(String workouttype, boolean isGym)
    {
        List <String> workout = new ArrayList<>();

        if (workouttype.equals("Chest")) {
            if (isGym) {
                workout.add("Cable Flys");
                workout.add("Bench Press");
                workout.add("Cable crossover");
                workout.add("Chest press");
            }
            else {
                workout.add("Incline Push ups");
                workout.add("Decline Push ups");
                workout.add("Knee Push ups");
                workout.add("Wide Push ups");
                workout.add("Box Push ups");
            }
        }
        else if (workouttype.equals("Triceps"))
        {
            if (isGym) {
                workout.add("Diamond Push-Ups");
                workout.add("Bench Dip");
                workout.add("One-Arm Overhead Extension");
            }
            else {
                workout.add("Triceps Bow");
                workout.add("Power Tricep Extension");
                workout.add("Tricep Dips");
            }
        }
        else if (workouttype.equals("Shoulders"))
        {
            if (isGym) {
                workout.add("Barbell Overhead Shoulder Press");
                workout.add("Seated Dumbbell Shoulder Press");
                workout.add("Front Raise");
                workout.add("Reverse Pec Deck Fly");
            }
            else {
                workout.add("Arm Raises");
                workout.add("Side Arm raise");
                workout.add("Rhomboid pulls");
                workout.add("Arm Scissors");
            }
        }
        else if (workouttype.equals("Biceps"))
        {
            if (isGym) {
                workout.add("Alternating Incline Dumbbell Curl");
                workout.add("Seated Alternating Hammer Curl");
                workout.add("Standing Reverse Barbell Curl");
                workout.add("Seated Alternating Dumbbell Curl");
            }
            else {
                workout.add("One Arm Push-Ups");
                workout.add("Side Plank");
                workout.add("Plank Up-Down");
                workout.add("Curls");
            }
        }
        else if (workouttype.equals("Legs"))
        {
            if (isGym) {
                workout.add("Leg Curl");
                workout.add("Leg Extension");
                workout.add("Glute Bridge");
                workout.add("Calf Raise");
            }
            else {
                workout.add("Backward Lunge");
                workout.add("Side Hop");
                workout.add("Squats");
                workout.add("Side Lying Leg Lift Left");
                workout.add("Side Lying Leg Lift Right");
            }
        }

        return workout;
    }
}