package com.mavendemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.module.mavendemo.SelectionScreen;

public class MainActivity extends AppCompatActivity {

    Button hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (Button) findViewById(R.id.hello_button);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SelectionScreen.class);
                startActivity(intent);
            }
        });
    }
}
