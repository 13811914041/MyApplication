package com.example.dai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //这里有冲突

        tvText = findViewById(R.id.tv_text);

        // 文本
        tvText.setText(getString(R.string.this_is_a_text));

        //颜色
        tvText.setTextColor(getResources().getColor(R.color.text_color));

        //点击事件
        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //提示框
                Toast.makeText(MainActivity.this, "点击事件", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
