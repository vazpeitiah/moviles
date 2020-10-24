package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MagicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magico);
    }

    public void regresar(View view){
        Intent reg = new Intent(this, MainActivity.class);
        startActivity(reg);
    }

    public void calcular(View view){
        EditText et = findViewById(R.id.editTextNumber3);
        EditText res = findViewById(R.id.editTextTextMultiLine);

        int x = Integer.parseInt(et.getText().toString());
        StringBuilder sb = new StringBuilder();
        if(x > 0){
            while(x != 1){
                if(x % 2 == 0){
                    sb.append(x+" es par: " + x + "/2 = ");
                    x = x / 2;
                    sb.append(x+"\n");
                }else{
                    sb.append(x+" es impar: " + x +  "x3+1 = ");
                    x = (x * 3) + 1;
                    sb.append(x+"\n");
                }
            }
            sb.append("Se llego a 1, por lo tanto el "+ x + " es maravilloso");
        }else{
            sb.append("Ingresa un numero valido");
        }
        res.setText(sb.toString());
    }
}