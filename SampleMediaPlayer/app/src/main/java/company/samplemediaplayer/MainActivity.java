package company.samplemediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.aj);
        Button PlayBtn = (Button)findViewById(R.id.play);
        Button PauseBtn = (Button)findViewById(R.id.pause);

        PlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){

                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(MainActivity.this, "I am done",Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        PauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             mediaPlayer.pause();

            }
        });
    }
}
