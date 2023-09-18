package com.example.mylaba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<ElStuff> states = new ArrayList<ElStuff>();
    ListView electricList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        electricList = findViewById(R.id.electricList);
        // создаем адаптер
        ElStuffAdapter stateAdapter = new ElStuffAdapter(this, R.layout.electronic_stuff_list, states);
        // устанавливаем адаптер
        electricList.setAdapter(stateAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                ElStuff selectedState = (ElStuff) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Были выбраны " + selectedState.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        electricList.setOnItemClickListener(itemListener);
    }
    private void setInitialData(){

        states.add(new ElStuff ("Флешка", " Носитель"," From: Germany"));
        states.add(new ElStuff ("Мышь Logitec G32", " Переферийное устройство"," From: Russia"));
        states.add(new ElStuff ("Клавиатура Logitec G24", " Переферийное устройство"," From: Russia"));
        states.add(new ElStuff ("Колонки ASP100", " Колонки"," From: US"));
        states.add(new ElStuff ("Веб-камера DEXP Live DCM138", " Камера"," From: Austria"));
    }
}