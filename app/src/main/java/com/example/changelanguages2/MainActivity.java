package com.example.changelanguages2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<?> adapter2 = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    }

    public void changeLanguage(String language) {
        Locale locale = new Locale(language);
        Configuration config = new Configuration();
        config.setLocale(locale);
        getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        recreate();
    }

    public void changeButton(View view) {
        String selected = spinner.getSelectedItem().toString();
        String selected2 = spinner2.getSelectedItem().toString();
        if (selected.equals("english")) {
            changeLanguage("en");
            if(selected2.equals("green")){
                Utils.changeToTheme(this, Utils.THEME_GREEN);
            } else if(selected2.equals("blue")){
                Utils.changeToTheme(this, Utils.THEME_BLUE);
            } else if (selected2.equals("black")){
                Utils.changeToTheme(this, Utils.THEME_BLACK);
            }
        } else if (selected.equals("russian")) {
            changeLanguage("ru");
            if(selected2.equals("green")){
                Utils.changeToTheme(this, Utils.THEME_GREEN);
            } else if(selected2.equals("blue")){
                Utils.changeToTheme(this, Utils.THEME_BLUE);
            } else if (selected2.equals("black")){
                Utils.changeToTheme(this, Utils.THEME_BLACK);
            }
        } else if(selected.equals("spanish")){
            changeLanguage("es");
            if(selected2.equals("green")){
                Utils.changeToTheme(this, Utils.THEME_GREEN);
            } else if(selected2.equals("blue")){
                Utils.changeToTheme(this, Utils.THEME_BLUE);
            } else if (selected2.equals("black")){
                Utils.changeToTheme(this, Utils.THEME_BLACK);
            }
        }
    }

}



