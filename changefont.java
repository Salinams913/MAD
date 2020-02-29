package com.example.change_font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   int ch=1;
   float font=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t=(TextView)findViewById(R.id.textView1);
        Button b3=(Button)findViewById(R.id.button3);
        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font=font+5;
                if(font==50) {
                    font=30;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch){
                    case 1:t.setTextColor(Color.RED);break;
                    case 2:t.setTextColor(Color.YELLOW);break;
                    case 3:t.setTextColor(Color.MAGENTA);break;
                    case 4:t.setTextColor(Color.GREEN);break;
                    case 5:t.setTextColor(Color.BLUE);break;

                }
                ch++;
                if(ch==7)ch=1;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t.getText()=="CSE")
                    t.setText("ISE");
                else
                    t.setText("CSE");

            }
        });
    }
}