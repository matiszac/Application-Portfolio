package com.theuhd.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_popularMovies;
    private Button btn_stockHawk;
    private Button btn_buildItBigger;
    private Button btn_makeYourAppMaterial;
    private Button btn_goUbiquitous;
    private Button btn_capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI Components

        initializeUI();

        // onClick Listener For Buttons

        btn_popularMovies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my 'Popular Movies' project.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_stockHawk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my 'Stock Hawk' project.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_buildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my 'Build it Bigger' project.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my 'Make Your App Material' project.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_goUbiquitous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my 'Go Ubiquitous' project.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my capstone project.", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void initializeUI() {
        btn_popularMovies = (Button) findViewById(R.id.btn_popularMovies);
        btn_stockHawk = (Button) findViewById(R.id.btn_stockHawk);
        btn_buildItBigger = (Button) findViewById(R.id.btn_buildItBigger);
        btn_makeYourAppMaterial = (Button) findViewById(R.id.btn_makeYourAppMaterial);
        btn_goUbiquitous = (Button) findViewById(R.id.btn_goUbiquitous);
        btn_capstone = (Button) findViewById(R.id.btn_capstone);
    }
}
