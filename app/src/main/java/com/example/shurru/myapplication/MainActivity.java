package com.example.shurru.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  // SharedPreferences sharedPreferences;


    Button btn;
    EditText e,t;
    String s;
   // String user="shurru";
    DatabaseHelper dh;
   // String pass="pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.idbtn);
        e = (EditText) findViewById(R.id.editText2);
        t = (EditText) findViewById(R.id.editText);


       // Intent i = getIntent();
        //user = i.getExtras().getString("user1");
        //pass = i.getExtras().getString("uer1password");
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
    dh=new DatabaseHelper(this);

       // user= i.getExtras().getString("user1");
        //pass= i.getExtras().getString("user1password");
      //  SharedPreferences.Editor editor=sharedPreferences.edit();

        //editor.putString(user,"");
        //editor.putString(pass,"");
        //editor.commit();
       String password= dh.searchpass(e.getText().toString());
       if( t.getText().toString().equals(password)) {

        Intent activitylogin = new Intent(this,activitylogin.class);
//            login.putExtra("main", e.getText().toString());
        startActivity(activitylogin);
    }

      else
        {
          Toast.makeText(MainActivity.this,"Wrong Credentials! Login Again",Toast.LENGTH_SHORT).show();

       }
    }
    public void btnclick2(View v)
    {
        Toast.makeText(this, "Welcome to Signup Page", Toast.LENGTH_SHORT).show();
        Intent login1=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(login1);
    }

}
