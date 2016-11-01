package com.theuhd.appportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(View view) {
        // create reference to button that called the method
        Button button = (Button) view;

        // text from button to be used in toast message
        String buttonText = (String) button.getText();

        // application context required for making toast
        Context context = getApplicationContext();

        // build toast message
        CharSequence text = getString(R.string.toast_button_prefix) + buttonText;

        //duration of toast message on screen
        int duration = Toast.LENGTH_SHORT;

        // create toast and show
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }

}
