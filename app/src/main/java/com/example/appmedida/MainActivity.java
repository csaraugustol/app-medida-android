package com.example.appmedida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

EditText campoNome, campoIdade, campoAltura, campoPeso;
Button btnCalc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DecimalFormat form = new DecimalFormat("0.00");

        campoNome = findViewById(R.id.edtNome);
       // campoNome.setText("Cesar");

        campoIdade = findViewById(R.id.editIdade);

        campoAltura = findViewById(R.id.edtDecAltura);
        
        campoPeso = findViewById(R.id.edtDecPeso);

        btnCalc = findViewById(R.id.btnCalcular);

        Pessoa p = new Pessoa();


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(), "Olá "+ campoNome.getText() + ", o seu resultado é: "
                        + p.resultado(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}