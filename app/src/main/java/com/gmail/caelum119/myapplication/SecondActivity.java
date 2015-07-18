package com.gmail.caelum119.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ibm on 11/07/15.
 */
public class SecondActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity2);



        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_launcher);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.cat);
            }
        });

        Intent intent = getIntent();


        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(intent.getStringExtra("testExtraKey"));

    }

}
