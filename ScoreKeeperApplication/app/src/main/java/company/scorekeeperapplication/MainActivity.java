package company.scorekeeperapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int Six = 6;
    final int Four = 4;
    final int Two = 2;


    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Update Scores
     */
    public void resetScores(View v) {
        team_a_score = 0;
        team_b_score = 0;
        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }

    public void updateTeamScore(View v) {
        switch(v.getId()) {
            case R.id.button3:
                team_a_score += Six;
                break;
            case R.id.button2:
                team_a_score += Four;
                break;
            case R.id.button1:
                team_a_score += Two;
                break;

            case R.id.button6:
                team_b_score += Six;
                break;
            case R.id.button5:
                team_b_score += Four;
                break;

            case R.id.button4:
                team_b_score += Two;
                break;


            default:
                break;
        }

        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }

    /**
     * Display Scores
     */
    public void displayTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }


}
