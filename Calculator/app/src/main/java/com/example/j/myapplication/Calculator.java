package com.example.j.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculator extends Activity {

    public String str ="";
    Character op = 'q';
    int i,num,numtemp;
    EditText showResult;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        showResult = (EditText)findViewById(R.id.result_id);


    }
    public void btn1Clicked(View v){
        insert(1);

    }

    public void btn2Clicked(View v){
        insert(2);

    }
    public void btn3Clicked(View v){
        insert(3);

    }
    public void btn4Clicked(View v){
        insert(4);

    }
    public void btn5Clicked(View v){
        insert(5);

    }
    public void btn6Clicked(View v){
        insert(6);
    }
    public void btn7Clicked(View v){
        insert(7);

    }
    public void btn8Clicked(View v){
        insert(8);

    }
    public void btn9Clicked(View v){
        insert(9);

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

    public void btn0Clicked(View v){
        insert(0);
    }
    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);


    }
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        numtemp = num;
    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

}