package com.example.buttonsejericio1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
public class MainActivity extends Activity {
    MediaPlayer mp;
    Button btn;

    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btnSonido);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ya está sonando", Toast.LENGTH_SHORT).show();
                mp = MediaPlayer.create(MainActivity.this, R.raw.sound);
                mp.start();
            }
        });

    }

}