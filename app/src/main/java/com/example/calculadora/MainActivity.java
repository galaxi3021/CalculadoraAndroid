package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText num1, num2;
    Button suma, resta, divi, mul;
    TextView resultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        suma = findViewById(R.id.sumar);
        resta = findViewById(R.id.restar);
        divi = findViewById(R.id.div);
        mul = findViewById(R.id.mul);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        divi.setOnClickListener(this);
        mul.setOnClickListener(this);

        resultado = findViewById(R.id.resultado);



    }

    @Override
    public void onClick(View view) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);

        int rta = 0;

        switch (view.getId()){
            case R.id.sumar:
                rta = entero1 + entero2;
                break;
            case R.id.restar:
                rta = entero1 - entero2;
                break;
            case  R.id.div:
                rta = entero1 / entero2;
                break;
            case  R.id.mul:
                rta = entero1 * entero2;
                break;
        }

        resultado.setText(""+rta);

    }
}
