package com.example.vikram.travellersguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.vikram.travellersguide.Account.RegisterActivity;
import com.example.vikram.travellersguide.Account.login;

public class MainActivity extends AppCompatActivity {
 private TextView signUp,signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp=(TextView)findViewById(R.id.signUp);
        signIn=(TextView)findViewById(R.id.signIn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlogin();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistration();
            }
        });

    }

    public void openlogin()
    {
        Intent intent=new Intent(this,login.class);
        startActivity(intent);
    }
    public void openRegistration()
    {
        Intent intent=new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
