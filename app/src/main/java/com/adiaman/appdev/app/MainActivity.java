package com.adiaman.appdev.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button counterBtn=(Button) findViewById(R.id.counterBtn);
        Button resetBtn=(Button) findViewById(R.id.resetBtn);

        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayTextView=(TextView) findViewById(R.id.displayTextView);
                int num=Integer.parseInt(displayTextView.getText().toString());
                num++;
                displayTextView.setText(num+"");
            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayTextView=(TextView) findViewById(R.id.displayTextView);
                int num=Integer.parseInt(displayTextView.getText().toString());
                num=0;
                displayTextView.setText(num+"");
            }
        });

    }
}
