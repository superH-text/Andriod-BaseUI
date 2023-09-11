package com.xxxy.lihang.baseui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //拿到Button控件

        Button btn_login = findViewById(R.id.btn_login);


        //对控件做点击事件

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //需要的操作
                setContentView(R.layout.activity_login);
            }
        });
        Button btn_velay = findViewById(R.id.btn_velay);
        btn_velay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.acticity_vertical);
            }
        });
        Button btn_relative = findViewById(R.id.btn_relative);
        btn_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_relative);
            }
        });
        Button btn_framelayout = findViewById(R.id.btn_framelayout);
        btn_framelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_framelayout);
            }
        });
    }
}