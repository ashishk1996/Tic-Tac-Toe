package com.ashish.kumar.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void multi1(View view)
    {
        Intent intent=new Intent(MainActivity.this,Multi1.class);
        startActivity(intent);
    }
    public void single(View view)
    {
        Intent intent=new Intent(MainActivity.this,Single.class);
        startActivity(intent);
    }
}
