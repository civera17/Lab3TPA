package com.example.lab3tpa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {



    private Button buttonSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void minute(View view){
        TextView minutesText = (TextView) findViewById(R.id.minuteText);
        Calendar calendar = new GregorianCalendar();
        Integer i = calendar.get(Calendar.MINUTE);
        minutesText.setText(i.toString());
    }

    public void hour(View view){
        TextView hoursText = (TextView) findViewById(R.id.oreText);
        Calendar calendar = new GregorianCalendar();
        Integer i = calendar.get(Calendar.HOUR);
        hoursText.setText(i.toString());
    }

    public void second(View view){
        TextView secondsText = (TextView) findViewById(R.id.secundeText);
        Calendar calendar = new GregorianCalendar();
        Integer i = calendar.get(Calendar.SECOND);
        secondsText.setText(i.toString());
    }

    public void fullTime(View view){
        TextView fullDateText = (TextView) findViewById(R.id.fullDateText);
        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
        fullDateText.setText(currentDateTimeString);
    }


}