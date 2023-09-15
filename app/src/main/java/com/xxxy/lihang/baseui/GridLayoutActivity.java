package com.xxxy.lihang.baseui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridLayoutActivity extends AppCompatActivity {
    String a="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        Button btn_7 = findViewById(R.id.btn_7);
        EditText et_show = findViewById(R.id.et_show);

        //给button做监听事件
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + String.valueOf(7);

                et_show.setText(String.valueOf(7));
            }
        });
    }
}