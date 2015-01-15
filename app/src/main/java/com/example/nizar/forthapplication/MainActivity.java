package com.example.nizar.forthapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {
    public int visibleT2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void myFirstMethod(View v){

    View myView = findViewById(R.id.textView2);
    if(visibleT2==0)
    {

        myView.setVisibility(View.VISIBLE);
        visibleT2=1;
    }

else {
        myView.setVisibility(View.INVISIBLE);
        visibleT2=0;
    }
}
}
