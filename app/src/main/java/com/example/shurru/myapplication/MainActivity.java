package com.example.shurru.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn;
    EditText e,t;
    String s;
    String user;

    String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.idbtn);
        e=(EditText)findViewById(R.id.editText2);
        t=(EditText)findViewById(R.id.editText);



    }
    public void onBackPressed()

    {

        AlertDialog.Builder a_builder=new AlertDialog.Builder(MainActivity.this);
        a_builder.setMessage("Do you want to Close this App?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();

                    }



                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();

                    }
                });

        AlertDialog alert=a_builder.create();
        alert.setTitle("Alert!!!");
        alert.show();


    }
    public void btnclick(View v) {
       Intent i=getIntent();
        Bundle extras = i.getExtras();
        if (extras != null)
        {
            String name = extras.getString("user1");
            String pass=extras.getString("uer1password");


       // user= i.getExtras().getString("user1");
        //pass= i.getExtras().getString("user1password");


            assert name != null;
            assert pass != null;
            if(name.equals(e.getText().toString()) && pass.equals(t.getText().toString())) {

        Intent activitylogin = new Intent(this,activitylogin.class);
//            login.putExtra("main", e.getText().toString());
        startActivity(activitylogin);
    }

      else
        {
          Toast.makeText(MainActivity.this,"Wrong Credentials! Login Again",Toast.LENGTH_SHORT).show();

       }
    }}
    public void btnclick2(View v)
    {
        Toast.makeText(this, "Welcome to Signup Page", Toast.LENGTH_SHORT).show();
        Intent login1=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(login1);
    }

}
