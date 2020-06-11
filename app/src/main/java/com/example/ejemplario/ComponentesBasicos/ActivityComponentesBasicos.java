package com.example.ejemplario.ComponentesBasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejemplario.R;

public class ActivityComponentesBasicos extends AppCompatActivity {


    //Para mandar un objeto agregar a la clase Implements Serializable

    //Declarar componenetes
    Spinner spinner;
    EditText et1;

    ObjetoComponentesBasicos objeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes_basicos);
        spinner =findViewById(R.id.spinner);
        et1 =findViewById(R.id.editText);


        Spinner spinner = findViewById(R.id.spinner);
        String[] valores = {"uno","dos","tres","cuatro","cinco","seis", "siete", "ocho"};               //llenar un string con los valores
        spinner.setAdapter(new ArrayAdapter(this, android.R.layout.simple_spinner_item, valores)); //Poner los valores en el spinner



        }
        public void btnMandarObjeto(View view){
        String seleccionSpinner = spinner.getSelectedItem().toString();

        switch (seleccionSpinner){
            case "uno":
                objeto.setStrSpinner("1");
                break;
            case "dos":
                objeto.setStrSpinner("2");                break;
            case "tres":
                objeto.setStrSpinner("3");                break;
            case "cuatro":
                objeto.setStrSpinner("4");                break;
            case "cinco":
                objeto.setStrSpinner("5");                break;
            case "seis":
                objeto.setStrSpinner("6");                break;
            case "siete":
                objeto.setStrSpinner("7");                break;
            case "ocho":
                objeto.setStrSpinner("8");                break;
        }
        }
    }

