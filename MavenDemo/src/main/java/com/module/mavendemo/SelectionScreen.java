package com.module.mavendemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sang.25 on 3/21/2018.
 */

public class SelectionScreen extends AppCompatActivity {

    TextView go_text, back_text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_screen);
        go_text = (TextView) findViewById(R.id.go);
        back_text = (TextView) findViewById(R.id.back);

        go_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectionScreen.this, Selected.class);
                startActivity(intent);
            }
        });

        back_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectionScreen.this, BackScreen.class);
                startActivity(intent);
            }
        });

    }
}
