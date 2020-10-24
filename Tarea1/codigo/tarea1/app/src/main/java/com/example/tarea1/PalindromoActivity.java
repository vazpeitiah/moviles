package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindromo);
    }

    public void regresar(View view){
        Intent back = new Intent(this, PalindromoActivity.class);
        startActivity(back);
    }

    public void calcular(View view){
        EditText et = findViewById(R.id.editTextTextPersonName2);
        TextView tv = findViewById(R.id.textView13);

        String str = et.getText().toString();
        str = str.replace(" ", "").toLowerCase();
        String strinv = new StringBuilder(str).reverse().toString();

        if(str.equals(strinv)){
            tv.setText("Resultado: la cadena es un palindromo");
        }else{
            tv.setText("Resultado: la cadena no es un palindromo");
        }

    }

}