package com.example.souravkumarbehera.cetbusservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Driver1Page extends AppCompatActivity {

    public void goOnlineClicked(View view){
        Toast.makeText(this, "You are Online now", Toast.LENGTH_SHORT).show();
        Intent goMap= new Intent(Driver1Page.this, Driver1Map.class);
        startActivity(goMap);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver1_page);
    }
}
