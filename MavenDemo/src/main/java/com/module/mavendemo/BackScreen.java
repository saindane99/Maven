package com.module.mavendemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sang.25 on 3/22/2018.
 */

public class BackScreen extends AppCompatActivity {
    TextView back_txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back_screen);
        back_txt = (TextView) findViewById(R.id.back_txt);

    }
}
