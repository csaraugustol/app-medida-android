package com.example.appmedida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

EditText campoNome, campoIdade, campoAltura, campoPeso;
Button btnCalc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Busca os campos a serem utilizados
        binding();


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    if (Integer.parseInt(campoIdade.getText().toString()) < 18){
                        Snackbar.make(view,"Pessoas menor de idade. Não é possível calcular.", Snackbar.LENGTH_SHORT ).show();

                        return;
                    }

                }catch (NumberFormatException e){

                    Snackbar.make(view,"Digite uma idade correta.", Snackbar.LENGTH_SHORT ).show();
                    campoIdade.requestFocus();

                    return;
                }


                Pessoa p = new Pessoa();
                p.setPeso(Double.parseDouble(campoAltura.getText().toString()));
                p.setAltura(Double.parseDouble(campoPeso.getText().toString()));


                Toast.makeText(getApplicationContext(), "Olá "+ campoNome.getText() + ", o seu IMC é "
                                + p.imc() + " e sua categoria é: "+ p.resultado(),
                        Toast.LENGTH_LONG).show();

                /*campoNome.setText("");
                campoAltura.setText("");
                campoIdade.setText("");
                campoPeso.setText("");*/

                limparCampos(campoNome, campoAltura, campoIdade, campoPeso);

            }
        });
    }

    private void limparCampos(EditText ... campos){

        for (EditText et: campos){
            et.setText("");
        }

    }

    private void binding() {
        campoNome = findViewById(R.id.edtNome);

        campoIdade = findViewById(R.id.edtIdade);

        campoAltura = findViewById(R.id.edtDecAltura);

        campoPeso = findViewById(R.id.edtDecPeso);

        btnCalc = findViewById(R.id.btnCalcular);
    }
}