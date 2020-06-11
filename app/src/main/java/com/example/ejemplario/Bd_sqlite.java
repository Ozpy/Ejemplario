package com.example.ejemplario;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejemplario.BD_sqlite.AdminSQLiteOpenHelper;
//Crear clase AdminSQLiteOpenGelper

public class Bd_sqlite extends AppCompatActivity {
    EditText etNombre,etApellido,etEdad;
    Button btn_registrar;
    private String nombre,apellido,id,edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_sqlite2);
        etNombre=findViewById(R.id.et_nombre);
        etApellido=findViewById(R.id.et_apellido);
        etEdad=findViewById(R.id.et_edad);
        btn_registrar = findViewById(R.id.btn_enviar);


    }

    public void mostrar(View view){ //Mostrar

    }

    public void enviar(View view){
        apellido=etApellido.getText().toString();
        nombre=etNombre.getText().toString();
        edad= etEdad.getText().toString() ;


        AdminSQLiteOpenHelper admin=new AdminSQLiteOpenHelper(this ,"NombreDeBaseDeDatos",null,1); //Lineas para acceder a la base de datos
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        ContentValues registro=new ContentValues();         //Generas variable para almacenar los datos
        registro.put("nombre",nombre);
        registro.put("apellido",apellido);
        registro.put("edad",edad);

        BaseDeDatos.insert("tabla",null,registro);//Se le pone el nombre de la tabla que habiamos puesto en el openHelper
        BaseDeDatos.close();                //Cierras la base de datos
        Toast.makeText(Bd_sqlite.this, "Registrado correctamente", Toast.LENGTH_SHORT).show();
    }
}