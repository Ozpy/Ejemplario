package com.example.ejemplario;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.ejemplario.fragment.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


//Normalmente se pone un TabLayout
//Despues un viewPager
//Crear una clase PageContreller Intrucciones en la clase de este doc
//Crear un fragment con el view para cada fragment sin lo metodos
//Crear objeto PagerController
//Usar SetAdapter
//Crear variables para el tab,viewPager,TabItems e inicializarlas
//Instanciar el PagerController con los parametros getSupportFragmentManager(),tabLayout.getTabCount()
//Usar el metodo de de setOnTabSelectedListener con parametro un new TabLayout.OnTabSelectedListener y que agregue los metodos
//Agregar un switch con tab.getPosition()

public class Fragment extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem item1,item2,item3;

    PagerController pagerController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        item1 = findViewById(R.id.tabContenido);
        item2 = findViewById(R.id.tabFormulario);
        item3 = findViewById(R.id.tabInfo);

        pagerController= new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerController);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            switch(tab.getPosition()){
                case 0:
                    pagerController.notifyDataSetChanged();
                    break;
                case 1:
                    pagerController.notifyDataSetChanged();
                    break;
                case 2:
                    pagerController.notifyDataSetChanged();
                    break;
            }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
