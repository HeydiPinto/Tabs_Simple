package com.example.heydi.tabs_simple.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.heydi.tabs_simple.R;


public class Incio extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button btnSimpleTabs, btnScrollableTabs, btnIconTextTabs, btnIconTabs, btnCustomIconTextTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incio);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabss);
        btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);
        btnIconTextTabs = (Button) findViewById(R.id.btnIconTextTabs);
        btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
        btnCustomIconTextTabs = (Button) findViewById(R.id.btnCustomIconTabs);

       btnSimpleTabs.setOnClickListener(this);
        btnScrollableTabs.setOnClickListener(this);
        btnIconTextTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
        btnCustomIconTextTabs.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSimpleTabss:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;
            case R.id.btnScrollableTabs:
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                break;
            case R.id.btnIconTextTabs:
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
                break;
            case R.id.btnIconTabs:
                startActivity(new Intent(getApplicationContext(), Main4Activity.class));
                break;
            case R.id.btnCustomIconTabs:
                startActivity(new Intent(getApplicationContext(), Main5Activity.class));
                break;
        }
    }
}





