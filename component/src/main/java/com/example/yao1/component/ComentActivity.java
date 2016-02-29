package com.example.yao1.component;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComentActivity extends AppCompatActivity {
    private Button startAty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coment);
        findViewById(R.id.startMyAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(ComentActivity.this,MyAty.class));
                startActivity(new Intent("com.example.yao1.component.intent.action.MainLog"));

            }
        });
    }
}
