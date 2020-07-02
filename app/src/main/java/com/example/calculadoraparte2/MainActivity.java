package com.example.calculadoraparte2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_sumar;
    private Button btn_restar;
    private Button btn_dividir;
    private Button btn_multiplicar;
    private TextView text_respuesta;
    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.Resultado);
        edit_numero_uno = findViewById(R.id.valor1);
        edit_numero_dos = findViewById(R.id.valor2);
        btn_sumar = findViewById(R.id.btnsumar);
        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( sumar( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });

        btn_dividir = findViewById(R.id.btndividir);
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( dividir( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_multiplicar = findViewById(R.id.btnmultiplicar);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicar( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_restar = findViewById(R.id.btnrestar);
        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( restar( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

    }

    public double sumar (int a, int b){
        return a+b;
    }

    public double restar (int a, int b){
        return a-b;
    }

    public double multiplicar (int a, int b){
        return a*b;
    }

    public double dividir (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}