package com.example.tarea1teclado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente(View view){
        EditText et = findViewById(R.id.editTextNumber);
        Intent resp = new Intent(MainActivity.this, ResultadoActivity.class);
        Bundle options = new Bundle();
        int number = Integer.parseInt(et.getText().toString());
        options.putInt("number", number);
        resp.putExtras(options);
        startActivity(resp);
    }

    public void colocar(View view){
        Button btn = (Button) view;

        EditText et = findViewById(R.id.editTextNumber);

        String str = btn.getText().toString();
        String str2 = et.getText().toString();

        et.setText(str2.concat(str));
    }

    public void clear(View view){
        EditText et = findViewById(R.id.editTextNumber);
        et.setText("");
    }
}