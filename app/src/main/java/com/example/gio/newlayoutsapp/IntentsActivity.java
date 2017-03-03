package com.example.gio.newlayoutsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IntentsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
        initView();


    }

    private void initView() {
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:

                String url = "http://www.example.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

                break;
            case R.id.button3:
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + "+995593102130"));
                startActivity(callIntent);

                break;
            case R.id.button4:
                Intent callIntent2 = new Intent(Intent.ACTION_DIAL);
                callIntent2.setData(Uri.parse("tel:" + "+995593102130"));
                startActivity(callIntent2);
                break;
            case R.id.button5:

                startActivity(new Intent(this, PercentageActivity.class));
                break;
        }
    }
}
