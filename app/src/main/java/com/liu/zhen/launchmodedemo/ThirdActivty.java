package com.liu.zhen.launchmodedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public  class ThirdActivty extends AppCompatActivity implements View.OnClickListener{

    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activty);
        Log.d("ThirdActivity", "onCreate");
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ThirdActivty", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ThirdActivty", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ThirdActivty", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ThirdActivty", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ThirdActivty", "onDestroy");
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(ThirdActivty.this,SecondActivity.class));
    }
}
