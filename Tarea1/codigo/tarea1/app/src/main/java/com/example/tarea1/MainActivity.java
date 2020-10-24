package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
    }

    public void primos(View view){
        Intent prim = new Intent(this, PrimosActivity.class);
        startActivity(prim);
    }

    public void fibonacci(View view){
        Intent fibo = new Intent(this, FibonacciActivity.class);
        startActivity(fibo);
    }

    public void magico(View view){
        Intent magic = new Intent(this, MagicoActivity.class);
        startActivity(magic);
    }

    public void palindromos(View view){
        Intent pali = new Intent(this, PalindromoActivity.class);
        startActivity(pali);
    }
}