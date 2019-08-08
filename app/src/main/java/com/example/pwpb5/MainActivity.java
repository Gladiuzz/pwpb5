package com.example.pwpb5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn_explicit_intent);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.btn_implicit_intent);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_explicit_intent:
                Intent explicit = new Intent(MainActivity.this, intent_activity.class);
                startActivity(explicit);
                break;
            case R.id.btn_implicit_intent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.komikgue.com/"));
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}
