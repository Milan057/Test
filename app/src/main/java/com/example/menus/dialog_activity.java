package com.example.menus;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dialog_activity extends AppCompatActivity {
Button calculateButton;
Button calculateSI;
Button AreaOfTriangle;
Button Sum;

Button AreaOfCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        calculateButton=findViewById(R.id.mainCalculateBtn);
        calculateSI=findViewById(R.id.mainSI);
        AreaOfTriangle=findViewById(R.id.mainTraingleArea);
        AreaOfCircle=findViewById(R.id.mainCircleArea);
        Sum=findViewById(R.id.mainCalculateBtn);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayAnswer();
                Log.d("Calculate Sum","Pressed");
            }
        });
        calculateSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displaySI();
            }
        });
        AreaOfTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAreaOfTriangle();
            }
        });
        AreaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAreaOfCircle();
            }
        });
        Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplaySum();
            }
        });

    }
    public void displayAnswer(){
        AlertDialog.Builder builder=new AlertDialog.Builder(dialog_activity.this);
        builder.setTitle("Calculate Number");
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.custom_dialog,null);
        builder.create();
        builder.setView(view);
        builder.show();
    }
    public void displaySI(){
        AlertDialog.Builder builder=new AlertDialog.Builder(dialog_activity.this);
        builder.setTitle("Calculate SI");
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.simple_interest_dialag,null);
        builder.setView(view);

        Button calculateSI=view.findViewById(R.id.calculateSI);
        EditText principle=view.findViewById(R.id.principle);
        EditText time=view.findViewById(R.id.time);
        EditText rate=view.findViewById(R.id.rate);
        TextView answerText=view.findViewById(R.id.SIAnswerText);
        calculateSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ans=(Float.parseFloat(principle.getText().toString())*Float.parseFloat(time.getText().toString())*Float.parseFloat(rate.getText().toString()))/100;
                answerText.setText(String.valueOf(ans));
            }
        });
        builder.create();
        builder.show();
    }
    void calculateAreaOfTriangle(){
        AlertDialog.Builder builder=new AlertDialog.Builder(dialog_activity.this);
        builder.setTitle("Calculate AreaOfTriangle");
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.areaoftraingle_dialog,null);
        builder.setView(view);

        Button calculate=view.findViewById(R.id.calculateAreaButton);
        EditText base=view.findViewById(R.id.base);
        EditText height=view.findViewById(R.id.height);
        TextView answerText=view.findViewById(R.id.AreaAnswerText);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ans=(Float.parseFloat(height.getText().toString())*Float.parseFloat(base.getText().toString()))/2;
                answerText.setText(String.valueOf(ans));
            }
        });
        builder.create();
        builder.show();

    }
    void calculateAreaOfCircle(){

        AlertDialog.Builder builder=new AlertDialog.Builder(dialog_activity.this);
        builder.setTitle("Calculate Area of Circle");
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.areaofcircle_dialog,null);
        builder.setView(view);

        Button calculate=view.findViewById(R.id.AreaCircleCalculate);
        EditText radius=view.findViewById(R.id.radius);

        TextView answerText=view.findViewById(R.id.CircleAnswerText);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float ans= (float) Math.round(Float.parseFloat(radius.getText().toString())*Float.parseFloat(radius.getText().toString())*Math.PI);
                answerText.setText(String.valueOf(ans));
            }
        });
        builder.create();
        builder.show();

    }
    private  void DisplaySum(){
        AlertDialog.Builder builder=new AlertDialog.Builder(dialog_activity.this);
        builder.setTitle("Calculate Sum");
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.custom_dialog,null);
        builder.setView(view);

        Button calculate=view.findViewById(R.id.calculateButton);
        EditText num1=view.findViewById(R.id.firstNumber);
        EditText num2=view.findViewById(R.id.secondNumber);

        TextView answerText=view.findViewById(R.id.answerText);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ans=(Integer.parseInt(num1.getText().toString())+ Integer.parseInt(num2.getText().toString()));
                answerText.setText(String.valueOf(ans));
            }
        });
        builder.create();
        builder.show();
    }
}