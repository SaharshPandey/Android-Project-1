package com.example.shurru.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class passwordActivity extends AppCompatActivity {
    Button login;
    EditText e1;
    EditText e2;
    String password;
    DatabaseHelper dh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passwordactivity);
        login=(Button)findViewById(R.id.login);



    }
public void finalss(View v)
{
    e1=(EditText)findViewById(R.id.pass);
    e2=(EditText)findViewById(R.id.passw);
   if(e1.getText().toString().equals(e2.getText().toString()) && !e1.getText().toString().trim().isEmpty())
   {
       password=e1.getText().toString();
       dh=new DatabaseHelper(this);
       dh.passinsert(password);
       Intent i=new Intent(this,MainActivity.class);
       //i.putExtra(password,"user1password");
       startActivity(i);


   }
   else
   {
       Toast.makeText(this,"Wrong Credentials. Retry?!!",Toast.LENGTH_SHORT).show();

   }
}
}
