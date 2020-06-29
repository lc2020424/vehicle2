package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //用EditText前，请先:import android.widget.EditText;
        //获取文本框1的文本
        String str1="";
        EditText editText1 =(EditText)findViewById(R.id.q1);
        str1=editText1.getText().toString();

        String str2="";
        EditText editText2 =(EditText)findViewById(R.id.a1);
        str2=editText1.getText().toString();
        String str3="";String str4="";
    }
}