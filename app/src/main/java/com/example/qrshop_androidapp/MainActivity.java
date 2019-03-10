package com.example.qrshop_androidapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.qrshop_androidapp.R;
import com.example.qrshop_androidapp.ui.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         FragmentTransaction transaction = getSupportFragmentManager()
                 .beginTransaction().replace(R.id.mainLayout, new LoginFragment());
         transaction.commit();
    }
}