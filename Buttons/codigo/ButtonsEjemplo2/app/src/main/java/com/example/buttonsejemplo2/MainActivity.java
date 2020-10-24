package com.example.buttonsejemplo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
//
import android.widget.*;
public class MainActivity extends Activity implements OnClickListener{
    //
    ImageButton
            jib1;
    ToggleButton
            jtb1;
    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        jib1 = (ImageButton) findViewById(R.id.xib1); jib1.setOnClickListener(this);//
        jtb1 = (ToggleButton)findViewById(R.id.xtb1); jtb1.setOnClickListener(this);
    }
    public void onClick(View v) {
//
        if(v.getId()==R.id.xib1)
//
            showToastMessage("Botón: ImageButton");
        else {
            if (jtb1.isChecked()) showToastMessage("Botón: ToggleButton en ON");
            else showToastMessage("Botón: ToggleButton en OFF");
        }
    }
    private void showToastMessage(String s){
        Toast t = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        t.show();
    }
}