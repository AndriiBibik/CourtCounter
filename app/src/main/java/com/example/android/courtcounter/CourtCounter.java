package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Increase the score for Team A by 3 points.
    public void add3ForTeamA(View view){
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }

    //Increase the score for Team A by 2 points.
    public void add2ForTeamA(View view){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    //Increase the score for Team A by 1 points.
    public void add1ForTeamA(View view){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Increase the score for Team B by 3 points.
    public void add3ForTeamB(View view){
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);
    }

    //Increase the score for Team B by 2 points.
    public void add2ForTeamB(View view){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    //Increase the score for Team B by 1 points.
    public void add1ForTeamB(View view){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets points for both TeamA and TeamB
     */
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
