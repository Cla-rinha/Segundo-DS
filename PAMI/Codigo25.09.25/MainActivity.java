package com.android.mariaclara.calculodemedia;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText nota1, nota2, nota3, nota4, numeroFaltas;
    private Button calcular;

    private TextView resultado;

    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        intiComponentes();

        calcular.setOnClickListener(view ->{
            validaCampos();
            calcularMedia();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void calcularMedia() {
        double n1 = Double.parseDouble(nota1.getText().toString());
        double n2 = Double.parseDouble(nota2.getText().toString());
        double n3 = Double.parseDouble(nota3.getText().toString());
        double n4 = Double.parseDouble(nota4.getText().toString());

        double media = (n1 + n2 + n3 + n4) / 4;
        double faltas = Double.parseDouble(numeroFaltas.getText().toString());

        if(media > 7){
            if (faltas < 20){
                resultado.setTextColor(Color.parseColor("#673AB7"));
                resultado.setText("Aluno aprovado com media: " + media);
            } else{
                resultado.setTextColor(Color.parseColor("#673AB7"));
                resultado.setText("Excesso de falta" + faltas);
            }
        } else{
            resultado.setTextColor(Color.parseColor("#673AB7"));
            resultado.setText("Aluno retido com media: " + media);
        }
    }

    private void validaCampos() {
        if (TextUtils.isEmpty(nota1.getText())) {

            nota1.setError("Este campo esta vazio.");
        } else if (TextUtils.isEmpty(nota2.getText())) {

            nota2.setError("Este campo esta vazio.");
        } else if (TextUtils.isEmpty(nota3.getText())) {

            nota3.setError("Este campo esta vazio.");
        } else if (TextUtils.isEmpty(nota4.getText())) {

            nota4.setError("Este campo esta vazio.");
        }
    }

    private void intiComponentes() {
        nota1 = findViewById(R.id.nota1);
        nota2 = findViewById(R.id.nota2);
        nota3 = findViewById(R.id.nota3);
        nota4 = findViewById(R.id.nota4);
        numeroFaltas = findViewById(R.id.numerofalta);
        calcular = findViewById(R.id.calcular);
        resultado = findViewById(R.id.resultado);
    }


}
