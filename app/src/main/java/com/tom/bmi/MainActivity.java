package com.tom.bmi;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button bHelp;
    private Button bCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        findViews();

        BMIControl();

    }

    private void BMIControl() {

        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showHelp();
            }
        });

        bCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calBIM();
            }
        });
    }

    private void showHelp() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("BMI說明");
        builder.setMessage("體重(kg)/身高的平方(m)");
        builder.setPositiveButton("OK",null);
        builder.show();
    }

    private void calBIM() {
//        String w = edWeight.getText().toString();
//        String h = edHeight.getText().toString();
//        float weight = Float.parseFloat(w);
//        float height = Float.parseFloat(h);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        Log.d("BMI", String.valueOf(bmi));
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra(getString(R.string.bmi_extra), bmi);
        startActivity(intent);
    }

//    public void bmi(View v){
//        String w = edWeight.getText().toString();
//        String h = edHeight.getText().toString();
//        float weight = Float.parseFloat(w);
//        float height = Float.parseFloat(h);
//        float bmi = weight/(height*height);
//        Log.d("BMI", String.valueOf(bmi));
//        Intent intent = new Intent(this, ResultActivity.class);
//        intent.putExtra(getString(R.string.bmi_extra), bmi);
//        startActivity(intent);
//        /*Toast.makeText(this, String.valueOf(bmi), Toast.LENGTH_LONG).show();
//        new AlertDialog.Builder(this)
//                .setMessage(bmi+"")
//                .setTitle("BMI運算")
//                .setPositiveButton("OK", null)
//                .show();*/
//    }

    private void findViews() {
        //取得畫面元件
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);
        bHelp = (Button) findViewById(R.id.b_help);
        bCalculate = (Button) findViewById(R.id.b_calculate);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }
}
