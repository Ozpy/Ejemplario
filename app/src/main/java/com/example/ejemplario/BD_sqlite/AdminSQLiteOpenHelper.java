package com.example.ejemplario.BD_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.ejemplario.Bd_sqlite;

//Extender SQLiteOpenHelper
//Agregar los metodos
//Agregar el contructor con 4 parametros(El primero normalmente)
//Se puede cambiar el nomrbe de la base de datos en la parte de OnCreate el parametro
//usar el metodo execSQL en tu base de datos y crear una tabla
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(@Nullable Bd_sqlite context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super((Context) context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {
        BaseDeDatos.execSQL("create table tabla(codigo int primary key,nombre text, apellido text, edad text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
