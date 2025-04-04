package com.shahjahan.oopsconcepts;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {




    TextView text_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);


        WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView())
                .setAppearanceLightStatusBars(false);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            getWindow().setNavigationBarContrastEnforced(false);
        }

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        text_view = findViewById(R.id.text_view);




        //seter
        Employee employee = new Employee("SADIK","CEO","120000");



        //Geter
        text_view.append("\n"+employee.getName());
        text_view.append("\n"+employee.getPosition());
        text_view.append("\n"+employee.getSalary());

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //seter
        Employee employee2 = new Employee("SHAHJAHAN","SELMAN","13000");



        //Geter
        text_view.append("\n\n"+employee2.getName());
        text_view.append("\n"+employee2.getPosition());
        text_view.append("\n"+employee2.getSalary());







    }//on create mathod end here>>>>>>>>>>>>>>>>>>>>










}//publice class end here>>>>>>>>>>>>>>>>