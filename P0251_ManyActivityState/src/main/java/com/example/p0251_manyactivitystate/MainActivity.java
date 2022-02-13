package com.example.p0251_manyactivitystate;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    final String TAG = "States";

    Button btnActTwo;
    Button btnActThree;
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActTwo.setOnClickListener(this);
        btnActThree.setOnClickListener(this);


        Log.d(TAG, "MainActivity: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tv.setText("Main Activity on Pause");
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.btnActTwo:
                intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            case R.id.btnActThree:
                intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
                break;
        }
    }
}