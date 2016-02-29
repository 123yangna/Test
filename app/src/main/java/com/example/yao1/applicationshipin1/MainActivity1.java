package com.example.yao1.applicationshipin1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener, ServiceConnection {
    private Button startService;
    private Button stopService;
    private Button bindService;
    private Button unbindService;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        intent=new Intent(MainActivity1.this,MyService.class);
        findViewById(R.id.btn_startService).setOnClickListener(this);
        findViewById(R.id.btn_stopService).setOnClickListener(this);
        findViewById(R.id.btn_bindService).setOnClickListener(this);
        findViewById(R.id.btn_unbindService).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_startService:
                startService(intent);
                break;
            case R.id.btn_stopService:
                stopService(intent);
                break;
            case R.id.btn_bindService:
                bindService(intent,this, Context.BIND_AUTO_CREATE);
                break;
            case R.id.btn_unbindService:
                unbindService(this);
                break;
        }
    }
    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        System.out.println("Service Contented");
    }
    @Override
    public void onServiceDisconnected(ComponentName name) {

    }
}
