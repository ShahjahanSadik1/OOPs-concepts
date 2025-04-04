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
                .setAppearanceLightStatusBars(true);

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




        Employee employee = new Employee();
        employee.salary="12000";
        employee.name= "sadik";
        employee.father="jahangir";


        Employee employee2 = new Employee();
        employee2.salary="124000";
        employee2.name= "Shahjahan";
        employee2.father="Akbar";






        text_view.append("\n"+employee2.salary);
        text_view.append("\n"+employee2.name);
        text_view.append("\n"+employee2.father);

        text_view.append("\n\n"+employee.salary);
        text_view.append("\n"+employee.name);
        text_view.append("\n"+employee.father);











    }//on create mathod end here>>>>>>>>>>>>>>>>>>>>










}//publice class end here>>>>>>>>>>>>>>>>