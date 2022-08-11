package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        switch (view.getId()){
            case R.id.textViewBTN:
                startActivity(new Intent(this,TextViewActivity.class));
                break;
            case R.id.editTextBTN:
                startActivity(new Intent(this,EditTextActivity.class));
                break;
        }
    }
}