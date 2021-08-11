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





        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dAltura = new Double(campoAltura.getText().toString());
                double dPeso = new Double(campoPeso.getText().toString());

                Pessoa p = new Pessoa();
                p.setPeso(dPeso);
                p.setAltura(dAltura);


                Toast.makeText(getApplicationContext(), "Olá "+ campoNome.getText() + ", o seu resultado é: "
                        + p.resultado(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}