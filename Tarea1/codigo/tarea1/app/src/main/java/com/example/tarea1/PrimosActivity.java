package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrimosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primos);
    }

    public void regresar(View view){
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }

    public void calcular(View view){
        EditText text = findViewById(R.id.editTextNumber);
        TextView view1 = findViewById(R.id.textView5);
        int num = Integer.parseInt(text.getText().toString());
        if(esprimo(num)){
            view1.setText("Resultado: es primo");
        }else{
            view1.setText("Resultado: no es primo");
        }


    }

    public boolean esprimo(int num){
        boolean result = true;

        for (int i = 2; i < num && result; i++){
            if(num % i == 0){
                result = false;
            }
        }

        if(num < 2){
            result = false;
        }

        return result;
    }
}