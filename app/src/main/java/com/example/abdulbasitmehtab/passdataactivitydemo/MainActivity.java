package com.example.abdulbasitmehtab.passdataactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnStartAnotherActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAnotherActivity = (Button) findViewById(R.id.btnPassData);

        btnStartAnotherActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // 1. create an intent pass class name or intnet action name
        Intent intent = new Intent("com.example.abdulbasitmehtab.passdataactivitydemo.ANOTHER_ACTIVITY");

        // 2. put key/value data
        intent.putExtra("message", "Hello From MainActivity");

        // 3. or you can add data to a bundle
        Bundle extras = new Bundle();
        extras.putString("status", "Data Received!");

        // 4. add bundle to intent
        intent.putExtras(extras);

        // 5. start the activity
        startActivity(intent);
    }
}
