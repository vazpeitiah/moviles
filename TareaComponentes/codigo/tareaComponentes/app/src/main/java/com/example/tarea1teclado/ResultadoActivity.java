package com.example.tarea1teclado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle bdl = getIntent().getExtras();
        TextView txtPrimo = findViewById(R.id.textView2);
        TextView txtFibonacci = findViewById(R.id.textView3);
        TextView txtPalidrome = findViewById(R.id.textView4);
        TextView txtMagico = findViewById(R.id.textView5);

        int num = bdl.getInt("number");

        if(esprimo(num)){
            txtPrimo.setText("El " + num + " es primo");
        }else{
            txtPrimo.setText("El " + num + " no es primo");
        }

        if(esfibonacci(num)){
            txtFibonacci.setText("El " + num + " es fibonacci");
        }else{
            txtFibonacci.setText("El " + num + " no es fibonacci");
        }

        String str = ""+num;
        String strinv = new StringBuilder(str).reverse().toString();

        if(str.equals(strinv)){
            txtPalidrome.setText("El " + num + " es palindrome");
        }else{
            txtPalidrome.setText("El " + num + " no es palindrome");
        }

        StringBuilder sb = new StringBuilder();
        if(num > 0){
            while(num != 1){
                if(num % 2 == 0){
                    sb.append(num+" es par: " + num + "/2 = ");
                    num = num / 2;
                    sb.append(num+"\n");
                }else{
                    sb.append(num+" es impar: " + num +  "x3+1 = ");
                    num = (num * 3) + 1;
                    sb.append(num+"\n");
                }
            }
            sb.append("Se llego a 1, por lo tanto el "+ num + " es maravilloso");
        }else{
            sb.append("Ingresa un numero valido");
        }
        txtMagico.setText(sb.toString());

    }

    public void regresar(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
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