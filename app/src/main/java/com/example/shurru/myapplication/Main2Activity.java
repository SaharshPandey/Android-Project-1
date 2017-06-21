package com.example.shurru.myapplication;

        import android.content.Intent;
        import android.support.annotation.NonNull;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.Toast;

        import java.util.Objects;

public class Main2Activity extends AppCompatActivity {
    Button btn1;
    EditText name;
    EditText username;
    EditText contact;
    EditText email;
    String finalname;
    String finalusername;
    String finalemail;
    String finalcontact;
    String user1name;
    String user1username;
    String user1contact;
    String user1email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1=(Button)findViewById(R.id.password);
        name=(EditText)findViewById(R.id.editText9);
        username=(EditText)findViewById(R.id.editText3);
        email=(EditText)findViewById(R.id.email);
        contact=(EditText)findViewById(R.id.contact);
    }


    public void passwords(View v)
    {
        finalname=name.getText().toString();
        finalusername=username.getText().toString();
        finalemail=email.getText().toString();
        finalcontact=contact.getText().toString();
        if(!finalname.trim().isEmpty() && !finalusername.trim().isEmpty() && !finalemail.trim().isEmpty() && !finalcontact.trim().isEmpty() )
        {
            user1name=finalname;
            user1username=finalusername;
            user1contact=finalcontact;
            user1email=finalcontact;
            Intent passwordactivity=new Intent(Main2Activity.this,passwordActivity.class);
            passwordactivity.putExtra(finalusername,"user1");
            startActivity(passwordactivity);


        }
        else
        {
            Toast.makeText(this,"First Fill the Form Completely",Toast.LENGTH_SHORT).show();

        }

    }

}
