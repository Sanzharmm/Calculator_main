package com.example.calculator_sanzhar_ain_2_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText a;
    private EditText b;
    private TextView answer;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button mult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.FirstNumber);
        b=findViewById(R.id.SecondNumber);
        answer=findViewById(R.id.Answer);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.Divide);
        mult=findViewById(R.id.multiply);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer FirstNumber=Integer.parseInt(a.getText().toString());
                Integer SecondNumber=Integer.parseInt(b.getText().toString());
                answer.setText((FirstNumber+SecondNumber)+"");
            }
        }
        );

        minus.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Integer FirstNumber=Integer.parseInt(a.getText().toString());
                                        Integer SecondNumber=Integer.parseInt(b.getText().toString());
                                        answer.setText((FirstNumber-SecondNumber)+"");
                                    }
                                }
        );
        divide.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Integer FirstNumber=Integer.parseInt(a.getText().toString());
                                        Integer SecondNumber=Integer.parseInt(b.getText().toString());
                                        answer.setText((FirstNumber/SecondNumber)+"");
                                    }
                                }
        );
        mult.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Integer FirstNumber=Integer.parseInt(a.getText().toString());
                                        Integer SecondNumber=Integer.parseInt(b.getText().toString());
                                        answer.setText((FirstNumber*SecondNumber)+"");
                                    }
                                }
        );
    }
}