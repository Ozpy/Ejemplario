package com.example.ejemplario.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
//INSTRUCCIONES;
//Extender a FragmentPAgerAdapter
//Ir arreglando errores
//Agregar una variable numTabs;
//Igualarla a behavior;
//Crear un switch con cada caso retornar la clase del fragment en getItem
//En getCount retornar numTabs

public class PagerController  extends FragmentPagerAdapter {
    int numTabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numTabs=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new frag1();
            case 1: return new frag2();
            case 2: return new frag3();
            default: return null;
        }
    }
    @Override
    public int getCount() {
        return numTabs;
    }
}
