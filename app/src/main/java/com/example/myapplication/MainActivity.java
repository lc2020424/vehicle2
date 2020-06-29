package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView view;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;

    private EditText editText1 = null;
    private EditText editText2 = null;
    private Button btn1 = null;
    String strq = "";
    String stra = "";
    String strid = "536";

    private static final String[] m = {"536", "537", "538", "539", "540", "541", "542", "543", "544", "545",
            "546", "547", "548", "549", "550", "551", "552", "553", "554", "555", "556", "557", "558", "559", "560", "561", "562", "563", "564", "565"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        //用EditText前，请先:import android.widget.EditText;
        //获取文本框1的文本
        editText1 = (EditText) findViewById(R.id.q1);
        editText2 = (EditText) findViewById(R.id.a1);

        view = (TextView) findViewById(R.id.spinnerText);
        spinner = (Spinner) findViewById(R.id.Spinner01);
        //将可选内容与ArrayAdapter连接起来
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, m);

        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //将adapter 添加到spinner中
        spinner.setAdapter(adapter);

        //添加事件Spinner事件监听
        spinner.setOnItemSelectedListener(new SpinnerSelectedListener());

        //设置默认值
        spinner.setVisibility(View.VISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strq = editText1.getText().toString();
                stra = editText2.getText().toString();

                 editText2.setText(strid.toCharArray(), 0, strid.length());
            }
        });
    }

    //使用数组形式操作
    class SpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                   long arg3) {
            strid =  m[arg2];
            view.setText("当前车辆是：" + m[arg2]);
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

}