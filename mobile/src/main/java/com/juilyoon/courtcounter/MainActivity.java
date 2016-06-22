package com.juilyoon.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int team1_score = 0;
    private int team2_score = 0;
    // Record distribution of points
    private int team1_1point = 0;
    private int team1_2point = 0;
    private int team1_3point = 0;
    private int team2_1point = 0;
    private int team2_2point = 0;
    private int team2_3point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * goal() adds the appropriate points to the teams score
     * @param view Whichever button was pressed
     */
    public void goal(View view) {
        switch (view.getId()) {
            case R.id.point1_team1:
                team1_1point++;
                team1_score++;
                break;
            case R.id.point2_team1:
                team1_2point += 2;
                team1_score += 2;
                break;
            case R.id.point3_team1:
                team1_3point += 3;
                team1_score += 3;
                break;
            case R.id.point1_team2:
                team2_1point++;
                team2_score++;
                break;
            case R.id.point2_team2:
                team2_2point += 2;
                team2_score += 2;
                break;
            case R.id.point3_team2:
                team2_3point += 3;
                team2_score += 3;
                break;
        }
        updateScore();
    }

    /**
     * updateScore() updates each team's score appropriately
     */
    private void updateScore() {
        TextView score = (TextView) findViewById(R.id.score_team1_view);
        score.setText(team1_score + "");
        score = (TextView) findViewById(R.id.score_team2_view);
        score.setText(team2_score + "");
    }

    public void reset(View view) {
        team1_score = 0;
        team2_score = 0;
        team1_1point = 0;
        team1_2point = 0;
        team1_3point = 0;
        team2_1point = 0;
        team2_2point = 0;
        team2_3point = 0;

        updateScore();
    }

}
