package com.example.errorremove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tt ;
    Button btn;
    public int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.reset);
        tt = findViewById(R.id.txt);
    }

    public void resetButton(View view){
        count=0;
        tt.setText(Integer.toString(count));
    }

    public void increaseButton(View view){
        count+=1;
        tt.setText(Integer.toString(count));
    }

    public void decreaseButton(View view){
        count-=1;
        tt.setText(Integer.toString(count));
    }
}