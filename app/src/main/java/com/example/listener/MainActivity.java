package com.example.listener;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    Button bt1,btn2;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress = new ProgressDialog(this);

        bt1 = (Button) findViewById(R.id.btn1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textview);
                textView.setText("Button is Clicked...");
                textView.setTextSize(25);
                Toast.makeText(getApplicationContext(),"Onclick() is running",Toast.LENGTH_SHORT).show();
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;

                Toast.makeText(getApplicationContext(),"The Button has "+count+ " times clicked",Toast.LENGTH_SHORT).show();
            }
        });


    }
}