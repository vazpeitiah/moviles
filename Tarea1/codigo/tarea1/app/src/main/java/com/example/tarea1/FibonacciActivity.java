package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
    }

    public void regresar(View view){
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }

    public void calcular(View view){
        EditText txt = findViewById(R.id.editTextNumber2);
        TextView view1 = findViewById(R.id.textView8);

        int num = Integer.parseInt(txt.getText().toString());

        if(esfibonacci(num)){
            view1.setText("Resultado: es fibonacci");
        }else{
            view1.setText("Resultado: no es fibonacci");
        }
    }

    public boolean esfibonacci(int num){
        boolean result = false;

        int x1 = 0;
        int x2 = 1;
        int x = x1 + x2;
        while (x <= num){
            if(x == num){
                result = true;
            }
            x1 = x2;
            x2 = x;
            x = x1 + x2;
        }

        if(num == 0){
            result = true;
        }

        return result;
    }
}