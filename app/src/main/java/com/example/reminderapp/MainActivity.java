package com.example.reminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
    }
   public void openReminder(View view){
       Intent intent=new Intent(this,ReminderManage.class);
       startActivity(intent);
   }
   public void openTracker(View view){
       Intent intent=new Intent(this,Tracker.class);
       startActivity(intent);
   }
}