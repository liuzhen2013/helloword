package com.liu.zhen.launchmodedemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Log.d("SecondActivity", "onCreate");
        AlertDialog.Builder alt = new AlertDialog.Builder(this);

        alt.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(SecondActivity.this,SecondActivity.class));
            }
        }).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SecondActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy");
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(SecondActivity.this,ThirdActivty.class));
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.d("SecondActivity", "我被调用了onNewInent");
    }
}
