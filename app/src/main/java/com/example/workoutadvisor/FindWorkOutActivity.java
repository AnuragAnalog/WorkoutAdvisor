package com.example.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FindWorkOutActivity extends Activity {

    boolean isGym;
    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting the date
        TextView date = (TextView) findViewById(R.id.textDate);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");
        String currentDate = sdf1.format(new Date());
        date.setText(currentDate);

        // Setting the time
        TextView time = (TextView) findViewById(R.id.textTime);
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf2.format(new Date());
        time.setText(currentTime);

        ToggleButton toggle = (ToggleButton) findViewById(R.id.switchButton);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    isGym = true;
                }
                else {
                    isGym = false;
                }
            }
        });
    }

    public void onClickFindWorkout(View view) {
        TextView workouts = (TextView) findViewById(R.id.workout);
        Spinner workouttype = (Spinner) findViewById(R.id.workouttype);

        String workout = String.valueOf(workouttype.getSelectedItem());

//        workouts.setText(workout);

        List<String> workoutList = expert.getworkout(workout, isGym);

        StringBuilder workoutFormatted = new StringBuilder();

        for (String work : workoutList) {
            workoutFormatted.append(work).append("\n");
        }

        workouts.setText(workoutFormatted);
    }
}