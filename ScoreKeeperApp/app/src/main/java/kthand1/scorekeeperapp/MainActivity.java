package kthand1.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * The goal of this project is to create an Score Keeper app which gives a user the ability to keep track of the score of two different teams playing a game.
 */

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    private int point3 = 3;
    private int point6 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Calculates the score depending on which button is selected per team.
     */
    public void score(View view) {

        if (view.getId() == R.id.teamA3) {
            scoreA += point3;
        } else if (view.getId() == R.id.teamA6) {
            scoreA += point6;
        } else if (view.getId() == R.id.teamB3) {
            scoreB += point3;
        } else if (view.getId() == R.id.teamB6) {
            scoreB += point6;
        }
        displayScore("A", scoreA);
        displayScore("B", scoreB);
    }

    /**
     * Resets the score to 0.
     */
    public void reset(View view) {

        scoreA = 0;
        scoreB = 0;
        displayScore("A", scoreA);
        displayScore("B", scoreB);
    }

    /**
     * Displays the score in the correct view.
     */
    private void displayScore(String team, int score) {
        if (team.equals("A")) {
            TextView quantityTextView = (TextView) findViewById(R.id.team_a_score_view);
            quantityTextView.setText("" + score);
        } else {
            if (team.equals("B")) {
                TextView quantityTextView = (TextView) findViewById(R.id.team_b_score_view);
                quantityTextView.setText("" + score);
            }
        }
    }


}

