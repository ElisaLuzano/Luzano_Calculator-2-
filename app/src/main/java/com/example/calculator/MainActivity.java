package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button clr;
    private Button btn_min;
    private Button btn_div;
    private Button btn_x;
    private Button btn_plus;
    private Button btn_eq;
    private TextView result;
    private TextView info;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char DIVISION = '/';
    private final char MULTIPLICATION = '*';
    private double val1 = Double.NaN;
    private double val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews ();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText(info.getText().toString() + "1");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText(info.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setText(info.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setText(info.getText().toString() + "2");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn4.setText(info.getText().toString() + "2");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setText(info.getText().toString() + "2");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setText(info.getText().toString() + "2");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn7.setText(info.getText().toString() + "2");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn8.setText(info.getText().toString() + "2");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn9.setText(info.getText().toString() + "2");
            }
        });

    }

    private void setupUIViews (){

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        clr = (Button)findViewById(R.id.clr);
        btn_min = (Button)findViewById(R.id.btn_min);
        btn_div= (Button)findViewById(R.id.btn_div);
        btn_x = (Button)findViewById(R.id.btn_x);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_eq = (Button)findViewById(R.id.btn_eq);
        result = (TextView)findViewById(R.id.txt_result);
        info = (TextView)findViewById(R.id.info);
    }
}