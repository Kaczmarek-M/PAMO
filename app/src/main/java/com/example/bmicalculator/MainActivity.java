/*
Michał Kaczmarek s18464
BMI Calculator
*/


package com.example.bmicalculator;
/*
Michał Kaczmarek s18464
BMI Calculator
*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bmi;
    Button caloriesPerDay;
    Button culinaryRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmi = (Button) findViewById(R.id.bmi);
        caloriesPerDay = (Button) findViewById(R.id.caloriesPerDay);
        culinaryRecipes = (Button) findViewById(R.id.culinaryRecipes);

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BmiActivity.class);
                startActivity(intent);
            }
        });

        caloriesPerDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calories_per_der.class);
                startActivity(intent);
            }
        });

        culinaryRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Culinary_recipes.class);
                startActivity(intent);
            }
        });

    }
}
