package com.tom.bmi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvresult;
    private Float flbmi;
    private String strname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle getBundle = getIntent().getBundleExtra("BMIBundle");
//        float flbmi = getBundle.getFloat(getString(R.string.bmi_extra),0);
        flbmi = getBundle.getFloat(getString(R.string.bmi_extra),0);
        strname = getBundle.getString(getString(R.string.name));
        tvresult = (TextView) findViewById(R.id.result);
        tvresult.setText(strname + "的BMI值為:" + flbmi);
//        Intent intent = getIntent();
//        float bmi = intent.getFloatExtra(getString(R.string.bmi_extra), 0);
//        TextView result = (TextView) findViewById(R.id.result);
//        result.setText("您的BMI值為:"+bmi);
    }
}
