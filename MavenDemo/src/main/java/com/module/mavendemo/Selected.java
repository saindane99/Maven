package com.module.mavendemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sang.25 on 3/22/2018.
 */

public class Selected extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_screen);
        txt = (TextView) findViewById(R.id.go_txt);
    }

}
