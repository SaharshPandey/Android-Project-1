package com.example.shurru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class activitylogin extends AppCompatActivity {
    EditText field;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button back;
    Button clear;
    Button minus;
    Button equals;
    Button point;
    double num1;
    double num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylogin);
        field=(EditText)findViewById(R.id.editText4);
        one=(Button)findViewById(R.id.button7);
        two=(Button)findViewById(R.id.button8);
        three=(Button)findViewById(R.id.button13);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button);
        eight=(Button)findViewById(R.id.button2);
        nine=(Button)findViewById(R.id.button3);
        zero=(Button)findViewById(R.id.button10);
        add=(Button)findViewById(R.id.button14);
        sub=(Button)findViewById(R.id.button15);
        mul=(Button)findViewById(R.id.button19);
        div=(Button)findViewById(R.id.button9);
        point=(Button)findViewById(R.id.button11);
        minus=(Button)findViewById(R.id.button17);
        back=(Button)findViewById(R.id.button16);
        clear=(Button)findViewById(R.id.button18);
        equals=(Button)findViewById(R.id.button12);

    }

    public void one1(View v)
    {

    field.append(one.getText());

    }
   public void two2(View v)
    {
    field.append(two.getText());
    }
    public void three3(View v)
    {
    field.append(three.getText());
    }
    public void four4(View v)
    {
    field.append(four.getText());
    }
    public void five5(View v)
    {
     field.append(five.getText());
    }
    public void six6(View v)
    {
     field.append(six.getText());
    }
    public void seven7(View v)
    {
        field.append(seven.getText());
    }
    public void eight8(View v)
    {
        field.append(eight.getText());
    }
    public void nine9(View v)
    {
        field.append(nine.getText());
    }
    public void zero0(View v)
    {
        field.append(zero.getText());
    }
    public void add1(View v)
    {
        num1= Double.parseDouble((String.valueOf(field.getText())));

        field.append(add.getText());
    }
    public void sub1(View v)
    {
        num1= Double.parseDouble((String.valueOf(field.getText())));
        field.append(sub.getText());
    }
    public void mul1(View v)
    {
        num1= Double.parseDouble((String.valueOf(field.getText())));
        field.append("*");
    }
    public void div1(View v)
    {
        num1= Double.parseDouble((String.valueOf(field.getText())));
        field.append(div.getText());
    }
    public void point1(View v)
    {

        field.append(point.getText());
    }
    public void clear1(View v)
    {
        field.setText("");
    }
    public void back1(View v)
    {

    }
    public void minus1(View v)
    {

    }
    public void equals1(View v)
    {

    }
}
