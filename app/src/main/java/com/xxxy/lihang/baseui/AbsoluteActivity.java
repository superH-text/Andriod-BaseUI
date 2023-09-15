package com.xxxy.lihang.baseui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AbsoluteLayout;
import android.widget.Button;

public class AbsoluteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute);

        Button btn_1 = new Button(AbsoluteActivity.this);
        btn_1.setText("按钮1");

        AbsoluteLayout layout_abs = findViewById(R.id.layout_abs);

        layout_abs.addView(btn_1);
    }
}