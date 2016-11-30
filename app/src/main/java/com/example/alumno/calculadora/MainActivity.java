package com.androidicts.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editTextResult;
    private Button botonUno;
    private Button botonDos;
    private Button botonTres;
    private Button botonCuatro;
    private Button botonCinco;
    private Button botonSeis;
    private Button botonSiete;
    private Button botonOcho;
    private Button botonNueve;
    private Button botonDel;
    private Button botonMas;
    private Button botonMenos;
    private Button botonMulti;
    private Button botonDivi;
    private Button botonIgual;
    private String contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
        editTextResult = (EditText) findViewById(R.id.editTextResultado);
        botonUno = (Button) findViewById(R.id.btnUno);
        botonDos = (Button) findViewById(R.id.btnDos);
        botonTres = (Button) findViewById(R.id.btnTres);
        botonCuatro = (Button) findViewById(R.id.btnCuatro);
        botonCinco = (Button) findViewById(R.id.btnCinco);
        botonSeis = (Button) findViewById(R.id.btnSeis);
        botonSiete = (Button) findViewById(R.id.btnsStiete);
        botonOcho = (Button) findViewById(R.id.btnoOcho);
        botonNueve = (Button) findViewById(R.id.btnNueve);
        botonDel = (Button) findViewById(R.id.btnDel);
        botonMas = (Button) findViewById(R.id.btnSuma);
        botonMenos = (Button) findViewById(R.id.btnMenos);
        botonMulti = (Button) findViewById(R.id.btnMulti);
        botonDivi = (Button) findViewById(R.id.btnDivi);
        botonIgual = (Button) findViewById(R.id.btnIgual);
        contador = "";
        List list = new ArrayList();
        botonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador += "1";
                editTextResult.setText(contador);
            }
        });

    }


}






