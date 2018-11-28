package com.example.oriin_bsqgiqy.my4thapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int x = 1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
    }




    public void go(View view) {
        button1.setText("This is a click number:"+x );
        if((x%7) == 0)
        {
            button1.setText("Boom!");
        }
        int xx = x;
        for(;xx!=0; xx = xx/10)
        {
            if ((xx%10) == 7 )
            {
                button1.setText("Boom!");
            }
        }
        x++ ;
    }
}

