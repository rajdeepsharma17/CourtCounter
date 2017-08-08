package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.team_a_score;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    int scoreForTeamA = 0;
    public void addOneForTeamA(View v) {
        scoreForTeamA = scoreForTeamA +1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreForTeamA = scoreForTeamA +2;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreForTeamA = scoreForTeamA +3;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(scoreForTeamA+"");
    }



    int scoreForTeamB = 0;
    public void addOneForTeamB(View v) {
        scoreForTeamB = scoreForTeamB +1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreForTeamB = scoreForTeamB +2;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreForTeamB = scoreForTeamB +3;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(scoreForTeamB+"");
    }

    public void Reset(View v){
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(0+"");
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(0+"");
    }
}