package com.example.findmyway_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Initialing variables
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring variables
        login=findViewById(R.id.btn_login);
        signup=findViewById(R.id.btn_signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Login_frag());
                login.setBackgroundColor(Color.WHITE);
                login.setTextColor(Color.BLACK);

                signup.setBackgroundColor(Color.BLACK);
                signup.setTextColor(Color.WHITE);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Signup_frag());

                login.setBackgroundColor(Color.BLACK);
                login.setTextColor(Color.WHITE);

                signup.setBackgroundColor(Color.WHITE);
                signup.setTextColor(Color.BLACK);
            }
        });
    }

    /**Switching between fragments**/
    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.accessOption,fragment);
        fragmentTransaction.commit();
    }

    class fetchData extends AsyncTask<Void,Void,Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }


}


