package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int ballScoreTeamA = 0;
    int scratchScoreTeamA = 0;
    int deadScoreTeamA = 0;

    int ballScoreTeamB = 0;
    int scratchScoreTeamB = 0;
    int deadScoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalForTeamA(0);
        displayGoalForTeamB(0);
    }

    /**
     * Display the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_ball_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_dead_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Display the given score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_ball_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_dead_score);
        scoreView.setText(String.valueOf(score));
    }


    /** Reset all Scores */
    public void resetScore (View v) {
        ballScoreTeamA = 0;
        scratchScoreTeamA = 0;
        deadScoreTeamA = 0;

        ballScoreTeamB = 0;
        scratchScoreTeamB = 0;
        deadScoreTeamB = 0;

        displayGoalForTeamA(ballScoreTeamA);
        displayYellowForTeamA(deadScoreTeamA);

        displayGoalForTeamB(ballScoreTeamB);
        displayYellowForTeamB(deadScoreTeamB);

    }


    /* Increment Balls made, Scratches and dead balls for team A*/
    public void addGoalForTeamA (View v) {
        ballScoreTeamA++;
        displayGoalForTeamA(ballScoreTeamA);
    }

    public void subtractBallForTeamA (View v) {
        int i = ballScoreTeamA--;
        if (ballScoreTeamA<=0)
            ballScoreTeamA=0;
        displayGoalForTeamA(ballScoreTeamA);
    }

    public void subtractBallForTeamB (View v) {
        int i = ballScoreTeamB--;
        if (ballScoreTeamB<=0)
            ballScoreTeamB=0;
        displayGoalForTeamB(ballScoreTeamB);
    }

    public void addYellowForTeamA (View v) {
        deadScoreTeamA++;
        displayYellowForTeamA(deadScoreTeamA);
    }

    /* Increment Balls made, Scratches and dead balls team B*/
    public void addBallForPlayerB(View v) {
        ballScoreTeamB++;
        displayGoalForTeamB(ballScoreTeamB);
    }

    public void addYellowForTeamB (View v) {
        deadScoreTeamB++;
        displayYellowForTeamB(deadScoreTeamB);
    }

}
