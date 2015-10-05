package com.example.j.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculator extends Activity {

    public String str ="";
    char op = 'q';
    float num, numtemp;
    EditText showResult;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        showResult = (EditText)findViewById(R.id.result_id);
    }

    public void btn0Clicked(View v){
        insert("0");
    }
    public void btn1Clicked(View v){
        insert("1");
    }
    public void btn2Clicked(View v){
        insert("2");
    }
    public void btn3Clicked(View v){
        insert("3");
    }
    public void btn4Clicked(View v){
        insert("4");
    }
    public void btn5Clicked(View v){
        insert("5");
    }
    public void btn6Clicked(View v){
        insert("6");
    }
    public void btn7Clicked(View v){
        insert("7");
    }
    public void btn8Clicked(View v){
        insert("8");
    }
    public void btn9Clicked(View v){
        insert("9");
    }
    public void btnDotClicked(View v){
        insert(".");
    }
    public void btnPlusClicked(View v){
        perform();
        op = '+';
    }
    public void btnMinClicked(View v){
        perform();
        op = '-';
    }
    public void btnDivClicked(View v){
        perform();
        op = '/';
    }
    public void btnMultClicked(View v){
        perform();
        op = '*';
    }
    public void btnEqualClicked(View v){
        calculate();
    }
    public void btnCEClicked(View v){
        reset();
    }

    private void reset() {
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void insert(String j) {
        if(j.equals(".")) {
            if(!str.contains(j))
                str = str+j;
        }
        else
            str = str+j;
        if(!j.equals("."))
            num = Float.parseFloat(str);
        showResult.setText(str);
    }
    private void perform() {
        String displayed = showResult.getText().toString();
        if(!displayed.equals("undefined") && !displayed.equals(".") && !displayed.equals(""))
            numtemp = Float.parseFloat(displayed);
        str = "";
    }
    private void calculate() {
        if(op == '+')
            numtemp += num;
        else if(op == '-')
            numtemp -= num;
        else if(op == '/') {
            if (num == 0) {
                showResult.setText("undefined");
                str = "";
                op = 'q';
                num = 0;
                numtemp = 0;
                return;
            }
            numtemp /= num;
        }
        else if(op == '*')
            numtemp *= num;
        showResult.setText(""+numtemp);
        str = "";
    }
}