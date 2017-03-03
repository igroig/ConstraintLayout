package com.example.gio.newlayoutsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PercentageActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
        initView();
    }

    private void initView() {
        bNext = (Button) findViewById(R.id.bNext);

        bNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bNext:


                startActivity(new Intent(this, Swipe.class));

                break;
        }
    }
}
