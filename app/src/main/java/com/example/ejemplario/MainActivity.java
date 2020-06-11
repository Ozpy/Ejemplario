package com.example.ejemplario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ir(View view){
        Intent i; //Declarar Intent
        switch (view.getId()){
            case R.id.button:
                i = new Intent(this,ObjetoComponentesBasicos.class); //Poner la direccion
                startActivity(i);//Mandar a llamar el activity
                break;
            case R.id.button2:
                i = new Intent(this,Fragment.class); //Poner la direccion
                startActivity(i);//Mandar a llamar el activity
                break;
            case R.id.button3:
                i = new Intent(this,ObjetoComponentesBasicos.class); //Poner la direccion
                startActivity(i);//Mandar a llamar el activity
                break;
        }
    }
}
